#!/usr/bin/env node

"use strict";
//Version: 2023-01-25
const fs = require('fs').promises;
const path = require('path');

try {
  require.resolve('xml2js');
}
catch (e) {
  console.error("xml2js is not installed.\nPlease run: \"npm install\" first and run this script again.");
  process.exit(e.code);
}
const { program } = require('commander');

program
  .name('tn-fix-html')
  .description('CLI to fix a qvto generated Petri net to work in TimeNET.')
  .usage("<inputXml[.xml]> [options]")
  .version(require('./package.json').version)
  //.option('-h, --help')
  .option('-a, --arrange', "arrange the resulting net in order to be able to select its segments. If not provided, all elements will remain in their original location.")
  .option('-o, --optimize', "removes superflous immediate transitions.")
  .option('-c, --compress', "simplify the net by merging together subsequent immediate transitions of different paths. If both o and c are provided, the net will be first optimized and then compressed")
  .option('-i, --inputFile <NAME>', "The name of the input file, with or without xml extension, this takes precedence on any unnamed argument.")

program.parse();

const options = program.opts();

const xml2js = require('xml2js');
const parseString = require('xml2js').parseString;
const stripPrefix = require('xml2js').processors.stripPrefix;

// Check if the help parameter was provided
const help = process.argv.some(a => a === "-h" || a === "--help" || a === "help");

if (options.help !== undefined || (program.args.length === 0 && options.inputFile === undefined)) {
  program.help();
}

// Initialize the parameters
const optimize = options.optimize ?? false;
const arrange = options.arrange ?? false;
const compress = options.compress ?? false;

bootstrap();

async function bootstrap() {
  // Set the provided filename - if you reach this part, there are at least 3 arguments
  let fileName = options.inputFile ?? program.args[0];

  console.log(`Executing with following settings:\n\tInput file: "${fileName}"\n\tOptimize: ${optimize}\n\tArrange: ${arrange}`);

  //Remove the xml extension, if provided:
  fileName = fileName.replace(".xml", "");

  const outputPath = "./"; // Future work: allow user to set an output path as a command line option
  const inputFilePath = path.normalize('./' + fileName + '.xml');

  let inputXML = null;
  try {
    inputXML = await fs.readFile(inputFilePath);
  }
  catch (error) {
    return fatalError("An error occurred while reading the XML file.\n" + error.message);
  }
  parseString(inputXML,
    {
      tagNameProcessors: [stripPrefix]
    }, (err, result) => { fileParsed(err, result, outputPath, fileName) });
}

function getNetworkType(netXML) {
  let toReplace = null; //e.g. "SCPNNet" - the model class
  let shortNetName = null; //e.g. "SCPN" - the URI element
  if (typeof netXML['SCPNNet'] !== "undefined") {
    toReplace = "SCPNNet";
    shortNetName = "SCPN";
  }
  else if (typeof netXML['EDSPNNet'] !== "undefined") {
    toReplace = "EDSPNNet";
    shortNetName = "eDSPN";
  }
  else {
    return fatalError("The provided XML does not have a root element of type EDSPNNet/SCPNNet");
  }
  return { toReplace, shortNetName };
}

/**
 * This is the main execution point, which runs after the input net file has been successfully parsed
 * @param {*} netXML 
 * @param {string} outputPath
 * @param {string} fileName without .xml
 */
