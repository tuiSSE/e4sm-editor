# ConstraintsTestProject
This *Modeling Project* contains an ABCD Model which contains all type of connections which are syntactically allowed in the model but should be marked as wrong by the EMF validator.

The ABCD Sirius Editor should not allow creating invalid elements or connections, so you should create them through the EMF-generated tree editor, by opening the [Constraints.abcd](Constraints.abcd) file.

Every name should be named or annotated with the name of the Constraint it is invalidating.

You can use the diagram inside [representations.aird](representations.aird) to visualize the invalid model graphically.

## Updating this Model
Every time a constraint gets modified (added, changed or removed) in the [ecore metamodel](../../plugins/abcd.xy.metamodel/model/abcd.ecore), 
- You must update its relative test-case in this model.
- Export the representation as a png file into the [representations_images](representations_images) folder.