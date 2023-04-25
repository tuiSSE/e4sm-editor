@ECHO off
:: Transforms tests/success.json to .result.e4smcode

node cli.js -s tests/success.json -t .result.e4smcode