async function mainScript(netXML, outputPath, fileName) {
  if (typeof netXML['XMI'] !== "undefined") {
    //The XML is malformed, an element was not assigned to a parent and the XML has more than one root.
    return fatalError("FAIL: The XML file has more than one root, you probably forgot to assign an element to its container.");
  }

  // Get the type of net
  let { toReplace, shortNetName } = getNetworkType(netXML);

  //Remove unused attributes
  //if (toReplace && shortNetName) {
  delete (netXML[toReplace]['$']['xmi:version']);
  delete (netXML[toReplace]['$']['xmlns:xmi']);
  //remove xmi:id;
  delete netXML[toReplace]['$']['xmi:id'];

  //Set the "xsi:schemaLocation" to the correct value
  netXML[toReplace]['$']['xsi:schemaLocation'] = `http://timenet.tu-ilmenau.de/schema/${shortNetName} etc/schemas/${shortNetName}.xsd`;


  // rename "xmlns:eDSPN" to "xmlns"
  netXML[toReplace]['$']['xmlns'] = `http://timenet.tu-ilmenau.de/schema/${shortNetName}`;
  delete netXML[toReplace]['$'][`xmlns:${shortNetName.toLowerCase()}`];

  // add "xmlns:xsi" attribute
  netXML[toReplace]['$']['xmlns:xsi'] = "http://www.w3.org/2001/XMLSchema-instance";

  // rename toReplace, e.G. "eDSPNNet" to "net"
  netXML['net'] = netXML[toReplace];
  delete netXML[toReplace];
  //}
  //else {
  //  console.warning("Net type is not being renamed.");
  //}


  logIf(!arrange, "Info: Elements arrangement was skipped, rerun the command with the -a flag, if needed");
  if (arrange === true) {
    // Change the position of the elements so that they are not one over another
    placeNodesCircle(netXML['net']);
  }

  // Check that the used ID are unique and correctly referenced.
  let success = checkIDs(netXML['net']);


  if (!success) {
    // Write the inspectable output file
    if (await storeXML(netXML, outputPath + fileName + '_debug.xml')) {
      printMessage("Debug file stored. You can open it in TimeNET to find out what went wrong.");
    }
    return fatalError("At least one error was found in the original file. Please fix the errors listed above and try again.");
  }

  // Write the compatible output file
  if (await storeXML(netXML, outputPath + fileName + '_compatible.xml')) {
    printMessage("Success!");
  }

  logIf(!optimize, "Info: Net optimization was skipped, rerun the command with the -o flag, if needed");
  if (optimize === true) {
    // Optimize the generated Petri Net.
    netXML['net'] = simplifyNet(netXML['net']);

    if (arrange === true) {
      // Change the position of the elements so that they are not one over another
      placeNodesCircle(netXML['net']);
    }

    // Check that the used ID are unique and correctly referenced.
    let optimizationSuccessful = checkIDs(netXML['net']);
    if (optimizationSuccessful === true) {
      // Write the output file
      if (await storeXML(netXML, outputPath + fileName + '_optimized.xml')) {
        printMessage("Optimization successful!");
      }
    }
    else {
      await storeXML(netXML, outputPath + fileName + '_optimized_with_errors.xml');
      return fatalError("There was a problem during the optimization. Please fix the errors listed above and try again.");
    }
  }

  logIf(!compress, "Info: Net compression was skipped, rerun the command with the -c flag, if needed");
  if(compress === true){
      // Optimize the generated Petri Net.
      netXML['net'] = compressNet(netXML['net']);
  
      if (arrange === true) {
        // Change the position of the elements so that they are not one over another
        placeNodesCircle(netXML['net']);
      }
  
      // Check that the used ID are unique and correctly referenced.
      let compressionSuccessful = checkIDs(netXML['net']);
      if (compressionSuccessful === true) {
        // Write the output file
        if (await storeXML(netXML, outputPath + fileName + '_compressed.xml')) {
          printMessage("Compression successful!");
        }
      }
      else {
        await storeXML(netXML, outputPath + fileName + '_compressed_with_errors.xml');
        return fatalError("There was a problem during the compression. Please fix the errors listed above and try again.");
      }
  }
}

/**
 * 
 * @param {boolean} condition 
 * @param {string} string
 */
function logIf(condition, string) {
  if (condition)
    console.log(string);
}

/**
 * This function gets called when the input XML file get parsed by the parseString method
 * @param {*} err 
 * @param {*} netXML 
 * @param {string} outputPath
 * @param {string} fileName without .xml
 */
function fileParsed(err, netXML, outputPath, fileName) {
  if (err) {
    fatalError("An error occurred while parsing the XML file.\n" + err.message);
  }
  mainScript(netXML, outputPath, fileName);
}

