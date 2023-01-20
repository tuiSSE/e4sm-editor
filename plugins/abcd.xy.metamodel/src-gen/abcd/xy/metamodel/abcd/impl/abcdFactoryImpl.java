/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Actor;
import abcd.xy.metamodel.abcd.Actuator;
import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.ComponentFiringStrategy;
import abcd.xy.metamodel.abcd.Connector;
import abcd.xy.metamodel.abcd.ConversionByConvention;
import abcd.xy.metamodel.abcd.ConversionByPrefix;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.DerivedUnit;
import abcd.xy.metamodel.abcd.ExternalDependency;
import abcd.xy.metamodel.abcd.Function;
import abcd.xy.metamodel.abcd.Heuristic;
import abcd.xy.metamodel.abcd.Human;
import abcd.xy.metamodel.abcd.Import;
import abcd.xy.metamodel.abcd.InputPin;
import abcd.xy.metamodel.abcd.LogicalConnector;
import abcd.xy.metamodel.abcd.MachineLearningComponent;
import abcd.xy.metamodel.abcd.MeasurementUnit;
import abcd.xy.metamodel.abcd.Model;
import abcd.xy.metamodel.abcd.OutputPin;
import abcd.xy.metamodel.abcd.Person;
import abcd.xy.metamodel.abcd.PhysicalComponent;
import abcd.xy.metamodel.abcd.PhysicalConnector;
import abcd.xy.metamodel.abcd.QueueType;
import abcd.xy.metamodel.abcd.RaceSemantic;
import abcd.xy.metamodel.abcd.Robot;
import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.Sensor;
import abcd.xy.metamodel.abcd.SimpleUnit;
import abcd.xy.metamodel.abcd.SoftwareComponent;
import abcd.xy.metamodel.abcd.UnitConversion;
import abcd.xy.metamodel.abcd.UnitPrefix;
import abcd.xy.metamodel.abcd.abcdFactory;
import abcd.xy.metamodel.abcd.abcdPackage;
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
public class abcdFactoryImpl extends EFactoryImpl implements abcdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static abcdFactory init() {
		try {
			abcdFactory theabcdFactory = (abcdFactory) EPackage.Registry.INSTANCE.getEFactory(abcdPackage.eNS_URI);
			if (theabcdFactory != null) {
				return theabcdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new abcdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abcdFactoryImpl() {
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
		case abcdPackage.COMPONENT:
			return createComponent();
		case abcdPackage.MACHINE_LEARNING_COMPONENT:
			return createMachineLearningComponent();
		case abcdPackage.CONNECTOR:
			return createConnector();
		case abcdPackage.PHYSICAL_CONNECTOR:
			return createPhysicalConnector();
		case abcdPackage.PHYSICAL_COMPONENT:
			return createPhysicalComponent();
		case abcdPackage.SOFTWARE_COMPONENT:
			return createSoftwareComponent();
		case abcdPackage.LOGICAL_CONNECTOR:
			return createLogicalConnector();
		case abcdPackage.HEURISTIC:
			return createHeuristic();
		case abcdPackage.FUNCTION:
			return createFunction();
		case abcdPackage.EXTERNAL_DEPENDENCY:
			return createExternalDependency();
		case abcdPackage.PACKAGE:
			return createPackage();
		case abcdPackage.MODEL:
			return createModel();
		case abcdPackage.ACTOR:
			return createActor();
		case abcdPackage.HUMAN:
			return createHuman();
		case abcdPackage.ROBOT:
			return createRobot();
		case abcdPackage.SECTOR:
			return createSector();
		case abcdPackage.SENSOR:
			return createSensor();
		case abcdPackage.ACTUATOR:
			return createActuator();
		case abcdPackage.INPUT_PIN:
			return createInputPin();
		case abcdPackage.OUTPUT_PIN:
			return createOutputPin();
		case abcdPackage.PERSON:
			return createPerson();
		case abcdPackage.MEASUREMENT_UNIT:
			return createMeasurementUnit();
		case abcdPackage.SIMPLE_UNIT:
			return createSimpleUnit();
		case abcdPackage.DERIVED_UNIT:
			return createDerivedUnit();
		case abcdPackage.UNIT_CONVERSION:
			return createUnitConversion();
		case abcdPackage.CONVERSION_BY_PREFIX:
			return createConversionByPrefix();
		case abcdPackage.CONVERSION_BY_CONVENTION:
			return createConversionByConvention();
		case abcdPackage.UNIT_PREFIX:
			return createUnitPrefix();
		case abcdPackage.IMPORT:
			return createImport();
		case abcdPackage.DATA_STORE:
			return createDataStore();
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
		case abcdPackage.QUEUE_TYPE:
			return createQueueTypeFromString(eDataType, initialValue);
		case abcdPackage.RACE_SEMANTIC:
			return createRaceSemanticFromString(eDataType, initialValue);
		case abcdPackage.COMPONENT_FIRING_STRATEGY:
			return createComponentFiringStrategyFromString(eDataType, initialValue);
		case abcdPackage.CONNECTIONSPEED:
			return createConnectionspeedFromString(eDataType, initialValue);
		case abcdPackage.JSON:
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
		case abcdPackage.QUEUE_TYPE:
			return convertQueueTypeToString(eDataType, instanceValue);
		case abcdPackage.RACE_SEMANTIC:
			return convertRaceSemanticToString(eDataType, instanceValue);
		case abcdPackage.COMPONENT_FIRING_STRATEGY:
			return convertComponentFiringStrategyToString(eDataType, instanceValue);
		case abcdPackage.CONNECTIONSPEED:
			return convertConnectionspeedToString(eDataType, instanceValue);
		case abcdPackage.JSON:
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
	public abcd.xy.metamodel.abcd.Package createPackage() {
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
	public MeasurementUnit createMeasurementUnit() {
		MeasurementUnitImpl measurementUnit = new MeasurementUnitImpl();
		return measurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleUnit createSimpleUnit() {
		SimpleUnitImpl simpleUnit = new SimpleUnitImpl();
		return simpleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedUnit createDerivedUnit() {
		DerivedUnitImpl derivedUnit = new DerivedUnitImpl();
		return derivedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitConversion createUnitConversion() {
		UnitConversionImpl unitConversion = new UnitConversionImpl();
		return unitConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionByPrefix createConversionByPrefix() {
		ConversionByPrefixImpl conversionByPrefix = new ConversionByPrefixImpl();
		return conversionByPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionByConvention createConversionByConvention() {
		ConversionByConventionImpl conversionByConvention = new ConversionByConventionImpl();
		return conversionByConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitPrefix createUnitPrefix() {
		UnitPrefixImpl unitPrefix = new UnitPrefixImpl();
		return unitPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueType createQueueTypeFromString(EDataType eDataType, String initialValue) {
		QueueType result = QueueType.get(initialValue);
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
	public String convertQueueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaceSemantic createRaceSemanticFromString(EDataType eDataType, String initialValue) {
		RaceSemantic result = RaceSemantic.get(initialValue);
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
	public String convertRaceSemanticToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFiringStrategy createComponentFiringStrategyFromString(EDataType eDataType, String initialValue) {
		ComponentFiringStrategy result = ComponentFiringStrategy.get(initialValue);
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
	public String convertComponentFiringStrategyToString(EDataType eDataType, Object instanceValue) {
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
	public abcdPackage getabcdPackage() {
		return (abcdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static abcdPackage getPackage() {
		return abcdPackage.eINSTANCE;
	}

} //abcdFactoryImpl
