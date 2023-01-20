/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.core.CorePackage;
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
 * @see abcd.xy.metamodel.abcd.abcdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface abcdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abcd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/abcd/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abcd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	abcdPackage eINSTANCE = abcd.xy.metamodel.abcd.impl.abcdPackageImpl.init();

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ComponentImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getComponent()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.SoftwareComponentImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSoftwareComponent()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.MachineLearningComponentImpl <em>Machine Learning Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.MachineLearningComponentImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getMachineLearningComponent()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ConnectorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl <em>Physical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPhysicalConnector()
	 * @generated
	 */
	int PHYSICAL_CONNECTOR = 3;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.PhysicalComponentImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPhysicalComponent()
	 * @generated
	 */
	int PHYSICAL_COMPONENT = 4;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.LogicalConnectorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getLogicalConnector()
	 * @generated
	 */
	int LOGICAL_CONNECTOR = 6;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.HeuristicImpl <em>Heuristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.HeuristicImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getHeuristic()
	 * @generated
	 */
	int HEURISTIC = 7;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.FunctionImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 8;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ExternalDependencyImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getExternalDependency()
	 * @generated
	 */
	int EXTERNAL_DEPENDENCY = 9;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.PackageImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 10;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ModelImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 11;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ActorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 12;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.HumanImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 13;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.RobotImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 14;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.SectorImpl <em>Sector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.SectorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSector()
	 * @generated
	 */
	int SECTOR = 15;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.SensorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 16;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ActuatorImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getActuator()
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
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = AnalysisPackage.PARAMETERIZABLE_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__DOCUMENTATION = CONNECTOR__DOCUMENTATION;

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
	 * The feature id for the '<em><b>Software Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SOFTWARE_COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PHYSICAL_COMPONENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MAIN_RESPONSIBLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Specifies Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SPECIFIES_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DATASTORES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

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
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.DataNodeImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDataNode()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.PinImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 18;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.InputPinImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 19;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.OutputPinImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 20;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.PersonImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPerson()
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
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.MeasurementUnitImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 22;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.SimpleUnitImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSimpleUnit()
	 * @generated
	 */
	int SIMPLE_UNIT = 23;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.DerivedUnitImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDerivedUnit()
	 * @generated
	 */
	int DERIVED_UNIT = 24;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.UnitConversionImpl <em>Unit Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.UnitConversionImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getUnitConversion()
	 * @generated
	 */
	int UNIT_CONVERSION = 25;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl <em>Conversion By Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConversionByPrefix()
	 * @generated
	 */
	int CONVERSION_BY_PREFIX = 26;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ConversionByConventionImpl <em>Conversion By Convention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ConversionByConventionImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConversionByConvention()
	 * @generated
	 */
	int CONVERSION_BY_CONVENTION = 27;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.UnitPrefixImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getUnitPrefix()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.ImportImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getImport()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.impl.DataStoreImpl
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDataStore()
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
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.QueueType <em>Queue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.QueueType
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getQueueType()
	 * @generated
	 */
	int QUEUE_TYPE = 32;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.RaceSemantic <em>Race Semantic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.RaceSemantic
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getRaceSemantic()
	 * @generated
	 */
	int RACE_SEMANTIC = 33;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.ComponentFiringStrategy <em>Component Firing Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.ComponentFiringStrategy
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getComponentFiringStrategy()
	 * @generated
	 */
	int COMPONENT_FIRING_STRATEGY = 34;

	/**
	 * The meta object id for the '<em>Connectionspeed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConnectionspeed()
	 * @generated
	 */
	int CONNECTIONSPEED = 35;

	/**
	 * The meta object id for the '<em>JSON</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 36;

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see abcd.xy.metamodel.abcd.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Component#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getPins()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pins();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Component#getMainResponsible <em>Main Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Responsible</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getMainResponsible()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_MainResponsible();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage <em>Specified In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specified In Package</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SpecifiedInPackage();

	/**
	 * Returns the meta object for the containment reference '{@link abcd.xy.metamodel.abcd.Component#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getExecution()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Execution();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Component#getFiringStrategy <em>Firing Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firing Strategy</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getFiringStrategy()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_FiringStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Component#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see abcd.xy.metamodel.abcd.Component#getDatastores()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Datastores();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Component#computeMainResponsible() <em>Compute Main Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Main Responsible</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Component#computeMainResponsible()
	 * @generated
	 */
	EOperation getComponent__ComputeMainResponsible();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Component#newOperation2() <em>New Operation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Operation2</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Component#newOperation2()
	 * @generated
	 */
	EOperation getComponent__NewOperation2();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.MachineLearningComponent <em>Machine Learning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Learning Component</em>'.
	 * @see abcd.xy.metamodel.abcd.MachineLearningComponent
	 * @generated
	 */
	EClass getMachineLearningComponent();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see abcd.xy.metamodel.abcd.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abcd.xy.metamodel.abcd.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abcd.xy.metamodel.abcd.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Connector#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Connector#computeName()
	 * @generated
	 */
	EOperation getConnector__ComputeName();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Connector#computeFlow() <em>Compute Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Flow</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Connector#computeFlow()
	 * @generated
	 */
	EOperation getConnector__ComputeFlow();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.PhysicalConnector <em>Physical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connector</em>'.
	 * @see abcd.xy.metamodel.abcd.PhysicalConnector
	 * @generated
	 */
	EClass getPhysicalConnector();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMinSpeed <em>Min Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Speed</em>'.
	 * @see abcd.xy.metamodel.abcd.PhysicalConnector#getMinSpeed()
	 * @see #getPhysicalConnector()
	 * @generated
	 */
	EAttribute getPhysicalConnector_MinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see abcd.xy.metamodel.abcd.PhysicalConnector#getMaxSpeed()
	 * @see #getPhysicalConnector()
	 * @generated
	 */
	EAttribute getPhysicalConnector_MaxSpeed();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component</em>'.
	 * @see abcd.xy.metamodel.abcd.PhysicalComponent
	 * @generated
	 */
	EClass getPhysicalComponent();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see abcd.xy.metamodel.abcd.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.SoftwareComponent#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see abcd.xy.metamodel.abcd.SoftwareComponent#isSynchronous()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.SoftwareComponent#getNumberOfServers <em>Number Of Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Servers</em>'.
	 * @see abcd.xy.metamodel.abcd.SoftwareComponent#getNumberOfServers()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_NumberOfServers();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.SoftwareComponent#isParallel() <em>Is Parallel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Parallel</em>' operation.
	 * @see abcd.xy.metamodel.abcd.SoftwareComponent#isParallel()
	 * @generated
	 */
	EOperation getSoftwareComponent__IsParallel();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.LogicalConnector <em>Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Connector</em>'.
	 * @see abcd.xy.metamodel.abcd.LogicalConnector
	 * @generated
	 */
	EClass getLogicalConnector();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Heuristic <em>Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heuristic</em>'.
	 * @see abcd.xy.metamodel.abcd.Heuristic
	 * @generated
	 */
	EClass getHeuristic();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see abcd.xy.metamodel.abcd.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Dependency</em>'.
	 * @see abcd.xy.metamodel.abcd.ExternalDependency
	 * @generated
	 */
	EClass getExternalDependency();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.ExternalDependency#computeMainResponsible() <em>Compute Main Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Main Responsible</em>' operation.
	 * @see abcd.xy.metamodel.abcd.ExternalDependency#computeMainResponsible()
	 * @generated
	 */
	EOperation getExternalDependency__ComputeMainResponsible();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see abcd.xy.metamodel.abcd.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Package#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Components();

	/**
	 * Returns the meta object for the reference list '{@link abcd.xy.metamodel.abcd.Package#getSoftwareComponents <em>Software Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Software Components</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getSoftwareComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SoftwareComponents();

	/**
	 * Returns the meta object for the reference list '{@link abcd.xy.metamodel.abcd.Package#getPhysicalComponents <em>Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical Components</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getPhysicalComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PhysicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Package#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getConnectors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Package#getSectors <em>Sectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sectors</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getSectors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Sectors();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Package#getMainResponsible <em>Main Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Responsible</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getMainResponsible()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MainResponsible();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Package#getSpecifiesComponent <em>Specifies Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies Component</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getSpecifiesComponent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SpecifiesComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Package#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see abcd.xy.metamodel.abcd.Package#getDatastores()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Datastores();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Package#getAllComponents() <em>Get All Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Components</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Package#getAllComponents()
	 * @generated
	 */
	EOperation getPackage__GetAllComponents();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Package#getMaxFlow() <em>Get Max Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Flow</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Package#getMaxFlow()
	 * @generated
	 */
	EOperation getPackage__GetMaxFlow();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see abcd.xy.metamodel.abcd.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Model#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getActors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Actors();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persons Pictures Path</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getPersonsPicturesPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_PersonsPicturesPath();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Model#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getVariants()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Variants();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Model#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Model#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see abcd.xy.metamodel.abcd.Model#getImports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Imports();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Model#isPersonPicturePathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Person Picture Path Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Person Picture Path Valid</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Model#isPersonPicturePathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__IsPersonPicturePathValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see abcd.xy.metamodel.abcd.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see abcd.xy.metamodel.abcd.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see abcd.xy.metamodel.abcd.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sector</em>'.
	 * @see abcd.xy.metamodel.abcd.Sector
	 * @generated
	 */
	EClass getSector();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Sector#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see abcd.xy.metamodel.abcd.Sector#getComponents()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Sector#getSectors <em>Sectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sectors</em>'.
	 * @see abcd.xy.metamodel.abcd.Sector#getSectors()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Sectors();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.Sector#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastores</em>'.
	 * @see abcd.xy.metamodel.abcd.Sector#getDatastores()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Datastores();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Sector#getAllComponents() <em>Get All Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Components</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Sector#getAllComponents()
	 * @generated
	 */
	EOperation getSector__GetAllComponents();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see abcd.xy.metamodel.abcd.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see abcd.xy.metamodel.abcd.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see abcd.xy.metamodel.abcd.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Pin#isGatewayPin <em>Gateway Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Pin</em>'.
	 * @see abcd.xy.metamodel.abcd.Pin#isGatewayPin()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_GatewayPin();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Pin#isStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream</em>'.
	 * @see abcd.xy.metamodel.abcd.Pin#isStream()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Stream();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Pin#getRaceSemantic <em>Race Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Race Semantic</em>'.
	 * @see abcd.xy.metamodel.abcd.Pin#getRaceSemantic()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_RaceSemantic();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.Pin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.Pin#computeName()
	 * @generated
	 */
	EOperation getPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see abcd.xy.metamodel.abcd.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.InputPin#getQueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Type</em>'.
	 * @see abcd.xy.metamodel.abcd.InputPin#getQueueType()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_QueueType();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.InputPin#getCollect <em>Collect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collect</em>'.
	 * @see abcd.xy.metamodel.abcd.InputPin#getCollect()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_Collect();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.InputPin#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see abcd.xy.metamodel.abcd.InputPin#isOptional()
	 * @see #getInputPin()
	 * @generated
	 */
	EAttribute getInputPin_Optional();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.InputPin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.InputPin#computeName()
	 * @generated
	 */
	EOperation getInputPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see abcd.xy.metamodel.abcd.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.OutputPin#getAmplify <em>Amplify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplify</em>'.
	 * @see abcd.xy.metamodel.abcd.OutputPin#getAmplify()
	 * @see #getOutputPin()
	 * @generated
	 */
	EAttribute getOutputPin_Amplify();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Uncertainty</em>'.
	 * @see abcd.xy.metamodel.abcd.OutputPin#getOutputUncertainty()
	 * @see #getOutputPin()
	 * @generated
	 */
	EAttribute getOutputPin_OutputUncertainty();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.OutputPin#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.OutputPin#computeName()
	 * @generated
	 */
	EOperation getOutputPin__ComputeName();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see abcd.xy.metamodel.abcd.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see abcd.xy.metamodel.abcd.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Person#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see abcd.xy.metamodel.abcd.Person#getDepartment()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Department();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.Person#getPictureFileName <em>Picture File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture File Name</em>'.
	 * @see abcd.xy.metamodel.abcd.Person#getPictureFileName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PictureFileName();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Unit</em>'.
	 * @see abcd.xy.metamodel.abcd.MeasurementUnit
	 * @generated
	 */
	EClass getMeasurementUnit();

	/**
	 * Returns the meta object for the containment reference '{@link abcd.xy.metamodel.abcd.MeasurementUnit#getUnitConversion <em>Unit Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Conversion</em>'.
	 * @see abcd.xy.metamodel.abcd.MeasurementUnit#getUnitConversion()
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	EReference getMeasurementUnit_UnitConversion();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.SimpleUnit <em>Simple Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Unit</em>'.
	 * @see abcd.xy.metamodel.abcd.SimpleUnit
	 * @generated
	 */
	EClass getSimpleUnit();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Unit</em>'.
	 * @see abcd.xy.metamodel.abcd.DerivedUnit
	 * @generated
	 */
	EClass getDerivedUnit();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.UnitConversion <em>Unit Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Conversion</em>'.
	 * @see abcd.xy.metamodel.abcd.UnitConversion
	 * @generated
	 */
	EClass getUnitConversion();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.UnitConversion#getReferenceUnit <em>Reference Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Unit</em>'.
	 * @see abcd.xy.metamodel.abcd.UnitConversion#getReferenceUnit()
	 * @see #getUnitConversion()
	 * @generated
	 */
	EReference getUnitConversion_ReferenceUnit();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.ConversionByPrefix <em>Conversion By Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion By Prefix</em>'.
	 * @see abcd.xy.metamodel.abcd.ConversionByPrefix
	 * @generated
	 */
	EClass getConversionByPrefix();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.ConversionByPrefix#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see abcd.xy.metamodel.abcd.ConversionByPrefix#getConversionFactor()
	 * @see #getConversionByPrefix()
	 * @generated
	 */
	EAttribute getConversionByPrefix_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.ConversionByPrefix#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see abcd.xy.metamodel.abcd.ConversionByPrefix#getPrefix()
	 * @see #getConversionByPrefix()
	 * @generated
	 */
	EReference getConversionByPrefix_Prefix();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.ConversionByConvention <em>Conversion By Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion By Convention</em>'.
	 * @see abcd.xy.metamodel.abcd.ConversionByConvention
	 * @generated
	 */
	EClass getConversionByConvention();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.UnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Prefix</em>'.
	 * @see abcd.xy.metamodel.abcd.UnitPrefix
	 * @generated
	 */
	EClass getUnitPrefix();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.UnitPrefix#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see abcd.xy.metamodel.abcd.UnitPrefix#getSymbol()
	 * @see #getUnitPrefix()
	 * @generated
	 */
	EAttribute getUnitPrefix_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see abcd.xy.metamodel.abcd.UnitPrefix#getConversionFactor()
	 * @see #getUnitPrefix()
	 * @generated
	 */
	EAttribute getUnitPrefix_ConversionFactor();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see abcd.xy.metamodel.abcd.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.Import#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Model</em>'.
	 * @see abcd.xy.metamodel.abcd.Import#getReferencedModel()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see abcd.xy.metamodel.abcd.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.DataStore#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.DataStore#computeName()
	 * @generated
	 */
	EOperation getDataStore__ComputeName();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see abcd.xy.metamodel.abcd.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.DataNode#computeName() <em>Compute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Name</em>' operation.
	 * @see abcd.xy.metamodel.abcd.DataNode#computeName()
	 * @generated
	 */
	EOperation getDataNode__ComputeName();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.DataNode#getOutgoingConnectors() <em>Get Outgoing Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Connectors</em>' operation.
	 * @see abcd.xy.metamodel.abcd.DataNode#getOutgoingConnectors()
	 * @generated
	 */
	EOperation getDataNode__GetOutgoingConnectors();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.DataNode#getIncomingConnectors() <em>Get Incoming Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Connectors</em>' operation.
	 * @see abcd.xy.metamodel.abcd.DataNode#getIncomingConnectors()
	 * @generated
	 */
	EOperation getDataNode__GetIncomingConnectors();

	/**
	 * Returns the meta object for enum '{@link abcd.xy.metamodel.abcd.QueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Type</em>'.
	 * @see abcd.xy.metamodel.abcd.QueueType
	 * @generated
	 */
	EEnum getQueueType();

	/**
	 * Returns the meta object for enum '{@link abcd.xy.metamodel.abcd.RaceSemantic <em>Race Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Race Semantic</em>'.
	 * @see abcd.xy.metamodel.abcd.RaceSemantic
	 * @generated
	 */
	EEnum getRaceSemantic();

	/**
	 * Returns the meta object for enum '{@link abcd.xy.metamodel.abcd.ComponentFiringStrategy <em>Component Firing Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Firing Strategy</em>'.
	 * @see abcd.xy.metamodel.abcd.ComponentFiringStrategy
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
	abcdFactory getabcdFactory();

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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ComponentImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>New Operation2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___NEW_OPERATION2 = eINSTANCE.getComponent__NewOperation2();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.MachineLearningComponentImpl <em>Machine Learning Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.MachineLearningComponentImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getMachineLearningComponent()
		 * @generated
		 */
		EClass MACHINE_LEARNING_COMPONENT = eINSTANCE.getMachineLearningComponent();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ConnectorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConnector()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl <em>Physical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPhysicalConnector()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.PhysicalComponentImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPhysicalComponent()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT = eINSTANCE.getPhysicalComponent();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.SoftwareComponentImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSoftwareComponent()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.LogicalConnectorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getLogicalConnector()
		 * @generated
		 */
		EClass LOGICAL_CONNECTOR = eINSTANCE.getLogicalConnector();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.HeuristicImpl <em>Heuristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.HeuristicImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getHeuristic()
		 * @generated
		 */
		EClass HEURISTIC = eINSTANCE.getHeuristic();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.FunctionImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ExternalDependencyImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getExternalDependency()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.PackageImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPackage()
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
		 * The meta object literal for the '<em><b>Datastores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DATASTORES = eINSTANCE.getPackage_Datastores();

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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ModelImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getModel()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ActorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.HumanImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.RobotImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.SectorImpl <em>Sector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.SectorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSector()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.SensorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ActuatorImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.PinImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPin()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.InputPinImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getInputPin()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.OutputPinImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getOutputPin()
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
		 * The meta object literal for the '<em><b>Compute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_PIN___COMPUTE_NAME = eINSTANCE.getOutputPin__ComputeName();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.PersonImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.MeasurementUnitImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getMeasurementUnit()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.SimpleUnitImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getSimpleUnit()
		 * @generated
		 */
		EClass SIMPLE_UNIT = eINSTANCE.getSimpleUnit();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.DerivedUnitImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDerivedUnit()
		 * @generated
		 */
		EClass DERIVED_UNIT = eINSTANCE.getDerivedUnit();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.UnitConversionImpl <em>Unit Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.UnitConversionImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getUnitConversion()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl <em>Conversion By Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConversionByPrefix()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ConversionByConventionImpl <em>Conversion By Convention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ConversionByConventionImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConversionByConvention()
		 * @generated
		 */
		EClass CONVERSION_BY_CONVENTION = eINSTANCE.getConversionByConvention();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.UnitPrefixImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getUnitPrefix()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.ImportImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getImport()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.DataStoreImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDataStore()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.impl.DataNodeImpl
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getDataNode()
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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.QueueType <em>Queue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.QueueType
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getQueueType()
		 * @generated
		 */
		EEnum QUEUE_TYPE = eINSTANCE.getQueueType();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.RaceSemantic <em>Race Semantic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.RaceSemantic
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getRaceSemantic()
		 * @generated
		 */
		EEnum RACE_SEMANTIC = eINSTANCE.getRaceSemantic();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.ComponentFiringStrategy <em>Component Firing Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.ComponentFiringStrategy
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getComponentFiringStrategy()
		 * @generated
		 */
		EEnum COMPONENT_FIRING_STRATEGY = eINSTANCE.getComponentFiringStrategy();

		/**
		 * The meta object literal for the '<em>Connectionspeed</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getConnectionspeed()
		 * @generated
		 */
		EDataType CONNECTIONSPEED = eINSTANCE.getConnectionspeed();

		/**
		 * The meta object literal for the '<em>JSON</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see abcd.xy.metamodel.abcd.impl.abcdPackageImpl#getJSON()
		 * @generated
		 */
		EDataType JSON = eINSTANCE.getJSON();

	}

} //abcdPackage