/**
 * Prints an error message and terminates the execution immediately
 * @param {string} message The message to print
 * @param {number} errorLevel The error level to use when exiting the process. Greater than 0 means: failure. Defaults to 1
 * @returns {never}
*/
function fatalError(message, errorLevel = 1) {
  printError(message);
  program.help();
  process.exit(errorLevel);
}

/**
 * Prints an error message with a warning sign
 * @param {string} message
 */
function printError(message) {
  console.log("       ===");
  console.log("      =   =");
  console.log("     =  || =");
  console.log("    =   ||  =");
  console.log("   =    ||   =");
  console.log("  =     ||    =");
  console.log(" =      ()     =");
  console.log("=================");
  console.error("\n" + message);
}

/**
 * Writes an XML file with the given data at the given path
 * @param {*} data
 * @param {string} filePath
 */
async function storeXML(data, filePath) {
  // Write the output file
  const builder = new xml2js.Builder();
  let xml = builder.buildObject(data);
  xml = xml.replace(/xmi:id="[^"]+"/gm, "");
  try {
    await fs.writeFile(filePath, xml);
  }
  catch (err) {
    console.error(err.message);
    return fatalError(`Could not write XML file at location "${filePath}"`)
  }
  console.log("\nOutput file stored in: " + path.normalize(filePath));
  return true;
}

/**
 * Prints a message with a decoration above and under the text.
 * The given message should fit in one line
 * @param {string} message
 */
function printMessage(message) {
  // Tab is 8 char longs
  console.log("=".repeat(message.length + 16));
  console.log(`\t${message}`);
  console.log("=".repeat(message.length + 16) + "\n");
}


function removeXmiID(el) {
  //remove xmi:id;
  delete el['$']['xmi:id'];
}

/**
 * Remove all superfluous immediate transitions from the Net
 * @param {*} net
 * @returns a net without useless immediate transition that do not change anything
 */
function simplifyNet(net) {
  net.immediateTransition.forEach(immediateTransNode => {
    let iT = immediateTransNode['$'];

    // All of the following must be false in order for the transition to be simplifyable
    if ('localGuard' in iT) return;
    if ('globalGuard' in iT) return;
    if (iT.watch === true) return;
    if ('displayExpression' in iT) return;
    if ('logfileExpression' in iT) return;

    // Find the arc leading to the immediateTransition, check that it is only one
    const leftArcs = getArcsToElement(net, iT.id);
    if (leftArcs.length !== 1) { return; }

    const leftInscription = getInscriptionText(leftArcs[0]);
    let lPlace = null;

    const lArc = leftArcs[0]['$'];

    // Get the place which is supplying this immediateTransition
    lPlace = getPlaceByID(net, lArc.fromNode);
    // Check if the incoming place has only one outgoing arc
    const outgoingArcs = getArcsFromElement(net, lPlace['$'].id);
    if (outgoingArcs.length !== 1) {
      return;
    }

    // Find the arc leaving from the immediateTransition, check that it is only one
    const rightArcs = getArcsFromElement(net, iT.id);
    if (rightArcs.length !== 1) { return; }
    const rightInscription = getInscriptionText(rightArcs[0]);
    if (leftInscription !== rightInscription) {
      return;
    }

    const rArc = rightArcs[0]['$'];
    // Get the place the arc leads to
    const rPlace = getPlaceByID(net, rArc.toNode);
    // Check it the outgoing place has only one incoming arc
    const incomingArcs = getArcsToElement(net, rPlace['$'].id);
    if (incomingArcs.length === 1) {
      // TODO: maybe also check that the type of lPlace and rPlace is the same.
      // It shouldn't be necessary as in that case the left and right inscriptions would not be identical.

      // This immediate transition can be simplified!
      immediateTransNode.simplify = true;
      immediateTransNode.lPlaceID = lPlace['$'].id;
      immediateTransNode.rPlaceID = rPlace['$'].id;
      immediateTransNode.rPlaceLabel = getLabel(rPlace);
      immediateTransNode.lPlaceLabel = getLabel(lPlace);
      leftArcs[0].simplify = true;
      rightArcs[0].simplify = true;
    }
    else{
      return;
    }
  });
  removeSimplifyableElements(net);
  return net;
}


