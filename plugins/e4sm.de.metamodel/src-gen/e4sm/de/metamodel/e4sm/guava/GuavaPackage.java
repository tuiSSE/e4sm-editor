/**
 */
package e4sm.de.metamodel.e4sm.guava;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see e4sm.de.metamodel.e4sm.guava.GuavaFactory
 * @model kind="package"
 * @generated
 */
public interface GuavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guava";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://guava.dev/releases/30.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "guava";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuavaPackage eINSTANCE = e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.google.common.graph.PredecessorsFunction <em>Predecessors Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.PredecessorsFunction
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getPredecessorsFunction()
	 * @generated
	 */
	int PREDECESSORS_FUNCTION = 4;

	/**
	 * The number of structural features of the '<em>Predecessors Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSORS_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predecessors Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSORS_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.Graph <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.Graph
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = PREDECESSORS_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_DIRECTED = PREDECESSORS_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IN_DEGREE__OBJECT = PREDECESSORS_FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HASH_CODE = PREDECESSORS_FUNCTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Allows Self Loops</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ALLOWS_SELF_LOOPS = PREDECESSORS_FUNCTION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = PREDECESSORS_FUNCTION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.common.graph.AbstractGraph <em>Abstract Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.AbstractGraph
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getAbstractGraph()
	 * @generated
	 */
	int ABSTRACT_GRAPH = 1;

	/**
	 * The number of structural features of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___IS_DIRECTED = GRAPH___IS_DIRECTED;

	/**
	 * The operation id for the '<em>In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___IN_DEGREE__OBJECT = GRAPH___IN_DEGREE__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HASH_CODE = GRAPH___HASH_CODE;

	/**
	 * The operation id for the '<em>Allows Self Loops</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ALLOWS_SELF_LOOPS = GRAPH___ALLOWS_SELF_LOOPS;

	/**
	 * The number of operations of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.ImmutableGraph <em>Immutable Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.ImmutableGraph
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getImmutableGraph()
	 * @generated
	 */
	int IMMUTABLE_GRAPH = 2;

	/**
	 * The number of structural features of the '<em>Immutable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH_FEATURE_COUNT = ABSTRACT_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH___IS_DIRECTED = ABSTRACT_GRAPH___IS_DIRECTED;

	/**
	 * The operation id for the '<em>In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH___IN_DEGREE__OBJECT = ABSTRACT_GRAPH___IN_DEGREE__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH___HASH_CODE = ABSTRACT_GRAPH___HASH_CODE;

	/**
	 * The operation id for the '<em>Allows Self Loops</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH___ALLOWS_SELF_LOOPS = ABSTRACT_GRAPH___ALLOWS_SELF_LOOPS;

	/**
	 * The number of operations of the '<em>Immutable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_GRAPH_OPERATION_COUNT = ABSTRACT_GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.MutableGraph <em>Mutable Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.MutableGraph
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getMutableGraph()
	 * @generated
	 */
	int MUTABLE_GRAPH = 3;

	/**
	 * The number of structural features of the '<em>Mutable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH___IS_DIRECTED = GRAPH___IS_DIRECTED;

	/**
	 * The operation id for the '<em>In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH___IN_DEGREE__OBJECT = GRAPH___IN_DEGREE__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH___HASH_CODE = GRAPH___HASH_CODE;

	/**
	 * The operation id for the '<em>Allows Self Loops</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH___ALLOWS_SELF_LOOPS = GRAPH___ALLOWS_SELF_LOOPS;

	/**
	 * The number of operations of the '<em>Mutable Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_GRAPH_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.Network <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.Network
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 5;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = PREDECESSORS_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___HASH_CODE = PREDECESSORS_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = PREDECESSORS_FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.common.graph.MutableNetwork <em>Mutable Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.MutableNetwork
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getMutableNetwork()
	 * @generated
	 */
	int MUTABLE_NETWORK = 6;

	/**
	 * The number of structural features of the '<em>Mutable Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_NETWORK_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_NETWORK___HASH_CODE = NETWORK___HASH_CODE;

	/**
	 * The number of operations of the '<em>Mutable Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABLE_NETWORK_OPERATION_COUNT = NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.AbstractNetwork <em>Abstract Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.AbstractNetwork
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getAbstractNetwork()
	 * @generated
	 */
	int ABSTRACT_NETWORK = 7;

	/**
	 * The number of structural features of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK___HASH_CODE = NETWORK___HASH_CODE;

	/**
	 * The number of operations of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_OPERATION_COUNT = NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.ImmutableNetwork <em>Immutable Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.ImmutableNetwork
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getImmutableNetwork()
	 * @generated
	 */
	int IMMUTABLE_NETWORK = 8;

	/**
	 * The number of structural features of the '<em>Immutable Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_NETWORK_FEATURE_COUNT = ABSTRACT_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_NETWORK___HASH_CODE = ABSTRACT_NETWORK___HASH_CODE;

	/**
	 * The number of operations of the '<em>Immutable Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_NETWORK_OPERATION_COUNT = ABSTRACT_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.common.graph.SuccessorsFunction <em>Successors Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.common.graph.SuccessorsFunction
	 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getSuccessorsFunction()
	 * @generated
	 */
	int SUCCESSORS_FUNCTION = 9;

	/**
	 * The number of structural features of the '<em>Successors Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSORS_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Successors Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSORS_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see com.google.common.graph.Graph
	 * @model instanceClass="com.google.common.graph.Graph" typeParameters="N" superTypes="e4sm.de.metamodel.e4sm.guava.PredecessorsFunction&lt;N&gt; e4sm.de.metamodel.e4sm.guava.SuccessorsFunction&lt;N&gt;"
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the '{@link com.google.common.graph.Graph#isDirected() <em>Is Directed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Directed</em>' operation.
	 * @see com.google.common.graph.Graph#isDirected()
	 * @generated
	 */
	EOperation getGraph__IsDirected();

	/**
	 * Returns the meta object for the '{@link com.google.common.graph.Graph#inDegree(java.lang.Object) <em>In Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Degree</em>' operation.
	 * @see com.google.common.graph.Graph#inDegree(java.lang.Object)
	 * @generated
	 */
	EOperation getGraph__InDegree__Object();

	/**
	 * Returns the meta object for the '{@link com.google.common.graph.Graph#hashCode() <em>Hash Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hash Code</em>' operation.
	 * @see com.google.common.graph.Graph#hashCode()
	 * @generated
	 */
	EOperation getGraph__HashCode();

	/**
	 * Returns the meta object for the '{@link com.google.common.graph.Graph#allowsSelfLoops() <em>Allows Self Loops</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allows Self Loops</em>' operation.
	 * @see com.google.common.graph.Graph#allowsSelfLoops()
	 * @generated
	 */
	EOperation getGraph__AllowsSelfLoops();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Graph</em>'.
	 * @see com.google.common.graph.AbstractGraph
	 * @model instanceClass="com.google.common.graph.AbstractGraph" typeParameters="N" superTypes="e4sm.de.metamodel.e4sm.guava.Graph"
	 * @generated
	 */
	EClass getAbstractGraph();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.ImmutableGraph <em>Immutable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immutable Graph</em>'.
	 * @see com.google.common.graph.ImmutableGraph
	 * @model instanceClass="com.google.common.graph.ImmutableGraph" typeParameters="N" superTypes="e4sm.de.metamodel.e4sm.guava.AbstractGraph"
	 * @generated
	 */
	EClass getImmutableGraph();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.MutableGraph <em>Mutable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutable Graph</em>'.
	 * @see com.google.common.graph.MutableGraph
	 * @model instanceClass="com.google.common.graph.MutableGraph" typeParameters="N" superTypes="e4sm.de.metamodel.e4sm.guava.Graph"
	 * @generated
	 */
	EClass getMutableGraph();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.PredecessorsFunction <em>Predecessors Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessors Function</em>'.
	 * @see com.google.common.graph.PredecessorsFunction
	 * @model instanceClass="com.google.common.graph.PredecessorsFunction" typeParameters="N"
	 * @generated
	 */
	EClass getPredecessorsFunction();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see com.google.common.graph.Network
	 * @model instanceClass="com.google.common.graph.Network" typeParameters="N E" superTypes="e4sm.de.metamodel.e4sm.guava.PredecessorsFunction&lt;N&gt; e4sm.de.metamodel.e4sm.guava.SuccessorsFunction&lt;N&gt;"
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the '{@link com.google.common.graph.Network#hashCode() <em>Hash Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hash Code</em>' operation.
	 * @see com.google.common.graph.Network#hashCode()
	 * @generated
	 */
	EOperation getNetwork__HashCode();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.MutableNetwork <em>Mutable Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutable Network</em>'.
	 * @see com.google.common.graph.MutableNetwork
	 * @model instanceClass="com.google.common.graph.MutableNetwork" typeParameters="N E" superTypes="e4sm.de.metamodel.e4sm.guava.Network&lt;N, E&gt;"
	 * @generated
	 */
	EClass getMutableNetwork();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.AbstractNetwork <em>Abstract Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Network</em>'.
	 * @see com.google.common.graph.AbstractNetwork
	 * @model instanceClass="com.google.common.graph.AbstractNetwork" typeParameters="N E" superTypes="e4sm.de.metamodel.e4sm.guava.Network&lt;N, E&gt;"
	 * @generated
	 */
	EClass getAbstractNetwork();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.ImmutableNetwork <em>Immutable Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immutable Network</em>'.
	 * @see com.google.common.graph.ImmutableNetwork
	 * @model instanceClass="com.google.common.graph.ImmutableNetwork" typeParameters="N E" superTypes="e4sm.de.metamodel.e4sm.guava.AbstractNetwork&lt;N, E&gt;"
	 * @generated
	 */
	EClass getImmutableNetwork();

	/**
	 * Returns the meta object for class '{@link com.google.common.graph.SuccessorsFunction <em>Successors Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Successors Function</em>'.
	 * @see com.google.common.graph.SuccessorsFunction
	 * @model instanceClass="com.google.common.graph.SuccessorsFunction" typeParameters="N"
	 * @generated
	 */
	EClass getSuccessorsFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuavaFactory getGuavaFactory();

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
		 * The meta object literal for the '{@link com.google.common.graph.Graph <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.Graph
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Is Directed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_DIRECTED = eINSTANCE.getGraph__IsDirected();

		/**
		 * The meta object literal for the '<em><b>In Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IN_DEGREE__OBJECT = eINSTANCE.getGraph__InDegree__Object();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___HASH_CODE = eINSTANCE.getGraph__HashCode();

		/**
		 * The meta object literal for the '<em><b>Allows Self Loops</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ALLOWS_SELF_LOOPS = eINSTANCE.getGraph__AllowsSelfLoops();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.AbstractGraph <em>Abstract Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.AbstractGraph
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getAbstractGraph()
		 * @generated
		 */
		EClass ABSTRACT_GRAPH = eINSTANCE.getAbstractGraph();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.ImmutableGraph <em>Immutable Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.ImmutableGraph
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getImmutableGraph()
		 * @generated
		 */
		EClass IMMUTABLE_GRAPH = eINSTANCE.getImmutableGraph();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.MutableGraph <em>Mutable Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.MutableGraph
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getMutableGraph()
		 * @generated
		 */
		EClass MUTABLE_GRAPH = eINSTANCE.getMutableGraph();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.PredecessorsFunction <em>Predecessors Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.PredecessorsFunction
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getPredecessorsFunction()
		 * @generated
		 */
		EClass PREDECESSORS_FUNCTION = eINSTANCE.getPredecessorsFunction();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.Network <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.Network
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORK___HASH_CODE = eINSTANCE.getNetwork__HashCode();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.MutableNetwork <em>Mutable Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.MutableNetwork
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getMutableNetwork()
		 * @generated
		 */
		EClass MUTABLE_NETWORK = eINSTANCE.getMutableNetwork();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.AbstractNetwork <em>Abstract Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.AbstractNetwork
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getAbstractNetwork()
		 * @generated
		 */
		EClass ABSTRACT_NETWORK = eINSTANCE.getAbstractNetwork();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.ImmutableNetwork <em>Immutable Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.ImmutableNetwork
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getImmutableNetwork()
		 * @generated
		 */
		EClass IMMUTABLE_NETWORK = eINSTANCE.getImmutableNetwork();

		/**
		 * The meta object literal for the '{@link com.google.common.graph.SuccessorsFunction <em>Successors Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.common.graph.SuccessorsFunction
		 * @see e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl#getSuccessorsFunction()
		 * @generated
		 */
		EClass SUCCESSORS_FUNCTION = eINSTANCE.getSuccessorsFunction();

	}

} //GuavaPackage
