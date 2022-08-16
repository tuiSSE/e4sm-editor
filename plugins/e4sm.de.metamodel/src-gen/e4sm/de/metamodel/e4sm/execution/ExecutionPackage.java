/**
 */
package e4sm.de.metamodel.e4sm.execution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/edapt historyURI='e4sm.history'"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/e4sm/execution/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "execution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExecutionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionElementImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExecutionElement()
	 * @generated
	 */
	int EXECUTION_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.ConnectableNode <em>Connectable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.ConnectableNode
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getConnectableNode()
	 * @generated
	 */
	int CONNECTABLE_NODE = 4;

	/**
	 * The number of structural features of the '<em>Connectable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_NODE_FEATURE_COUNT = EXECUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connectable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_NODE_OPERATION_COUNT = EXECUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.DecisionNodeImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 0;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONNECTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OPERATION_COUNT = CONNECTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 1;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__TIME_FUNCTION = CONNECTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__SOURCE = CONNECTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__TARGETS = CONNECTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONNECTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = CONNECTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__TIME_FUNCTION = CONNECTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__SOURCES = CONNECTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__TARGET = CONNECTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONNECTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OPERATION_COUNT = CONNECTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.FlowImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 3;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TIME_FUNCTION = EXECUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = EXECUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TARGET = EXECUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = EXECUTION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = EXECUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.FlowFinalImpl <em>Flow Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.FlowFinalImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getFlowFinal()
	 * @generated
	 */
	int FLOW_FINAL = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL__SOURCE = CONNECTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_FEATURE_COUNT = CONNECTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_OPERATION_COUNT = CONNECTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExpressionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXECUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_TANGIBLE_CHILD = EXECUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_ACTUAL_PARENT = EXECUTION_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = EXECUTION_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.BinaryExpressionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Real Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___IS_REAL_OPERATION = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___GET_ACTUAL_PARENT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION___GET_TANGIBLE_CHILD = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.UnaryExpressionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___GET_TANGIBLE_CHILD = EXPRESSION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION___GET_ACTUAL_PARENT = EXPRESSION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ADDITION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SUBTRACTION = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_ACTUAL_PARENT = BINARY_EXPRESSION___GET_ACTUAL_PARENT;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_TANGIBLE_CHILD = BINARY_EXPRESSION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Is Real Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___IS_REAL_OPERATION = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Multiplication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__MULTIPLICATION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Division</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__DIVISION = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_ACTUAL_PARENT = BINARY_EXPRESSION___GET_ACTUAL_PARENT;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_TANGIBLE_CHILD = BINARY_EXPRESSION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Is Real Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___IS_REAL_OPERATION = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.VariableImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ConstImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__NAME = EXECUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__EXPRESSION = EXECUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = EXECUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = EXECUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CONST__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXPRESSION = CONST__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CONST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = CONST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.VariableRefImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 15;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF___GET_ACTUAL_PARENT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF___GET_TANGIBLE_CHILD = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl <em>Time Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getTimeFunction()
	 * @generated
	 */
	int TIME_FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Par1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION__PAR1 = 1;

	/**
	 * The feature id for the '<em><b>Par2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION__PAR2 = 2;

	/**
	 * The number of structural features of the '<em>Time Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION___GET_STRING = 0;

	/**
	 * The number of operations of the '<em>Time Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.DelayableElement <em>Delayable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.DelayableElement
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getDelayableElement()
	 * @generated
	 */
	int DELAYABLE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYABLE_ELEMENT__TIME_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Delayable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Delayable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.AssignmentImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = EXECUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TARGET = EXECUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EXECUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = EXECUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AssignableElementReferenceImpl <em>Assignable Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.impl.AssignableElementReferenceImpl
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignableElementReference()
	 * @generated
	 */
	int ASSIGNABLE_ELEMENT_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_ELEMENT_REFERENCE__REF = 0;

	/**
	 * The number of structural features of the '<em>Assignable Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_ELEMENT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assignable Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.AssignableElement <em>Assignable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.AssignableElement
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignableElement()
	 * @generated
	 */
	int ASSIGNABLE_ELEMENT = 20;

	/**
	 * The number of structural features of the '<em>Assignable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assignable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.execution.TimeFunctions <em>Time Functions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunctions
	 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getTimeFunctions()
	 * @generated
	 */
	int TIME_FUNCTIONS = 21;

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.ForkNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.ForkNode#getSource()
	 * @see #getForkNode()
	 * @generated
	 */
	EReference getForkNode_Source();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.execution.ForkNode#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.ForkNode#getTargets()
	 * @see #getForkNode()
	 * @generated
	 */
	EReference getForkNode_Targets();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.execution.MergeNode#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.MergeNode#getSources()
	 * @see #getMergeNode()
	 * @generated
	 */
	EReference getMergeNode_Sources();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.MergeNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.MergeNode#getTarget()
	 * @see #getMergeNode()
	 * @generated
	 */
	EReference getMergeNode_Target();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.Flow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Flow#getTarget()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Target();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.ConnectableNode <em>Connectable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Node</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.ConnectableNode
	 * @generated
	 */
	EClass getConnectableNode();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.execution.Execution#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Execution#getElements()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Elements();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.FlowFinal <em>Flow Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.FlowFinal
	 * @generated
	 */
	EClass getFlowFinal();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.FlowFinal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.FlowFinal#getSource()
	 * @see #getFlowFinal()
	 * @generated
	 */
	EReference getFlowFinal_Source();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.ExecutionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionElement
	 * @generated
	 */
	EClass getExecutionElement();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.Expression#getTangibleChild() <em>Get Tangible Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tangible Child</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.Expression#getTangibleChild()
	 * @generated
	 */
	EOperation getExpression__GetTangibleChild();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.Expression#getActualParent() <em>Get Actual Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actual Parent</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.Expression#getActualParent()
	 * @generated
	 */
	EOperation getExpression__GetActualParent();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression#isRealOperation() <em>Is Real Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Real Operation</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression#isRealOperation()
	 * @generated
	 */
	EOperation getBinaryExpression__IsRealOperation();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression#getActualParent() <em>Get Actual Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actual Parent</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression#getActualParent()
	 * @generated
	 */
	EOperation getBinaryExpression__GetActualParent();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.BinaryExpression#getTangibleChild() <em>Get Tangible Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tangible Child</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.BinaryExpression#getTangibleChild()
	 * @generated
	 */
	EOperation getBinaryExpression__GetTangibleChild();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.Addition#isAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addition</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Addition#isAddition()
	 * @see #getAddition()
	 * @generated
	 */
	EAttribute getAddition_Addition();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.Addition#isSubtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtraction</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Addition#isSubtraction()
	 * @see #getAddition()
	 * @generated
	 */
	EAttribute getAddition_Subtraction();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.Addition#isRealOperation() <em>Is Real Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Real Operation</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.Addition#isRealOperation()
	 * @generated
	 */
	EOperation getAddition__IsRealOperation();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isMultiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplication</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Multiplication#isMultiplication()
	 * @see #getMultiplication()
	 * @generated
	 */
	EAttribute getMultiplication_Multiplication();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Division</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Multiplication#isDivision()
	 * @see #getMultiplication()
	 * @generated
	 */
	EAttribute getMultiplication_Division();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isRealOperation() <em>Is Real Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Real Operation</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.Multiplication#isRealOperation()
	 * @generated
	 */
	EOperation getMultiplication__IsRealOperation();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.Const#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Const#getExpression()
	 * @see #getConst()
	 * @generated
	 */
	EReference getConst_Expression();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.VariableRef#getActualParent() <em>Get Actual Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actual Parent</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.VariableRef#getActualParent()
	 * @generated
	 */
	EOperation getVariableRef__GetActualParent();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.VariableRef#getTangibleChild() <em>Get Tangible Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tangible Child</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.VariableRef#getTangibleChild()
	 * @generated
	 */
	EOperation getVariableRef__GetTangibleChild();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.TimeFunction <em>Time Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Function</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunction
	 * @generated
	 */
	EClass getTimeFunction();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.TimeFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunction#getFunction()
	 * @see #getTimeFunction()
	 * @generated
	 */
	EAttribute getTimeFunction_Function();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.TimeFunction#getPar1 <em>Par1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Par1</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunction#getPar1()
	 * @see #getTimeFunction()
	 * @generated
	 */
	EAttribute getTimeFunction_Par1();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.execution.TimeFunction#getPar2 <em>Par2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Par2</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunction#getPar2()
	 * @see #getTimeFunction()
	 * @generated
	 */
	EAttribute getTimeFunction_Par2();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.execution.TimeFunction#getString() <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get String</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunction#getString()
	 * @generated
	 */
	EOperation getTimeFunction__GetString();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.DelayableElement <em>Delayable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayable Element</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.DelayableElement
	 * @generated
	 */
	EClass getDelayableElement();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.DelayableElement#getTimeFunction <em>Time Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Function</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.DelayableElement#getTimeFunction()
	 * @see #getDelayableElement()
	 * @generated
	 */
	EReference getDelayableElement_TimeFunction();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.execution.Assignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.Assignment#getTarget()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Target();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.AssignableElementReference <em>Assignable Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable Element Reference</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.AssignableElementReference
	 * @generated
	 */
	EClass getAssignableElementReference();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.execution.AssignableElementReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.AssignableElementReference#getRef()
	 * @see #getAssignableElementReference()
	 * @generated
	 */
	EReference getAssignableElementReference_Ref();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.execution.AssignableElement <em>Assignable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable Element</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.AssignableElement
	 * @generated
	 */
	EClass getAssignableElement();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.execution.TimeFunctions <em>Time Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Functions</em>'.
	 * @see e4sm.de.metamodel.e4sm.execution.TimeFunctions
	 * @generated
	 */
	EEnum getTimeFunctions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

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
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.DecisionNodeImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_NODE__SOURCE = eINSTANCE.getForkNode_Source();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_NODE__TARGETS = eINSTANCE.getForkNode_Targets();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_NODE__SOURCES = eINSTANCE.getMergeNode_Sources();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_NODE__TARGET = eINSTANCE.getMergeNode_Target();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.FlowImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TARGET = eINSTANCE.getFlow_Target();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.ConnectableNode <em>Connectable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.ConnectableNode
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getConnectableNode()
		 * @generated
		 */
		EClass CONNECTABLE_NODE = eINSTANCE.getConnectableNode();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__ELEMENTS = eINSTANCE.getExecution_Elements();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.FlowFinalImpl <em>Flow Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.FlowFinalImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getFlowFinal()
		 * @generated
		 */
		EClass FLOW_FINAL = eINSTANCE.getFlowFinal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_FINAL__SOURCE = eINSTANCE.getFlowFinal_Source();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExecutionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionElementImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExecutionElement()
		 * @generated
		 */
		EClass EXECUTION_ELEMENT = eINSTANCE.getExecutionElement();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExpressionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Get Tangible Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_TANGIBLE_CHILD = eINSTANCE.getExpression__GetTangibleChild();

		/**
		 * The meta object literal for the '<em><b>Get Actual Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_ACTUAL_PARENT = eINSTANCE.getExpression__GetActualParent();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.BinaryExpressionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Is Real Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINARY_EXPRESSION___IS_REAL_OPERATION = eINSTANCE.getBinaryExpression__IsRealOperation();

		/**
		 * The meta object literal for the '<em><b>Get Actual Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINARY_EXPRESSION___GET_ACTUAL_PARENT = eINSTANCE.getBinaryExpression__GetActualParent();

		/**
		 * The meta object literal for the '<em><b>Get Tangible Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINARY_EXPRESSION___GET_TANGIBLE_CHILD = eINSTANCE.getBinaryExpression__GetTangibleChild();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.UnaryExpressionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '<em><b>Addition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITION__ADDITION = eINSTANCE.getAddition_Addition();

		/**
		 * The meta object literal for the '<em><b>Subtraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITION__SUBTRACTION = eINSTANCE.getAddition_Subtraction();

		/**
		 * The meta object literal for the '<em><b>Is Real Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITION___IS_REAL_OPERATION = eINSTANCE.getAddition__IsRealOperation();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '<em><b>Multiplication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATION__MULTIPLICATION = eINSTANCE.getMultiplication_Multiplication();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATION__DIVISION = eINSTANCE.getMultiplication_Division();

		/**
		 * The meta object literal for the '<em><b>Is Real Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICATION___IS_REAL_OPERATION = eINSTANCE.getMultiplication__IsRealOperation();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.VariableImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ConstImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONST__EXPRESSION = eINSTANCE.getConst_Expression();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.VariableRefImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '<em><b>Get Actual Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_REF___GET_ACTUAL_PARENT = eINSTANCE.getVariableRef__GetActualParent();

		/**
		 * The meta object literal for the '<em><b>Get Tangible Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_REF___GET_TANGIBLE_CHILD = eINSTANCE.getVariableRef__GetTangibleChild();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl <em>Time Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getTimeFunction()
		 * @generated
		 */
		EClass TIME_FUNCTION = eINSTANCE.getTimeFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_FUNCTION__FUNCTION = eINSTANCE.getTimeFunction_Function();

		/**
		 * The meta object literal for the '<em><b>Par1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_FUNCTION__PAR1 = eINSTANCE.getTimeFunction_Par1();

		/**
		 * The meta object literal for the '<em><b>Par2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_FUNCTION__PAR2 = eINSTANCE.getTimeFunction_Par2();

		/**
		 * The meta object literal for the '<em><b>Get String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_FUNCTION___GET_STRING = eINSTANCE.getTimeFunction__GetString();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.DelayableElement <em>Delayable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.DelayableElement
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getDelayableElement()
		 * @generated
		 */
		EClass DELAYABLE_ELEMENT = eINSTANCE.getDelayableElement();

		/**
		 * The meta object literal for the '<em><b>Time Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAYABLE_ELEMENT__TIME_FUNCTION = eINSTANCE.getDelayableElement_TimeFunction();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.AssignmentImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TARGET = eINSTANCE.getAssignment_Target();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.impl.AssignableElementReferenceImpl <em>Assignable Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.impl.AssignableElementReferenceImpl
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignableElementReference()
		 * @generated
		 */
		EClass ASSIGNABLE_ELEMENT_REFERENCE = eINSTANCE.getAssignableElementReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNABLE_ELEMENT_REFERENCE__REF = eINSTANCE.getAssignableElementReference_Ref();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.AssignableElement <em>Assignable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.AssignableElement
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getAssignableElement()
		 * @generated
		 */
		EClass ASSIGNABLE_ELEMENT = eINSTANCE.getAssignableElement();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.execution.TimeFunctions <em>Time Functions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.execution.TimeFunctions
		 * @see e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl#getTimeFunctions()
		 * @generated
		 */
		EEnum TIME_FUNCTIONS = eINSTANCE.getTimeFunctions();

	}

} //ExecutionPackage