/**
 * Merge together immediate transitions belonging to different decision branches
 * @param {*} net
 * @returns a net with less immediate transitions
 */
function compressNet(net) {
  net.immediateTransition.forEach(immediateTransNode => {
    let iT = immediateTransNode['$'];

    // All of the following must be false in order for the transition to be simplifyable
    if ('localGuard' in iT) return;
    if ('globalGuard' in iT) return;
    if (iT.watch === true) return;
    if ('displayExpression' in iT) return;
    if ('logfileExpression' in iT) return;

    // Find the arc leading to the immediateTransition, check that it is only one
    const leftArcs = getArcsToElement(net, iT.id);
    if (leftArcs.length !== 1) { return; }

    const leftInscription = getInscriptionText(leftArcs[0]);
    let lPlace = null;

    const lArc = leftArcs[0]['$'];

    // Get the place which is supplying this immediateTransition
    lPlace = getPlaceByID(net, lArc.fromNode);
    // Check if the incoming place has only one outgoing arc
    const outgoingArcs = getArcsFromElement(net, lPlace['$'].id);
    if (outgoingArcs.length !== 1) {
      return;
    }

    // Find the arc leaving from the immediateTransition, check that it is only one
    const rightArcs = getArcsFromElement(net, iT.id);
    if (rightArcs.length !== 1) { return; }
    const rightInscription = getInscriptionText(rightArcs[0]);
    if (leftInscription !== rightInscription) {
      return;
    }

    const rArc = rightArcs[0]['$'];
    // Get the place the arc leads to
    const rPlace = getPlaceByID(net, rArc.toNode);
    // Check it the outgoing place has only one incoming arc
    const incomingArcs = getArcsToElement(net, rPlace['$'].id);
    if (incomingArcs.length === 1) {
      // TODO: maybe also check that the type of lPlace and rPlace is the same.
      // It shouldn't be necessary as in that case the left and right inscriptions would not be identical.

      // This immediate transition can be simplified!
      immediateTransNode.simplify = true;
      immediateTransNode.lPlaceID = lPlace['$'].id;
      immediateTransNode.rPlaceID = rPlace['$'].id;
      immediateTransNode.rPlaceLabel = getLabel(rPlace);
      immediateTransNode.lPlaceLabel = getLabel(lPlace);
      leftArcs[0].simplify = true;
      rightArcs[0].simplify = true;
    }
    else return;
  });
  removeSimplifyableElements(net);
  return net;
}

/**
 * Return the label of the place with the given ID
 * @param {*} net
 * @param {string} placeID
 * @returns {string} the label of the element with the given ID
 */
// eslint-disable-next-line no-unused-vars
function getLabelByPlaceID(net, placeID) {
  return getLabel(getPlaceByID(net, placeID));
}

/**
 *
 * @param {object} element
 * @returns {(string|undefined)} The elements' label
 */
function getLabel(element) {
  return element.label[0]['$'].text;
}

/**
 *
 * @param {object} arc
 * @returns {string} The arc's inscription
 */
function getInscriptionText(arc) {
  return arc.inscription[0]['$'].text
}

/**
 * Remove the elements which have been marked as simplifyable in the SimplifyNet function from the net
 * @param {*} net 
 */
