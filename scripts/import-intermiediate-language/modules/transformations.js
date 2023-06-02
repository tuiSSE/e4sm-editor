const scalingFactor = 1000;
/** 
 * @typedef {Object} InputData
 * @property {string} name
 * @property {number} timestamp
 * @property {Component[]} components
 * @property {Source[]} sources
 * @property {Connector[]} connections
 */

/** 
 * @typedef {Object} Source
 * @property {string} id
 * @property {string} name
 * @property {ExecutionFunction} executionFunction
 * @property {OutputPin[]} outputPins
 */

/** 
 * @typedef {Object} Component
 * @property {string} id
 * @property {string} name
 * @property {Parameter} parameters
 * @property {string} outputSize - a function describing the size of the output
 * @property {ExecutionFunction} executionFunction
 * @property {OutputPin[]} outputPins
 * @property {InputPin[]} inputPins
 */

/** 
 * @typedef {Object} Connector
 * @property {string} source
 * @property {string} target
 * @property {number} transferTime
 */

/** 
 * @typedef {Object} InputPin
 * @property {string} id
 */

/** 
 * @typedef {Object} OutputPin
 * @property {string} id
 * @property {string} dataFunction
 * @property {Result[]=} results
 */

/** 
 * @typedef {Object} Result 
 * @property {number} value
 * @property {number} probability
 * @property {number} outputSize
*/

/** 
 * @typedef {Object} Parameter
 * @property {string} name
 * @property {number} value
 */

/** 
 * @typedef {Object} ExecutionFunction
 * @property {string|number} meanValue - The formula computing the execution time of the given component.
 * @property {number} stdDev
 * @property {number} maxError
 */

const ID_SEPARATOR = "__";

/**
 * Transforms the given object to an E4SM model
 * @param {InputData} input 
 * @returns {string}
 */
function generateE4SM(input) {
    return `// Generated from '${input.name}', : '${new Date(input.timestamp * 1000).toLocaleString()}'
    model "${input.name}_model"{
        package "${input.name}" {
            ${generateSensors(input.sources)}
            ${generateComponents(input.components)}
            ${generateConnectors(input.connections)}
        }
    }`;
}

/**
 * 
 * @param {ExecutionFunction} ef 
 * @returns {String}
 */
function executionFunctionToString(ef) {
    if (ef.stdDev > 0) {
        return `Norm((${ef.meanValue}) * ${scalingFactor}, (${ef.stdDev})* ${scalingFactor})`;
    }
    return `Det((${ef.meanValue}) * ${scalingFactor})`;
}

/**
 * 
 * @param {string} outputFunction 
 * @returns {string}
 */
function generateOutputFunction(outputFunction){
    return `\nruns {
        OUT_0 = ${outputFunction};
    }`;
}


/**
 * 
 * @param {Component[]} components 
 * @returns {string}
 */
function generateComponents(components) {
    let result = "// Components\n";
    for (let i = 0; i < components.length; i++) {
        const c = components[i];
        if (c.outputPins?.length > 0) {
            result += `softwareComponent "${c.name}${ID_SEPARATOR}${c.id}" {
            takes ${executionFunctionToString(c.executionFunction)}
            ${generateInputPins(c.inputPins)},
            ${generateOutputPins(c.outputPins)}
            ${generateParameters(c.parameters)}
            ${generateOutputFunction(c.outputSize)}
        }`;
        } else {
            result += `actuator "${c.name}${ID_SEPARATOR}${c.id}" {
            takes ${executionFunctionToString(c.executionFunction)}
            ${generateInputPins(c.inputPins)}
            ${generateParameters(c.parameters)}
    }`;
        }
        if ((i + 1) < components.length)
            result += ",\n";
    }
    return result;
}

/**
 * 
 * @param {Source[]} sensors 
 * @returns {string}
 */
function generateSensors(sensors) {
    let result = "// Sensors\n";
    for (const s of sensors) {
        result += `sensor "${s.name}${ID_SEPARATOR}${s.id}" {
            takes ${executionFunctionToString(s.executionFunction)}
            ${generateOutputPins(s.outputPins)}
            ${generateParameters(s.parameters)}
            }, `; // always print the comma, as it is followed by other components...
    }
    return result;
}

/**
 * 
 * @param {Parameter[]=} parameters 
 * @returns {string}
 */
function generateParameters(parameters) {
    if (!parameters || parameters.length === 0) return "";

    let result = "// Parameters\n";
    result += "parameters {";
    for (let i = 0; i < parameters.length; i++) {
        const p = parameters[i];
        result += `par "${p.name}" := ${p.value} `;
        if ((i + 1) < parameters.length)
            result += ",\n";
    }
    result += "}"
    return result;
}

/**
 * 
 * @param {InputPin[]} iPins 
 * @returns {string}
 */
function generateInputPins(iPins) {
    let result = "// Input Pins\n";
    for (const [i, p] of iPins.entries()) {
        result += `in "${p.id}"`;
        if ((i + 1) < iPins.length) { result += ",\n"; }
    }
    return result;
}

/**
 * 
 * @param {OutputPin[]} oPins 
 * @returns {string}
 */
function generateOutputPins(oPins) {
    let result = "// Output Pins\n";
    for (let i = 0; i < oPins.length; i++) {
        const p = oPins[i];
        result += `out "${p.id}"`;
        if (p.results) {
            if (!probabilitiesSumToOne(p.results)) {
                console.error(`The given probabilities for the output pin ${p.id} do not sum up to one`);
                process.exit(1);
            }
            result += ' {\ngenerates set {';
            for (const element of p.results) {
                result += `value: "${element.value}" prob: ${element.probability.toFixed(3)}  size:${element.outputSize.toFixed(3)};`;
            }
            result += '}\n}\n';
        }
        if ((i + 1) < oPins.length)
            result += ",\n";
    }
    return result;
}

/**
 * 
 * @param {Connector[]} connectors 
 * @returns {string}
 */
function generateConnectors(connectors) {
    let result = "// Connectors\n";
    for (let i = 0; i < connectors.length; i++) {
        const c = connectors[i];
        result += `connector "${c.source}_to_${c.target}" "${c.source}" -> "${c.target}"`;
        if (c.transferTime) {
            result += ` {
                    takes Det(${c.transferTime})
            } `
        }
        if ((i + 1) < connectors.length)
            result += ",\n";
    }
    return result;
}

/**
 * Check that the probabilities of all objects of an array sum to 1.
 * @param {Result[]} results
 * @returns {boolean} 
 */
function probabilitiesSumToOne(results) {
    // multiplying to 100 to avoid working with float numbers and epsilon.
    // this may not always work if a probability smaller than 1% is provided
    return results.map(r => r.probability * 100).reduce((a, b) => a + b) === 100;
}

export default generateE4SM;