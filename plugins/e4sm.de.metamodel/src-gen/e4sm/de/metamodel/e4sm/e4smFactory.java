/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.e4smPackage
 * @generated
 */
public interface e4smFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	e4smFactory eINSTANCE = e4sm.de.metamodel.e4sm.impl.e4smFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Machine Learning Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Learning Component</em>'.
	 * @generated
	 */
	MachineLearningComponent createMachineLearningComponent();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Physical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Connector</em>'.
	 * @generated
	 */
	PhysicalConnector createPhysicalConnector();

	/**
	 * Returns a new object of class '<em>Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Component</em>'.
	 * @generated
	 */
	PhysicalComponent createPhysicalComponent();

	/**
	 * Returns a new object of class '<em>Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Component</em>'.
	 * @generated
	 */
	SoftwareComponent createSoftwareComponent();

	/**
	 * Returns a new object of class '<em>Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Connector</em>'.
	 * @generated
	 */
	LogicalConnector createLogicalConnector();

	/**
	 * Returns a new object of class '<em>Heuristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heuristic</em>'.
	 * @generated
	 */
	Heuristic createHeuristic();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>External Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Dependency</em>'.
	 * @generated
	 */
	ExternalDependency createExternalDependency();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human</em>'.
	 * @generated
	 */
	Human createHuman();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Sector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sector</em>'.
	 * @generated
	 */
	Sector createSector();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pin</em>'.
	 * @generated
	 */
	InputPin createInputPin();

	/**
	 * Returns a new object of class '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pin</em>'.
	 * @generated
	 */
	OutputPin createOutputPin();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parameter Definition Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition Library</em>'.
	 * @generated
	 */
	ParameterDefinitionLibrary createParameterDefinitionLibrary();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	Variant createVariant();

	/**
	 * Returns a new object of class '<em>Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Unit</em>'.
	 * @generated
	 */
	MeasurementUnit createMeasurementUnit();

	/**
	 * Returns a new object of class '<em>Simple Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Unit</em>'.
	 * @generated
	 */
	SimpleUnit createSimpleUnit();

	/**
	 * Returns a new object of class '<em>Derived Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Unit</em>'.
	 * @generated
	 */
	DerivedUnit createDerivedUnit();

	/**
	 * Returns a new object of class '<em>Unit Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Conversion</em>'.
	 * @generated
	 */
	UnitConversion createUnitConversion();

	/**
	 * Returns a new object of class '<em>Conversion By Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion By Prefix</em>'.
	 * @generated
	 */
	ConversionByPrefix createConversionByPrefix();

	/**
	 * Returns a new object of class '<em>Conversion By Convention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion By Convention</em>'.
	 * @generated
	 */
	ConversionByConvention createConversionByConvention();

	/**
	 * Returns a new object of class '<em>Unit Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Prefix</em>'.
	 * @generated
	 */
	UnitPrefix createUnitPrefix();

	/**
	 * Returns a new object of class '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Null</em>'.
	 * @generated
	 */
	LiteralNull createLiteralNull();

	/**
	 * Returns a new object of class '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String</em>'.
	 * @generated
	 */
	LiteralString createLiteralString();

	/**
	 * Returns a new object of class '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Integer</em>'.
	 * @generated
	 */
	LiteralInteger createLiteralInteger();

	/**
	 * Returns a new object of class '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean</em>'.
	 * @generated
	 */
	LiteralBoolean createLiteralBoolean();

	/**
	 * Returns a new object of class '<em>Literal Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Float</em>'.
	 * @generated
	 */
	LiteralFloat createLiteralFloat();

	/**
	 * Returns a new object of class '<em>Literal Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Double</em>'.
	 * @generated
	 */
	LiteralDouble createLiteralDouble();

	/**
	 * Returns a new object of class '<em>Literal Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Long</em>'.
	 * @generated
	 */
	LiteralLong createLiteralLong();

	/**
	 * Returns a new object of class '<em>Literal Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Short</em>'.
	 * @generated
	 */
	LiteralShort createLiteralShort();

	/**
	 * Returns a new object of class '<em>Literal Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Byte</em>'.
	 * @generated
	 */
	LiteralByte createLiteralByte();

	/**
	 * Returns a new object of class '<em>Literal Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Character</em>'.
	 * @generated
	 */
	LiteralCharacter createLiteralCharacter();

	/**
	 * Returns a new object of class '<em>Literal Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Date</em>'.
	 * @generated
	 */
	LiteralDate createLiteralDate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	e4smPackage gete4smPackage();

} //e4smFactory
