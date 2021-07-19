/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import e4sm.de.metamodel.e4sm.analysis.Analysis;
import e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition;
import e4sm.de.metamodel.e4sm.analysis.AnalysisFactory;
import e4sm.de.metamodel.e4sm.analysis.AnalysisManager;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.EntireGraphAnalysis;
import e4sm.de.metamodel.e4sm.analysis.GraphAnalysis;
import e4sm.de.metamodel.e4sm.analysis.MemoryLessGraphAnalysis;
import e4sm.de.metamodel.e4sm.analysis.ModelAnalysis;
import e4sm.de.metamodel.e4sm.analysis.NetworkGenerator;
import e4sm.de.metamodel.e4sm.analysis.PackageAnalysis;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.analysis.PreviousNodeGraphAnalysis;

import e4sm.de.metamodel.e4sm.analysis.Variant;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;
import e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsPackageImpl;
import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.guava.GuavaPackage;
import e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl;
import e4sm.de.metamodel.e4sm.impl.e4smPackageImpl;
import e4sm.de.metamodel.e4sm.core.CorePackage;

import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisPackageImpl extends EPackageImpl implements AnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryLessGraphAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entireGraphAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previousNodeGraphAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkGeneratorEClass = null;

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
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisPackageImpl() {
		super(eNS_URI, AnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisPackage init() {
		if (isInited)
			return (AnalysisPackage) EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnalysisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = registeredAnalysisPackage instanceof AnalysisPackageImpl
				? (AnalysisPackageImpl) registeredAnalysisPackage
				: new AnalysisPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl) (registeredPackage instanceof ResultsPackageImpl
				? registeredPackage
				: ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GuavaPackage.eNS_URI);
		GuavaPackageImpl theGuavaPackage = (GuavaPackageImpl) (registeredPackage instanceof GuavaPackageImpl
				? registeredPackage
				: GuavaPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysisPackage.createPackageContents();
		thee4smPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theGuavaPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisPackage.initializePackageContents();
		thee4smPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theGuavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisPackage.eNS_URI, theAnalysisPackage);
		return theAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisManager() {
		return analysisManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysisManager__Start__EList() {
		return analysisManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysisManager__StoreResult__AnalysisExecution() {
		return analysisManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisDefinition() {
		return analysisDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisDefinition_ParameterDefinitions() {
		return (EReference) analysisDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisDefinition_Analysis() {
		return (EReference) analysisDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Parameters() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Unit() {
		return (EAttribute) parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_MustBeDefinedOn() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_CanBeDefinedOn() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_ShallNotBeDefinedOn() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_DefaultValue() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ParameterDefinition() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_AppliesOnlyOnVariants() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_DoesNotApplyOnVariants() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_InitialValue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_CurrentValue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__IsValid() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizableElement() {
		return parameterizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizableElement_Parameters() {
		return (EReference) parameterizableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__Exec() {
		return analysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__Init() {
		return analysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__PostExecution() {
		return analysisEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__Run() {
		return analysisEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelAnalysis() {
		return modelAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphAnalysis() {
		return graphAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphAnalysis_Graph() {
		return (EReference) graphAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphAnalysis__InitGraph() {
		return graphAnalysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphAnalysis__Init() {
		return graphAnalysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryLessGraphAnalysis() {
		return memoryLessGraphAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntireGraphAnalysis() {
		return entireGraphAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageAnalysis() {
		return packageAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreviousNodeGraphAnalysis() {
		return previousNodeGraphAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkGenerator() {
		return networkGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetworkGenerator__GenerateNetwork__Model() {
		return networkGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetworkGenerator__GenerateNetwork__Package() {
		return networkGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisFactory getAnalysisFactory() {
		return (AnalysisFactory) getEFactoryInstance();
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
		analysisManagerEClass = createEClass(ANALYSIS_MANAGER);
		createEOperation(analysisManagerEClass, ANALYSIS_MANAGER___START__ELIST);
		createEOperation(analysisManagerEClass, ANALYSIS_MANAGER___STORE_RESULT__ANALYSISEXECUTION);

		analysisDefinitionEClass = createEClass(ANALYSIS_DEFINITION);
		createEReference(analysisDefinitionEClass, ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS);
		createEReference(analysisDefinitionEClass, ANALYSIS_DEFINITION__ANALYSIS);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__PARAMETERS);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__UNIT);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__MUST_BE_DEFINED_ON);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__CAN_BE_DEFINED_ON);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__DEFAULT_VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAMETER_DEFINITION);
		createEReference(parameterEClass, PARAMETER__APPLIES_ONLY_ON_VARIANTS);
		createEReference(parameterEClass, PARAMETER__DOES_NOT_APPLY_ON_VARIANTS);
		createEReference(parameterEClass, PARAMETER__INITIAL_VALUE);
		createEReference(parameterEClass, PARAMETER__CURRENT_VALUE);
		createEOperation(parameterEClass, PARAMETER___IS_VALID);

		parameterizableElementEClass = createEClass(PARAMETERIZABLE_ELEMENT);
		createEReference(parameterizableElementEClass, PARAMETERIZABLE_ELEMENT__PARAMETERS);

		analysisEClass = createEClass(ANALYSIS);
		createEOperation(analysisEClass, ANALYSIS___EXEC);
		createEOperation(analysisEClass, ANALYSIS___INIT);
		createEOperation(analysisEClass, ANALYSIS___POST_EXECUTION);
		createEOperation(analysisEClass, ANALYSIS___RUN);

		modelAnalysisEClass = createEClass(MODEL_ANALYSIS);

		graphAnalysisEClass = createEClass(GRAPH_ANALYSIS);
		createEReference(graphAnalysisEClass, GRAPH_ANALYSIS__GRAPH);
		createEOperation(graphAnalysisEClass, GRAPH_ANALYSIS___INIT_GRAPH);
		createEOperation(graphAnalysisEClass, GRAPH_ANALYSIS___INIT);

		memoryLessGraphAnalysisEClass = createEClass(MEMORY_LESS_GRAPH_ANALYSIS);

		entireGraphAnalysisEClass = createEClass(ENTIRE_GRAPH_ANALYSIS);

		packageAnalysisEClass = createEClass(PACKAGE_ANALYSIS);

		previousNodeGraphAnalysisEClass = createEClass(PREVIOUS_NODE_GRAPH_ANALYSIS);

		variantEClass = createEClass(VARIANT);

		networkGeneratorEClass = createEClass(NETWORK_GENERATOR);
		createEOperation(networkGeneratorEClass, NETWORK_GENERATOR___GENERATE_NETWORK__MODEL);
		createEOperation(networkGeneratorEClass, NETWORK_GENERATOR___GENERATE_NETWORK__PACKAGE);
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

		// Obtain other dependent packages
		ResultsPackage theResultsPackage = (ResultsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ResultsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		GuavaPackage theGuavaPackage = (GuavaPackage) EPackage.Registry.INSTANCE.getEPackage(GuavaPackage.eNS_URI);
		e4smPackage thee4smPackage = (e4smPackage) EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theResultsPackage);

		// Create type parameters
		ETypeParameter graphAnalysisEClass_C = addETypeParameter(graphAnalysisEClass, "C");
		ETypeParameter memoryLessGraphAnalysisEClass_C = addETypeParameter(memoryLessGraphAnalysisEClass, "C");
		ETypeParameter entireGraphAnalysisEClass_C = addETypeParameter(entireGraphAnalysisEClass, "C");
		ETypeParameter previousNodeGraphAnalysisEClass_C = addETypeParameter(previousNodeGraphAnalysisEClass, "C");

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisDefinitionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		parameterDefinitionEClass.getESuperTypes().add(theCorePackage.getTypedElement());
		parameterEClass.getESuperTypes().add(theCorePackage.getElement());
		modelAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		graphAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		EGenericType g1 = createEGenericType(this.getGraphAnalysis());
		EGenericType g2 = createEGenericType(memoryLessGraphAnalysisEClass_C);
		g1.getETypeArguments().add(g2);
		memoryLessGraphAnalysisEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphAnalysis());
		g2 = createEGenericType(entireGraphAnalysisEClass_C);
		g1.getETypeArguments().add(g2);
		entireGraphAnalysisEClass.getEGenericSuperTypes().add(g1);
		packageAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		g1 = createEGenericType(this.getGraphAnalysis());
		g2 = createEGenericType(previousNodeGraphAnalysisEClass_C);
		g1.getETypeArguments().add(g2);
		previousNodeGraphAnalysisEClass.getEGenericSuperTypes().add(g1);
		variantEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisManagerEClass, AnalysisManager.class, "AnalysisManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAnalysisManager__Start__EList(), theResultsPackage.getAnalysisExecution(),
				"start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysis(), "a", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisManager__StoreResult__AnalysisExecution(), ecorePackage.getEBoolean(),
				"storeResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theResultsPackage.getAnalysisExecution(), "res", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisDefinitionEClass, AnalysisDefinition.class, "AnalysisDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisDefinition_ParameterDefinitions(), this.getParameterDefinition(), null,
				"parameterDefinitions", null, 0, -1, AnalysisDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDefinition_Analysis(), this.getAnalysis(), null, "analysis", null, 1, 1,
				AnalysisDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterDefinition_Parameters(), this.getParameter(),
				this.getParameter_ParameterDefinition(), "parameters", null, 0, -1, ParameterDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Unit(), theCorePackage.getUnitOfMeasurement(), "unit", "none", 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_MustBeDefinedOn(), ecorePackage.getEClass(), null, "mustBeDefinedOn",
				null, 0, -1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_CanBeDefinedOn(), ecorePackage.getEClass(), null, "canBeDefinedOn", null,
				0, -1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_ShallNotBeDefinedOn(), ecorePackage.getEClass(), null,
				"shallNotBeDefinedOn", null, 0, -1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_DefaultValue(), theCorePackage.getValueSpecification(), null,
				"defaultValue", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_ParameterDefinition(), this.getParameterDefinition(),
				this.getParameterDefinition_Parameters(), "parameterDefinition", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_AppliesOnlyOnVariants(), this.getVariant(), null, "appliesOnlyOnVariants", null, 0,
				-1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DoesNotApplyOnVariants(), this.getVariant(), null, "doesNotApplyOnVariants", null,
				0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_InitialValue(), theCorePackage.getValueSpecification(), null, "initialValue", null,
				0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_CurrentValue(), theCorePackage.getValueSpecification(), null, "currentValue", null,
				0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameter__IsValid(), ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterizableElementEClass, ParameterizableElement.class, "ParameterizableElement", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizableElement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				ParameterizableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisEClass, Analysis.class, "Analysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAnalysis__Exec(), null, "exec", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysis__Init(), ecorePackage.getEBoolean(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysis__PostExecution(), null, "postExecution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysis__Run(), ecorePackage.getEBoolean(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelAnalysisEClass, ModelAnalysis.class, "ModelAnalysis", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphAnalysisEClass, GraphAnalysis.class, "GraphAnalysis", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theGuavaPackage.getGraph());
		g2 = createEGenericType(graphAnalysisEClass_C);
		g1.getETypeArguments().add(g2);
		initEReference(getGraphAnalysis_Graph(), g1, null, "graph", null, 0, 1, GraphAnalysis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getGraphAnalysis__InitGraph(), null, "initGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraphAnalysis__Init(), ecorePackage.getEBoolean(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(memoryLessGraphAnalysisEClass, MemoryLessGraphAnalysis.class, "MemoryLessGraphAnalysis",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entireGraphAnalysisEClass, EntireGraphAnalysis.class, "EntireGraphAnalysis", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageAnalysisEClass, PackageAnalysis.class, "PackageAnalysis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(previousNodeGraphAnalysisEClass, PreviousNodeGraphAnalysis.class, "PreviousNodeGraphAnalysis",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkGeneratorEClass, NetworkGenerator.class, "NetworkGenerator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNetworkGenerator__GenerateNetwork__Model(), null, "generateNetwork", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, thee4smPackage.getModel(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGuavaPackage.getImmutableNetwork());
		g2 = createEGenericType(thee4smPackage.getComponent());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thee4smPackage.getConnector());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNetworkGenerator__GenerateNetwork__Package(), null, "generateNetwork", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, thee4smPackage.getPackage(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGuavaPackage.getImmutableNetwork());
		g2 = createEGenericType(thee4smPackage.getComponent());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thee4smPackage.getConnector());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //AnalysisPackageImpl
