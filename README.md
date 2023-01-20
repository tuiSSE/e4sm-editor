# ABCD Editor
This project contains [Eclipse](https://eclipse.org) plugins required to realize the ABCD Editor. The editor has been realized with [Eclipse Sirius](https://www.eclipse.org/sirius/).

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
- **Compute Response time**: In some scenarios, the system needs to react within a given time to a certain event. This reaction may be decided through a series of different components, which all add a different delay. A statistical analysis should check if it is likely that the system will react within a given time or not.
- **Security**: The editor should consider and analyze security aspects too, but this currently out of focus due to the lack of a specialized employee.

## Plugins overview
### [abcd.xy.antlr4.petri.grammar](plugins/abcd.xy.antlr4.petri.grammar)
Contains an ANTLR grammar which specifies which strings are valid inside TimeNET's SCPN models. It should be used to parse and validate the content of the strings which are manually inserted in the model editors.

### [abcd.xy.metamodel](plugins/abcd.xy.metamodel)
It contains the **ecore metamodel specification** for the ABCD data model. It includes Java interfaces and implementation classes for all the classes in the model, plus a factory and package (metadata) implementation class.

### [abcd.xy.metamodel.edit](plugins/abcd.xy.metamodel.edit)
Generated implementation classes (called `ItemProviders`) that adapt the model classes for editing and display. In this project you can find all elements **icons** which are used almost everywhere.

### [abcd.xy.metamodel.editor](plugins/abcd.xy.metamodel.editor)
It contains a structured, simple editor that conforms to the recommended style for Eclipse EMF model editors.

### [abcd.xy.metamodel.design](plugins/abcd.xy.metamodel.design)
Contains the Sirius Viewpoint Specification Project of the graphical ABCD editor (diagrams).

## Packaging folder overview
### [abcd.xy.metamodel.feature](packaging/abcd.xy.metamodel.feature)
It contains a feature project containing the metamodel projects (metamodel, edit, editor) and the Sirius viewpoint specification project.

### [abcd.xy.metamodel.update](packaging/abcd.xy.metamodel.update)
It contains the project needed to build the update site in order to distribute the editor.

## Acknowledgments
This work has received funding from the _[Carl Zeiss Foundation](https://www.carl-zeiss-stiftung.de/english)_ as part of the project _"Engineering for Smart Manufacturing"_ (ABCD) under grant agreement no. P2017-01-005.

### More information
- [ABCD Project Website](https://abcd-projekt.de) (in German only)
#### Regulations
- **Safety**: ISO 26262 "Road vehicles – Functional safety", is an international standard for functional safety of electrical and/or electronic systems that are installed in serial production road vehicles.
- **Security**: ISO/IEC 27001 is an international standard on how to manage information security.

#### Eclipse Tools
- *Eclipse Modeling Tools* - Tested with version 2022-03 [download the package from here](https://www.eclipse.org/downloads/packages/). We recommend not using the installer.
##### Eclipse Modeling Tools Already includes
- [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/modeling/emf/)
##### To be installed additionally
- [Eclipse Sirius](https://www.eclipse.org/sirius) - Used to create the drag-and-drop model editor. Tested with v. 7.0.0
- [QVTo](https://projects.eclipse.org/projects/modeling.mmt.qvt-oml)
