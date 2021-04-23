# E4SM Editor
This project contains [Eclipse](https://eclipse.org) plugins required to realize the E4SM Editor. The editor has been realized with [Eclipse Sirius](https://www.eclipse.org/sirius/).

## Table of Contents
 [[_TOC_]]

## Goal
The Objective of this editor is to simplify the application of machine learning methods for small and medium-sized enterprises (SMEs).

ML-based methods must be combined with conventional methods in a system development process ("engineering") in such a way that the resulting overall system consisting of assistance system and existing infrastructure fulfills all functional (framework conditions) and non-functional requirements (security, safety, reliability) in a verifiable and certifiable manner.

In contrast to current research work on the use of machine learning in individual industrial applications, the unique selling point of this project is that integrated and holistic engineering methods for the overall manufacturing process are being researched. This process should make ML methods plannable and controllable for SMEs and minimize the barriers to using manufacturing processes with assistance robotics.

Given the complexity of industrial scenarios and a large number of players active in this field, the researchers involved in this project aim to achieve breakthroughs in the systems engineering of ML-based assistance systems by developing an integrated approach that covers the important core areas of data analytics & management, cross-domain machine learning, software engineering, collaborative robotics, and IT security & safety.

In order to be executable, all model elements need to have a *precise formal semantics*.

### Analysis Objectives
- **Errors propagation**: Every component of the system may amplify or reduce errors that generate inside a system. The analysis should simulate how specific errors (caused, for example, from wrong results from machine learning and heuristic-based components) impact the entire system's stability.
- **Data flow capacity**: The model and the editor should allow specifying the load capacity of all connections and the amount/format of data (for example, pictures resolution) that the other components will send on them. The analysis should check if the available connectors can support the required data flow.
- **Security**: The editor should consider and analyze safety aspects too, but this currently out of focus due to the lack of a specialized employee.

## Plugins overview
### [e4sm.de.metamodel](plugins/e4sm.de.metamodel)
It contains the ecore metamodel specification for the e4sm data model. It includes Java interfaces and implementation classes for all the classes in the model, plus a factory and package (metadata) implementation class.

### [e4sm.de.metamodel.edit](plugins/e4sm.de.metamodel.edit)
Generated implementation classes (called ItemProviders) that adapt the model classes for editing and display.

### [e4sm.de.metamodel.editor](plugins/e4sm.de.metamodel.editor)
It contains a structured, simple editor that conforms to the recommended style for Eclipse EMF model editors.

### [e4sm.de.metamodel.design](plugins/e4sm.de.metamodel.design)
Contains the Sirius Viewpoint Specification Project of the graphical E4SM editor (diagrams).

## Packaging folder overview
### [e4sm.de.metamodel.feature](plugins/e4sm.de.metamodel.feature)
It contains a feature project containing the metamodel projects (metamodel, edit, editor) and the Sirius viewpoint specification project.

### [e4sm.de.metamodel.update](plugins/e4sm.de.metamodel.update)
It contains the project needed to build the update site in order to distribute the editor.

## Acknowledgments
This work has received funding from the _[Carl Zeiss Foundation](https://www.carl-zeiss-stiftung.de/english)_ as part of the project _"Engineering for Smart Manufacturing"_ (E4SM) under grant agreement no. P2017-01-005.

### More information
#### Regulations
- **Safety**: ISO 26262 "Road vehicles – Functional safety", is an international standard for functional safety of electrical and/or electronic systems that are installed in serial production road vehicles.
- **Security**: ISO/IEC 27001 is an international standard on how to manage information security.

#### Eclipse Tools
- *Eclipse Modeling Tools* - Tested with version 2021-03 R [download the package from here](https://www.eclipse.org/downloads/packages/). We recommend not using the installer.
- [Eclipse Sirius](https://www.eclipse.org/sirius)
