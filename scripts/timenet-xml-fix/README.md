# TimeNET XML Fix
This command line package allows converting the result of a QVTo Model-To-Model Transformation (MMT) to an XML format which is compatible with the Petri Net software TimeNET.

## Installation instruction
Install globally using the command:
```npm install --global @tuiilm/timenet-xml-fix```

## Usage
Place yourself in the folder containing your genared Petri Net file, and run:
* ```tn-fix-xml <fileName>[.xml]``` transforms the given Petri Net to a format which can be opened by TimeNET. The output file will be named ```<filename>_compatible.xml```

* ```tn-fix-xml <fileName>[.xml] [-o|--optimize]``` also remove useless transitions, additionally stored as ```<filename>_optimized.xml```

* ```tn-fix-xml <fileName>[.xml] [-a|--arrange]``` additionally places the elements in circles of different radius to allow moving them more easily

## Related Software
* [TimeNET](https://timenet.tu-ilmenau.de)
* [QVTo](https://projects.eclipse.org/projects/modeling.mmt.qvt-oml)