function removeSimplifyableElements(net) {
  // remove the immediate transitions that are marked with simplify:true
  let removedTransitions = 0;
  let removedPlaces = 0;
  let immT = net?.immediateTransition?.find(iT => iT.simplify === true);
  while (immT) {
    removedTransitions += 1;
    // simplify this immediateTransition
    // delete the immediate transition
    net.immediateTransition = net.immediateTransition.filter(iT => iT['$'].id !== immT['$'].id);

    // update the fromNode of the arcs leaving from the rPlace
    let outgoingArcs = getArcsFromElement(net, immT.rPlaceID);
    // If the lPlace still exists
    let lPlaceID = null;
    if (getPlaceByID(net, immT.lPlaceID)) {
      lPlaceID = immT.lPlaceID;
    }
    else {
      // look for the current lPlace
      let incomingArc = getArcsToElement(immT['$'].id)[0];
      lPlaceID = incomingArc['$'].fromNode;
    }
    outgoingArcs.forEach(a => {
      a['$'].fromNode = lPlaceID
    });

    // check if rPlace is referenced in any measure
    const regex = new RegExp(immT.rPlaceLabel, "g");
    net?.measure?.forEach(m => {
      m['$'].expression = m['$'].expression.replace(regex, immT.lPlaceLabel);
    });

    // delete rPlace
    removePlaceByID(net, immT.rPlaceID);
    removedPlaces += 1;

    // continue the while loop
    immT = net.immediateTransition.find(iT => iT.simplify === true);
  }

  // remove the arcs that are marked with simplify:true
  const arcsBefore = net.arc.length;
  net.arc = net.arc.filter(a => a.simplify !== true);
  const arcsAfter = net.arc.length;

  console.log(`Simplified:
   ${removedTransitions} immediate transition(s)
   ${removedPlaces} place(s)
   ${arcsBefore - arcsAfter} arc(s)`)
}

/**
 * Remove the element with the given ID from the given net
 * @param {*} net 
 * @param {string} ID 
 * @param {string} type 
 */
function removeElementByID(net, ID, type) {
  net[type] = net[type].filter(el => el['$'].id !== ID);
}

/**
 *
 * @param {*} net
 * @param {string} ID
 * @param {string} type: arc | place | ...
 * @returns {(* | undefined)} if no element is found by the given ID
 */
function getElByID(net, ID, type) {
  return net[type].find(el => el['$'].id === ID);
}

// eslint-disable-next-line no-unused-vars
function removeArcByID(net, ID) {
  removeElementByID(net, ID, 'arc');
}

function removePlaceByID(net, ID) {
  removeElementByID(net, ID, 'place');
}

function getPlaceByID(net, ID) {
  return getElByID(net, ID, 'place');
}

function getArcsFromElement(net, id) {
  return net.arc.filter(arc => arc['$'].fromNode === id);
}

function getArcsToElement(net, id) {
  return net.arc.filter(arc => arc['$'].toNode === id);
}

/**
 * @typedef {Object} InitializedNet
 * @property {Array} places
 * @property {Array} expTrans
 * @property {Array} immTrans
 * @property {Array} timedTrans
 * @property {Array} arcs
 */

/**
 * 
 * @param {*} net 
 * @returns {InitializedNet}
 */
function initVariables(net) {
  return {
    places: net.place ?? [],
    expTrans: net.exponentialTransition ?? [], // EDSPN only
    immTrans: net.immediateTransition ?? [],
    timedTrans: net.timedTransition ?? [], // SCPN only
    arcs: net.arc ?? []
  }
}

/** 
 * @typedef {Object} Arc 
 * @property {string} id
 * @property {string} fromNode
 * @property {string} toNode
 * @property {string} type
*/

/**
 * 
 * @param {Arc} arc 
 * @param {string[]} ids 
 * @param {string[]} placesIDs 
 * @returns {boolean}
 */
function checkArcIsCorrectlyConnected(arc, ids, placesIDs) {
  let success = true;
  let sourceIsPlace;
  let targetIsPlace;
  if (ids.indexOf(arc.fromNode) === -1) {
    console.error(`\n\tIn Arc with id: ${arc.id}\n\tERROR - fromNode | Referenced node not found: ${arc.fromNode}`);
    success = false;
  }
  else {
    sourceIsPlace = placesIDs.indexOf(arc.fromNode) >= 0;
  }

  if (ids.indexOf(arc.toNode) === -1) {
    console.error(`\n\tIn Arc with id: ${arc.id}\n\tERROR - toNode | Referenced node not found: ${arc.toNode}`);
    success = false;
  }
  else {
    targetIsPlace = placesIDs.indexOf(arc.toNode) >= 0;
  }

  if (sourceIsPlace === undefined || targetIsPlace === undefined) {
    return success;
  }

  // Check that the arcs are connected between place and transitions only.
  if (sourceIsPlace ? targetIsPlace : !targetIsPlace) {
    console.error("----\n\tERROR:The arc with ID '" + arc.id + "' is not valid; it connects two transitions or two places.");
    console.error("\tSource is a place: " + (sourceIsPlace ? "yes" : "no"));
    console.error("\tTarget is a place: " + (targetIsPlace ? "yes" : "no") + "\n----");
    success = false;
  }
  return success;
}


