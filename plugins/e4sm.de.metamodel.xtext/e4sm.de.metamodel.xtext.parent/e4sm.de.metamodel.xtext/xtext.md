#  E4SM Textual Concrete Syntax Specification


Included grammars:
- `org.eclipse.xtext.common.Terminals`

Included metamodels:
- ecore (`http://www.eclipse.org/emf/2002/Ecore`)
- core (`http://de.tu-ilmenau/e4sm/core/1.0.0`)
- analysis (`http://de.tu-ilmenau/e4sm/analysis/1.0.0`)
- execution (`http://de.tu-ilmenau/e4sm/execution/1.0.0`)
- security (`http://de.tu-ilmenau/e4sm/security/1.0.0`)

##  Rules
###  Model  


**Refers to:**
- [Actor](#actor)
- [ClassificationClass](#classificationclass)
- [Documentation](#documentation)
- [EString](#estring)
- [Environment](#environment)
- [Import](#import)
- [KnownSecurityThreats](#knownsecuritythreats)
- [Name](#name)
- [PROPERTY_ASSIGN](#property_assign)
- [Package](#package)
- [Parameters](#parameters)
- [SecuritySpecification](#securityspecification)
- [SecurityThreatsImport](#securitythreatsimport)
- [TypeSpecification](#typespecification)
- [Variant](#variant)



```
Model returns Model:
	'model'
	Name
	'{'
	Documentation?
	(imports+=Import ("," imports+=Import)*)?
	(securityThreatsImport+=SecurityThreatsImport ("," securityThreatsImport+=SecurityThreatsImport)*)?
	(securityThreatsDefinition=KnownSecurityThreats)?
	(securitySpecification=SecuritySpecification)?
	('picturesPath' PROPERTY_ASSIGN personsPicturesPath=EString)?
	(types+=TypeSpecification ("," types+=TypeSpecification)*)?
	Parameters?
	(packages+=Package ("," packages+=Package)*)?
	(actors+=Actor ("," actors+=Actor)*)?
	(variants+=Variant ("," variants+=Variant)*)?
	(classificationClasses+=ClassificationClass ("," classificationClasses+=ClassificationClass)*)?
	(environments+=Environment ("," environments+=Environment)*)?
	'}';
```



###  Documentation  


**Refers to:**
- [EString](#estring)
- [PROPERTY_ASSIGN](#property_assign)

**Referred by:**
- [Actor_Impl](#actor_impl)
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [Connector_Impl](#connector_impl)
- [DataStore](#datastore)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [Human_Impl](#human_impl)
- [InputPin](#inputpin)
- [LogicalConnector](#logicalconnector)
- [MachineLearningComponent](#machinelearningcomponent)
- [Model](#model)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [OutputPin](#outputpin)
- [Package](#package)
- [Parameter](#parameter)
- [ParameterDefinition](#parameterdefinition)
- [Person](#person)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [PhysicalConnector](#physicalconnector)
- [Robot](#robot)
- [Sector](#sector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)
- [Variant](#variant)

**Returns:** `core::DocumentableElement`

```
fragment Documentation returns core::DocumentableElement:
	'doc' PROPERTY_ASSIGN documentation=EString;
```



###  Parameters  


**Refers to:**
- [Parameter](#parameter)

**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [Connector_Impl](#connector_impl)
- [DataStore](#datastore)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [InputPin](#inputpin)
- [LogicalConnector](#logicalconnector)
- [MachineLearningComponent](#machinelearningcomponent)
- [Model](#model)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [OutputPin](#outputpin)
- [Package](#package)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [PhysicalConnector](#physicalconnector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Returns:** `analysis::ParameterizableElement`

```
fragment Parameters returns analysis::ParameterizableElement:
	'parameters' '{' parameters+=Parameter ("," parameters+=Parameter)* '}'
;
```



###  Name  


**Refers to:**
- [EString](#estring)

**Referred by:**
- [Actor_Impl](#actor_impl)
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [ClassificationClass](#classificationclass)
- [Component_Impl](#component_impl)
- [Connector_Impl](#connector_impl)
- [DataStore](#datastore)
- [Environment](#environment)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [Human_Impl](#human_impl)
- [InputPin](#inputpin)
- [LiteralByte](#literalbyte)
- [LiteralCharacter](#literalcharacter)
- [LiteralDate](#literaldate)
- [LiteralShort](#literalshort)
- [LogicalConnector](#logicalconnector)
- [MachineLearningComponent](#machinelearningcomponent)
- [Model](#model)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [MulticlassConfusionMatrix](#multiclassconfusionmatrix)
- [OutputPin](#outputpin)
- [Package](#package)
- [Parameter](#parameter)
- [ParameterDefinition](#parameterdefinition)
- [Person](#person)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [PhysicalConnector](#physicalconnector)
- [Robot](#robot)
- [Sector](#sector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)
- [Variant](#variant)

**Returns:** `core::NamedElement`

```
fragment Name returns core::NamedElement:
	name=EString
;
```



###  EcoreName  


**Refers to:**
- [EString](#estring)

**Referred by:**
- [EAttribute](#eattribute)
- [EClass](#eclass)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)
- [EEnumLiteral](#eenumliteral)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [ETypeParameter](#etypeparameter)

**Returns:** `ecore::ENamedElement`

```
fragment EcoreName returns ecore::ENamedElement:
	name=EString
;
```



###  ClassificationClass  


**Refers to:**
- [Name](#name)

**Referred by:**
- [Model](#model)


```
ClassificationClass returns ClassificationClass:
	{ClassificationClass}
	'cl' Name;
```



###  ClassificationClassDistribution  


**Refers to:**
- [EDouble](#edouble)
- [EString](#estring)

**Referred by:**
- [Environment](#environment)


```
ClassificationClassDistribution returns ClassificationClassDistribution:
	{ClassificationClassDistribution}
	((not?='not')? classificationClass=[ClassificationClass|EString] probability=EDouble);
```



###  Environment  


**Refers to:**
- [ClassificationClassDistribution](#classificationclassdistribution)
- [EDouble](#edouble)
- [Name](#name)

**Referred by:**
- [Model](#model)


```
Environment returns Environment:
	{Environment}
	'environment' Name
	'{'
	(classificationClasses+=ClassificationClassDistribution ("," classificationClasses+=ClassificationClassDistribution)
	*)?
	(',' 'OOD' oodProbability=EDouble)?
	'}';
```



###  ConfusionMatrix  


**Refers to:**
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [MulticlassConfusionMatrix](#multiclassconfusionmatrix)



```
ConfusionMatrix returns ConfusionMatrix:
	BinaryConfusionMatrix | MulticlassConfusionMatrix;
```



###  BinaryConfusionMatrix  


**Refers to:**
- [EInt](#eint)
- [EString](#estring)
- [Name](#name)
- [PROPERTY_ASSIGN](#property_assign)

**Referred by:**
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [ConfusionMatrix](#confusionmatrix)


```
BinaryConfusionMatrix returns BinaryConfusionMatrix:
	{BinaryConfusionMatrix}
	'confusion' 'matrix' Name
	'+' positiveClass=[ClassificationClass|EString]
	'{'
	'TP' PROPERTY_ASSIGN tp=EInt ',' 'FN' PROPERTY_ASSIGN fn=EInt
	',' 'FP' PROPERTY_ASSIGN fp=EInt ',' 'TN' PROPERTY_ASSIGN tn=EInt
	'}';
```



###  MulticlassConfusionMatrix  


**Refers to:**
- [ConfusionMatrixEntry](#confusionmatrixentry)
- [Name](#name)

**Referred by:**
- [ConfusionMatrix](#confusionmatrix)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)


```
MulticlassConfusionMatrix returns MulticlassConfusionMatrix:
	{MulticlassConfusionMatrix}
	'confusion' 'matrix' Name
	'{'
	(entries+=ConfusionMatrixEntry ("," entries+=ConfusionMatrixEntry)*)?
	'}';
```



###  ConfusionMatrixEntry  


**Refers to:**
- [EInt](#eint)
- [EString](#estring)
- [PROPERTY_ASSIGN](#property_assign)

**Referred by:**
- [MulticlassConfusionMatrix](#multiclassconfusionmatrix)


```
ConfusionMatrixEntry returns ConfusionMatrixEntry:
	{ConfusionMatrixEntry}
	truth=[ClassificationClass|EString] predicted=[ClassificationClass|EString] PROPERTY_ASSIGN value=EInt;
```



###  SecurityThreatsImport  


**Refers to:**
- ID

**Referred by:**
- [Model](#model)


```
SecurityThreatsImport returns SecurityThreatsImport:
	{SecurityThreatsImport}
	'import' 'security' securityThreat=[security::KnownSecurityThreats] ';';
```



###  KnownSecurityThreats  


**Refers to:**
- [CVE](#cve)

**Referred by:**
- [Model](#model)

**Returns:** `security::KnownSecurityThreats`

```
KnownSecurityThreats returns security::KnownSecurityThreats:
	{security::KnownSecurityThreats}
	'knownSecurityThreats'
	'{'
	(cves+=CVE (cves+=CVE)*)?
		'}';
```



###  CVE  


**Refers to:**
- [EDouble](#edouble)
- [EString](#estring)
- [PROPERTY_ASSIGN](#property_assign)

**Referred by:**
- [KnownSecurityThreats](#knownsecuritythreats)

**Returns:** `security::CVE`

```
CVE returns security::CVE:
	{security::CVE}
	'cve' cveId=EString
	('cvss' PROPERTY_ASSIGN cvss=EDouble)?
	(vectorString=EString)?
	('descr' PROPERTY_ASSIGN description=EString)?
	('affects' '{'
	affectsComponents+=[Component|EString] (',' affectsComponents+=[Component|EString])*
	'}')?';';
```



###  SecuritySpecification  


**Refers to:**
- [AssetDefinition](#assetdefinition)
- [AttackSurface](#attacksurface)

**Referred by:**
- [Model](#model)

**Returns:** `security::SecuritySpecification`

```
SecuritySpecification returns security::SecuritySpecification:
	{security::SecuritySpecification}
	'securitySpec' '{'
	(assetDefinitions+=AssetDefinition (assetDefinitions+=AssetDefinition)*)?
	(attackSurfaces+=AttackSurface (attackSurfaces+=AttackSurface)*)?
	'}';
```



###  AssetDefinition  


**Refers to:**
- [EString](#estring)

**Referred by:**
- [SecuritySpecification](#securityspecification)

**Returns:** `security::AssetDefinition`

```
AssetDefinition returns security::AssetDefinition:
	{security::AssetDefinition}
	'asset' component=[Component|EString] ';';
```



###  AttackSurface  


**Refers to:**
- [EString](#estring)

**Referred by:**
- [SecuritySpecification](#securityspecification)

**Returns:** `security::AttackSurface`

```
AttackSurface returns security::AttackSurface:
	{security::AttackSurface}
	'attack' 'surface' component=[Component|EString] ';';
```



###  Import  


**Refers to:**
- STRING

**Referred by:**
- [Model](#model)


```
Import returns Import:
	{Import}
	'import' referencedModel=[Model|STRING] ';';
```



###  Actor  


**Refers to:**
- [Actor_Impl](#actor_impl)
- [Human_Impl](#human_impl)
- [Person](#person)
- [Robot](#robot)

**Referred by:**
- [Model](#model)


```
Actor returns Actor:
	Actor_Impl | Human_Impl | Robot | Person;
```



###  ValueSpecification  


**Refers to:**
- [LiteralBoolean](#literalboolean)
- [LiteralByte](#literalbyte)
- [LiteralCharacter](#literalcharacter)
- [LiteralDate](#literaldate)
- [LiteralDouble](#literaldouble)
- [LiteralFloat](#literalfloat)
- [LiteralInteger](#literalinteger)
- [LiteralLong](#literallong)
- [LiteralNull](#literalnull)
- [LiteralShort](#literalshort)
- [LiteralString](#literalstring)

**Referred by:**
- [Parameter](#parameter)
- [ParameterDefinition](#parameterdefinition)
- [Primary](#primary)

**Returns:** `core::ValueSpecification`

```
ValueSpecification returns core::ValueSpecification:
	LiteralNull | LiteralString | LiteralInteger | LiteralBoolean | LiteralFloat | LiteralDouble | LiteralLong |
	LiteralShort | LiteralByte | LiteralCharacter | LiteralDate;
```



###  Component  


**Refers to:**
- [Actuator](#actuator)
- [ClassificationComponent](#classificationcomponent)
- [Component_Impl](#component_impl)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [Package](#package)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [Sector](#sector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)


```
Component returns Component:
	Component_Impl | MachineLearningComponent | ClassificationComponent | PhysicalComponent_Impl |
	SoftwareComponent_Impl | Heuristic | Function |
	ExternalDependency | Sensor | Actuator;
```



###  ClassificationComponent  


**Refers to:**
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)

**Referred by:**
- [Component](#component)


```
ClassificationComponent returns ClassificationComponent:
	BinaryClassificationComponent | MulticlassClassificationComponent;
```



###  Connector  


**Refers to:**
- [Connector_Impl](#connector_impl)
- [LogicalConnector](#logicalconnector)
- [PhysicalConnector](#physicalconnector)

**Referred by:**
- [Package](#package)


```
Connector returns Connector:
	Connector_Impl | PhysicalConnector | LogicalConnector;
```



###  EDataType  


**Refers to:**
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)


**Returns:** `ecore::EDataType`

```
EDataType returns ecore::EDataType:
	EDataType_Impl | EEnum;
```



###  EStructuralFeature  


**Refers to:**
- [EAttribute](#eattribute)
- [EReference](#ereference)

**Referred by:**
- [EClass](#eclass)

**Returns:** `ecore::EStructuralFeature`

```
EStructuralFeature returns ecore::EStructuralFeature:
	EAttribute | EReference;
```



###  EClassifier  


**Refers to:**
- [EClass](#eclass)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)


**Returns:** `ecore::EClassifier`

```
EClassifier returns ecore::EClassifier:
	EClass | EDataType_Impl | EEnum;
```



###  DataStore  


**Refers to:**
- [Documentation](#documentation)
- ID
- [Name](#name)
- [Parameters](#parameters)

**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [DataNode](#datanode)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [Package](#package)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [Sector](#sector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)


```
DataStore returns DataStore:
	{DataStore}
	'datastore'
	(type=[core::TypeSpecification])?
	Name 	('{'
	Documentation?
	Parameters?
	'}')?;
```



###  DataNode  


**Refers to:**
- [DataStore](#datastore)
- [Pin](#pin)



```
DataNode returns DataNode:
	Pin | DataStore;
```



###  Pin  


**Refers to:**
- [InputPin](#inputpin)
- [OutputPin](#outputpin)

**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [DataNode](#datanode)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)


```
Pin returns Pin:
	InputPin | OutputPin;
```



###  EString  


**Refers to:**
- ID
- STRING

**Referred by:**
- [Actuator](#actuator)
- [AssetDefinition](#assetdefinition)
- [AttackSurface](#attacksurface)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [CVE](#cve)
- [ClassificationClassDistribution](#classificationclassdistribution)
- [Component_Impl](#component_impl)
- [ConfusionMatrixEntry](#confusionmatrixentry)
- [Connector_Impl](#connector_impl)
- [Documentation](#documentation)
- [EAnnotation](#eannotation)
- [EAttribute](#eattribute)
- [EClass](#eclass)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)
- [EEnumLiteral](#eenumliteral)
- [EGenericType](#egenerictype)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [EStringToStringMapEntry](#estringtostringmapentry)
- [EcoreName](#ecorename)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [LogicalConnector](#logicalconnector)
- [MachineLearningComponent](#machinelearningcomponent)
- [Model](#model)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [Name](#name)
- [Package](#package)
- [Parameter](#parameter)
- [ParameterDefinition](#parameterdefinition)
- [Person](#person)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [PhysicalConnector](#physicalconnector)
- [Sensor](#sensor)
- [SetValue](#setvalue)
- [SoftwareComponent_Impl](#softwarecomponent_impl)
- [StringAttribute](#stringattribute)

**Returns:** `ecore::EString`

```
EString returns ecore::EString:
	STRING | ID;
```



###  Parameter  


**Refers to:**
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)
- [PROPERTY_ASSIGN](#property_assign)
- [ValueSpecification](#valuespecification)

**Referred by:**
- [Parameters](#parameters)

**Returns:** `analysis::Parameter`

```
Parameter returns analysis::Parameter:
	{analysis::Parameter}
	'par' Name (':=' initialValue=ValueSpecification)?
	('{'
	Documentation?
	('parameterDefinition' PROPERTY_ASSIGN parameterDefinition=[analysis::ParameterDefinition|EString])?
	('appliesOnlyOnVariants' '(' appliesOnlyOnVariants+=[core::Variant|EString] (","
	appliesOnlyOnVariants+=[core::Variant|EString])* ')')?
	('doesNotApplyOnVariants' '(' doesNotApplyOnVariants+=[core::Variant|EString] (","
	doesNotApplyOnVariants+=[core::Variant|EString])* ')')?
	('currentValue' PROPERTY_ASSIGN currentValue=ValueSpecification)?
	'}')?;
```



###  Package  


**Refers to:**
- [Component](#component)
- [Connector](#connector)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EInt](#eint)
- [EString](#estring)
- [Name](#name)
- [PROPERTY_ASSIGN](#property_assign)
- [Package](#package)
- [Parameters](#parameters)
- [Sector](#sector)

**Referred by:**
- [Model](#model)
- [Package](#package)


```
Package returns Package:
	'package'
	Name
	'{'
	Documentation?
	('simulationDuration' PROPERTY_ASSIGN simulationDuration=EInt)?
	('mainResponsible' PROPERTY_ASSIGN mainResponsible=[Person|EString])?
	('specifiesComponent' PROPERTY_ASSIGN specifiesComponent=[Component|EString])?
	('processingUnits' PROPERTY_ASSIGN processingUnits=EInt)?
	Parameters?
	(components+=Component ("," components+=Component)*)?
	(connectors+=Connector ("," connectors+=Connector)*)?
	(datastores+=DataStore ("," datastores+=DataStore)*)?
	(sectors+=Sector ("," sectors+=Sector)*)?
	('subPackages' '{' packages+=Package ("," packages+=Package)* '}')?
	'}';
```



###  PROPERTY_ASSIGN (terminal) 


**Referred by:**
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [CVE](#cve)
- [ConfusionMatrixEntry](#confusionmatrixentry)
- [Documentation](#documentation)
- [Model](#model)
- [Package](#package)
- [Parameter](#parameter)
- [SetValue](#setvalue)

```
terminal PROPERTY_ASSIGN:
	':';
```



###  Actor_Impl  


**Refers to:**
- [Documentation](#documentation)
- [Name](#name)

**Referred by:**
- [Actor](#actor)


```
Actor_Impl returns Actor:
	{Actor}
	'actor'
	Name
	('{'
	Documentation?
	'}')?;
```



###  Variant  


**Refers to:**
- [Documentation](#documentation)
- [Name](#name)

**Referred by:**
- [Model](#model)

**Returns:** `core::Variant`

```
Variant returns core::Variant:
	{core::Variant}
	'variant'
	Name
	('{'
	Documentation?
	'}')?;
```



###  ParameterDefinition  


**Refers to:**
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)
- [UnitOfMeasurement](#unitofmeasurement)
- [ValueSpecification](#valuespecification)


**Returns:** `analysis::ParameterDefinition`

```
ParameterDefinition returns analysis::ParameterDefinition:
	{analysis::ParameterDefinition}
	'ParameterDefinition'
	Name
	'{'
	Documentation?
	('unit' unit=UnitOfMeasurement)?
		('parameters' '(' parameters+=[analysis::Parameter|EString] ("," parameters+=[analysis::Parameter|EString])* ')')?
				('defaultValue' defaultValue=ValueSpecification)?
	'}';
```



###  EDataType_Impl  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EString](#estring)
- [ETypeParameter](#etypeparameter)
- [EcoreName](#ecorename)

**Referred by:**
- [EClassifier](#eclassifier)
- [EDataType](#edatatype)

**Returns:** `ecore::EDataType`

```
EDataType_Impl returns ecore::EDataType:
	{ecore::EDataType}
	'EDataType'
	EcoreName
	'{'
	('instanceClassName' instanceClassName=EString)?
	('instanceTypeName' instanceTypeName=EString)?
	('serializable' serializable=EBoolean)?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eTypeParameters' '{' eTypeParameters+=ETypeParameter ("," eTypeParameters+=ETypeParameter)* '}')?
	'}';
```



###  UnitOfMeasurement (enum) 


Literals:
- cm (`cm`)
- hours (`hours`)
- m (`m`)
- mbps (`mbps`)
- minutes (`minutes`)
- mm (`mm`)
- ms (`ms`)
- none (`none`)
- percentage (`percentage`)
- s (`s`)

```
enum UnitOfMeasurement returns core::UnitOfMeasurement:
	cm='cm' | m='m' | mm='mm' | percentage='percentage' | s='s' | ms='ms' | minutes='minutes' | hours='hours' |
	mbps='mbps' | none='none';
```



###  EClass  


**Refers to:**
- [EAnnotation](#eannotation)
- [EGenericType](#egenerictype)
- [EOperation](#eoperation)
- [EString](#estring)
- [EStructuralFeature](#estructuralfeature)
- [ETypeParameter](#etypeparameter)
- [EcoreName](#ecorename)

**Referred by:**
- [EClassifier](#eclassifier)

**Returns:** `ecore::EClass`

```
EClass returns ecore::EClass:
	{ecore::EClass}
	(abstract?='abstract')?
	(interface?='interface')?
	'EClass'
	EcoreName
	'{'
	('instanceClassName' instanceClassName=EString)?
	('instanceTypeName' instanceTypeName=EString)?
	('eSuperTypes' '(' eSuperTypes+=[ecore::EClass|EString] ("," eSuperTypes+=[ecore::EClass|EString])* ')')?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eTypeParameters' '{' eTypeParameters+=ETypeParameter ("," eTypeParameters+=ETypeParameter)* '}')?
	('eOperations' '{' eOperations+=EOperation ("," eOperations+=EOperation)* '}')?
	('eStructuralFeatures' '{' eStructuralFeatures+=EStructuralFeature ("," eStructuralFeatures+=EStructuralFeature)*
	'}')?
	('eGenericSuperTypes' '{' eGenericSuperTypes+=EGenericType ("," eGenericSuperTypes+=EGenericType)* '}')?
	'}';
```



###  EAnnotation  


**Refers to:**
- [EAnnotation](#eannotation)
- [EObject](#eobject)
- [EString](#estring)
- [EStringToStringMapEntry](#estringtostringmapentry)

**Referred by:**
- [EAnnotation](#eannotation)
- [EAttribute](#eattribute)
- [EClass](#eclass)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)
- [EEnumLiteral](#eenumliteral)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [ETypeParameter](#etypeparameter)

**Returns:** `ecore::EAnnotation`

```
EAnnotation returns ecore::EAnnotation:
	{ecore::EAnnotation}
	'EAnnotation'
	'{'
	('source' source=EString)?
	('references' '(' references+=[ecore::EObject|EString] ("," references+=[ecore::EObject|EString])* ')')?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('details' '{' details+=EStringToStringMapEntry ("," details+=EStringToStringMapEntry)* '}')?
	('contents' '{' contents+=EObject ("," contents+=EObject)* '}')?
	'}';
```



###  ETypeParameter  


**Refers to:**
- [EAnnotation](#eannotation)
- [EGenericType](#egenerictype)
- [EcoreName](#ecorename)

**Referred by:**
- [EClass](#eclass)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)
- [EOperation](#eoperation)

**Returns:** `ecore::ETypeParameter`

```
ETypeParameter returns ecore::ETypeParameter:
	{ecore::ETypeParameter}
	'ETypeParameter'
	EcoreName
	'{'
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eBounds' '{' eBounds+=EGenericType ("," eBounds+=EGenericType)* '}')?
	'}';
```



###  EBoolean  


**Referred by:**
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [BooleanAttribute](#booleanattribute)
- [EAttribute](#eattribute)
- [EDataType_Impl](#edatatype_impl)
- [EEnum](#eenum)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Returns:** `ecore::EBoolean`

```
EBoolean returns ecore::EBoolean:
	'true' | 'false';
```



###  EEnum  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EEnumLiteral](#eenumliteral)
- [EString](#estring)
- [ETypeParameter](#etypeparameter)
- [EcoreName](#ecorename)

**Referred by:**
- [EClassifier](#eclassifier)
- [EDataType](#edatatype)

**Returns:** `ecore::EEnum`

```
EEnum returns ecore::EEnum:
	{ecore::EEnum}
	'EEnum'
	EcoreName
	'{'
	('instanceClassName' instanceClassName=EString)?
	('instanceTypeName' instanceTypeName=EString)?
	('serializable' serializable=EBoolean)?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eTypeParameters' '{' eTypeParameters+=ETypeParameter ("," eTypeParameters+=ETypeParameter)* '}')?
	('eLiterals' '{' eLiterals+=EEnumLiteral ("," eLiterals+=EEnumLiteral)* '}')?
	'}';
```



###  EStringToStringMapEntry  


**Refers to:**
- [EString](#estring)

**Referred by:**
- [EAnnotation](#eannotation)

**Returns:** `ecore::EStringToStringMapEntry`

```
EStringToStringMapEntry returns ecore::EStringToStringMapEntry:
	{ecore::EStringToStringMapEntry}
	'EStringToStringMapEntry'
	'{'
	('key' key=EString)?
	('value' value=EString)?
	'}';
```



###  EObject  


**Referred by:**
- [EAnnotation](#eannotation)

**Returns:** `ecore::EObject`

```
EObject returns ecore::EObject:
	{ecore::EObject}
	'EObject';
```



###  EGenericType  


**Refers to:**
- [EGenericType](#egenerictype)
- [EString](#estring)

**Referred by:**
- [EAttribute](#eattribute)
- [EClass](#eclass)
- [EGenericType](#egenerictype)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [ETypeParameter](#etypeparameter)

**Returns:** `ecore::EGenericType`

```
EGenericType returns ecore::EGenericType:
	{ecore::EGenericType}
	'EGenericType'
	'{'
	('eTypeParameter' eTypeParameter=[ecore::ETypeParameter|EString])?
	('eClassifier' eClassifier=[ecore::EClassifier|EString])?
	('eUpperBound' eUpperBound=EGenericType)?
	('eTypeArguments' '{' eTypeArguments+=EGenericType ("," eTypeArguments+=EGenericType)* '}')?
	('eLowerBound' eLowerBound=EGenericType)?
	'}';
```



###  EEnumLiteral  


**Refers to:**
- [EAnnotation](#eannotation)
- [EInt](#eint)
- [EString](#estring)
- [EcoreName](#ecorename)

**Referred by:**
- [EEnum](#eenum)

**Returns:** `ecore::EEnumLiteral`

```
EEnumLiteral returns ecore::EEnumLiteral:
	{ecore::EEnumLiteral}
	'EEnumLiteral'
	EcoreName
	'{'
	('value' value=EInt)?
	('literal' literal=EString)?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	'}';
```



###  EOperation  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EGenericType](#egenerictype)
- [EInt](#eint)
- [EParameter](#eparameter)
- [EString](#estring)
- [ETypeParameter](#etypeparameter)
- [EcoreName](#ecorename)

**Referred by:**
- [EClass](#eclass)

**Returns:** `ecore::EOperation`

```
EOperation returns ecore::EOperation:
	{ecore::EOperation}
	'EOperation'
	EcoreName
	'{'
	('ordered' ordered=EBoolean)?
	('unique' unique=EBoolean)?
	('lowerBound' lowerBound=EInt)?
	('upperBound' upperBound=EInt)?
	('eType' eType=[ecore::EClassifier|EString])?
	('eExceptions' '(' eExceptions+=[ecore::EClassifier|EString] ("," eExceptions+=[ecore::EClassifier|EString])* ')')?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eGenericType' eGenericType=EGenericType)?
	('eTypeParameters' '{' eTypeParameters+=ETypeParameter ("," eTypeParameters+=ETypeParameter)* '}')?
	('eParameters' '{' eParameters+=EParameter ("," eParameters+=EParameter)* '}')?
	('eGenericExceptions' '{' eGenericExceptions+=EGenericType ("," eGenericExceptions+=EGenericType)* '}')?
	'}';
```



###  EParameter  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EGenericType](#egenerictype)
- [EInt](#eint)
- [EString](#estring)
- [EcoreName](#ecorename)

**Referred by:**
- [EOperation](#eoperation)

**Returns:** `ecore::EParameter`

```
EParameter returns ecore::EParameter:
	{ecore::EParameter}
	'EParameter'
	EcoreName
	'{'
	('ordered' ordered=EBoolean)?
	('unique' unique=EBoolean)?
	('lowerBound' lowerBound=EInt)?
	('upperBound' upperBound=EInt)?
	('eType' eType=[ecore::EClassifier|EString])?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eGenericType' eGenericType=EGenericType)?
	'}';
```



###  EAttribute  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EGenericType](#egenerictype)
- [EInt](#eint)
- [EString](#estring)
- [EcoreName](#ecorename)

**Referred by:**
- [EStructuralFeature](#estructuralfeature)

**Returns:** `ecore::EAttribute`

```
EAttribute returns ecore::EAttribute:
	{ecore::EAttribute}
	(volatile?='volatile')?
	(transient?='transient')?
	(unsettable?='unsettable')?
	(derived?='derived')?
	(iD?='iD')?
	'EAttribute'
	EcoreName
	'{'
	('ordered' ordered=EBoolean)?
	('unique' unique=EBoolean)?
	('lowerBound' lowerBound=EInt)?
	('upperBound' upperBound=EInt)?
	('changeable' changeable=EBoolean)?
	('defaultValueLiteral' defaultValueLiteral=EString)?
	('eType' eType=[ecore::EClassifier|EString])?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eGenericType' eGenericType=EGenericType)?
	'}';
```



###  EReference  


**Refers to:**
- [EAnnotation](#eannotation)
- [EBoolean](#eboolean)
- [EGenericType](#egenerictype)
- [EInt](#eint)
- [EString](#estring)
- [EcoreName](#ecorename)

**Referred by:**
- [EStructuralFeature](#estructuralfeature)

**Returns:** `ecore::EReference`

```
EReference returns ecore::EReference:
	{ecore::EReference}
	(volatile?='volatile')?
	(transient?='transient')?
	(unsettable?='unsettable')?
	(derived?='derived')?
	(containment?='containment')?
	'EReference'
	EcoreName
	'{'
	('ordered' ordered=EBoolean)?
	('unique' unique=EBoolean)?
	('lowerBound' lowerBound=EInt)?
	('upperBound' upperBound=EInt)?
	('changeable' changeable=EBoolean)?
	('defaultValueLiteral' defaultValueLiteral=EString)?
	('resolveProxies' resolveProxies=EBoolean)?
	('eType' eType=[ecore::EClassifier|EString])?
	('eOpposite' eOpposite=[ecore::EReference|EString])?
	('eKeys' '(' eKeys+=[ecore::EAttribute|EString] ("," eKeys+=[ecore::EAttribute|EString])* ')')?
	('eAnnotations' '{' eAnnotations+=EAnnotation ("," eAnnotations+=EAnnotation)* '}')?
	('eGenericType' eGenericType=EGenericType)?
	'}';
```



###  LiteralNull  


**Referred by:**
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralNull`

```
LiteralNull returns core::LiteralNull:
	{core::LiteralNull}
	'null';
```



###  LiteralString  


**Refers to:**
- STRING

**Referred by:**
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralString`

```
LiteralString returns core::LiteralString:
	{core::LiteralString}
	value=STRING;
```



###  LiteralBoolean  


**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralBoolean`

```
LiteralBoolean returns core::LiteralBoolean:
	{core::LiteralBoolean}
	(value?='true' | 'false');
```



###  LiteralFloat  


**Refers to:**
- [Float](#float)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralFloat`

```
LiteralFloat returns core::LiteralFloat:
	{core::LiteralFloat}
	value=Float;
```



###  LiteralDouble  


**Refers to:**
- [EDouble](#edouble)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralDouble`

```
LiteralDouble returns core::LiteralDouble:
	{core::LiteralDouble}
	value=EDouble;
```



###  LiteralLong  


**Refers to:**
- [Long](#long)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralLong`

```
LiteralLong returns core::LiteralLong:
	{core::LiteralLong}
	value=Long;
```



###  LiteralShort  


**Refers to:**
- [Name](#name)
- [Short](#short)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralShort`

```
LiteralShort returns core::LiteralShort:
	{core::LiteralShort}
	'LiteralShort'
	Name
	'{'
	('value' value=Short)?
		'}';
```



###  LiteralByte  


**Refers to:**
- [Byte](#byte)
- [Name](#name)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralByte`

```
LiteralByte returns core::LiteralByte:
	{core::LiteralByte}
	'LiteralByte'
	Name
	'{'
	('value' value=Byte)?
		'}';
```



###  LiteralCharacter  


**Refers to:**
- [Character](#character)
- [Name](#name)

**Referred by:**
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralCharacter`

```
LiteralCharacter returns core::LiteralCharacter:
	{core::LiteralCharacter}
	'LiteralCharacter'
	Name
	'{'
	('value' value=Character)?
		'}';
```



###  LiteralDate  


**Refers to:**
- [Date](#date)
- [Name](#name)

**Referred by:**
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralDate`

```
LiteralDate returns core::LiteralDate:
	{core::LiteralDate}
	'LiteralDate'
	Name
	'{'
	('value' value=Date)?
		'}';
```



###  Float  


**Refers to:**
- INT

**Referred by:**
- [LiteralFloat](#literalfloat)

**Returns:** `core::Float`

```
Float returns core::Float:
	'f' INT '.' INT;
```



###  Long  


**Refers to:**
- INT

**Referred by:**
- [LiteralLong](#literallong)

**Returns:** `core::Long`

```
Long returns core::Long:
	'l' INT;
```



###  Short  


**Referred by:**
- [LiteralShort](#literalshort)

**Returns:** `core::Short`

```
Short returns core::Short:
	'Short'  ;
```



###  Byte  


**Referred by:**
- [LiteralByte](#literalbyte)

**Returns:** `core::Byte`

```
Byte returns core::Byte:
	'Byte'  ;
```



###  Character  


**Referred by:**
- [LiteralCharacter](#literalcharacter)

**Returns:** `core::Character`

```
Character returns core::Character:
	'Character'  ;
```



###  Date  


**Referred by:**
- [LiteralDate](#literaldate)

**Returns:** `core::Date`

```
Date returns core::Date:
	'Date'  ;
```



###  Component_Impl  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
Component_Impl returns Component:
	{Component}
	'component'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  Connector_Impl  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)
- [Parameters](#parameters)

**Referred by:**
- [Connector](#connector)


```
Connector_Impl returns Connector:
	'connector'
	Name
	source=[Pin|EString] '->' target=[Pin|EString]
	('{'
	Documentation?
	('takes' timeFunction=ComplexTimefunction)?
	Parameters?
	'}')?;
```



###  Sector  


**Refers to:**
- [Component](#component)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [Name](#name)
- [Sector](#sector)

**Referred by:**
- [Package](#package)
- [Sector](#sector)


```
Sector returns Sector:
	{Sector}
	'sector'
	Name
	'{'
	Documentation?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('sectors' '{' sectors+=Sector ("," sectors+=Sector)* '}')?
	'}';
```



###  Person  


**Refers to:**
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)

**Referred by:**
- [Actor](#actor)


```
Person returns Person:
	'person'
	(Name | surname=EString ',' Name)
	'{'
	Documentation?
	('department' department=EString)?
	('pictureFileName' pictureFileName=EString)?
			'}';
```



###  MulticlassClassificationComponent  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [MulticlassConfusionMatrix](#multiclassconfusionmatrix)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [ClassificationComponent](#classificationcomponent)


```
MulticlassClassificationComponent returns MulticlassClassificationComponent:
	{MulticlassClassificationComponent}
	'multiclassClassificationComponent'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	('confusionMatrixes' '{' confusionMatrixes+=MulticlassConfusionMatrix (","
	confusionMatrixes+=MulticlassConfusionMatrix)* '}')?
	'}';
```



###  BinaryClassificationComponent  


**Refers to:**
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [ClassificationComponent](#classificationcomponent)


```
BinaryClassificationComponent returns BinaryClassificationComponent:
	{BinaryClassificationComponent}
	'binaryClassificationComponent'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	('confusionMatrixes' '{' confusionMatrixes+=BinaryConfusionMatrix ("," confusionMatrixes+=BinaryConfusionMatrix)*
	'}')?
	'}';
```



###  MachineLearningComponent  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
MachineLearningComponent returns MachineLearningComponent:
	{MachineLearningComponent}
	'mlComponent'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  PhysicalComponent_Impl  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
PhysicalComponent_Impl returns PhysicalComponent:
	{PhysicalComponent}
	'physicalComponent'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  SoftwareComponent_Impl  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
SoftwareComponent_Impl returns SoftwareComponent:
	{SoftwareComponent}
	'softwareComponent'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  Heuristic  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
Heuristic returns Heuristic:
	{Heuristic}
	'heuristic'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  Function  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
Function returns Function:
	{Function}
	'function'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  ExternalDependency  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EBoolean](#eboolean)
- [EInt](#eint)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
ExternalDependency returns ExternalDependency:
	{ExternalDependency}
	'externalDependency'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('synchronous' synchronous=EBoolean)?
	('numberOfServers' numberOfServers=EInt)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  Sensor  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
Sensor returns Sensor:
	'sensor'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
		('generates' classificationClasses+=[ClassificationClass|EString] (','
	classificationClasses+=[ClassificationClass|EString])*)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  Actuator  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Component](#component)
- [ComponentFiringStrategy](#componentfiringstrategy)
- [DataStore](#datastore)
- [Documentation](#documentation)
- [EString](#estring)
- [Execution](#execution)
- [Name](#name)
- [Parameters](#parameters)
- [Pin](#pin)

**Referred by:**
- [Component](#component)


```
Actuator returns Actuator:
	{Actuator}
	'actuator'
	Name
	'{'
	Documentation?
	('firingStrategy' firingStrategy=ComponentFiringStrategy)?
	('takes' timeFunction=ComplexTimefunction)?
	(pins+=Pin ("," pins+=Pin)*)?
	('mainResponsible' mainResponsible=[Person|EString])?
	('specifiedInPackage' specifiedInPackage=[Package|EString])?
	Parameters?
	('components' '{' components+=Component ("," components+=Component)* '}')?
	('datastores' '{' datastores+=DataStore ("," datastores+=DataStore)* '}')?
	('runs' '{' execution=Execution '}')?
	'}';
```



###  RaceSemantic (enum) 


Literals:
- DUPLICATE (`DUPLICATE`)
- FCFS (`FCFS`)
- MERGE (`MERGE`)
- MERGE_AND_DUPLICATE (`MERGE_AND_DUPLICATE`)

```
enum RaceSemantic returns RaceSemantic:
	FCFS='FCFS' | DUPLICATE='DUPLICATE' | MERGE='MERGE' | MERGE_AND_DUPLICATE='MERGE_AND_DUPLICATE';
```



###  ComponentFiringStrategy (enum) 


Literals:
- AND (`AND`, `&&`)
- OR (`OR`, `||`)

```
enum ComponentFiringStrategy returns ComponentFiringStrategy:
	AND='AND' | AND='&&' | OR='OR' | OR='||';
```



###  InputPin  


**Refers to:**
- [Documentation](#documentation)
- [EInt](#eint)
- ID
- [Name](#name)
- [Parameters](#parameters)
- [QueueType](#queuetype)
- [RaceSemantic](#racesemantic)

**Referred by:**
- [Pin](#pin)


```
InputPin returns InputPin:
	{InputPin}
	(optional?='optional')? 'in' (stream?='stream')?
	(type=[core::TypeSpecification])?
	Name 	('{'
	Documentation?
	('collects' collect=EInt)?
	('raceSemantic' raceSemantic=RaceSemantic)?
	('queueType' queueType=QueueType)?
			Parameters?
	'}')?;
```



###  OutputPin  


**Refers to:**
- [Documentation](#documentation)
- [EDouble](#edouble)
- [EInt](#eint)
- [Expression](#expression)
- ID
- [Name](#name)
- [Parameters](#parameters)
- [RaceSemantic](#racesemantic)
- [TokenSpecification](#tokenspecification)

**Referred by:**
- [AssignableElement](#assignableelement)
- [Pin](#pin)


```
OutputPin returns OutputPin:
	{OutputPin}
	'out' (stream?='stream')?
	(type=[core::TypeSpecification])?
	Name 	('{'
	Documentation?
	('amplifies' amplify=EInt)?
	('outputUncertainty' outputUncertainty=EDouble)?
	('raceSemantic' raceSemantic=RaceSemantic)?
	('generates' tokenSpecification=TokenSpecification)?
			Parameters?
	'}')? ('=' outputExpression=Expression)?;
```



###  QueueType (enum) 


Literals:
- FIFO (`FIFO`)
- LATEST_ONLY (`LATEST_ONLY`)
- LIFO (`LIFO`)
- RANDOM (`RANDOM`)
- STORE (`STORE`)

```
enum QueueType returns QueueType:
	FIFO='FIFO' | LIFO='LIFO' | RANDOM='RANDOM' | LATEST_ONLY='LATEST_ONLY' | STORE='STORE';
```



###  EDouble  


**Referred by:**
- [CVE](#cve)
- [ClassificationClassDistribution](#classificationclassdistribution)
- [DoubleAttribute](#doubleattribute)
- [Environment](#environment)
- [LiteralDouble](#literaldouble)
- [OutputPin](#outputpin)
- [SetValue](#setvalue)

**Returns:** `ecore::EDouble`

```
EDouble returns ecore::EDouble:
	DOUBLE;
```



###  DOUBLE (terminal) 


**Refers to:**
- INT


```
terminal DOUBLE returns ecore::EDouble:
	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
```



###  EInt  


**Refers to:**
- INT
- [NEGATIVE_INT](#negative_int)

**Referred by:**
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [BinaryConfusionMatrix](#binaryconfusionmatrix)
- [ConfusionMatrixEntry](#confusionmatrixentry)
- [EAttribute](#eattribute)
- [EEnumLiteral](#eenumliteral)
- [EOperation](#eoperation)
- [EParameter](#eparameter)
- [EReference](#ereference)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [InputPin](#inputpin)
- [IntegerAttribute](#integerattribute)
- [LiteralInteger](#literalinteger)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [OutputPin](#outputpin)
- [Package](#package)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Returns:** `ecore::EInt`

```
EInt returns ecore::EInt:
	NEGATIVE_INT|INT;
```



###  NEGATIVE_INT (terminal) 


**Refers to:**
- INT

**Referred by:**
- [EInt](#eint)

```
terminal NEGATIVE_INT returns ecore::EInt:
	'-' INT;
```



###  TokenSpecification  


**Refers to:**
- [Set](#set)

**Referred by:**
- [OutputPin](#outputpin)


```
TokenSpecification returns TokenSpecification:
	{TokenSpecification}
	inputSize+=Set;
```



###  Set  


**Refers to:**
- [SetValue](#setvalue)

**Referred by:**
- [TokenSpecification](#tokenspecification)


```
Set returns Set:
	{Set}
	'set' '{' values+=SetValue (values+=SetValue)* '}';
```



###  SetValue  


**Refers to:**
- [EDouble](#edouble)
- [EString](#estring)
- [PROPERTY_ASSIGN](#property_assign)

**Referred by:**
- [Set](#set)


```
SetValue returns SetValue:
	{SetValue}
	'value' PROPERTY_ASSIGN value=EString ('prob' PROPERTY_ASSIGN probability=EDouble & ('size' PROPERTY_ASSIGN
	size=EDouble)?) ';';
```



###  PhysicalConnector  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Connectionspeed](#connectionspeed)
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)
- [Parameters](#parameters)

**Referred by:**
- [Connector](#connector)


```
PhysicalConnector returns PhysicalConnector:
	'physicalConnector'
	Name
	source=[Pin|EString] '->' target=[Pin|EString]
	('{'
	Documentation?
	('minSpeed' minSpeed=Connectionspeed)?
	('maxSpeed' maxSpeed=Connectionspeed)?
	('takes' timeFunction=ComplexTimefunction)?
	Parameters?
	'}')?;
```



###  LogicalConnector  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- [Documentation](#documentation)
- [EString](#estring)
- [Name](#name)
- [Parameters](#parameters)

**Referred by:**
- [Connector](#connector)


```
LogicalConnector returns LogicalConnector:
	'logicalConnector'
	Name
	source=[Pin|EString] '->' target=[Pin|EString]
	('{'
	Documentation?
	('takes' timeFunction=ComplexTimefunction)?
	Parameters?
	'}')?;
```



###  Connectionspeed  


**Referred by:**
- [PhysicalConnector](#physicalconnector)


```
Connectionspeed returns Connectionspeed:
	'Connectionspeed'  ;
```



###  Human_Impl  


**Refers to:**
- [Documentation](#documentation)
- [Name](#name)

**Referred by:**
- [Actor](#actor)


```
Human_Impl returns Human:
	{Human}
	'human' Name
	('{'
	Documentation?
	'}')?;
```



###  Robot  


**Refers to:**
- [Documentation](#documentation)
- [Name](#name)

**Referred by:**
- [Actor](#actor)


```
Robot returns Robot:
	{Robot}
	'robot' Name
	('{'
	Documentation?
	'}')?;
```



###  Execution  
EXECUTION


**Refers to:**
- [Elements](#elements)

**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [ExternalDependency](#externaldependency)
- [Function](#function)
- [Heuristic](#heuristic)
- [MachineLearningComponent](#machinelearningcomponent)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Returns:** `execution::Execution`

```
Execution returns execution::Execution:
	{execution::Execution}
	elements+=Elements+;
```



###  Elements  


**Refers to:**
- [Addition](#addition)
- [Assignment](#assignment)
- [ConnectableNode](#connectablenode)
- [Flow](#flow)
- [ReferenceableItem](#referenceableitem)

**Referred by:**
- [Execution](#execution)

**Returns:** `execution::ExecutionElement`

```
Elements returns execution::ExecutionElement:
	Flow | ConnectableNode | Addition | ReferenceableItem | Assignment;
```



###  ConnectableNode  


**Refers to:**
- [FlowFinal](#flowfinal)
- [ForkNode](#forknode)
- [MergeNode](#mergenode)

**Referred by:**
- [Elements](#elements)

**Returns:** `execution::ConnectableNode`

```
ConnectableNode returns execution::ConnectableNode:
	FlowFinal | ForkNode | MergeNode ;
```



###  Flow  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- ID

**Referred by:**
- [Elements](#elements)

**Returns:** `execution::Flow`

```
Flow returns execution::Flow:
	source=[execution::ConnectableNode] '->' target=[execution::ConnectableNode] ('takes'
	timeFunction=ComplexTimefunction)?';';
```



###  ComplexTimefunction  


**Referred by:**
- [Actuator](#actuator)
- [BinaryClassificationComponent](#binaryclassificationcomponent)
- [Component_Impl](#component_impl)
- [Connector_Impl](#connector_impl)
- [ExternalDependency](#externaldependency)
- [Flow](#flow)
- [ForkNode](#forknode)
- [Function](#function)
- [Heuristic](#heuristic)
- [LogicalConnector](#logicalconnector)
- [MachineLearningComponent](#machinelearningcomponent)
- [MergeNode](#mergenode)
- [MulticlassClassificationComponent](#multiclassclassificationcomponent)
- [PhysicalComponent_Impl](#physicalcomponent_impl)
- [PhysicalConnector](#physicalconnector)
- [Sensor](#sensor)
- [SoftwareComponent_Impl](#softwarecomponent_impl)

**Returns:** `execution::TimeFunction`

```
ComplexTimefunction returns execution::TimeFunction: 	ExeTimeFunction;
```



###  ExeTimeFunction  


**Refers to:**
- [Expression](#expression)
- [TimeFunctions](#timefunctions)


**Returns:** `execution::TimeFunction`

```
ExeTimeFunction returns execution::TimeFunction:
	{execution::TimeFunction}
			function=TimeFunctions '(' par1=Expression (',' par2=Expression)? ')';
```



###  TimeFunctions (enum) 


Literals:
- DUni (`DUni`, `Triang`)
- Det (`Det`)
- Exp (`Exp`)
- LogNorm (`LogNorm`)
- Norm (`Norm`)
- Uni (`Uni`)
- Wei (`Wei`)

```
enum TimeFunctions returns execution::TimeFunctions:
	Det='Det' | Exp='Exp' | Uni='Uni' | DUni='DUni' | Norm='Norm' | LogNorm='LogNorm' | Wei='Wei' | DUni='Triang';
```



###  FlowFinal  


**Refers to:**
- ID

**Referred by:**
- [ConnectableNode](#connectablenode)

**Returns:** `execution::FlowFinal`

```
FlowFinal returns execution::FlowFinal:
	{execution::FlowFinal}
	source=[execution::ConnectableNode] '->' 'discard' ';';
```



###  ForkNode  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- ID

**Referred by:**
- [ConnectableNode](#connectablenode)

**Returns:** `execution::ForkNode`

```
ForkNode returns execution::ForkNode:
	'fork' source=[execution::ConnectableNode] '{'
	targets+=[execution::ConnectableNode] ("," targets+=[execution::ConnectableNode])*
	('takes' timeFunction=ComplexTimefunction)?
	'}';
```



###  MergeNode  


**Refers to:**
- [ComplexTimefunction](#complextimefunction)
- ID

**Referred by:**
- [ConnectableNode](#connectablenode)

**Returns:** `execution::MergeNode`

```
MergeNode returns execution::MergeNode:
	'join' '{'
	sources+=[execution::ConnectableNode] ("," sources+=[execution::ConnectableNode])*
	('takes' timeFunction=ComplexTimefunction)?
	'}' 'to' target=[execution::ConnectableNode];
```



###  Expression  


**Referred by:**
- [Assignment](#assignment)
- [Const](#const)
- [ExeTimeFunction](#exetimefunction)
- [OutputPin](#outputpin)
- [Variable](#variable)

**Returns:** `execution::Expression`

```
Expression returns execution::Expression:
	Addition;
```



###  Addition  


**Refers to:**
- [Multiplication](#multiplication)

**Referred by:**
- [Elements](#elements)
- [Primary](#primary)

**Returns:** `execution::Expression`

```
Addition returns execution::Expression:
	{execution::Addition}
	left=Multiplication ({execution::Addition.left=current}
	(addition?='+' | subtraction?='-')
	right=Multiplication)*;
```



###  Multiplication  


**Refers to:**
- [Exponentiation](#exponentiation)

**Referred by:**
- [Addition](#addition)

**Returns:** `execution::Expression`

```
Multiplication returns execution::Expression:
	{execution::Multiplication}
	left=Exponentiation ({execution::Multiplication.left=current}
	(multiplication?='*' | division?='/')
	right=Exponentiation)*;
```



###  Exponentiation  


**Refers to:**
- [LiteralBoolean](#literalboolean)
- [LiteralByte](#literalbyte)
- [LiteralDouble](#literaldouble)
- [LiteralFloat](#literalfloat)
- [LiteralInteger](#literalinteger)
- [LiteralLong](#literallong)
- [LiteralShort](#literalshort)
- [Primary](#primary)

**Referred by:**
- [Multiplication](#multiplication)

**Returns:** `execution::Exponentiation`

```
Exponentiation returns execution::Exponentiation:
	{execution::Exponentiation}
	left=Primary ({execution::Exponentiation.left=current}
	'^'
	right=(LiteralInteger | LiteralBoolean | LiteralFloat | LiteralDouble | LiteralLong | LiteralShort | LiteralByte))*;
```



###  AssignableElement  


**Refers to:**
- [OutputPin](#outputpin)
- [Variable](#variable)


**Returns:** `execution::AssignableElement`

```
AssignableElement returns execution::AssignableElement:
	Variable | OutputPin;
```



###  Primary  


**Refers to:**
- [Addition](#addition)
- [InputPinAttributeReference](#inputpinattributereference)
- [InputPinReference](#inputpinreference)
- [ParameterReference](#parameterreference)
- [ValueSpecification](#valuespecification)
- [VariableRef](#variableref)

**Referred by:**
- [Exponentiation](#exponentiation)

**Returns:** `execution::Expression`

```
Primary returns execution::Expression:
	ParameterReference | ValueSpecification | VariableRef | InputPinAttributeReference | InputPinReference |
	'(' Addition ')';
```



###  LiteralInteger  


**Refers to:**
- [EInt](#eint)

**Referred by:**
- [Exponentiation](#exponentiation)
- [ValueSpecification](#valuespecification)

**Returns:** `core::LiteralInteger`

```
LiteralInteger returns core::LiteralInteger:
	value=EInt;
```



###  ReferenceableItem  


**Refers to:**
- [Const](#const)
- [Variable](#variable)

**Referred by:**
- [Elements](#elements)

**Returns:** `execution::ReferenceableItem`

```
ReferenceableItem returns execution::ReferenceableItem:
	Variable | Const;
```



###  ParameterReference  


**Refers to:**
- ID

**Referred by:**
- [Primary](#primary)

**Returns:** `execution::ParameterReference`

```
ParameterReference returns execution::ParameterReference:
	{execution::ParameterReference}
	'@' parameter=[analysis::Parameter];
```



###  InputPinReference  


**Refers to:**
- ID

**Referred by:**
- [Primary](#primary)

**Returns:** `execution::InputPinReference`

```
InputPinReference returns execution::InputPinReference:
	{execution::InputPinReference}
	'$' inputPin=[InputPin];
```



###  InputPinAttributeReference  


**Refers to:**
- ID

**Referred by:**
- [Primary](#primary)

**Returns:** `execution::InputPinAttributeReference`

```
InputPinAttributeReference returns execution::InputPinAttributeReference:
	{execution::InputPinAttributeReference}
	'$' inputPin=[InputPin] '.' attribute=[core::AttributeSpecification];
```



###  Variable  


**Refers to:**
- [Expression](#expression)
- ID

**Referred by:**
- [AssignableElement](#assignableelement)
- [ReferenceableItem](#referenceableitem)

**Returns:** `execution::Variable`

```
Variable returns execution::Variable:
	'var' name=ID ('=' expression=Expression)? ';';
```



###  Const  


**Refers to:**
- [Expression](#expression)
- ID

**Referred by:**
- [ReferenceableItem](#referenceableitem)

**Returns:** `execution::Const`

```
Const returns execution::Const:
	'const' name=ID ('=' expression=Expression)? ';';
```



###  Assignment  


**Refers to:**
- [AssignableElementReference](#assignableelementreference)
- [Expression](#expression)

**Referred by:**
- [Elements](#elements)

**Returns:** `execution::Assignment`

```
Assignment returns execution::Assignment:
	target=AssignableElementReference '=' expression=Expression ';';
```



###  AssignableElementReference  


**Refers to:**
- ID

**Referred by:**
- [Assignment](#assignment)

**Returns:** `execution::AssignableElementReference`

```
AssignableElementReference returns execution::AssignableElementReference:
	ref=[execution::AssignableElement];
```



###  VariableRef  


**Refers to:**
- ID

**Referred by:**
- [Primary](#primary)

**Returns:** `execution::VariableRef`

```
VariableRef returns execution::VariableRef:
	{execution::VariableRef}
	variable=[execution::ReferenceableItem];
```



###  TypeSpecification  
TYPES


**Refers to:**
- [AttributeSpecification](#attributespecification)
- ID

**Referred by:**
- [Model](#model)

**Returns:** `core::TypeSpecification`

```
TypeSpecification returns core::TypeSpecification:
	{core::TypeSpecification}
	(abstract?='abstract')? 'type' name=ID ('extends' superType=[core::TypeSpecification])? '{'
	(attributes+=AttributeSpecification (',' attributes+=AttributeSpecification)*)?'}';
```



###  AttributeSpecification  


**Refers to:**
- [BooleanAttribute](#booleanattribute)
- [ClassAttribute](#classattribute)
- [DoubleAttribute](#doubleattribute)
- [IntegerAttribute](#integerattribute)
- [StringAttribute](#stringattribute)

**Referred by:**
- [TypeSpecification](#typespecification)

**Returns:** `core::AttributeSpecification`

```
AttributeSpecification returns core::AttributeSpecification:
	IntegerAttribute | DoubleAttribute | StringAttribute | BooleanAttribute | ClassAttribute;
```



###  IntegerAttribute  


**Refers to:**
- [EInt](#eint)
- ID

**Referred by:**
- [AttributeSpecification](#attributespecification)

**Returns:** `core::IntegerAttribute`

```
IntegerAttribute returns core::IntegerAttribute:
	{core::IntegerAttribute}
	'int' (array?='[' ']')? name=ID ('=' defaultValue=EInt)?;
```



###  DoubleAttribute  


**Refers to:**
- [EDouble](#edouble)
- ID

**Referred by:**
- [AttributeSpecification](#attributespecification)

**Returns:** `core::DoubleAttribute`

```
DoubleAttribute returns core::DoubleAttribute:
	{core::DoubleAttribute}
	'double' (array?='[' ']')? name=ID ('=' defaultValue=EDouble)?;
```



###  StringAttribute  


**Refers to:**
- [EString](#estring)
- ID

**Referred by:**
- [AttributeSpecification](#attributespecification)

**Returns:** `core::StringAttribute`

```
StringAttribute returns core::StringAttribute:
	{core::StringAttribute}
	'string' (array?='[' ']')? name=ID ('=' defaultValue=EString)?;
```



###  BooleanAttribute  


**Refers to:**
- [EBoolean](#eboolean)
- ID

**Referred by:**
- [AttributeSpecification](#attributespecification)

**Returns:** `core::BooleanAttribute`

```
BooleanAttribute returns core::BooleanAttribute:
	{core::BooleanAttribute}
	'boolean' (array?='[' ']')? name=ID ('=' defaultValue=EBoolean)?;
```



###  ClassAttribute  


**Refers to:**
- ID

**Referred by:**
- [AttributeSpecification](#attributespecification)

**Returns:** `core::ClassAttribute`

```
ClassAttribute returns core::ClassAttribute:
	{core::ClassAttribute}
	type=[core::TypeSpecification] (array?='[' ']')? name=ID;
```




##  Simplified grammar
**Model** ::= `model`   _Name_   `{`   _Documentation_?   (_Import_   (`,`   _Import_)*)?   (_SecurityThreatsImport_   (`,`   _SecurityThreatsImport_)*)?   _KnownSecurityThreats_?   _SecuritySpecification_?   (`picturesPath`   _PROPERTY_ASSIGN_   _EString_)?   (_TypeSpecification_   (`,`   _TypeSpecification_)*)?   _Parameters_?   (_Package_   (`,`   _Package_)*)?   (_Actor_   (`,`   _Actor_)*)?   (_Variant_   (`,`   _Variant_)*)?   (_ClassificationClass_   (`,`   _ClassificationClass_)*)?   (_Environment_   (`,`   _Environment_)*)?   `}`;

**Name** ::= _EString_;

**Documentation** ::= `doc`   _PROPERTY_ASSIGN_   _EString_;

**Import** ::=    `import`   _STRING_   `;`;

**SecurityThreatsImport** ::=    `import`   `security`   _ID_   `;`;

**KnownSecurityThreats** ::=    `knownSecurityThreats`   `{`   (_CVE_   _CVE_*)?   `}`;

**SecuritySpecification** ::=    `securitySpec`   `{`   (_AssetDefinition_   _AssetDefinition_*)?   (_AttackSurface_   _AttackSurface_*)?   `}`;

**PROPERTY_ASSIGN** ::= `:`;

**EString** ::= _STRING_ | _ID_;

**TypeSpecification** ::=    `abstract`?   `type`   _ID_   (`extends`   _ID_)?   `{`   (_AttributeSpecification_   (`,`   _AttributeSpecification_)*)?   `}`;

**Parameters** ::= `parameters`   `{`   _Parameter_   (`,`   _Parameter_)*   `}`;

**Package** ::= `package`   _Name_   `{`   _Documentation_?   (`simulationDuration`   _PROPERTY_ASSIGN_   _EInt_)?   (`mainResponsible`   _PROPERTY_ASSIGN_   _EString_)?   (`specifiesComponent`   _PROPERTY_ASSIGN_   _EString_)?   (`processingUnits`   _PROPERTY_ASSIGN_   _EInt_)?   _Parameters_?   (_Component_   (`,`   _Component_)*)?   (_Connector_   (`,`   _Connector_)*)?   (_DataStore_   (`,`   _DataStore_)*)?   (_Sector_   (`,`   _Sector_)*)?   (`subPackages`   `{`   _Package_   (`,`   _Package_)*   `}`)?   `}`;

**Actor** ::= _Actor_Impl_ | _Human_Impl_ | _Robot_ | _Person_;

**Variant** ::=    `variant`   _Name_   (`{`   _Documentation_?   `}`)?;

**ClassificationClass** ::=    `cl`   _Name_;

**Environment** ::=    `environment`   _Name_   `{`   (_ClassificationClassDistribution_   (`,`   _ClassificationClassDistribution_)*)?   (`,`   `OOD`   _EDouble_)?   `}`;

**STRING** ::= (`"`   ((`\`   _._) | !(`\` | `"`))*   `"`) | (`'`   ((`\`   _._) | !(`\` | `'`))*   `'`);

**ID** ::= `^`?   ([`a`..`z`] | [`A`..`Z`] | `_`)   ([`a`..`z`] | [`A`..`Z`] | `_` | [`0`..`9`])*;

**CVE** ::=    `cve`   _EString_   (`cvss`   _PROPERTY_ASSIGN_   _EDouble_)?   _EString_?   (`descr`   _PROPERTY_ASSIGN_   _EString_)?   (`affects`   `{`   _EString_   (`,`   _EString_)*   `}`)?   `;`;

**AssetDefinition** ::=    `asset`   _EString_   `;`;

**AttackSurface** ::=    `attack`   `surface`   _EString_   `;`;

**AttributeSpecification** ::= _IntegerAttribute_ | _DoubleAttribute_ | _StringAttribute_ | _BooleanAttribute_ | _ClassAttribute_;

**Parameter** ::=    `par`   _Name_   (`:=`   _ValueSpecification_)?   (`{`   _Documentation_?   (`parameterDefinition`   _PROPERTY_ASSIGN_   _EString_)?   (`appliesOnlyOnVariants`   `(`   _EString_   (`,`   _EString_)*   `)`)?   (`doesNotApplyOnVariants`   `(`   _EString_   (`,`   _EString_)*   `)`)?   (`currentValue`   _PROPERTY_ASSIGN_   _ValueSpecification_)?   `}`)?;

**EInt** ::= _NEGATIVE_INT_ | _INT_;

**Component** ::= _Component_Impl_ | _MachineLearningComponent_ | _ClassificationComponent_ | _PhysicalComponent_Impl_ | _SoftwareComponent_Impl_ | _Heuristic_ | _Function_ | _ExternalDependency_ | _Sensor_ | _Actuator_;

**Connector** ::= _Connector_Impl_ | _PhysicalConnector_ | _LogicalConnector_;

**DataStore** ::=    `datastore`   _ID_?   _Name_   (`{`   _Documentation_?   _Parameters_?   `}`)?;

**Sector** ::=    `sector`   _Name_   `{`   _Documentation_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`sectors`   `{`   _Sector_   (`,`   _Sector_)*   `}`)?   `}`;

**Actor_Impl** ::=    `actor`   _Name_   (`{`   _Documentation_?   `}`)?;

**Human_Impl** ::=    `human`   _Name_   (`{`   _Documentation_?   `}`)?;

**Robot** ::=    `robot`   _Name_   (`{`   _Documentation_?   `}`)?;

**Person** ::= `person`   (_Name_ | (_EString_   `,`   _Name_))   `{`   _Documentation_?   (`department`   _EString_)?   (`pictureFileName`   _EString_)?   `}`;

**ClassificationClassDistribution** ::=    (`not`?   _EString_   _EDouble_);

**EDouble** ::= _DOUBLE_;

**IntegerAttribute** ::=    `int`   (`[`   `]`)?   _ID_   (`=`   _EInt_)?;

**DoubleAttribute** ::=    `double`   (`[`   `]`)?   _ID_   (`=`   _EDouble_)?;

**StringAttribute** ::=    `string`   (`[`   `]`)?   _ID_   (`=`   _EString_)?;

**BooleanAttribute** ::=    `boolean`   (`[`   `]`)?   _ID_   (`=`   _EBoolean_)?;

**ClassAttribute** ::=    _ID_   (`[`   `]`)?   _ID_;

**ValueSpecification** ::= _LiteralNull_ | _LiteralString_ | _LiteralInteger_ | _LiteralBoolean_ | _LiteralFloat_ | _LiteralDouble_ | _LiteralLong_ | _LiteralShort_ | _LiteralByte_ | _LiteralCharacter_ | _LiteralDate_;

**NEGATIVE_INT** ::= `-`   _INT_;

**INT** ::= [`0`..`9`]+;

**Component_Impl** ::=    `component`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**MachineLearningComponent** ::=    `mlComponent`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**ClassificationComponent** ::= _BinaryClassificationComponent_ | _MulticlassClassificationComponent_;

**PhysicalComponent_Impl** ::=    `physicalComponent`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**SoftwareComponent_Impl** ::=    `softwareComponent`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**Heuristic** ::=    `heuristic`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**Function** ::=    `function`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**ExternalDependency** ::=    `externalDependency`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**Sensor** ::= `sensor`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`generates`   _EString_   (`,`   _EString_)*)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**Actuator** ::=    `actuator`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   `}`;

**Connector_Impl** ::= `connector`   _Name_   _EString_   `->`   _EString_   (`{`   _Documentation_?   (`takes`   _ComplexTimefunction_)?   _Parameters_?   `}`)?;

**PhysicalConnector** ::= `physicalConnector`   _Name_   _EString_   `->`   _EString_   (`{`   _Documentation_?   (`minSpeed`   _Connectionspeed_)?   (`maxSpeed`   _Connectionspeed_)?   (`takes`   _ComplexTimefunction_)?   _Parameters_?   `}`)?;

**LogicalConnector** ::= `logicalConnector`   _Name_   _EString_   `->`   _EString_   (`{`   _Documentation_?   (`takes`   _ComplexTimefunction_)?   _Parameters_?   `}`)?;

**DOUBLE** ::= `-`?   _INT_?   `.`   _INT_   ((`E` | `e`)   `-`?   _INT_)?;

**EBoolean** ::= `true` | `false`;

**LiteralNull** ::=    `null`;

**LiteralString** ::=    _STRING_;

**LiteralInteger** ::= _EInt_;

**LiteralBoolean** ::=    (`true` | `false`);

**LiteralFloat** ::=    _Float_;

**LiteralDouble** ::=    _EDouble_;

**LiteralLong** ::=    _Long_;

**LiteralShort** ::=    `LiteralShort`   _Name_   `{`   (`value`   _Short_)?   `}`;

**LiteralByte** ::=    `LiteralByte`   _Name_   `{`   (`value`   _Byte_)?   `}`;

**LiteralCharacter** ::=    `LiteralCharacter`   _Name_   `{`   (`value`   _Character_)?   `}`;

**LiteralDate** ::=    `LiteralDate`   _Name_   `{`   (`value`   _Date_)?   `}`;

**ComponentFiringStrategy** ::= `AND` | `&&` | `OR` | `||`;

**ComplexTimefunction** ::= _ExeTimeFunction_;

**Pin** ::= _InputPin_ | _OutputPin_;

**Execution** ::=    _Elements_+;

**BinaryClassificationComponent** ::=    `binaryClassificationComponent`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   (`confusionMatrixes`   `{`   _BinaryConfusionMatrix_   (`,`   _BinaryConfusionMatrix_)*   `}`)?   `}`;

**MulticlassClassificationComponent** ::=    `multiclassClassificationComponent`   _Name_   `{`   _Documentation_?   (`firingStrategy`   _ComponentFiringStrategy_)?   (`takes`   _ComplexTimefunction_)?   (_Pin_   (`,`   _Pin_)*)?   (`synchronous`   _EBoolean_)?   (`numberOfServers`   _EInt_)?   (`mainResponsible`   _EString_)?   (`specifiedInPackage`   _EString_)?   _Parameters_?   (`components`   `{`   _Component_   (`,`   _Component_)*   `}`)?   (`datastores`   `{`   _DataStore_   (`,`   _DataStore_)*   `}`)?   (`runs`   `{`   _Execution_   `}`)?   (`confusionMatrixes`   `{`   _MulticlassConfusionMatrix_   (`,`   _MulticlassConfusionMatrix_)*   `}`)?   `}`;

**Connectionspeed** ::= `Connectionspeed`;

**Float** ::= `f`   _INT_   `.`   _INT_;

**Long** ::= `l`   _INT_;

**Short** ::= `Short`;

**Byte** ::= `Byte`;

**Character** ::= `Character`;

**Date** ::= `Date`;

**ExeTimeFunction** ::=    _TimeFunctions_   `(`   _Expression_   (`,`   _Expression_)?   `)`;

**InputPin** ::=    `optional`?   `in`   `stream`?   _ID_?   _Name_   (`{`   _Documentation_?   (`collects`   _EInt_)?   (`raceSemantic`   _RaceSemantic_)?   (`queueType`   _QueueType_)?   _Parameters_?   `}`)?;

**OutputPin** ::=    `out`   `stream`?   _ID_?   _Name_   (`{`   _Documentation_?   (`amplifies`   _EInt_)?   (`outputUncertainty`   _EDouble_)?   (`raceSemantic`   _RaceSemantic_)?   (`generates`   _TokenSpecification_)?   _Parameters_?   `}`)?   (`=`   _Expression_)?;

**Elements** ::= _Flow_ | _ConnectableNode_ | _Addition_ | _ReferenceableItem_ | _Assignment_;

**BinaryConfusionMatrix** ::=    `confusion`   `matrix`   _Name_   `+`   _EString_   `{`   `TP`   _PROPERTY_ASSIGN_   _EInt_   `,`   `FN`   _PROPERTY_ASSIGN_   _EInt_   `,`   `FP`   _PROPERTY_ASSIGN_   _EInt_   `,`   `TN`   _PROPERTY_ASSIGN_   _EInt_   `}`;

**MulticlassConfusionMatrix** ::=    `confusion`   `matrix`   _Name_   `{`   (_ConfusionMatrixEntry_   (`,`   _ConfusionMatrixEntry_)*)?   `}`;

**TimeFunctions** ::= `Det` | `Exp` | `Uni` | `DUni` | `Norm` | `LogNorm` | `Wei` | `Triang`;

**Expression** ::= _Addition_;

**RaceSemantic** ::= `FCFS` | `DUPLICATE` | `MERGE` | `MERGE_AND_DUPLICATE`;

**QueueType** ::= `FIFO` | `LIFO` | `RANDOM` | `LATEST_ONLY` | `STORE`;

**TokenSpecification** ::=    _Set_;

**Flow** ::= _ID_   `->`   _ID_   (`takes`   _ComplexTimefunction_)?   `;`;

**ConnectableNode** ::= _FlowFinal_ | _ForkNode_ | _MergeNode_;

**Addition** ::=    _Multiplication_   (   (`+` | `-`)   _Multiplication_)*;

**ReferenceableItem** ::= _Variable_ | _Const_;

**Assignment** ::= _AssignableElementReference_   `=`   _Expression_   `;`;

**ConfusionMatrixEntry** ::=    _EString_   _EString_   _PROPERTY_ASSIGN_   _EInt_;

**Set** ::=    `set`   `{`   _SetValue_   _SetValue_*   `}`;

**FlowFinal** ::=    _ID_   `->`   `discard`   `;`;

**ForkNode** ::= `fork`   _ID_   `{`   _ID_   (`,`   _ID_)*   (`takes`   _ComplexTimefunction_)?   `}`;

**MergeNode** ::= `join`   `{`   _ID_   (`,`   _ID_)*   (`takes`   _ComplexTimefunction_)?   `}`   `to`   _ID_;

**Multiplication** ::=    _Exponentiation_   (   (`*` | `/`)   _Exponentiation_)*;

**Variable** ::= `var`   _ID_   (`=`   _Expression_)?   `;`;

**Const** ::= `const`   _ID_   (`=`   _Expression_)?   `;`;

**AssignableElementReference** ::= _ID_;

**SetValue** ::=    `value`   _PROPERTY_ASSIGN_   _EString_   ((`prob`   _PROPERTY_ASSIGN_   _EDouble_) & (`size`   _PROPERTY_ASSIGN_   _EDouble_)?)   `;`;

**Exponentiation** ::=    _Primary_   (   `^`   (_LiteralInteger_ | _LiteralBoolean_ | _LiteralFloat_ | _LiteralDouble_ | _LiteralLong_ | _LiteralShort_ | _LiteralByte_))*;

**Primary** ::= _ParameterReference_ | _ValueSpecification_ | _VariableRef_ | _InputPinAttributeReference_ | _InputPinReference_ | (`(`   _Addition_   `)`);

**ParameterReference** ::=    `@`   _ID_;

**VariableRef** ::=    _ID_;

**InputPinAttributeReference** ::=    `$`   _ID_   `.`   _ID_;

**InputPinReference** ::=    `$`   _ID_;


