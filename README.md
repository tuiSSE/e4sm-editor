# E4SM Editor
This project contains [Eclipse](https://eclipse.org) plugins required to realize the E4SM Editor. The editor has been realized with [Eclipse Sirius](https://www.eclipse.org/sirius/).

## Goal
The Objective of this editor, is to simplify the application of machine learning methods for small and medium-sized enterprises.

ML-based methods must be combined with conventional methods in a system development process ("engineering") in such a way that the resulting overall system consisting of assistance system and existing infrastructure fulfills all functional (framework conditions) and non-functional requirements (security, safety, reliability) in a verifiable and certifiable manner.

### Plugins overview
#### e4sm.de.metamodel
Contains the ecore metamodel specification for the e4sm data model. It contains Java interfaces and implementation classes for all the classes in the model, plus a factory and package (meta data) implementation class.

#### e4sm.de.metamodel.edit
Generated implementation classes (called ItemProviders) that adapt the model classes for editing and display.

#### e4sm.de.metamodel.editor
Contains a structured simple editor that conforms to the recommended style for Eclipse EMF model editors.

#### e4sm.de.metamodel.design
Contains the Sirius Viewpoint Specification Project of the graphical E4SM editor (diagrams).

### Acknowledgments
This work has received funding from the _[Carl Zeiss Foundation](https://www.carl-zeiss-stiftung.de/english)_ as part of the project _"Engineering for Smart Manufacturing"_ (E4SM) under grant agreement no. P2017-01-005.