/**
 * This functions checks that all IDS are unique and that referenced IDS exist.
 * @param {*} net 
 * @returns {boolean} success
 */
function checkIDs(net) {
  let success = true;
  /**@type{string[]} */
  let ids = []; // List of known IDs
  /**@type{string[]} */
  let placesIDs = [];
  let { places, expTrans, immTrans, timedTrans, arcs } = initVariables(net);
  for (const element of places) {
    ids.push(element['$'].id);
    placesIDs.push(element['$'].id);
    removeXmiID(element);
  }
  for (const element of expTrans) {
    ids.push(element['$'].id);
    removeXmiID(element);
  }
  for (const element of immTrans) {
    ids.push(element['$'].id);
    removeXmiID(element);
  }
  for (const element of timedTrans) {
    ids.push(element['$'].id);
    removeXmiID(element);
  }
  for (const element of arcs) {
    ids.push(element['$'].id);
    success = checkArcIsCorrectlyConnected(element['$'], ids, placesIDs);
    removeXmiID(element);
  }

  ids = ids.sort((a, b) => a.localeCompare(b));
  for (let i = 1; i < ids.length; i++) {
    if (ids[i] === ids[i - 1]) {
      console.error("\tERROR: The ID '" + ids[i] + "' is not unique.");
      success = false;
    }
  }

  return success;
}

/**
 * Places all elements of a given net in different location of concentrical circles
 * @param {*} net 
 */
function placeNodesCircle(net) {
  const pi2 = 6.28318530718;

  //Origin of the circumference
  const origin = {
    x: 800,
    y: 800
  };

  if (net.place && net.place.length > 0) {
    placeAllElementsInCircle(net.place, origin, 400, pi2 / net.place.length);
  }

  if (net.immediateTransition && net.immediateTransition.length > 0) {
    placeAllElementsInCircle(net.immediateTransition, origin, 200, pi2 / net.immediateTransition.length);
  }

  if (net.deterministicTransition && net.deterministicTransition.length > 0) //EDSPN only
  {
    placeAllElementsInCircle(net.deterministicTransition, origin, 600, pi2 / net.deterministicTransition.length);
  }

  if (net.timedTransition && net.timedTransition.length > 0) //SCPN only
  {
    placeAllElementsInCircle(net.timedTransition, origin, 600, pi2 / net.timedTransition.length);
  }

  if (net.exponentialTransition && net.exponentialTransition.length > 0) {
    placeAllElementsInCircle(net.exponentialTransition, origin, 150, pi2 / net.exponentialTransition.length);
  }
}

/**
 * 
 * @param {*} elements 
 * @param {{x:number, y: number}} origin 
 * @param {number} radius 
 * @param {number} step 
 * @param {number} [startingAngle=0]  
 */
function placeAllElementsInCircle(elements, origin, radius, step, startingAngle = 0) {
  let angle = startingAngle;
  elements.forEach(t => {
    moveGraphicInCircle(t, origin, radius, angle);
    angle += step;
  });
}

/**
 * Move the given element to a location (angle) on the circonference of a circle of a given origin, radius
 * @param {*} el 
 * @param {{x:number, y: number}} origin 
 * @param {number} radius 
 * @param {number} angle 
 */
function moveGraphicInCircle(el, origin, radius, angle) {
  if (el.graphics) {
    el.graphics[0]['$']['x'] = Math.round(origin.x + radius * Math.cos(angle));
    el.graphics[0]['$']['y'] = Math.round(origin.y + radius * Math.sin(angle));
  }
  else {
    return fatalError(`Element with ID "${el.id}" does not have a graphic`);
  }
}