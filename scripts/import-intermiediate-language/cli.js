import assert from 'node:assert/strict';
import { Validator } from 'jsonschema';
import { readFile, writeFile } from 'fs/promises';
import commandLineArgs from 'command-line-args';
import commandLineUsage from 'command-line-usage'

const optionDefinitions = [
    { name: 'source', alias: 's', type: String, description: "The path of the input file, in the intermediate language format" },
    { name: 'target', alias: 't', type: String, description: "The optional path of the output e4sm file. If not provided, it will be generated to ./out.e4smcode" }
]
const options = commandLineArgs(optionDefinitions)

const schemaPath = "./schema.json";
const v = new Validator();

async function run() {
    if (!options.source) {
        console.error("Error: source option is required!");
        printHelp();
        process.exit(1);
    }
    const input = await loadJSONFile(options.source);
    const schema = await loadSchema();

    // Check that the input follows the schema
    if (!isValid(input, schema)) {
        console.error("The given file does not follow the required schema, please fix the errors listed above and retry.");
        process.exit(1);
    }
    console.log("Input file is valid");
    
    console.dir(input); // TODO remove

    let res = generateE4SM(input);

    console.log(res); // TODO out to file
    writeStringToFile(res, options.target ?? "out.e4smcode");

    //runTests();
}

/**
 * Transforms the given object to an E4SM model
 * @param {object} input 
 * @returns string
 */
function generateE4SM(input) {
    return `model "${input.name}_model"{
        package "${input.name}" {
            ${generateComponents(input.components)}
            ${generateConnectors(input.connections)}
        }
    }`;
}

function generateComponents(components){
    let result = "// Components\n";
    for (let i = 0; i < components.length; i++) {
        const c = components[i];
        result += `component "${c.name}|${c.id}" {
            takes Det(${c.executionFunction.meanValue})
            ${generateInputPins(c.inputPins)}
            ${generateOutputPins(c.outputPins)}
        }`;
        if ((i + 1) < components.length)
            result += ",\n";
    };
    return result;
}

function generateInputPins(pins){
    let result = "// Input Pins\n";
    for (let i = 0; i < pins.length; i++) {
        const p = pins[i];
        result += `in "${p.id}"`;
        //if ((i + 1) < pins.length)
            result += ",\n";
    };
    return result;
}

function generateOutputPins(pins){
    let result = "// Output Pins\n";
    for (let i = 0; i < pins.length; i++) {
        const p = pins[i];
        result += `out "${p.id}"`;
        if ((i + 1) < pins.length)
            result += ",\n";
    };
    return result;
}

function generateConnectors(connectors) {
    let result = "// Connectors\n";
    for (let i = 0; i < connectors.length; i++) {
        const c = connectors[i];
        result += `connector "${c.source}_to_${c.target}" "${c.source}"->"${c.target}"`;
        if ((i + 1) < connectors.length)
            result += ",\n";
    };
    return result;
}

function printHelp() {
    const sections = [
        {
            header: 'Intermediate Language Importer',
            content: 'Converts an intermediate language JSON to an E4SM model'
        },
        {
            header: 'Options',
            optionList: optionDefinitions
        }
    ];
    const usage = commandLineUsage(sections)
    console.log(usage)
}

async function loadSchema() {
    return loadJSONFile(schemaPath);
}

export async function runTests() {
    const schema = await loadSchema();

    console.log("\nSuccessful test:")
    const testSuccess = await loadJSONFile("./tests/success.json");
    assert(isValid(testSuccess, schema));
    console.log("... pass");

    console.log("\nFailing test:")
    const testFail = await loadJSONFile("./tests/fail.json");
    assert(isValid(testFail, schema) === false);
    console.log("... pass");
}

async function loadJSONFile(path) {
    try {
        const data = await readFile(path, { encoding: 'utf8' });
        return JSON.parse(data);
    } catch (err) {
        console.error(err);
    }
    process.exit(1);
}

/**
 * 
 * @param {string} content 
 * @param {string} path 
 * @returns 
 */
async function writeStringToFile(content, path) {
    try {
      await writeFile(path, content);
      return;
    } catch (err) {
      console.log(err);
    }
    process.exit(1);
  }

function isValid(instance, schema) {
    const res = v.validate(instance, schema);
    res.errors.forEach(element => {
        console.error(element.stack);
    });
    return res.errors.length === 0;
}


run();


// TODOs
// - check that the results probabilities sum to 1.0