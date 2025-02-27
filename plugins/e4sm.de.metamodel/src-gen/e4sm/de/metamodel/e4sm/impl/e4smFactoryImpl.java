/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.BinaryClassificationComponent;
import e4sm.de.metamodel.e4sm.BinaryConfusionMatrix;
import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.ClassificationClassDistribution;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ComponentFiringStrategy;
import e4sm.de.metamodel.e4sm.ConfusionMatrixEntry;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.ConversionByConvention;
import e4sm.de.metamodel.e4sm.ConversionByPrefix;
import e4sm.de.metamodel.e4sm.DataStore;
import e4sm.de.metamodel.e4sm.DerivedUnit;
import e4sm.de.metamodel.e4sm.DynamicRange;
import e4sm.de.metamodel.e4sm.Environment;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.Human;
import e4sm.de.metamodel.e4sm.Import;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.MeasurementUnit;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.MulticlassClassificationComponent;
import e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.QueueType;
import e4sm.de.metamodel.e4sm.RaceSemantic;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.SecurityThreatsImport;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.Set;
import e4sm.de.metamodel.e4sm.SetValue;
import e4sm.de.metamodel.e4sm.SimpleUnit;
import e4sm.de.metamodel.e4sm.SizeComputation;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.StaticSize;
import e4sm.de.metamodel.e4sm.TokenSpecification;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.UnitPrefix;
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
		case e4smPackage.MEASUREMENT_UNIT:
			return createMeasurementUnit();
		case e4smPackage.SIMPLE_UNIT:
			return createSimpleUnit();
		case e4smPackage.DERIVED_UNIT:
			return createDerivedUnit();
		case e4smPackage.UNIT_CONVERSION:
			return createUnitConversion();
		case e4smPackage.CONVERSION_BY_PREFIX:
			return createConversionByPrefix();
		case e4smPackage.CONVERSION_BY_CONVENTION:
			return createConversionByConvention();
		case e4smPackage.UNIT_PREFIX:
			return createUnitPrefix();
		case e4smPackage.IMPORT:
			return createImport();
		case e4smPackage.DATA_STORE:
			return createDataStore();
		case e4smPackage.ENVIRONMENT:
			return createEnvironment();
		case e4smPackage.CLASSIFICATION_CLASS:
			return createClassificationClass();
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION:
			return createClassificationClassDistribution();
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX:
			return createMulticlassConfusionMatrix();
		case e4smPackage.CONFUSION_MATRIX_ENTRY:
			return createConfusionMatrixEntry();
		case e4smPackage.BINARY_CONFUSION_MATRIX:
			return createBinaryConfusionMatrix();
		case e4smPackage.BINARY_CLASSIFICATION_COMPONENT:
			return createBinaryClassificationComponent();
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT:
			return createMulticlassClassificationComponent();
		case e4smPackage.TOKEN_SPECIFICATION:
			return createTokenSpecification();
		case e4smPackage.STATIC_SIZE:
			return createStaticSize();
		case e4smPackage.SET:
			return createSet();
		case e4smPackage.SET_VALUE:
			return createSetValue();
		case e4smPackage.DYNAMIC_RANGE:
			return createDynamicRange();
		case e4smPackage.SECURITY_THREATS_IMPORT:
			return createSecurityThreatsImport();
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
		case e4smPackage.QUEUE_TYPE:
			return createQueueTypeFromString(eDataType, initialValue);
		case e4smPackage.RACE_SEMANTIC:
			return createRaceSemanticFromString(eDataType, initialValue);
		case e4smPackage.COMPONENT_FIRING_STRATEGY:
			return createComponentFiringStrategyFromString(eDataType, initialValue);
		case e4smPackage.SIZE_COMPUTATION:
			return createSizeComputationFromString(eDataType, initialValue);
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
		case e4smPackage.QUEUE_TYPE:
			return convertQueueTypeToString(eDataType, instanceValue);
		case e4smPackage.RACE_SEMANTIC:
			return convertRaceSemanticToString(eDataType, instanceValue);
		case e4smPackage.COMPONENT_FIRING_STRATEGY:
			return convertComponentFiringStrategyToString(eDataType, instanceValue);
		case e4smPackage.SIZE_COMPUTATION:
			return convertSizeComputationToString(eDataType, instanceValue);
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
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass createClassificationClass() {
		ClassificationClassImpl classificationClass = new ClassificationClassImpl();
		return classificationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClassDistribution createClassificationClassDistribution() {
		ClassificationClassDistributionImpl classificationClassDistribution = new ClassificationClassDistributionImpl();
		return classificationClassDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticlassConfusionMatrix createMulticlassConfusionMatrix() {
		MulticlassConfusionMatrixImpl multiclassConfusionMatrix = new MulticlassConfusionMatrixImpl();
		return multiclassConfusionMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfusionMatrixEntry createConfusionMatrixEntry() {
		ConfusionMatrixEntryImpl confusionMatrixEntry = new ConfusionMatrixEntryImpl();
		return confusionMatrixEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryConfusionMatrix createBinaryConfusionMatrix() {
		BinaryConfusionMatrixImpl binaryConfusionMatrix = new BinaryConfusionMatrixImpl();
		return binaryConfusionMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryClassificationComponent createBinaryClassificationComponent() {
		BinaryClassificationComponentImpl binaryClassificationComponent = new BinaryClassificationComponentImpl();
		return binaryClassificationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticlassClassificationComponent createMulticlassClassificationComponent() {
		MulticlassClassificationComponentImpl multiclassClassificationComponent = new MulticlassClassificationComponentImpl();
		return multiclassClassificationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenSpecification createTokenSpecification() {
		TokenSpecificationImpl tokenSpecification = new TokenSpecificationImpl();
		return tokenSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticSize createStaticSize() {
		StaticSizeImpl staticSize = new StaticSizeImpl();
		return staticSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetValue createSetValue() {
		SetValueImpl setValue = new SetValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicRange createDynamicRange() {
		DynamicRangeImpl dynamicRange = new DynamicRangeImpl();
		return dynamicRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityThreatsImport createSecurityThreatsImport() {
		SecurityThreatsImportImpl securityThreatsImport = new SecurityThreatsImportImpl();
		return securityThreatsImport;
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
	public SizeComputation createSizeComputationFromString(EDataType eDataType, String initialValue) {
		SizeComputation result = SizeComputation.get(initialValue);
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
	public String convertSizeComputationToString(EDataType eDataType, Object instanceValue) {
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
