/**
 * Transforms the given object to an E4SM model
 * @param {Object} input 
 * @returns {string}
 */
function generateE4SM(input) {
    return `model "${input.name}_model"{
        package "${input.name}" {
            ${generateComponents(input.components)}
            ${generateConnectors(input.connections)}
        }
    }`;
}

/**
 * 
 * @param {Object[]} components 
 * @returns {string}
 */
function generateComponents(components){
    let result = "// Components\n";
    for (let i = 0; i < components.length; i++) {
        const c = components[i];
        result += `component "${c.name}!${c.id}" {
            takes Det(${c.executionFunction.meanValue})
            ${generateInputPins(c.inputPins)}
            ${generateOutputPins(c.outputPins)}
            ${generateParameters(c.parameters)}
        }`;
        if ((i + 1) < components.length)
            result += ",\n";
    };
    return result;
}

/**
 * 
 * @param {Object[]} parameters 
 * @returns {string}
 */
function generateParameters(parameters){
    if(!parameters || parameters.length===0) return "";

    let result = "// Parameters\n";
    result += "parameters {";
    for (let i = 0; i < parameters.length; i++) {
        const p = parameters[i];
        result += `par "${p.name}" := ${p.value}`;
        if ((i + 1) < parameters.length)
            result += ",\n";
    };
    result += "}"
    return result;
}

/**
 * 
 * @param {Object[]} pins 
 * @returns {string}
 */
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

/**
 * 
 * @param {Object[]} pins 
 * @returns {string}
 */
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

/**
 * 
 * @param {Object[]} connectors 
 * @returns {string}
 */
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

export default generateE4SM;