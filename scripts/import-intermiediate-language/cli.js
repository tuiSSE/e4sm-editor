#!/usr/bin/env node

"use strict";

import assert from 'node:assert/strict';
import { Validator } from 'jsonschema';
import { readFile, writeFile } from 'fs/promises';
import commandLineArgs from 'command-line-args';
import commandLineUsage from 'command-line-usage'
import generateE4SM from './modules/transformations.js';
import * as path from 'path';
import * as url from 'url';

const __dirname = url.fileURLToPath(new URL('.', import.meta.url));

const optionDefinitions = [
    { name: 'source', alias: 's', type: String, description: "The path of the input file, in the intermediate language model JSON format" },
    { name: 'target', alias: 't', type: String, description: "The optional path of the output e4sm file. If not provided, it will be generated to ./out.e4smcode" }
]
const options = commandLineArgs(optionDefinitions)

const schemaPath = path.join(__dirname, "./schema.json");
const v = new Validator();

async function run() {
    if (!options.source) {
        console.error("Error: source option is required!");
        printHelp();
        process.exit(1);
    }

    console.log(`Converting file ${options.source}`);
    const input = await loadJSONFile(options.source);
    const schema = await loadSchema();

    // Check that the input follows the schema
    if (!isValid(input, schema)) {
        console.error("The given file does not follow the required schema, please fix the errors listed above and retry.");
        process.exit(1);
    }
    console.log("Input file format is valid");

    // console.dir(input); // TODO remove

    let res = generateE4SM(input);

    // console.log(res); // TODO out to file
    writeStringToFile(res, options.target ?? "out.e4smcode");

    // Run tests with runTests();
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
    console.debug(`Writing file to ${path} …`);
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
