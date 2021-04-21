# E4SM Editor
This project contains [Eclipse](https://eclipse.org) plugins required to realize the E4SM Editor. The editor has been realized with [Eclipse Sirius](https://www.eclipse.org/sirius/).

{:toc}

## Goal
The Objective of this editor, is to simplify the application of machine learning methods for small and medium-sized enterprises (SMEs).

ML-based methods must be combined with conventional methods in a system development process ("engineering") in such a way that the resulting overall system consisting of assistance system and existing infrastructure fulfills all functional (framework conditions) and non-functional requirements (security, safety, reliability) in a verifiable and certifiable manner.

In contrast to current research work on the use of machine learning in individual industrial applications, the unique selling point of this project  is that integrated and holistic engineering methods for the overall manufacturing process are being researched. This should make the use of ML methods plannable and controllable for SMEs and minimize the barriers to entry, for example in manufacturing processes with assistance robotics.

Given the complexity of industrial scenarios and the large number of players active in this field, the researchers involved in this project aim to achieve breakthroughs in the systems engineering of ML-based assistance systems by developing an integrated approach that covers the important core areas of data analytics & management, cross-domain machine learning, software engineering, collaborative robotics, and IT security & safety.

### Analysis Objectives
- **Errors propagation**: Every component of the system may contribute to amplifying or reducing errors which generate inside a system. The analysis should be able to simulate how certain errors (generated for example from wrong results from machine learning and heuristic-based components) impact the stability of the entire system.
- **Data flow capacity**: The model and the editor should be allow specifying the load capacity of all connection and the amount of data (including the format) that will be sent on them. The analysis should check if the available connectors are able to support the required data flow.
- **Security**: The editor should consider and analyze safety aspects too, but this currently out of focus due to the lack of a specialized employee.

## Plugins overview
### e4sm.de.metamodel
Contains the ecore metamodel specification for the e4sm data model. It contains Java interfaces and implementation classes for all the classes in the model, plus a factory and package (meta data) implementation class.

### e4sm.de.metamodel.edit
Generated implementation classes (called ItemProviders) that adapt the model classes for editing and display.

### e4sm.de.metamodel.editor
Contains a structured simple editor that conforms to the recommended style for Eclipse EMF model editors.

### e4sm.de.metamodel.design
Contains the Sirius Viewpoint Specification Project of the graphical E4SM editor (diagrams).

## Acknowledgments
This work has received funding from the _[Carl Zeiss Foundation](https://www.carl-zeiss-stiftung.de/english)_ as part of the project _"Engineering for Smart Manufacturing"_ (E4SM) under grant agreement no. P2017-01-005.
