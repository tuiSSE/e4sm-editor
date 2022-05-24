/**
 */
package e4sm.de.metamodel.e4sm;

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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
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
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PINS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specified In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SPECIFIED_IN_PACKAGE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXECUTION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Firing Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FIRING_STRATEGY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___COMPUTE_MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___NEW_OPERATION2 = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__SYNCHRONOUS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__NUMBER_OF_SERVERS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Main Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT___COMPUTE_MAIN_RESPONSIBLE = COMPONENT___COMPUTE_MAIN_RESPONSIBLE;

	/**
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT___NEW_OPERATION2 = COMPONENT___NEW_OPERATION2;

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
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT__OUTPUT_UNCERTAINTY = SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LEARNING_COMPONENT___NEW_OPERATION2 = SOFTWARE_COMPONENT___NEW_OPERATION2;

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
	int CONNECTOR__PARAMETERS = CorePackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___COMPUTE_NAME = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___COMPUTE_FLOW = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT___NEW_OPERATION2 = COMPONENT___NEW_OPERATION2;

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
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__OUTPUT_UNCERTAINTY = SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC___NEW_OPERATION2 = SOFTWARE_COMPONENT___NEW_OPERATION2;

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
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT_UNCERTAINTY = SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___NEW_OPERATION2 = SOFTWARE_COMPONENT___NEW_OPERATION2;

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
	 * The feature id for the '<em><b>Output Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__OUTPUT_UNCERTAINTY = SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY___NEW_OPERATION2 = SOFTWARE_COMPONENT___NEW_OPERATION2;

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
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Software Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SOFTWARE_COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Physical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PHYSICAL_COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Specifies Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SPECIFIES_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persons Pictures Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PERSONS_PICTURES_PATH = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VARIANTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

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
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__SECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___NEW_OPERATION2 = PHYSICAL_COMPONENT___NEW_OPERATION2;

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
	 * The operation id for the '<em>New Operation2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___NEW_OPERATION2 = PHYSICAL_COMPONENT___NEW_OPERATION2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = PHYSICAL_COMPONENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PARAMETERS = CorePackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__GATEWAY_PIN = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__STREAM = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Race Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__RACE_SEMANTIC = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = CorePackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___COMPUTE_NAME = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___GET_INCOMING_CONNECTORS = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___GET_OUTGOING_CONNECTORS = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = CorePackage.PARAMETERIZABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PARAMETERS = PIN__PARAMETERS;

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
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_INCOMING_CONNECTORS = PIN___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___GET_OUTGOING_CONNECTORS = PIN___GET_OUTGOING_CONNECTORS;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PARAMETERS = PIN__PARAMETERS;

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
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Incoming Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_INCOMING_CONNECTORS = PIN___GET_INCOMING_CONNECTORS;

	/**
	 * The operation id for the '<em>Get Outgoing Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___GET_OUTGOING_CONNECTORS = PIN___GET_OUTGOING_CONNECTORS;

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
	 * The feature id for the '<em><b>Responsible For Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RESPONSIBLE_FOR_COMPONENTS = HUMAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Picture File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PICTURE_FILE_NAME = HUMAN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = HUMAN_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.QueueType <em>Queue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.QueueType
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getQueueType()
	 * @generated
	 */
	int QUEUE_TYPE = 30;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.RaceSemantic <em>Race Semantic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.RaceSemantic
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getRaceSemantic()
	 * @generated
	 */
	int RACE_SEMANTIC = 31;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.ComponentFiringStrategy <em>Component Firing Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.ComponentFiringStrategy
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getComponentFiringStrategy()
	 * @generated
	 */
	int COMPONENT_FIRING_STRATEGY = 32;

	/**
	 * The meta object id for the '<em>Connectionspeed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getConnectionspeed()
	 * @generated
	 */
	int CONNECTIONSPEED = 33;

	/**
	 * The meta object id for the '<em>JSON</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see e4sm.de.metamodel.e4sm.impl.e4smPackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 34;

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
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Component#computeMainResponsible() <em>Compute Main Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Main Responsible</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Component#computeMainResponsible()
	 * @generated
	 */
	EOperation getComponent__ComputeMainResponsible();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Component#newOperation2() <em>New Operation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Operation2</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Component#newOperation2()
	 * @generated
	 */
	EOperation getComponent__NewOperation2();

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
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getOutputUncertainty <em>Output Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Uncertainty</em>'.
	 * @see e4sm.de.metamodel.e4sm.SoftwareComponent#getOutputUncertainty()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_OutputUncertainty();

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
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.Package#getSoftwareComponents <em>Software Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Software Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getSoftwareComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SoftwareComponents();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.Package#getPhysicalComponents <em>Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Package#getPhysicalComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PhysicalComponents();

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
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Pin#getIncomingConnectors() <em>Get Incoming Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Connectors</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Pin#getIncomingConnectors()
	 * @generated
	 */
	EOperation getPin__GetIncomingConnectors();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.Pin#getOutgoingConnectors() <em>Get Outgoing Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Connectors</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.Pin#getOutgoingConnectors()
	 * @generated
	 */
	EOperation getPin__GetOutgoingConnectors();

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
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.Person#getResponsibleForComponents <em>Responsible For Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible For Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.Person#getResponsibleForComponents()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ResponsibleForComponents();

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
		 * The meta object literal for the '<em><b>Compute Main Responsible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___COMPUTE_MAIN_RESPONSIBLE = eINSTANCE.getComponent__ComputeMainResponsible();

		/**
		 * The meta object literal for the '<em><b>New Operation2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___NEW_OPERATION2 = eINSTANCE.getComponent__NewOperation2();

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
		 * The meta object literal for the '<em><b>Output Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY = eINSTANCE.getSoftwareComponent_OutputUncertainty();

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
		 * The meta object literal for the '<em><b>Software Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SOFTWARE_COMPONENTS = eINSTANCE.getPackage_SoftwareComponents();

		/**
		 * The meta object literal for the '<em><b>Physical Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PHYSICAL_COMPONENTS = eINSTANCE.getPackage_PhysicalComponents();

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
		 * The meta object literal for the '<em><b>Get Incoming Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN___GET_INCOMING_CONNECTORS = eINSTANCE.getPin__GetIncomingConnectors();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN___GET_OUTGOING_CONNECTORS = eINSTANCE.getPin__GetOutgoingConnectors();

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
		 * The meta object literal for the '<em><b>Responsible For Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__RESPONSIBLE_FOR_COMPONENTS = eINSTANCE.getPerson_ResponsibleForComponents();

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
