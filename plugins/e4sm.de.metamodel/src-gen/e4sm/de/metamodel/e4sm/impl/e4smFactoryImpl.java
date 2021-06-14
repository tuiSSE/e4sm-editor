/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.E4SMElementType;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.Human;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Parameter;
import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.ParameterDefinitionLibrary;
import e4sm.de.metamodel.e4sm.ParameterType;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.UnitOfMeasurement;
import e4sm.de.metamodel.e4sm.Variant;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class e4smFactoryImpl extends EFactoryImpl implements e4smFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static e4smFactory init() {
		try {
			e4smFactory thee4smFactory = (e4smFactory) EPackage.Registry.INSTANCE.getEFactory(e4smPackage.eNS_URI);
			if (thee4smFactory != null) {
				return thee4smFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new e4smFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public e4smFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case e4smPackage.COMPONENT:
			return createComponent();
		case e4smPackage.MACHINE_LEARNING_COMPONENT:
			return createMachineLearningComponent();
		case e4smPackage.CONNECTOR:
			return createConnector();
		case e4smPackage.PHYSICAL_CONNECTOR:
			return createPhysicalConnector();
		case e4smPackage.PHYSICAL_COMPONENT:
			return createPhysicalComponent();
		case e4smPackage.SOFTWARE_COMPONENT:
			return createSoftwareComponent();
		case e4smPackage.LOGICAL_CONNECTOR:
			return createLogicalConnector();
		case e4smPackage.HEURISTIC:
			return createHeuristic();
		case e4smPackage.FUNCTION:
			return createFunction();
		case e4smPackage.EXTERNAL_DEPENDENCY:
			return createExternalDependency();
		case e4smPackage.PACKAGE:
			return createPackage();
		case e4smPackage.MODEL:
			return createModel();
		case e4smPackage.ACTOR:
			return createActor();
		case e4smPackage.HUMAN:
			return createHuman();
		case e4smPackage.ROBOT:
			return createRobot();
		case e4smPackage.SECTOR:
			return createSector();
		case e4smPackage.SENSOR:
			return createSensor();
		case e4smPackage.ACTUATOR:
			return createActuator();
		case e4smPackage.INPUT_PIN:
			return createInputPin();
		case e4smPackage.OUTPUT_PIN:
			return createOutputPin();
		case e4smPackage.PERSON:
			return createPerson();
		case e4smPackage.PARAMETER_DEFINITION:
			return createParameterDefinition();
		case e4smPackage.PARAMETER:
			return createParameter();
		case e4smPackage.PARAMETER_DEFINITION_LIBRARY:
			return createParameterDefinitionLibrary();
		case e4smPackage.VARIANT:
			return createVariant();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case e4smPackage.PARAMETER_TYPE:
			return createParameterTypeFromString(eDataType, initialValue);
		case e4smPackage.UNIT_OF_MEASUREMENT:
			return createUnitOfMeasurementFromString(eDataType, initialValue);
		case e4smPackage.E4SM_ELEMENT_TYPE:
			return createE4SMElementTypeFromString(eDataType, initialValue);
		case e4smPackage.CONNECTIONSPEED:
			return createConnectionspeedFromString(eDataType, initialValue);
		case e4smPackage.JSON:
			return createJSONFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case e4smPackage.PARAMETER_TYPE:
			return convertParameterTypeToString(eDataType, instanceValue);
		case e4smPackage.UNIT_OF_MEASUREMENT:
			return convertUnitOfMeasurementToString(eDataType, instanceValue);
		case e4smPackage.E4SM_ELEMENT_TYPE:
			return convertE4SMElementTypeToString(eDataType, instanceValue);
		case e4smPackage.CONNECTIONSPEED:
			return convertConnectionspeedToString(eDataType, instanceValue);
		case e4smPackage.JSON:
			return convertJSONToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MachineLearningComponent createMachineLearningComponent() {
		MachineLearningComponentImpl machineLearningComponent = new MachineLearningComponentImpl();
		return machineLearningComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalConnector createPhysicalConnector() {
		PhysicalConnectorImpl physicalConnector = new PhysicalConnectorImpl();
		return physicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponent createPhysicalComponent() {
		PhysicalComponentImpl physicalComponent = new PhysicalComponentImpl();
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalConnector createLogicalConnector() {
		LogicalConnectorImpl logicalConnector = new LogicalConnectorImpl();
		return logicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heuristic createHeuristic() {
		HeuristicImpl heuristic = new HeuristicImpl();
		return heuristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDependency createExternalDependency() {
		ExternalDependencyImpl externalDependency = new ExternalDependencyImpl();
		return externalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public e4sm.de.metamodel.e4sm.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Human createHuman() {
		HumanImpl human = new HumanImpl();
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sector createSector() {
		SectorImpl sector = new SectorImpl();
		return sector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinitionLibrary createParameterDefinitionLibrary() {
		ParameterDefinitionLibraryImpl parameterDefinitionLibrary = new ParameterDefinitionLibraryImpl();
		return parameterDefinitionLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasurement createUnitOfMeasurementFromString(EDataType eDataType, String initialValue) {
		UnitOfMeasurement result = UnitOfMeasurement.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfMeasurementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E4SMElementType createE4SMElementTypeFromString(EDataType eDataType, String initialValue) {
		E4SMElementType result = E4SMElementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertE4SMElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createConnectionspeedFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionspeedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJSONFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public e4smPackage gete4smPackage() {
		return (e4smPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static e4smPackage getPackage() {
		return e4smPackage.eINSTANCE;
	}

} //e4smFactoryImpl
