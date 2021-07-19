/**
 */
package e4sm.de.metamodel.e4sm.guava.impl;

import com.google.common.graph.AbstractGraph;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Graph;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.PredecessorsFunction;
import com.google.common.graph.SuccessorsFunction;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;

import e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl;

import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;

import e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsPackageImpl;

import e4sm.de.metamodel.e4sm.core.CorePackage;

import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;

import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.guava.GuavaFactory;
import e4sm.de.metamodel.e4sm.guava.GuavaPackage;

import e4sm.de.metamodel.e4sm.impl.e4smPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuavaPackageImpl extends EPackageImpl implements GuavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immutableGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutableGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorsFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutableNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immutableNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successorsFunctionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see e4sm.de.metamodel.e4sm.guava.GuavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuavaPackageImpl() {
		super(eNS_URI, GuavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GuavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuavaPackage init() {
		if (isInited)
			return (GuavaPackage) EPackage.Registry.INSTANCE.getEPackage(GuavaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGuavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GuavaPackageImpl theGuavaPackage = registeredGuavaPackage instanceof GuavaPackageImpl
				? (GuavaPackageImpl) registeredGuavaPackage
				: new GuavaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);
		e4smPackageImpl thee4smPackage = (e4smPackageImpl) (registeredPackage instanceof e4smPackageImpl
				? registeredPackage
				: e4smPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl) (registeredPackage instanceof AnalysisPackageImpl
				? registeredPackage
				: AnalysisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl) (registeredPackage instanceof ResultsPackageImpl
				? registeredPackage
				: ResultsPackage.eINSTANCE);

		// Create package meta-data objects
		theGuavaPackage.createPackageContents();
		thee4smPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAnalysisPackage.createPackageContents();
		theResultsPackage.createPackageContents();

		// Initialize created meta-data
		theGuavaPackage.initializePackageContents();
		thee4smPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuavaPackage.eNS_URI, theGuavaPackage);
		return theGuavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__IsDirected() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__InDegree__Object() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__HashCode() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AllowsSelfLoops() {
		return graphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractGraph() {
		return abstractGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmutableGraph() {
		return immutableGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMutableGraph() {
		return mutableGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredecessorsFunction() {
		return predecessorsFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetwork__HashCode() {
		return networkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMutableNetwork() {
		return mutableNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractNetwork() {
		return abstractNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmutableNetwork() {
		return immutableNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessorsFunction() {
		return successorsFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuavaFactory getGuavaFactory() {
		return (GuavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		graphEClass = createEClass(GRAPH);
		createEOperation(graphEClass, GRAPH___IS_DIRECTED);
		createEOperation(graphEClass, GRAPH___IN_DEGREE__OBJECT);
		createEOperation(graphEClass, GRAPH___HASH_CODE);
		createEOperation(graphEClass, GRAPH___ALLOWS_SELF_LOOPS);

		abstractGraphEClass = createEClass(ABSTRACT_GRAPH);

		immutableGraphEClass = createEClass(IMMUTABLE_GRAPH);

		mutableGraphEClass = createEClass(MUTABLE_GRAPH);

		predecessorsFunctionEClass = createEClass(PREDECESSORS_FUNCTION);

		networkEClass = createEClass(NETWORK);
		createEOperation(networkEClass, NETWORK___HASH_CODE);

		mutableNetworkEClass = createEClass(MUTABLE_NETWORK);

		abstractNetworkEClass = createEClass(ABSTRACT_NETWORK);

		immutableNetworkEClass = createEClass(IMMUTABLE_NETWORK);

		successorsFunctionEClass = createEClass(SUCCESSORS_FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter graphEClass_N = addETypeParameter(graphEClass, "N");
		addETypeParameter(abstractGraphEClass, "N");
		addETypeParameter(immutableGraphEClass, "N");
		addETypeParameter(mutableGraphEClass, "N");
		addETypeParameter(predecessorsFunctionEClass, "N");
		ETypeParameter networkEClass_N = addETypeParameter(networkEClass, "N");
		addETypeParameter(networkEClass, "E");
		ETypeParameter mutableNetworkEClass_N = addETypeParameter(mutableNetworkEClass, "N");
		ETypeParameter mutableNetworkEClass_E = addETypeParameter(mutableNetworkEClass, "E");
		ETypeParameter abstractNetworkEClass_N = addETypeParameter(abstractNetworkEClass, "N");
		ETypeParameter abstractNetworkEClass_E = addETypeParameter(abstractNetworkEClass, "E");
		ETypeParameter immutableNetworkEClass_N = addETypeParameter(immutableNetworkEClass, "N");
		ETypeParameter immutableNetworkEClass_E = addETypeParameter(immutableNetworkEClass, "E");
		addETypeParameter(successorsFunctionEClass, "N");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getPredecessorsFunction());
		EGenericType g2 = createEGenericType(graphEClass_N);
		g1.getETypeArguments().add(g2);
		graphEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSuccessorsFunction());
		g2 = createEGenericType(graphEClass_N);
		g1.getETypeArguments().add(g2);
		graphEClass.getEGenericSuperTypes().add(g1);
		abstractGraphEClass.getESuperTypes().add(this.getGraph());
		immutableGraphEClass.getESuperTypes().add(this.getAbstractGraph());
		mutableGraphEClass.getESuperTypes().add(this.getGraph());
		g1 = createEGenericType(this.getPredecessorsFunction());
		g2 = createEGenericType(networkEClass_N);
		g1.getETypeArguments().add(g2);
		networkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSuccessorsFunction());
		g2 = createEGenericType(networkEClass_N);
		g1.getETypeArguments().add(g2);
		networkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNetwork());
		g2 = createEGenericType(mutableNetworkEClass_N);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(mutableNetworkEClass_E);
		g1.getETypeArguments().add(g2);
		mutableNetworkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNetwork());
		g2 = createEGenericType(abstractNetworkEClass_N);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(abstractNetworkEClass_E);
		g1.getETypeArguments().add(g2);
		abstractNetworkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractNetwork());
		g2 = createEGenericType(immutableNetworkEClass_N);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(immutableNetworkEClass_E);
		g1.getETypeArguments().add(g2);
		immutableNetworkEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(graphEClass, Graph.class, "Graph", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGraph__IsDirected(), ecorePackage.getEBoolean(), "isDirected", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGraph__InDegree__Object(), ecorePackage.getEInt(), "inDegree", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(graphEClass_N);
		addEParameter(op, g1, "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__HashCode(), ecorePackage.getEInt(), "hashCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__AllowsSelfLoops(), ecorePackage.getEBoolean(), "allowsSelfLoops", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(abstractGraphEClass, AbstractGraph.class, "AbstractGraph", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(immutableGraphEClass, ImmutableGraph.class, "ImmutableGraph", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(mutableGraphEClass, MutableGraph.class, "MutableGraph", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(predecessorsFunctionEClass, PredecessorsFunction.class, "PredecessorsFunction", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNetwork__HashCode(), ecorePackage.getEInt(), "hashCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mutableNetworkEClass, MutableNetwork.class, "MutableNetwork", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractNetworkEClass, AbstractNetwork.class, "AbstractNetwork", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(immutableNetworkEClass, ImmutableNetwork.class, "ImmutableNetwork", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(successorsFunctionEClass, SuccessorsFunction.class, "SuccessorsFunction", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
	}

} //GuavaPackageImpl
