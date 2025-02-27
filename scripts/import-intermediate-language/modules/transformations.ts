const scalingFactor = 1000;
interface InputData {
    name: string;
    timestamp: number;
    duration: number;
    components: Component[];
    sources: Source[];
    connections: Connector[];
}

interface Source {
    id: string;
    name: string;
    executionFunction: ExecutionFunction;
    parameters: Parameter[];
    outputPins: OutputPin[];
}

interface Component {
    id: string;
    name: string;
    readonly settings?: SettingItem[];
    parameters: Parameter[];
    outputSize: string;
    executionFunction: ExecutionFunction;
    outputPins: OutputPin[];
    inputPins: InputPin[];
}

interface SettingItem {
    key: string;
    value: (number | string | boolean);
}

interface Connector {
    source: string;
    target: string;
    transferTime: number;
}

interface InputPin {
    id: string;
}

interface OutputPin {
    id: string;
    dataFunction: string;
    results?: Result[] | null;
}

interface Result {
    value: number;
    probability: number;
    outputSize: number;
}

interface Parameter {
    name: string;
    value: number;
}

interface ExecutionFunction {
    meanValue: string | number;
    stdDev: number;
    maxError: number;
}

const ID_SEPARATOR = "__";

/**
 * Transforms the given object to an E4SM model
 */
export default function generateE4SM(input: InputData): string {
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
function executionFunctionToString(ef: ExecutionFunction): string {
    if (ef.stdDev > 0) {
        return `Norm((${ef.meanValue}) * ${scalingFactor}, (${ef.stdDev})* ${scalingFactor})`;
    }
    return `Det((${ef.meanValue}) * ${scalingFactor})`;
}
/**
 * 
 * @deprecated
 */
function generateOutputFunction(outputFunction: string): string {
    return `\nruns {
        OUT_0 = ${outputFunction};
    }`;
}

function generateComponents(components: Component[]): string {
    let result = "// Components\n";
    for (let i = 0; i < components.length; i++) {
        result += generateComponent(components[i]);
        if ((i + 1) < components.length)
            result += ",\n";
    }
    return result;
}

function generateComponent(c: Component): string {
    let collect = 1;
    if (c.settings && c.settings.length > 0) {
        let res = c.settings?.filter(s => s.key === 'collect');
        if (res?.length == 1) {
            collect = res[0].value as number;
        }
    }
    if (c.outputPins?.length > 0) {
        return `softwareComponent "${c.name}${ID_SEPARATOR}${c.id}" {
        takes ${executionFunctionToString(c.executionFunction)}
        ${generateInputPins(c.inputPins, collect)},
        ${generateOutputPins(c.outputPins, c.outputSize)}
        ${generateParameters(c.parameters)}
    }`;
    } else {
        return `actuator "${c.name}${ID_SEPARATOR}${c.id}" {
        takes ${executionFunctionToString(c.executionFunction)}
        ${generateInputPins(c.inputPins)}
        ${generateParameters(c.parameters)}
    }`;
    }
}

function generateSensors(sensors: Source[]): string {
    let result = "// Sensors\n";
    for (const s of sensors) {
        result += generateSensor(s) + ", "; // always print the comma, as it is followed by other components...
    }
    return result;
}

function generateSensor(s: Source): string {
    return `sensor "${s.name}${ID_SEPARATOR}${s.id}" {
        takes ${executionFunctionToString(s.executionFunction)}
        ${generateOutputPins(s.outputPins)}
        ${generateParameters(s.parameters)}
    }`;
}

function generateParameters(parameters: Parameter[] | null): string {
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

function generateInputPins(iPins: InputPin[], collect = 1): string {
    let result = "// Input Pins\n";
    for (const [i, p] of iPins.entries()) {
        result += `in "${p.id}"`;
        if (collect > 1) {
            result += ` {
                    collects ${collect}
                }`;
        }
        if ((i + 1) < iPins.length) { result += ",\n"; }
    }
    return result;
}

function generateOutputPins(oPins: OutputPin[], oSize: string | null = null): string {
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
            result += ` = ${oSize}`
        }
        if ((i + 1) < oPins.length)
            result += ",\n";
    }
    return result;
}

function generateConnectors(connectors: Connector[]): string {
    let result = "// Connectors\n";
    for (let i = 0; i < connectors.length; i++) {
        const c = connectors[i];
        result += `connector "${c.source}_to_${c.target}" "${c.source}" -> "${c.target}"`;
        if (c.transferTime) {
            result += ` {
                    takes Det((${c.transferTime})*${scalingFactor})
            } `
        }
        if ((i + 1) < connectors.length)
            result += ",\n";
    }
    return result;
}

/**
 * Check that the probabilities of all objects of an array sum to 1.
 */
function probabilitiesSumToOne(results: Result[]): boolean {
    // multiplying to 100 to avoid working with float numbers and epsilon.
    // this may not always work if a probability smaller than 1% is provided
    return results.map(r => r.probability * 100).reduce((a, b) => a + b) === 100;
}