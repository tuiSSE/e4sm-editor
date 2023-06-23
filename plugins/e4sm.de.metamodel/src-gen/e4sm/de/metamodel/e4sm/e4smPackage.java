/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.e4smFactory
 * @model kind="package"
 * @generated
 */
public interface e4smPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "e4sm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/e4sm/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "e4sm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	e4smPackage eINSTANCE = e4sm.de.metamodel.e4sm.impl.e4smPackageImpl.init();

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TIME_FUNCTION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DOCUMENTATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PINS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SPECIFIED_IN_PACKAGE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXECUTION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FIRING_STRATEGY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATASTORES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___COMPUTE_MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__TIME_FUNCTION = COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__DOCUMENTATION = COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__PINS = COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__MAIN_RESPONSIBLE = COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__SPECIFIED_IN_PACKAGE = COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__EXECUTION = COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__FIRING_STRATEGY = COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__DATASTORES = COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__SYNCHRONOUS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__NUMBER_OF_SERVERS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT___IS_PARALLEL = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.MachineLearningComponentImpl <em>Machine Learning Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.MachineLearningComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMachineLearningComponent()
	 * @generated
	 */
	int MACHINE_LEARNING_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__NAME = SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__PARAMETERS = SOFTWARE_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__TIME_FUNCTION = SOFTWARE_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__DOCUMENTATION = SOFTWARE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__COMPONENTS = SOFTWARE_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__PINS = SOFTWARE_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__MAIN_RESPONSIBLE = SOFTWARE_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__SPECIFIED_IN_PACKAGE = SOFTWARE_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__EXECUTION = SOFTWARE_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__FIRING_STRATEGY = SOFTWARE_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__DATASTORES = SOFTWARE_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__SYNCHRONOUS = SOFTWARE_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__NUMBER_OF_SERVERS = SOFTWARE_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The number of structural features of the '<em>Machine Learning Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT_FEATURE_COUNT = SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = SOFTWARE_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT___IS_PARALLEL = SOFTWARE_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Machine Learning Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT_OPERATION_COUNT = SOFTWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ConnectorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.PhysicalConnectorImpl <em>Physical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.PhysicalConnectorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPhysicalConnector()
	 * @generated
	 */
	int PHYSICAL_CONNECTOR = 3;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.PhysicalComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPhysicalComponent()
	 * @generated
	 */
	int PHYSICAL_COMPONENT = 4;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.LogicalConnectorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getLogicalConnector()
	 * @generated
	 */
	int LOGICAL_CONNECTOR = 6;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.HeuristicImpl <em>Heuristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.HeuristicImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getHeuristic()
	 * @generated
	 */
	int HEURISTIC = 7;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.FunctionImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 8;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ExternalDependencyImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getExternalDependency()
	 * @generated
	 */
	int EXTERNAL_DEPENDENCY = 9;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.PackageImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 10;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ModelImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 11;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ActorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 12;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.HumanImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 13;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.RobotImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 14;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SectorImpl <em>Sector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SectorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSector()
	 * @generated
	 */
	int SECTOR = 15;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SensorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 16;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ActuatorImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 17;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARAMETERS = AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DOCUMENTATION = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TIME_FUNCTION = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___COMPUTE_NAME = AnalysisPackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___COMPUTE_FLOW = AnalysisPackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = AnalysisPackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__PARAMETERS = CONNECTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__DOCUMENTATION = CONNECTOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__TIME_FUNCTION = CONNECTOR__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__MIN_SPEED = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR__MAX_SPEED = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR___COMPUTE_NAME = CONNECTOR___COMPUTE_NAME;

	/**
	 * The operation id for the '<em>Compute Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR___COMPUTE_FLOW = CONNECTOR___COMPUTE_FLOW;

	/**
	 * The number of operations of the '<em>Physical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PARAMETERS = COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__TIME_FUNCTION = COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DOCUMENTATION = COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PINS = COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__MAIN_RESPONSIBLE = COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SPECIFIED_IN_PACKAGE = COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__EXECUTION = COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__FIRING_STRATEGY = COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DATASTORES = COMPONENT__DATASTORES;

	/**
	 * The number of structural features of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The number of operations of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__PARAMETERS = CONNECTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__DOCUMENTATION = CONNECTOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__TIME_FUNCTION = CONNECTOR__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__TARGET = CONNECTOR__TARGET;

	/**
	 * The number of structural features of the '<em>Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR___COMPUTE_NAME = CONNECTOR___COMPUTE_NAME;

	/**
	 * The operation id for the '<em>Compute Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR___COMPUTE_FLOW = CONNECTOR___COMPUTE_FLOW;

	/**
	 * The number of operations of the '<em>Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__NAME = SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__PARAMETERS = SOFTWARE_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__TIME_FUNCTION = SOFTWARE_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__DOCUMENTATION = SOFTWARE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__COMPONENTS = SOFTWARE_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__PINS = SOFTWARE_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__MAIN_RESPONSIBLE = SOFTWARE_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__SPECIFIED_IN_PACKAGE = SOFTWARE_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__EXECUTION = SOFTWARE_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__FIRING_STRATEGY = SOFTWARE_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__DATASTORES = SOFTWARE_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__SYNCHRONOUS = SOFTWARE_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__NUMBER_OF_SERVERS = SOFTWARE_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The number of structural features of the '<em>Heuristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_FEATURE_COUNT = SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC___COMPUTE_MAIN_RESPONSIBLE = SOFTWARE_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC___IS_PARALLEL = SOFTWARE_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Heuristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_OPERATION_COUNT = SOFTWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = SOFTWARE_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TIME_FUNCTION = SOFTWARE_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = SOFTWARE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMPONENTS = SOFTWARE_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PINS = SOFTWARE_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MAIN_RESPONSIBLE = SOFTWARE_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SPECIFIED_IN_PACKAGE = SOFTWARE_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXECUTION = SOFTWARE_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FIRING_STRATEGY = SOFTWARE_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DATASTORES = SOFTWARE_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SYNCHRONOUS = SOFTWARE_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NUMBER_OF_SERVERS = SOFTWARE_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___COMPUTE_MAIN_RESPONSIBLE = SOFTWARE_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___IS_PARALLEL = SOFTWARE_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = SOFTWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__NAME = SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__PARAMETERS = SOFTWARE_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__TIME_FUNCTION = SOFTWARE_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__DOCUMENTATION = SOFTWARE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__COMPONENTS = SOFTWARE_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__PINS = SOFTWARE_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__MAIN_RESPONSIBLE = SOFTWARE_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__SPECIFIED_IN_PACKAGE = SOFTWARE_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__EXECUTION = SOFTWARE_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__FIRING_STRATEGY = SOFTWARE_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__DATASTORES = SOFTWARE_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__SYNCHRONOUS = SOFTWARE_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__NUMBER_OF_SERVERS = SOFTWARE_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The number of structural features of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_FEATURE_COUNT = SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY___IS_PARALLEL = SOFTWARE_COMPONENT___IS_PARALLEL;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE = SOFTWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_OPERATION_COUNT = SOFTWARE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCUMENTATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Specifies Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SPECIFIES_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DATASTORES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROCESSING_UNITS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Simulation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SIMULATION_DURATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get All Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_ALL_COMPONENTS = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Max Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_MAX_FLOW = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOCUMENTATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Persons Pictures Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PERSONS_PICTURES_PATH = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VARIANTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENVIRONMENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Classification Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLASSIFICATION_CLASSES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Security Threats Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SECURITY_THREATS_DEFINITION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Security Threats Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SECURITY_THREATS_IMPORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Person Picture Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_PERSON_PICTURE_PATH_VALID__DIAGNOSTICCHAIN_MAP = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOCUMENTATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__DOCUMENTATION = ACTOR__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DOCUMENTATION = ACTOR__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__DOCUMENTATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__SECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__DATASTORES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR___GET_ALL_COMPONENTS = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = PHYSICAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARAMETERS = PHYSICAL_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIME_FUNCTION = PHYSICAL_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DOCUMENTATION = PHYSICAL_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COMPONENTS = PHYSICAL_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PINS = PHYSICAL_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MAIN_RESPONSIBLE = PHYSICAL_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SPECIFIED_IN_PACKAGE = PHYSICAL_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__EXECUTION = PHYSICAL_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FIRING_STRATEGY = PHYSICAL_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DATASTORES = PHYSICAL_COMPONENT__DATASTORES;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PHYSICAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___COMPUTE_MAIN_RESPONSIBLE = PHYSICAL_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = PHYSICAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = PHYSICAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PARAMETERS = PHYSICAL_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TIME_FUNCTION = PHYSICAL_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DOCUMENTATION = PHYSICAL_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMPONENTS = PHYSICAL_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PINS = PHYSICAL_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MAIN_RESPONSIBLE = PHYSICAL_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SPECIFIED_IN_PACKAGE = PHYSICAL_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__EXECUTION = PHYSICAL_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__FIRING_STRATEGY = PHYSICAL_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DATASTORES = PHYSICAL_COMPONENT__DATASTORES;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = PHYSICAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___COMPUTE_MAIN_RESPONSIBLE = PHYSICAL_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = PHYSICAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.DataNodeImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__NAME = CorePackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__TYPE = CorePackage.TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__PARAMETERS = CorePackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__DOCUMENTATION = CorePackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = CorePackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE___COMPUTE_NAME = CorePackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE___GET_OUTGOING_CONNECTORS = CorePackage.TYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE___GET_INCOMING_CONNECTORS = CorePackage.TYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_OPERATION_COUNT = CorePackage.TYPED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.PinImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 18;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.InputPinImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 19;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.OutputPinImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 20;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.PersonImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = DATA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = DATA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PARAMETERS = DATA_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__DOCUMENTATION = DATA_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__GATEWAY_PIN = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__STREAM = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Race Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__RACE_SEMANTIC = DATA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___GET_OUTGOING_CONNECTORS = DATA_NODE___GET_OUTGOING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___GET_INCOMING_CONNECTORS = DATA_NODE___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___COMPUTE_NAME = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__TYPE = PIN__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PARAMETERS = PIN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__DOCUMENTATION = PIN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__GATEWAY_PIN = PIN__GATEWAY_PIN;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__STREAM = PIN__STREAM;

	/**
	 * The feature id for the '<em><b>Race Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__RACE_SEMANTIC = PIN__RACE_SEMANTIC;

	/**
	 * The feature id for the '<em><b>Queue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__QUEUE_TYPE = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__COLLECT = PIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OPTIONAL = PIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_OUTGOING_CONNECTORS = PIN___GET_OUTGOING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_INCOMING_CONNECTORS = PIN___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___COMPUTE_NAME = PIN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TYPE = PIN__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PARAMETERS = PIN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__DOCUMENTATION = PIN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__GATEWAY_PIN = PIN__GATEWAY_PIN;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__STREAM = PIN__STREAM;

	/**
	 * The feature id for the '<em><b>Race Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__RACE_SEMANTIC = PIN__RACE_SEMANTIC;

	/**
	 * The feature id for the '<em><b>Amplify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__AMPLIFY = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTPUT_UNCERTAINTY = PIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TOKEN_SPECIFICATION = PIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTPUT_EXPRESSION = PIN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_OUTGOING_CONNECTORS = PIN___GET_OUTGOING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_INCOMING_CONNECTORS = PIN___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___COMPUTE_NAME = PIN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = HUMAN__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOCUMENTATION = HUMAN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = HUMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEPARTMENT = HUMAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Picture File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PICTURE_FILE_NAME = HUMAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = HUMAN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = HUMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.MeasurementUnitImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 22;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SimpleUnitImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSimpleUnit()
	 * @generated
	 */
	int SIMPLE_UNIT = 23;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.DerivedUnitImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDerivedUnit()
	 * @generated
	 */
	int DERIVED_UNIT = 24;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.UnitConversionImpl <em>Unit Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.UnitConversionImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getUnitConversion()
	 * @generated
	 */
	int UNIT_CONVERSION = 25;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ConversionByPrefixImpl <em>Conversion By Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ConversionByPrefixImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConversionByPrefix()
	 * @generated
	 */
	int CONVERSION_BY_PREFIX = 26;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ConversionByConventionImpl <em>Conversion By Convention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ConversionByConventionImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConversionByConvention()
	 * @generated
	 */
	int CONVERSION_BY_CONVENTION = 27;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.UnitPrefixImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getUnitPrefix()
	 * @generated
	 */
	int UNIT_PREFIX = 28;

	/**
	 * The feature id for the '<em><b>Unit Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__UNIT_CONVERSION = 0;

	/**
	 * The number of structural features of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Unit Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__UNIT_CONVERSION = MEASUREMENT_UNIT__UNIT_CONVERSION;

	/**
	 * The number of structural features of the '<em>Simple Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT_FEATURE_COUNT = MEASUREMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT_OPERATION_COUNT = MEASUREMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__UNIT_CONVERSION = MEASUREMENT_UNIT__UNIT_CONVERSION;

	/**
	 * The number of structural features of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_FEATURE_COUNT = MEASUREMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_OPERATION_COUNT = MEASUREMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERSION__REFERENCE_UNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_PREFIX__REFERENCE_UNIT = UNIT_CONVERSION__REFERENCE_UNIT;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_PREFIX__CONVERSION_FACTOR = UNIT_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_PREFIX__PREFIX = UNIT_CONVERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conversion By Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_PREFIX_FEATURE_COUNT = UNIT_CONVERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conversion By Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_PREFIX_OPERATION_COUNT = UNIT_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_CONVENTION__REFERENCE_UNIT = UNIT_CONVERSION__REFERENCE_UNIT;

	/**
	 * The number of structural features of the '<em>Conversion By Convention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_CONVENTION_FEATURE_COUNT = UNIT_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conversion By Convention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BY_CONVENTION_OPERATION_COUNT = UNIT_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__CONVERSION_FACTOR = 1;

	/**
	 * The number of structural features of the '<em>Unit Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ImportImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 29;

	/**
	 * The feature id for the '<em><b>Referenced Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__REFERENCED_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.DataStoreImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = DATA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__TYPE = DATA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__PARAMETERS = DATA_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DOCUMENTATION = DATA_NODE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE___GET_OUTGOING_CONNECTORS = DATA_NODE___GET_OUTGOING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE___GET_INCOMING_CONNECTORS = DATA_NODE___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE___COMPUTE_NAME = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationComponentImpl <em>Classification Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ClassificationComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationComponent()
	 * @generated
	 */
	int CLASSIFICATION_COMPONENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__NAME = MACHINE_LEARNING_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__PARAMETERS = MACHINE_LEARNING_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__TIME_FUNCTION = MACHINE_LEARNING_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__DOCUMENTATION = MACHINE_LEARNING_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__COMPONENTS = MACHINE_LEARNING_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__PINS = MACHINE_LEARNING_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__MAIN_RESPONSIBLE = MACHINE_LEARNING_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__SPECIFIED_IN_PACKAGE = MACHINE_LEARNING_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__EXECUTION = MACHINE_LEARNING_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__FIRING_STRATEGY = MACHINE_LEARNING_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__DATASTORES = MACHINE_LEARNING_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__SYNCHRONOUS = MACHINE_LEARNING_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__NUMBER_OF_SERVERS = MACHINE_LEARNING_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT__ENVIRONMENT = MACHINE_LEARNING_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT_FEATURE_COUNT = MACHINE_LEARNING_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = MACHINE_LEARNING_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT___IS_PARALLEL = MACHINE_LEARNING_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_COMPONENT_OPERATION_COUNT = MACHINE_LEARNING_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.EnvironmentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classification Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CLASSIFICATION_CLASSES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassImpl <em>Classification Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ClassificationClassImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationClass()
	 * @generated
	 */
	int CLASSIFICATION_CLASS = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Classification Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classification Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl <em>Classification Class Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationClassDistribution()
	 * @generated
	 */
	int CLASSIFICATION_CLASS_DISTRIBUTION = 35;

	/**
	 * The feature id for the '<em><b>Classification Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Classification Class Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classification Class Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CLASS_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.MulticlassConfusionMatrixImpl <em>Multiclass Confusion Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.MulticlassConfusionMatrixImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMulticlassConfusionMatrix()
	 * @generated
	 */
	int MULTICLASS_CONFUSION_MATRIX = 36;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixImpl <em>Confusion Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ConfusionMatrixImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConfusionMatrix()
	 * @generated
	 */
	int CONFUSION_MATRIX = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl <em>Binary Confusion Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getBinaryConfusionMatrix()
	 * @generated
	 */
	int BINARY_CONFUSION_MATRIX = 38;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.BinaryClassificationComponentImpl <em>Binary Classification Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.BinaryClassificationComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getBinaryClassificationComponent()
	 * @generated
	 */
	int BINARY_CLASSIFICATION_COMPONENT = 39;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.MulticlassClassificationComponentImpl <em>Multiclass Classification Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.MulticlassClassificationComponentImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMulticlassClassificationComponent()
	 * @generated
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT = 40;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl <em>Confusion Matrix Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConfusionMatrixEntry()
	 * @generated
	 */
	int CONFUSION_MATRIX_ENTRY = 37;

	/**
	 * The number of structural features of the '<em>Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Accuracy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___COMPUTE_ACCURACY = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Recall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___COMPUTE_RECALL = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Precision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___COMPUTE_PRECISION = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute F1 Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___COMPUTE_F1_SCORE = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Highest Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___GET_HIGHEST_VALUE = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Specificity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX___COMPUTE_SPECIFICITY = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX__NAME = CONFUSION_MATRIX__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX__ENTRIES = CONFUSION_MATRIX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiclass Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX_FEATURE_COUNT = CONFUSION_MATRIX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Accuracy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_ACCURACY = CONFUSION_MATRIX___COMPUTE_ACCURACY;

	/**
	 * The operation id for the '<em>Compute Recall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_RECALL = CONFUSION_MATRIX___COMPUTE_RECALL;

	/**
	 * The operation id for the '<em>Compute Precision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_PRECISION = CONFUSION_MATRIX___COMPUTE_PRECISION;

	/**
	 * The operation id for the '<em>Compute F1 Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_F1_SCORE = CONFUSION_MATRIX___COMPUTE_F1_SCORE;

	/**
	 * The operation id for the '<em>Get Highest Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_HIGHEST_VALUE = CONFUSION_MATRIX___GET_HIGHEST_VALUE;

	/**
	 * The operation id for the '<em>Compute Specificity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_SPECIFICITY = CONFUSION_MATRIX___COMPUTE_SPECIFICITY;

	/**
	 * The operation id for the '<em>Get Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_CLASSES = CONFUSION_MATRIX_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get TP</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_TP__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get FP</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_FP__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get TN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_TN__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get FN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___GET_FN__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Balanced Accuracy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_BALANCED_ACCURACY = CONFUSION_MATRIX_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Class Accuracy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_ACCURACY__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Compute Class Recall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_RECALL__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Compute Class Precision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_PRECISION__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Compute Class F1 Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_F1_SCORE__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Compute Class Specificity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_SPECIFICITY__CLASSIFICATIONCLASS = CONFUSION_MATRIX_OPERATION_COUNT
			+ 10;

	/**
	 * The number of operations of the '<em>Multiclass Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CONFUSION_MATRIX_OPERATION_COUNT = CONFUSION_MATRIX_OPERATION_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Predicted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_ENTRY__PREDICTED = 1;

	/**
	 * The feature id for the '<em><b>Truth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_ENTRY__TRUTH = 2;

	/**
	 * The number of structural features of the '<em>Confusion Matrix Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Confusion Matrix Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFUSION_MATRIX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__NAME = CONFUSION_MATRIX__NAME;

	/**
	 * The feature id for the '<em><b>Tp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__TP = CONFUSION_MATRIX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__TN = CONFUSION_MATRIX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__FP = CONFUSION_MATRIX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__FN = CONFUSION_MATRIX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Positive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__POSITIVE_CLASS = CONFUSION_MATRIX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Negative Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS = CONFUSION_MATRIX_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Binary Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX_FEATURE_COUNT = CONFUSION_MATRIX_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Compute Accuracy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___COMPUTE_ACCURACY = CONFUSION_MATRIX___COMPUTE_ACCURACY;

	/**
	 * The operation id for the '<em>Compute Recall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___COMPUTE_RECALL = CONFUSION_MATRIX___COMPUTE_RECALL;

	/**
	 * The operation id for the '<em>Compute Precision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___COMPUTE_PRECISION = CONFUSION_MATRIX___COMPUTE_PRECISION;

	/**
	 * The operation id for the '<em>Compute F1 Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___COMPUTE_F1_SCORE = CONFUSION_MATRIX___COMPUTE_F1_SCORE;

	/**
	 * The operation id for the '<em>Get Highest Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___GET_HIGHEST_VALUE = CONFUSION_MATRIX___GET_HIGHEST_VALUE;

	/**
	 * The operation id for the '<em>Compute Specificity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX___COMPUTE_SPECIFICITY = CONFUSION_MATRIX___COMPUTE_SPECIFICITY;

	/**
	 * The number of operations of the '<em>Binary Confusion Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONFUSION_MATRIX_OPERATION_COUNT = CONFUSION_MATRIX_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__NAME = CLASSIFICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__PARAMETERS = CLASSIFICATION_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__TIME_FUNCTION = CLASSIFICATION_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__DOCUMENTATION = CLASSIFICATION_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__COMPONENTS = CLASSIFICATION_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__PINS = CLASSIFICATION_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__MAIN_RESPONSIBLE = CLASSIFICATION_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__SPECIFIED_IN_PACKAGE = CLASSIFICATION_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__EXECUTION = CLASSIFICATION_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__FIRING_STRATEGY = CLASSIFICATION_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__DATASTORES = CLASSIFICATION_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__SYNCHRONOUS = CLASSIFICATION_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__NUMBER_OF_SERVERS = CLASSIFICATION_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__ENVIRONMENT = CLASSIFICATION_COMPONENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Confusion Matrixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES = CLASSIFICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT_FEATURE_COUNT = CLASSIFICATION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = CLASSIFICATION_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT___IS_PARALLEL = CLASSIFICATION_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Binary Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLASSIFICATION_COMPONENT_OPERATION_COUNT = CLASSIFICATION_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__NAME = CLASSIFICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__PARAMETERS = CLASSIFICATION_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__TIME_FUNCTION = CLASSIFICATION_COMPONENT__TIME_FUNCTION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__DOCUMENTATION = CLASSIFICATION_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__COMPONENTS = CLASSIFICATION_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__PINS = CLASSIFICATION_COMPONENT__PINS;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__MAIN_RESPONSIBLE = CLASSIFICATION_COMPONENT__MAIN_RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__SPECIFIED_IN_PACKAGE = CLASSIFICATION_COMPONENT__SPECIFIED_IN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__EXECUTION = CLASSIFICATION_COMPONENT__EXECUTION;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__FIRING_STRATEGY = CLASSIFICATION_COMPONENT__FIRING_STRATEGY;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__DATASTORES = CLASSIFICATION_COMPONENT__DATASTORES;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__SYNCHRONOUS = CLASSIFICATION_COMPONENT__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__NUMBER_OF_SERVERS = CLASSIFICATION_COMPONENT__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__ENVIRONMENT = CLASSIFICATION_COMPONENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Confusion Matrixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES = CLASSIFICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiclass Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT_FEATURE_COUNT = CLASSIFICATION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = CLASSIFICATION_COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT___IS_PARALLEL = CLASSIFICATION_COMPONENT___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Multiclass Classification Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICLASS_CLASSIFICATION_COMPONENT_OPERATION_COUNT = CLASSIFICATION_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl <em>Token Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getTokenSpecification()
	 * @generated
	 */
	int TOKEN_SPECIFICATION = 42;

	/**
	 * The feature id for the '<em><b>Input Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SPECIFICATION__INPUT_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Collect Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SPECIFICATION__COLLECT_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SPECIFICATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Token Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.DataSizeImpl <em>Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.DataSizeImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataSize()
	 * @generated
	 */
	int DATA_SIZE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___GET_SIZE = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.StaticSizeImpl <em>Static Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.StaticSizeImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getStaticSize()
	 * @generated
	 */
	int STATIC_SIZE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SIZE__NAME = DATA_SIZE__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SIZE__SIZE = DATA_SIZE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SIZE_FEATURE_COUNT = DATA_SIZE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SIZE___GET_SIZE = DATA_SIZE___GET_SIZE;

	/**
	 * The number of operations of the '<em>Static Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SIZE_OPERATION_COUNT = DATA_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SetImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSet()
	 * @generated
	 */
	int SET = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NAME = DATA_SIZE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUES = DATA_SIZE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = DATA_SIZE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET___GET_SIZE = DATA_SIZE___GET_SIZE;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = DATA_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SetValueImpl <em>Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SetValueImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSetValue()
	 * @generated
	 */
	int SET_VALUE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__PROBABILITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__VALUE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl <em>Dynamic Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDynamicRange()
	 * @generated
	 */
	int DYNAMIC_RANGE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE__NAME = DATA_SIZE__NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE__MIN = DATA_SIZE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE__MAX = DATA_SIZE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE__SIZE_FACTOR = DATA_SIZE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE_FEATURE_COUNT = DATA_SIZE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE___GET_SIZE = DATA_SIZE___GET_SIZE;

	/**
	 * The number of operations of the '<em>Dynamic Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_RANGE_OPERATION_COUNT = DATA_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.impl.SecurityThreatsImportImpl <em>Security Threats Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.impl.SecurityThreatsImportImpl
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSecurityThreatsImport()
	 * @generated
	 */
	int SECURITY_THREATS_IMPORT = 48;

	/**
	 * The feature id for the '<em><b>Security Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_THREATS_IMPORT__SECURITY_THREAT = 0;

	/**
	 * The number of structural features of the '<em>Security Threats Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_THREATS_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Threats Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_THREATS_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.QueueType <em>Queue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.QueueType
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getQueueType()
	 * @generated
	 */
	int QUEUE_TYPE = 49;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.RaceSemantic <em>Race Semantic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.RaceSemantic
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getRaceSemantic()
	 * @generated
	 */
	int RACE_SEMANTIC = 50;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.ComponentFiringStrategy <em>Component Firing Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.ComponentFiringStrategy
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getComponentFiringStrategy()
	 * @generated
	 */
	int COMPONENT_FIRING_STRATEGY = 51;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.SizeComputation <em>Size Computation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.SizeComputation
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSizeComputation()
	 * @generated
	 */
	int SIZE_COMPUTATION = 52;

	/**
	 * The meta object id for the '<em>Connectionspeed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConnectionspeed()
	 * @generated
	 */
	int CONNECTIONSPEED = 53;

	/**
	 * The meta object id for the '<em>JSON</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 54;

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getPins()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pins();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Component#getMainResponsible <em>Main Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Responsible</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getMainResponsible()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_MainResponsible();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Component#getSpecifiedInPackage <em>Specified In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specified In Package</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getSpecifiedInPackage()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SpecifiedInPackage();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.Component#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getExecution()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Execution();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Component#getFiringStrategy <em>Firing Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing Strategy</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getFiringStrategy()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_FiringStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Component#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see e4sm.de.metamodel.e4sm.Component#getDatastores()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Datastores();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Component#computeMainResponsible() <em>Compute Main Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Main Responsible</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Component#computeMainResponsible()
	 * @generated
	 */
	EOperation getComponent__ComputeMainResponsible();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.MachineLearningComponent <em>Machine Learning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Learning Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.MachineLearningComponent
	 * @generated
	 */
	EClass getMachineLearningComponent();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see e4sm.de.metamodel.e4sm.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see e4sm.de.metamodel.e4sm.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see e4sm.de.metamodel.e4sm.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Connector#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Connector#computeName()
	 * @generated
	 */
	EOperation getConnector__ComputeName();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Connector#computeFlow() <em>Compute Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Flow</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Connector#computeFlow()
	 * @generated
	 */
	EOperation getConnector__ComputeFlow();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.PhysicalConnector <em>Physical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connector</em>'.
	 * @see e4sm.de.metamodel.e4sm.PhysicalConnector
	 * @generated
	 */
	EClass getPhysicalConnector();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMinSpeed <em>Min Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Speed</em>'.
	 * @see e4sm.de.metamodel.e4sm.PhysicalConnector#getMinSpeed()
	 * @see #getPhysicalConnector()
	 * @generated
	 */
	EAttribute getPhysicalConnector_MinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see e4sm.de.metamodel.e4sm.PhysicalConnector#getMaxSpeed()
	 * @see #getPhysicalConnector()
	 * @generated
	 */
	EAttribute getPhysicalConnector_MaxSpeed();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.PhysicalComponent
	 * @generated
	 */
	EClass getPhysicalComponent();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see e4sm.de.metamodel.e4sm.SoftwareComponent#isSynchronous()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getNumberOfServers <em>Number Of Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Servers</em>'.
	 * @see e4sm.de.metamodel.e4sm.SoftwareComponent#getNumberOfServers()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_NumberOfServers();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#isParallel() <em>Is Parallel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Parallel</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.SoftwareComponent#isParallel()
	 * @generated
	 */
	EOperation getSoftwareComponent__IsParallel();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.LogicalConnector <em>Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Connector</em>'.
	 * @see e4sm.de.metamodel.e4sm.LogicalConnector
	 * @generated
	 */
	EClass getLogicalConnector();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Heuristic <em>Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heuristic</em>'.
	 * @see e4sm.de.metamodel.e4sm.Heuristic
	 * @generated
	 */
	EClass getHeuristic();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see e4sm.de.metamodel.e4sm.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Dependency</em>'.
	 * @see e4sm.de.metamodel.e4sm.ExternalDependency
	 * @generated
	 */
	EClass getExternalDependency();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ExternalDependency#computeMainResponsible() <em>Compute Main Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Main Responsible</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ExternalDependency#computeMainResponsible()
	 * @generated
	 */
	EOperation getExternalDependency__ComputeMainResponsible();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Package#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Package#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getConnectors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Package#getSectors <em>Sectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sectors</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getSectors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Sectors();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Package#getMainResponsible <em>Main Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Responsible</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getMainResponsible()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MainResponsible();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Package#getSpecifiesComponent <em>Specifies Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getSpecifiesComponent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SpecifiesComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Package#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getDatastores()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Datastores();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Package#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Units</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getProcessingUnits()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ProcessingUnits();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Package#getSimulationDuration <em>Simulation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Duration</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getSimulationDuration()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_SimulationDuration();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Package#getAllComponents() <em>Get All Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Components</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Package#getAllComponents()
	 * @generated
	 */
	EOperation getPackage__GetAllComponents();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Package#getMaxFlow() <em>Get Max Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Flow</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Package#getMaxFlow()
	 * @generated
	 */
	EOperation getPackage__GetMaxFlow();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getActors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Actors();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persons Pictures Path</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getPersonsPicturesPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_PersonsPicturesPath();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getVariants()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Variants();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getImports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getEnvironments()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getClassificationClasses <em>Classification Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Classes</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getClassificationClasses()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ClassificationClasses();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.Model#getSecurityThreatsDefinition <em>Security Threats Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Threats Definition</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getSecurityThreatsDefinition()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_SecurityThreatsDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Model#getSecurityThreatsImport <em>Security Threats Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Threats Import</em>'.
	 * @see e4sm.de.metamodel.e4sm.Model#getSecurityThreatsImport()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_SecurityThreatsImport();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Model#isPersonPicturePathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Person Picture Path Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Person Picture Path Valid</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Model#isPersonPicturePathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__IsPersonPicturePathValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see e4sm.de.metamodel.e4sm.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see e4sm.de.metamodel.e4sm.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see e4sm.de.metamodel.e4sm.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sector</em>'.
	 * @see e4sm.de.metamodel.e4sm.Sector
	 * @generated
	 */
	EClass getSector();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Sector#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Sector#getComponents()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Sector#getSectors <em>Sectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sectors</em>'.
	 * @see e4sm.de.metamodel.e4sm.Sector#getSectors()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Sectors();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Sector#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see e4sm.de.metamodel.e4sm.Sector#getDatastores()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Datastores();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Sector#getAllComponents() <em>Get All Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Components</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Sector#getAllComponents()
	 * @generated
	 */
	EOperation getSector__GetAllComponents();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see e4sm.de.metamodel.e4sm.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see e4sm.de.metamodel.e4sm.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see e4sm.de.metamodel.e4sm.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Pin#isGatewayPin <em>Gateway Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Pin</em>'.
	 * @see e4sm.de.metamodel.e4sm.Pin#isGatewayPin()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_GatewayPin();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Pin#isStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream</em>'.
	 * @see e4sm.de.metamodel.e4sm.Pin#isStream()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Stream();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Pin#getRaceSemantic <em>Race Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Race Semantic</em>'.
	 * @see e4sm.de.metamodel.e4sm.Pin#getRaceSemantic()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_RaceSemantic();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Pin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Pin#computeName()
	 * @generated
	 */
	EOperation getPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see e4sm.de.metamodel.e4sm.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.InputPin#getQueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Type</em>'.
	 * @see e4sm.de.metamodel.e4sm.InputPin#getQueueType()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_QueueType();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.InputPin#getCollect <em>Collect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collect</em>'.
	 * @see e4sm.de.metamodel.e4sm.InputPin#getCollect()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_Collect();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.InputPin#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see e4sm.de.metamodel.e4sm.InputPin#isOptional()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_Optional();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.InputPin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.InputPin#computeName()
	 * @generated
	 */
	EOperation getInputPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see e4sm.de.metamodel.e4sm.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.OutputPin#getAmplify <em>Amplify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplify</em>'.
	 * @see e4sm.de.metamodel.e4sm.OutputPin#getAmplify()
	 * @see #getOutputPin()
	 * @generated
	 */
	EAttribute getOutputPin_Amplify();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Uncertainty</em>'.
	 * @see e4sm.de.metamodel.e4sm.OutputPin#getOutputUncertainty()
	 * @see #getOutputPin()
	 * @generated
	 */
	EAttribute getOutputPin_OutputUncertainty();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.OutputPin#getTokenSpecification <em>Token Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token Specification</em>'.
	 * @see e4sm.de.metamodel.e4sm.OutputPin#getTokenSpecification()
	 * @see #getOutputPin()
	 * @generated
	 */
	EReference getOutputPin_TokenSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputExpression <em>Output Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.OutputPin#getOutputExpression()
	 * @see #getOutputPin()
	 * @generated
	 */
	EReference getOutputPin_OutputExpression();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.OutputPin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.OutputPin#computeName()
	 * @generated
	 */
	EOperation getOutputPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see e4sm.de.metamodel.e4sm.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see e4sm.de.metamodel.e4sm.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Person#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see e4sm.de.metamodel.e4sm.Person#getDepartment()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Department();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.Person#getPictureFileName <em>Picture File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture File Name</em>'.
	 * @see e4sm.de.metamodel.e4sm.Person#getPictureFileName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PictureFileName();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Unit</em>'.
	 * @see e4sm.de.metamodel.e4sm.MeasurementUnit
	 * @generated
	 */
	EClass getMeasurementUnit();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.MeasurementUnit#getUnitConversion <em>Unit Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Conversion</em>'.
	 * @see e4sm.de.metamodel.e4sm.MeasurementUnit#getUnitConversion()
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	EReference getMeasurementUnit_UnitConversion();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.SimpleUnit <em>Simple Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Unit</em>'.
	 * @see e4sm.de.metamodel.e4sm.SimpleUnit
	 * @generated
	 */
	EClass getSimpleUnit();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Unit</em>'.
	 * @see e4sm.de.metamodel.e4sm.DerivedUnit
	 * @generated
	 */
	EClass getDerivedUnit();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.UnitConversion <em>Unit Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Conversion</em>'.
	 * @see e4sm.de.metamodel.e4sm.UnitConversion
	 * @generated
	 */
	EClass getUnitConversion();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.UnitConversion#getReferenceUnit <em>Reference Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Unit</em>'.
	 * @see e4sm.de.metamodel.e4sm.UnitConversion#getReferenceUnit()
	 * @see #getUnitConversion()
	 * @generated
	 */
	EReference getUnitConversion_ReferenceUnit();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ConversionByPrefix <em>Conversion By Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion By Prefix</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConversionByPrefix
	 * @generated
	 */
	EClass getConversionByPrefix();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConversionByPrefix#getConversionFactor()
	 * @see #getConversionByPrefix()
	 * @generated
	 */
	EAttribute getConversionByPrefix_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConversionByPrefix#getPrefix()
	 * @see #getConversionByPrefix()
	 * @generated
	 */
	EReference getConversionByPrefix_Prefix();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ConversionByConvention <em>Conversion By Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion By Convention</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConversionByConvention
	 * @generated
	 */
	EClass getConversionByConvention();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.UnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Prefix</em>'.
	 * @see e4sm.de.metamodel.e4sm.UnitPrefix
	 * @generated
	 */
	EClass getUnitPrefix();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.UnitPrefix#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see e4sm.de.metamodel.e4sm.UnitPrefix#getSymbol()
	 * @see #getUnitPrefix()
	 * @generated
	 */
	EAttribute getUnitPrefix_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see e4sm.de.metamodel.e4sm.UnitPrefix#getConversionFactor()
	 * @see #getUnitPrefix()
	 * @generated
	 */
	EAttribute getUnitPrefix_ConversionFactor();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see e4sm.de.metamodel.e4sm.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.Import#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Model</em>'.
	 * @see e4sm.de.metamodel.e4sm.Import#getReferencedModel()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see e4sm.de.metamodel.e4sm.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.DataStore#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.DataStore#computeName()
	 * @generated
	 */
	EOperation getDataStore__ComputeName();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see e4sm.de.metamodel.e4sm.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.DataNode#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.DataNode#computeName()
	 * @generated
	 */
	EOperation getDataNode__ComputeName();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.DataNode#getOutgoingConnectors() <em>Get Outgoing Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Connectors</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.DataNode#getOutgoingConnectors()
	 * @generated
	 */
	EOperation getDataNode__GetOutgoingConnectors();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.DataNode#getIncomingConnectors() <em>Get Incoming Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Connectors</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.DataNode#getIncomingConnectors()
	 * @generated
	 */
	EOperation getDataNode__GetIncomingConnectors();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ClassificationComponent <em>Classification Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationComponent
	 * @generated
	 */
	EClass getClassificationComponent();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.ClassificationComponent#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationComponent#getEnvironment()
	 * @see #getClassificationComponent()
	 * @generated
	 */
	EReference getClassificationComponent_Environment();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see e4sm.de.metamodel.e4sm.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Environment#getClassificationClasses <em>Classification Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Classes</em>'.
	 * @see e4sm.de.metamodel.e4sm.Environment#getClassificationClasses()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ClassificationClasses();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ClassificationClass <em>Classification Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Class</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationClass
	 * @generated
	 */
	EClass getClassificationClass();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution <em>Classification Class Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Class Distribution</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationClassDistribution
	 * @generated
	 */
	EClass getClassificationClassDistribution();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getClassificationClass <em>Classification Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Class</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getClassificationClass()
	 * @see #getClassificationClassDistribution()
	 * @generated
	 */
	EReference getClassificationClassDistribution_ClassificationClass();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getProbability()
	 * @see #getClassificationClassDistribution()
	 * @generated
	 */
	EAttribute getClassificationClassDistribution_Probability();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix <em>Multiclass Confusion Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiclass Confusion Matrix</em>'.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix
	 * @generated
	 */
	EClass getMulticlassConfusionMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getEntries()
	 * @see #getMulticlassConfusionMatrix()
	 * @generated
	 */
	EReference getMulticlassConfusionMatrix_Entries();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getClasses() <em>Get Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classes</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getClasses()
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__GetClasses();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getTP(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Get TP</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TP</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getTP(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__GetTP__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getFP(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Get FP</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get FP</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getFP(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__GetFP__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getTN(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Get TN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TN</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getTN(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__GetTN__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getFN(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Get FN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get FN</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getFN(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__GetFN__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeBalancedAccuracy() <em>Compute Balanced Accuracy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Balanced Accuracy</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeBalancedAccuracy()
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeBalancedAccuracy();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassAccuracy(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Compute Class Accuracy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Class Accuracy</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassAccuracy(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeClassAccuracy__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassRecall(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Compute Class Recall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Class Recall</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassRecall(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeClassRecall__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassPrecision(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Compute Class Precision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Class Precision</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassPrecision(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeClassPrecision__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassF1Score(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Compute Class F1 Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Class F1 Score</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassF1Score(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeClassF1Score__ClassificationClass();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassSpecificity(e4sm.de.metamodel.e4sm.ClassificationClass) <em>Compute Class Specificity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Class Specificity</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#computeClassSpecificity(e4sm.de.metamodel.e4sm.ClassificationClass)
	 * @generated
	 */
	EOperation getMulticlassConfusionMatrix__ComputeClassSpecificity__ClassificationClass();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix <em>Confusion Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confusion Matrix</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix
	 * @generated
	 */
	EClass getConfusionMatrix();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#computeAccuracy() <em>Compute Accuracy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Accuracy</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#computeAccuracy()
	 * @generated
	 */
	EOperation getConfusionMatrix__ComputeAccuracy();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#computeRecall() <em>Compute Recall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Recall</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#computeRecall()
	 * @generated
	 */
	EOperation getConfusionMatrix__ComputeRecall();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#computePrecision() <em>Compute Precision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Precision</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#computePrecision()
	 * @generated
	 */
	EOperation getConfusionMatrix__ComputePrecision();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#computeF1Score() <em>Compute F1 Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute F1 Score</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#computeF1Score()
	 * @generated
	 */
	EOperation getConfusionMatrix__ComputeF1Score();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#getHighestValue() <em>Get Highest Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Highest Value</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#getHighestValue()
	 * @generated
	 */
	EOperation getConfusionMatrix__GetHighestValue();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrix#computeSpecificity() <em>Compute Specificity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Specificity</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrix#computeSpecificity()
	 * @generated
	 */
	EOperation getConfusionMatrix__ComputeSpecificity();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.TokenSpecification <em>Token Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Specification</em>'.
	 * @see e4sm.de.metamodel.e4sm.TokenSpecification
	 * @generated
	 */
	EClass getTokenSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.TokenSpecification#getInputSize <em>Input Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.TokenSpecification#getInputSize()
	 * @see #getTokenSpecification()
	 * @generated
	 */
	EReference getTokenSpecification_InputSize();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.TokenSpecification#getCollectSize <em>Collect Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collect Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.TokenSpecification#getCollectSize()
	 * @see #getTokenSpecification()
	 * @generated
	 */
	EAttribute getTokenSpecification_CollectSize();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.TokenSpecification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see e4sm.de.metamodel.e4sm.TokenSpecification#getType()
	 * @see #getTokenSpecification()
	 * @generated
	 */
	EReference getTokenSpecification_Type();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.DataSize
	 * @generated
	 */
	EClass getDataSize();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.DataSize#getSize() <em>Get Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Size</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.DataSize#getSize()
	 * @generated
	 */
	EOperation getDataSize__GetSize();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.StaticSize <em>Static Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.StaticSize
	 * @generated
	 */
	EClass getStaticSize();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.StaticSize#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.StaticSize#getSize()
	 * @see #getStaticSize()
	 * @generated
	 */
	EAttribute getStaticSize_Size();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see e4sm.de.metamodel.e4sm.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.Set#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see e4sm.de.metamodel.e4sm.Set#getValues()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Values();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.SetValue
	 * @generated
	 */
	EClass getSetValue();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SetValue#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see e4sm.de.metamodel.e4sm.SetValue#getProbability()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_Probability();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SetValue#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see e4sm.de.metamodel.e4sm.SetValue#getSize()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_Size();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.SetValue#getValue()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_Value();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.DynamicRange <em>Dynamic Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Range</em>'.
	 * @see e4sm.de.metamodel.e4sm.DynamicRange
	 * @generated
	 */
	EClass getDynamicRange();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.DynamicRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see e4sm.de.metamodel.e4sm.DynamicRange#getMin()
	 * @see #getDynamicRange()
	 * @generated
	 */
	EAttribute getDynamicRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.DynamicRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see e4sm.de.metamodel.e4sm.DynamicRange#getMax()
	 * @see #getDynamicRange()
	 * @generated
	 */
	EAttribute getDynamicRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.DynamicRange#getSizeFactor <em>Size Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Factor</em>'.
	 * @see e4sm.de.metamodel.e4sm.DynamicRange#getSizeFactor()
	 * @see #getDynamicRange()
	 * @generated
	 */
	EAttribute getDynamicRange_SizeFactor();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.SecurityThreatsImport <em>Security Threats Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Threats Import</em>'.
	 * @see e4sm.de.metamodel.e4sm.SecurityThreatsImport
	 * @generated
	 */
	EClass getSecurityThreatsImport();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.SecurityThreatsImport#getSecurityThreat <em>Security Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Threat</em>'.
	 * @see e4sm.de.metamodel.e4sm.SecurityThreatsImport#getSecurityThreat()
	 * @see #getSecurityThreatsImport()
	 * @generated
	 */
	EReference getSecurityThreatsImport_SecurityThreat();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry <em>Confusion Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confusion Matrix Entry</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrixEntry
	 * @generated
	 */
	EClass getConfusionMatrixEntry();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getValue()
	 * @see #getConfusionMatrixEntry()
	 * @generated
	 */
	EAttribute getConfusionMatrixEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getPredicted <em>Predicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicted</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getPredicted()
	 * @see #getConfusionMatrixEntry()
	 * @generated
	 */
	EReference getConfusionMatrixEntry_Predicted();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getTruth <em>Truth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Truth</em>'.
	 * @see e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getTruth()
	 * @see #getConfusionMatrixEntry()
	 * @generated
	 */
	EReference getConfusionMatrixEntry_Truth();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix <em>Binary Confusion Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Confusion Matrix</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix
	 * @generated
	 */
	EClass getBinaryConfusionMatrix();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tp</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTp()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EAttribute getBinaryConfusionMatrix_Tp();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTn <em>Tn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tn</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTn()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EAttribute getBinaryConfusionMatrix_Tn();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFp <em>Fp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fp</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFp()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EAttribute getBinaryConfusionMatrix_Fp();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFn <em>Fn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fn</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFn()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EAttribute getBinaryConfusionMatrix_Fn();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getPositiveClass <em>Positive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Positive Class</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getPositiveClass()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EReference getBinaryConfusionMatrix_PositiveClass();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getNegativeClass <em>Negative Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Negative Class</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getNegativeClass()
	 * @see #getBinaryConfusionMatrix()
	 * @generated
	 */
	EReference getBinaryConfusionMatrix_NegativeClass();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.BinaryClassificationComponent <em>Binary Classification Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Classification Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryClassificationComponent
	 * @generated
	 */
	EClass getBinaryClassificationComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.BinaryClassificationComponent#getConfusionMatrixes <em>Confusion Matrixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confusion Matrixes</em>'.
	 * @see e4sm.de.metamodel.e4sm.BinaryClassificationComponent#getConfusionMatrixes()
	 * @see #getBinaryClassificationComponent()
	 * @generated
	 */
	EReference getBinaryClassificationComponent_ConfusionMatrixes();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.MulticlassClassificationComponent <em>Multiclass Classification Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiclass Classification Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.MulticlassClassificationComponent
	 * @generated
	 */
	EClass getMulticlassClassificationComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.MulticlassClassificationComponent#getConfusionMatrixes <em>Confusion Matrixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confusion Matrixes</em>'.
	 * @see e4sm.de.metamodel.e4sm.MulticlassClassificationComponent#getConfusionMatrixes()
	 * @see #getMulticlassClassificationComponent()
	 * @generated
	 */
	EReference getMulticlassClassificationComponent_ConfusionMatrixes();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.QueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Type</em>'.
	 * @see e4sm.de.metamodel.e4sm.QueueType
	 * @generated
	 */
	EEnum getQueueType();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.RaceSemantic <em>Race Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Race Semantic</em>'.
	 * @see e4sm.de.metamodel.e4sm.RaceSemantic
	 * @generated
	 */
	EEnum getRaceSemantic();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.ComponentFiringStrategy <em>Component Firing Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Firing Strategy</em>'.
	 * @see e4sm.de.metamodel.e4sm.ComponentFiringStrategy
	 * @generated
	 */
	EEnum getComponentFiringStrategy();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.SizeComputation <em>Size Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Computation</em>'.
	 * @see e4sm.de.metamodel.e4sm.SizeComputation
	 * @generated
	 */
	EEnum getSizeComputation();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Connectionspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connectionspeed</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getConnectionspeed();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JSON</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getJSON();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	e4smFactory gete4smFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PINS = eINSTANCE.getComponent_Pins();

		/**
		 * The meta object literal for the '<em><b>Main Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__MAIN_RESPONSIBLE = eINSTANCE.getComponent_MainResponsible();

		/**
		 * The meta object literal for the '<em><b>Specified In Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SPECIFIED_IN_PACKAGE = eINSTANCE.getComponent_SpecifiedInPackage();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__EXECUTION = eINSTANCE.getComponent_Execution();

		/**
		 * The meta object literal for the '<em><b>Firing Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FIRING_STRATEGY = eINSTANCE.getComponent_FiringStrategy();

		/**
		 * The meta object literal for the '<em><b>Datastores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATASTORES = eINSTANCE.getComponent_Datastores();

		/**
		 * The meta object literal for the '<em><b>Compute Main Responsible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___COMPUTE_MAIN_RESPONSIBLE = eINSTANCE.getComponent__ComputeMainResponsible();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.MachineLearningComponentImpl <em>Machine Learning Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.MachineLearningComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMachineLearningComponent()
		 * @generated
		 */
		EClass MACHINE_LEARNING_COMPONENT = eINSTANCE.getMachineLearningComponent();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ConnectorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___COMPUTE_NAME = eINSTANCE.getConnector__ComputeName();

		/**
		 * The meta object literal for the '<em><b>Compute Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___COMPUTE_FLOW = eINSTANCE.getConnector__ComputeFlow();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.PhysicalConnectorImpl <em>Physical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.PhysicalConnectorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPhysicalConnector()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTOR = eINSTANCE.getPhysicalConnector();

		/**
		 * The meta object literal for the '<em><b>Min Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONNECTOR__MIN_SPEED = eINSTANCE.getPhysicalConnector_MinSpeed();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONNECTOR__MAX_SPEED = eINSTANCE.getPhysicalConnector_MaxSpeed();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.PhysicalComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPhysicalComponent()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT = eINSTANCE.getPhysicalComponent();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__SYNCHRONOUS = eINSTANCE.getSoftwareComponent_Synchronous();

		/**
		 * The meta object literal for the '<em><b>Number Of Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__NUMBER_OF_SERVERS = eINSTANCE.getSoftwareComponent_NumberOfServers();

		/**
		 * The meta object literal for the '<em><b>Is Parallel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOFTWARE_COMPONENT___IS_PARALLEL = eINSTANCE.getSoftwareComponent__IsParallel();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.LogicalConnectorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getLogicalConnector()
		 * @generated
		 */
		EClass LOGICAL_CONNECTOR = eINSTANCE.getLogicalConnector();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.HeuristicImpl <em>Heuristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.HeuristicImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getHeuristic()
		 * @generated
		 */
		EClass HEURISTIC = eINSTANCE.getHeuristic();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.FunctionImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ExternalDependencyImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getExternalDependency()
		 * @generated
		 */
		EClass EXTERNAL_DEPENDENCY = eINSTANCE.getExternalDependency();

		/**
		 * The meta object literal for the '<em><b>Compute Main Responsible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE = eINSTANCE
				.getExternalDependency__ComputeMainResponsible();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.PackageImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__COMPONENTS = eINSTANCE.getPackage_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONNECTORS = eINSTANCE.getPackage_Connectors();

		/**
		 * The meta object literal for the '<em><b>Sectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SECTORS = eINSTANCE.getPackage_Sectors();

		/**
		 * The meta object literal for the '<em><b>Main Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MAIN_RESPONSIBLE = eINSTANCE.getPackage_MainResponsible();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Specifies Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SPECIFIES_COMPONENT = eINSTANCE.getPackage_SpecifiesComponent();

		/**
		 * The meta object literal for the '<em><b>Datastores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DATASTORES = eINSTANCE.getPackage_Datastores();

		/**
		 * The meta object literal for the '<em><b>Processing Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PROCESSING_UNITS = eINSTANCE.getPackage_ProcessingUnits();

		/**
		 * The meta object literal for the '<em><b>Simulation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__SIMULATION_DURATION = eINSTANCE.getPackage_SimulationDuration();

		/**
		 * The meta object literal for the '<em><b>Get All Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_ALL_COMPONENTS = eINSTANCE.getPackage__GetAllComponents();

		/**
		 * The meta object literal for the '<em><b>Get Max Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_MAX_FLOW = eINSTANCE.getPackage__GetMaxFlow();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ModelImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTORS = eINSTANCE.getModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Persons Pictures Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PERSONS_PICTURES_PATH = eINSTANCE.getModel_PersonsPicturesPath();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__VARIANTS = eINSTANCE.getModel_Variants();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TYPES = eINSTANCE.getModel_Types();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ENVIRONMENTS = eINSTANCE.getModel_Environments();

		/**
		 * The meta object literal for the '<em><b>Classification Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLASSIFICATION_CLASSES = eINSTANCE.getModel_ClassificationClasses();

		/**
		 * The meta object literal for the '<em><b>Security Threats Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SECURITY_THREATS_DEFINITION = eINSTANCE.getModel_SecurityThreatsDefinition();

		/**
		 * The meta object literal for the '<em><b>Security Threats Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SECURITY_THREATS_IMPORT = eINSTANCE.getModel_SecurityThreatsImport();

		/**
		 * The meta object literal for the '<em><b>Is Person Picture Path Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___IS_PERSON_PICTURE_PATH_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__IsPersonPicturePathValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ActorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.HumanImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.RobotImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SectorImpl <em>Sector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SectorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSector()
		 * @generated
		 */
		EClass SECTOR = eINSTANCE.getSector();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__COMPONENTS = eINSTANCE.getSector_Components();

		/**
		 * The meta object literal for the '<em><b>Sectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__SECTORS = eINSTANCE.getSector_Sectors();

		/**
		 * The meta object literal for the '<em><b>Datastores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__DATASTORES = eINSTANCE.getSector_Datastores();

		/**
		 * The meta object literal for the '<em><b>Get All Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTOR___GET_ALL_COMPONENTS = eINSTANCE.getSector__GetAllComponents();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SensorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ActuatorImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.PinImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Gateway Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__GATEWAY_PIN = eINSTANCE.getPin_GatewayPin();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__STREAM = eINSTANCE.getPin_Stream();

		/**
		 * The meta object literal for the '<em><b>Race Semantic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__RACE_SEMANTIC = eINSTANCE.getPin_RaceSemantic();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN___COMPUTE_NAME = eINSTANCE.getPin__ComputeName();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.InputPinImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '<em><b>Queue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PIN__QUEUE_TYPE = eINSTANCE.getInputPin_QueueType();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PIN__COLLECT = eINSTANCE.getInputPin_Collect();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PIN__OPTIONAL = eINSTANCE.getInputPin_Optional();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_PIN___COMPUTE_NAME = eINSTANCE.getInputPin__ComputeName();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.OutputPinImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '<em><b>Amplify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PIN__AMPLIFY = eINSTANCE.getOutputPin_Amplify();

		/**
		 * The meta object literal for the '<em><b>Output Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PIN__OUTPUT_UNCERTAINTY = eINSTANCE.getOutputPin_OutputUncertainty();

		/**
		 * The meta object literal for the '<em><b>Token Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PIN__TOKEN_SPECIFICATION = eINSTANCE.getOutputPin_TokenSpecification();

		/**
		 * The meta object literal for the '<em><b>Output Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PIN__OUTPUT_EXPRESSION = eINSTANCE.getOutputPin_OutputExpression();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_PIN___COMPUTE_NAME = eINSTANCE.getOutputPin__ComputeName();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.PersonImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEPARTMENT = eINSTANCE.getPerson_Department();

		/**
		 * The meta object literal for the '<em><b>Picture File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PICTURE_FILE_NAME = eINSTANCE.getPerson_PictureFileName();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.MeasurementUnitImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMeasurementUnit()
		 * @generated
		 */
		EClass MEASUREMENT_UNIT = eINSTANCE.getMeasurementUnit();

		/**
		 * The meta object literal for the '<em><b>Unit Conversion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_UNIT__UNIT_CONVERSION = eINSTANCE.getMeasurementUnit_UnitConversion();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SimpleUnitImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSimpleUnit()
		 * @generated
		 */
		EClass SIMPLE_UNIT = eINSTANCE.getSimpleUnit();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.DerivedUnitImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDerivedUnit()
		 * @generated
		 */
		EClass DERIVED_UNIT = eINSTANCE.getDerivedUnit();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.UnitConversionImpl <em>Unit Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.UnitConversionImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getUnitConversion()
		 * @generated
		 */
		EClass UNIT_CONVERSION = eINSTANCE.getUnitConversion();

		/**
		 * The meta object literal for the '<em><b>Reference Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONVERSION__REFERENCE_UNIT = eINSTANCE.getUnitConversion_ReferenceUnit();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ConversionByPrefixImpl <em>Conversion By Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ConversionByPrefixImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConversionByPrefix()
		 * @generated
		 */
		EClass CONVERSION_BY_PREFIX = eINSTANCE.getConversionByPrefix();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_BY_PREFIX__CONVERSION_FACTOR = eINSTANCE.getConversionByPrefix_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_BY_PREFIX__PREFIX = eINSTANCE.getConversionByPrefix_Prefix();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ConversionByConventionImpl <em>Conversion By Convention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ConversionByConventionImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConversionByConvention()
		 * @generated
		 */
		EClass CONVERSION_BY_CONVENTION = eINSTANCE.getConversionByConvention();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.UnitPrefixImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getUnitPrefix()
		 * @generated
		 */
		EClass UNIT_PREFIX = eINSTANCE.getUnitPrefix();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_PREFIX__SYMBOL = eINSTANCE.getUnitPrefix_Symbol();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_PREFIX__CONVERSION_FACTOR = eINSTANCE.getUnitPrefix_ConversionFactor();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ImportImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Referenced Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__REFERENCED_MODEL = eINSTANCE.getImport_ReferencedModel();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.DataStoreImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STORE___COMPUTE_NAME = eINSTANCE.getDataStore__ComputeName();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.DataNodeImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_NODE___COMPUTE_NAME = eINSTANCE.getDataNode__ComputeName();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_NODE___GET_OUTGOING_CONNECTORS = eINSTANCE.getDataNode__GetOutgoingConnectors();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_NODE___GET_INCOMING_CONNECTORS = eINSTANCE.getDataNode__GetIncomingConnectors();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationComponentImpl <em>Classification Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ClassificationComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationComponent()
		 * @generated
		 */
		EClass CLASSIFICATION_COMPONENT = eINSTANCE.getClassificationComponent();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_COMPONENT__ENVIRONMENT = eINSTANCE.getClassificationComponent_Environment();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.EnvironmentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Classification Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CLASSIFICATION_CLASSES = eINSTANCE.getEnvironment_ClassificationClasses();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassImpl <em>Classification Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ClassificationClassImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationClass()
		 * @generated
		 */
		EClass CLASSIFICATION_CLASS = eINSTANCE.getClassificationClass();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl <em>Classification Class Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getClassificationClassDistribution()
		 * @generated
		 */
		EClass CLASSIFICATION_CLASS_DISTRIBUTION = eINSTANCE.getClassificationClassDistribution();

		/**
		 * The meta object literal for the '<em><b>Classification Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS = eINSTANCE
				.getClassificationClassDistribution_ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY = eINSTANCE
				.getClassificationClassDistribution_Probability();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.MulticlassConfusionMatrixImpl <em>Multiclass Confusion Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.MulticlassConfusionMatrixImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMulticlassConfusionMatrix()
		 * @generated
		 */
		EClass MULTICLASS_CONFUSION_MATRIX = eINSTANCE.getMulticlassConfusionMatrix();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICLASS_CONFUSION_MATRIX__ENTRIES = eINSTANCE.getMulticlassConfusionMatrix_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___GET_CLASSES = eINSTANCE.getMulticlassConfusionMatrix__GetClasses();

		/**
		 * The meta object literal for the '<em><b>Get TP</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___GET_TP__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__GetTP__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Get FP</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___GET_FP__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__GetFP__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Get TN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___GET_TN__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__GetTN__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Get FN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___GET_FN__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__GetFN__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Compute Balanced Accuracy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_BALANCED_ACCURACY = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeBalancedAccuracy();

		/**
		 * The meta object literal for the '<em><b>Compute Class Accuracy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_ACCURACY__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeClassAccuracy__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Compute Class Recall</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_RECALL__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeClassRecall__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Compute Class Precision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_PRECISION__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeClassPrecision__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Compute Class F1 Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_F1_SCORE__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeClassF1Score__ClassificationClass();

		/**
		 * The meta object literal for the '<em><b>Compute Class Specificity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_SPECIFICITY__CLASSIFICATIONCLASS = eINSTANCE
				.getMulticlassConfusionMatrix__ComputeClassSpecificity__ClassificationClass();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixImpl <em>Confusion Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ConfusionMatrixImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConfusionMatrix()
		 * @generated
		 */
		EClass CONFUSION_MATRIX = eINSTANCE.getConfusionMatrix();

		/**
		 * The meta object literal for the '<em><b>Compute Accuracy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___COMPUTE_ACCURACY = eINSTANCE.getConfusionMatrix__ComputeAccuracy();

		/**
		 * The meta object literal for the '<em><b>Compute Recall</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___COMPUTE_RECALL = eINSTANCE.getConfusionMatrix__ComputeRecall();

		/**
		 * The meta object literal for the '<em><b>Compute Precision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___COMPUTE_PRECISION = eINSTANCE.getConfusionMatrix__ComputePrecision();

		/**
		 * The meta object literal for the '<em><b>Compute F1 Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___COMPUTE_F1_SCORE = eINSTANCE.getConfusionMatrix__ComputeF1Score();

		/**
		 * The meta object literal for the '<em><b>Get Highest Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___GET_HIGHEST_VALUE = eINSTANCE.getConfusionMatrix__GetHighestValue();

		/**
		 * The meta object literal for the '<em><b>Compute Specificity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFUSION_MATRIX___COMPUTE_SPECIFICITY = eINSTANCE.getConfusionMatrix__ComputeSpecificity();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl <em>Token Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getTokenSpecification()
		 * @generated
		 */
		EClass TOKEN_SPECIFICATION = eINSTANCE.getTokenSpecification();

		/**
		 * The meta object literal for the '<em><b>Input Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_SPECIFICATION__INPUT_SIZE = eINSTANCE.getTokenSpecification_InputSize();

		/**
		 * The meta object literal for the '<em><b>Collect Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_SPECIFICATION__COLLECT_SIZE = eINSTANCE.getTokenSpecification_CollectSize();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_SPECIFICATION__TYPE = eINSTANCE.getTokenSpecification_Type();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.DataSizeImpl <em>Data Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.DataSizeImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDataSize()
		 * @generated
		 */
		EClass DATA_SIZE = eINSTANCE.getDataSize();

		/**
		 * The meta object literal for the '<em><b>Get Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___GET_SIZE = eINSTANCE.getDataSize__GetSize();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.StaticSizeImpl <em>Static Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.StaticSizeImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getStaticSize()
		 * @generated
		 */
		EClass STATIC_SIZE = eINSTANCE.getStaticSize();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_SIZE__SIZE = eINSTANCE.getStaticSize_Size();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SetImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__VALUES = eINSTANCE.getSet_Values();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SetValueImpl <em>Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SetValueImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSetValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSetValue();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__PROBABILITY = eINSTANCE.getSetValue_Probability();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__SIZE = eINSTANCE.getSetValue_Size();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__VALUE = eINSTANCE.getSetValue_Value();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl <em>Dynamic Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getDynamicRange()
		 * @generated
		 */
		EClass DYNAMIC_RANGE = eINSTANCE.getDynamicRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_RANGE__MIN = eINSTANCE.getDynamicRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_RANGE__MAX = eINSTANCE.getDynamicRange_Max();

		/**
		 * The meta object literal for the '<em><b>Size Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_RANGE__SIZE_FACTOR = eINSTANCE.getDynamicRange_SizeFactor();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.SecurityThreatsImportImpl <em>Security Threats Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.SecurityThreatsImportImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSecurityThreatsImport()
		 * @generated
		 */
		EClass SECURITY_THREATS_IMPORT = eINSTANCE.getSecurityThreatsImport();

		/**
		 * The meta object literal for the '<em><b>Security Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_THREATS_IMPORT__SECURITY_THREAT = eINSTANCE.getSecurityThreatsImport_SecurityThreat();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl <em>Confusion Matrix Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConfusionMatrixEntry()
		 * @generated
		 */
		EClass CONFUSION_MATRIX_ENTRY = eINSTANCE.getConfusionMatrixEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFUSION_MATRIX_ENTRY__VALUE = eINSTANCE.getConfusionMatrixEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Predicted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFUSION_MATRIX_ENTRY__PREDICTED = eINSTANCE.getConfusionMatrixEntry_Predicted();

		/**
		 * The meta object literal for the '<em><b>Truth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFUSION_MATRIX_ENTRY__TRUTH = eINSTANCE.getConfusionMatrixEntry_Truth();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl <em>Binary Confusion Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getBinaryConfusionMatrix()
		 * @generated
		 */
		EClass BINARY_CONFUSION_MATRIX = eINSTANCE.getBinaryConfusionMatrix();

		/**
		 * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONFUSION_MATRIX__TP = eINSTANCE.getBinaryConfusionMatrix_Tp();

		/**
		 * The meta object literal for the '<em><b>Tn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONFUSION_MATRIX__TN = eINSTANCE.getBinaryConfusionMatrix_Tn();

		/**
		 * The meta object literal for the '<em><b>Fp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONFUSION_MATRIX__FP = eINSTANCE.getBinaryConfusionMatrix_Fp();

		/**
		 * The meta object literal for the '<em><b>Fn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONFUSION_MATRIX__FN = eINSTANCE.getBinaryConfusionMatrix_Fn();

		/**
		 * The meta object literal for the '<em><b>Positive Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONFUSION_MATRIX__POSITIVE_CLASS = eINSTANCE.getBinaryConfusionMatrix_PositiveClass();

		/**
		 * The meta object literal for the '<em><b>Negative Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS = eINSTANCE.getBinaryConfusionMatrix_NegativeClass();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.BinaryClassificationComponentImpl <em>Binary Classification Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.BinaryClassificationComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getBinaryClassificationComponent()
		 * @generated
		 */
		EClass BINARY_CLASSIFICATION_COMPONENT = eINSTANCE.getBinaryClassificationComponent();

		/**
		 * The meta object literal for the '<em><b>Confusion Matrixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES = eINSTANCE
				.getBinaryClassificationComponent_ConfusionMatrixes();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.impl.MulticlassClassificationComponentImpl <em>Multiclass Classification Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.impl.MulticlassClassificationComponentImpl
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getMulticlassClassificationComponent()
		 * @generated
		 */
		EClass MULTICLASS_CLASSIFICATION_COMPONENT = eINSTANCE.getMulticlassClassificationComponent();

		/**
		 * The meta object literal for the '<em><b>Confusion Matrixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES = eINSTANCE
				.getMulticlassClassificationComponent_ConfusionMatrixes();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.QueueType <em>Queue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.QueueType
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getQueueType()
		 * @generated
		 */
		EEnum QUEUE_TYPE = eINSTANCE.getQueueType();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.RaceSemantic <em>Race Semantic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.RaceSemantic
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getRaceSemantic()
		 * @generated
		 */
		EEnum RACE_SEMANTIC = eINSTANCE.getRaceSemantic();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.ComponentFiringStrategy <em>Component Firing Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.ComponentFiringStrategy
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getComponentFiringStrategy()
		 * @generated
		 */
		EEnum COMPONENT_FIRING_STRATEGY = eINSTANCE.getComponentFiringStrategy();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.SizeComputation <em>Size Computation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.SizeComputation
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getSizeComputation()
		 * @generated
		 */
		EEnum SIZE_COMPUTATION = eINSTANCE.getSizeComputation();

		/**
		 * The meta object literal for the '<em>Connectionspeed</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConnectionspeed()
		 * @generated
		 */
		EDataType CONNECTIONSPEED = eINSTANCE.getConnectionspeed();

		/**
		 * The meta object literal for the '<em>JSON</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getJSON()
		 * @generated
		 */
		EDataType JSON = eINSTANCE.getJSON();

	}

} //e4smPackage
