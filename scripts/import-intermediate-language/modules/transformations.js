const scalingFactor = 1000;
const ID_SEPARATOR = "__";
/**
 * Transforms the given object to an E4SM model
 */
export default function generateE4SM(input) {
    return `// Generated on ${new Date().toLocaleString()} from '${input.name}' '${new Date(input.timestamp * 1000).toLocaleString()}'
    model "${input.name}_model"{
        package "${input.name}" {
            ${input.duration ? 'simulationDuration :' + input.duration : ''}
            ${generateSensors(input.sources)}
            ${generateComponents(input.components)}
            ${generateConnectors(input.connections)}
        }
    }`;
}
/**
 * transforms an execution function element to its string representation
 */
function executionFunctionToString(ef) {
    if (ef.stdDev > 0) {
        return `Norm((${ef.meanValue}) * ${scalingFactor}, (${ef.stdDev})* ${scalingFactor})`;
    }
    return `Det((${ef.meanValue}) * ${scalingFactor})`;
}
/**
 *
 * @deprecated
 */
function generateOutputFunction(outputFunction) {
    return `\nruns {
        OUT_0 = ${outputFunction};
    }`;
}
function generateComponents(components) {
    let result = "// Components\n";
    for (let i = 0; i < components.length; i++) {
        result += generateComponent(components[i]);
        if ((i + 1) < components.length)
            result += ",\n";
    }
    return result;
}
function generateComponent(c) {
    var _a, _b;
    let collect = 1;
    if (c.settings && c.settings.length > 0) {
        let res = (_a = c.settings) === null || _a === void 0 ? void 0 : _a.filter(s => s.key === 'collect');
        if ((res === null || res === void 0 ? void 0 : res.length) == 1) {
            collect = res[0].value;
        }
    }
    if (((_b = c.outputPins) === null || _b === void 0 ? void 0 : _b.length) > 0) {
        return `softwareComponent "${c.name}${ID_SEPARATOR}${c.id}" {
        takes ${executionFunctionToString(c.executionFunction)}
        ${generateInputPins(c.inputPins, collect)},
        ${generateOutputPins(c.outputPins, c.outputSize)}
        ${generateParameters(c.parameters)}
    }`;
    }
    else {
        return `actuator "${c.name}${ID_SEPARATOR}${c.id}" {
        takes ${executionFunctionToString(c.executionFunction)}
        ${generateInputPins(c.inputPins)}
        ${generateParameters(c.parameters)}
    }`;
    }
}
function generateSensors(sensors) {
    let result = "// Sensors\n";
    for (const s of sensors) {
        result += generateSensor(s) + ", "; // always print the comma, as it is followed by other components...
    }
    return result;
}
function generateSensor(s) {
    return `sensor "${s.name}${ID_SEPARATOR}${s.id}" {
        takes ${executionFunctionToString(s.executionFunction)}
        ${generateOutputPins(s.outputPins)}
        ${generateParameters(s.parameters)}
    }`;
}
function generateParameters(parameters) {
    if (!parameters || parameters.length === 0)
        return "";
    let result = "// Parameters\n";
    result += "parameters {";
    for (let i = 0; i < parameters.length; i++) {
        const p = parameters[i];
        result += `par "${p.name}" := ${p.value} `;
        if ((i + 1) < parameters.length)
            result += ",\n";
    }
    result += "}";
    return result;
}
function generateInputPins(iPins, collect = 1) {
    let result = "// Input Pins\n";
    for (const [i, p] of iPins.entries()) {
        result += `in "${p.id}"`;
        if (collect > 1) {
            result += ` {
                    collects ${collect}
                }`;
        }
        if ((i + 1) < iPins.length) {
            result += ",\n";
        }
    }
    return result;
}
function generateOutputPins(oPins, oSize = null) {
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
        if (oSize) {
            result += ` = ${oSize}`;
        }
        if ((i + 1) < oPins.length)
            result += ",\n";
    }
    return result;
}
function generateConnectors(connectors) {
    let result = "// Connectors\n";
    for (let i = 0; i < connectors.length; i++) {
        const c = connectors[i];
        result += `connector "${c.source}_to_${c.target}" "${c.source}" -> "${c.target}"`;
        if (c.transferTime) {
            result += ` {
                    takes Det((${c.transferTime})*${scalingFactor})
            } `;
        }
        if ((i + 1) < connectors.length)
            result += ",\n";
    }
    return result;
}
/**
 * Check that the probabilities of all objects of an array sum to 1.
 */
function probabilitiesSumToOne(results) {
    // multiplying to 100 to avoid working with float numbers and epsilon.
    // this may not always work if a probability smaller than 1% is provided
    return results.map(r => r.probability * 100).reduce((a, b) => a + b) === 100;
}
