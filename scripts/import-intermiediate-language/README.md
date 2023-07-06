# Intermediate Language Model (ILM) to E4SM
This command line package allows converting an Intermediate Language Model JSON file to an E4SM model in ```.e4smcode``` format.

## Installation instruction
Install globally using the command:
```npm install --global @tuiilm/intermediate-language-model-to-e4sm```

## Usage
Place yourself in the folder containing your ILM file, and run:
* ```ILMtoE4SM -s <pathToSourceFile> [-t <pathToOutputFile>]``` transforms the given ILM Model to an e4smcode file. The output file will be named ```<pathToOutputFile>``` or out.e4smcode if not provided.