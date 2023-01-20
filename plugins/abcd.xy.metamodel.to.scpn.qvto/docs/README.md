# Setting up a Transformation

## QVTo run configuration
* Go to ```Run > Run Configurations ```
* Right click on ```QVT Operational Transformation``` then ```New Configuration```
### In the **Transformation** tab:
* Transformation module: ```platform:/plugin/abcd.xy.metamodel.to.scpn.qvto/transforms/transformToSCPN.qvto```

* Recommended: Tick "Generate trace file"

* IN model: your ```<abcdModel>.xml``` or ```<abcdModel>.abcdcode``` file
* OUT model: the path where you want your file to be generated, the extension of the new file must be .xml

### In the **Configuration** tab:
* type the name of the package you want to transform in the value of the *packageName* row.

## Fixing the generated file to work in TimeNet

**Requirement**: recent versions of NodeJS and npm.

*Just once*: Install globally [@tuiilm/timenet-xml-fix](https://www.npmjs.com/package/@tuiilm/timenet-xml-fix)

* Right click on your project folder in ```eclipse > Properties > Builders```
* Click on ```new```
* Select ```Program``` then ```OK```

* Inside *Location* set the path of the globally installed npm script, which is the result of the console command:
  * Windows: ```where tn-fix-xml``` (the one ending with ```.cmd```)
  * Linux: ```whereis tn-fix-xml``` (the one without any extension)

* Inside *Working Directory*, select the folder which contains your QVTo generated file.

* Inside *Arguments*:
```<file_name> -o -a``` **o** and **a** are optional arguments (optimize and arrange, see [here](https://www.npmjs.com/package/@tuiilm/timenet-xml-fix) for further information and parameters)

* Click on ```Apply``` and ```OK```

* Uncheck the checbox on the left of the item you have just created, and click on ```Apply and close```

## Running both configurations at once
* Go to ```Run > Run Configurations ```
* Right click on ```Launch Group``` then ```New Configuration```
* Click on ```Add``` and then pick your QVTo transformation
* In the ```Post launch action```, select ```Wait until terminated```
* Click on ```Add``` and then pick your defined Program.
