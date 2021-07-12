/**
 */
package e4sm.de.metamodel.e4sm.analysis.results.impl;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;

import e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl;

import e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution;
import e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult;
import e4sm.de.metamodel.e4sm.analysis.results.Data;
import e4sm.de.metamodel.e4sm.analysis.results.Diagram;
import e4sm.de.metamodel.e4sm.analysis.results.Plot;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsFactory;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;
import e4sm.de.metamodel.e4sm.analysis.results.ScalarValue;
import e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot;
import e4sm.de.metamodel.e4sm.analysis.results.TwoDimensionalPlot;

import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.impl.e4smPackageImpl;

import e4sm.de.metamodel.e4sm.core.CorePackage;

import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultsPackageImpl extends EPackageImpl implements ResultsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoDimensionalPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDimensionalPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisExecutionEClass = null;

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
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultsPackageImpl() {
		super(eNS_URI, ResultsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResultsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultsPackage init() {
		if (isInited)
			return (ResultsPackage) EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResultsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResultsPackageImpl theResultsPackage = registeredResultsPackage instanceof ResultsPackageImpl
				? (ResultsPackageImpl) registeredResultsPackage
				: new ResultsPackageImpl();

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

		// Create package meta-data objects
		theResultsPackage.createPackageContents();
		thee4smPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theResultsPackage.initializePackageContents();
		thee4smPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultsPackage.eNS_URI, theResultsPackage);
		return theResultsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisResult() {
		return analysisResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlot() {
		return plotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoDimensionalPlot() {
		return twoDimensionalPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwoDimensionalPlot_XLabel() {
		return (EAttribute) twoDimensionalPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwoDimensionalPlot_YLabel() {
		return (EAttribute) twoDimensionalPlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreeDimensionalPlot() {
		return threeDimensionalPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreeDimensionalPlot_ZLabel() {
		return (EAttribute) threeDimensionalPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalarValue() {
		return scalarValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalarValue_Value() {
		return (EAttribute) scalarValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisExecution() {
		return analysisExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisExecution_AnalysisResults() {
		return (EReference) analysisExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisExecution_Started() {
		return (EAttribute) analysisExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisExecution_Finished() {
		return (EAttribute) analysisExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisExecution_Analysis() {
		return (EReference) analysisExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisExecution_RunOnModel() {
		return (EReference) analysisExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsFactory getResultsFactory() {
		return (ResultsFactory) getEFactoryInstance();
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
		analysisResultEClass = createEClass(ANALYSIS_RESULT);

		diagramEClass = createEClass(DIAGRAM);

		plotEClass = createEClass(PLOT);

		twoDimensionalPlotEClass = createEClass(TWO_DIMENSIONAL_PLOT);
		createEAttribute(twoDimensionalPlotEClass, TWO_DIMENSIONAL_PLOT__XLABEL);
		createEAttribute(twoDimensionalPlotEClass, TWO_DIMENSIONAL_PLOT__YLABEL);

		threeDimensionalPlotEClass = createEClass(THREE_DIMENSIONAL_PLOT);
		createEAttribute(threeDimensionalPlotEClass, THREE_DIMENSIONAL_PLOT__ZLABEL);

		scalarValueEClass = createEClass(SCALAR_VALUE);
		createEAttribute(scalarValueEClass, SCALAR_VALUE__VALUE);

		dataEClass = createEClass(DATA);

		analysisExecutionEClass = createEClass(ANALYSIS_EXECUTION);
		createEReference(analysisExecutionEClass, ANALYSIS_EXECUTION__ANALYSIS_RESULTS);
		createEAttribute(analysisExecutionEClass, ANALYSIS_EXECUTION__STARTED);
		createEAttribute(analysisExecutionEClass, ANALYSIS_EXECUTION__FINISHED);
		createEReference(analysisExecutionEClass, ANALYSIS_EXECUTION__ANALYSIS);
		createEReference(analysisExecutionEClass, ANALYSIS_EXECUTION__RUN_ON_MODEL);
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
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		AnalysisPackage theAnalysisPackage = (AnalysisPackage) EPackage.Registry.INSTANCE
				.getEPackage(AnalysisPackage.eNS_URI);
		e4smPackage thee4smPackage = (e4smPackage) EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisResultEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		diagramEClass.getESuperTypes().add(this.getAnalysisResult());
		plotEClass.getESuperTypes().add(this.getDiagram());
		twoDimensionalPlotEClass.getESuperTypes().add(this.getPlot());
		threeDimensionalPlotEClass.getESuperTypes().add(this.getTwoDimensionalPlot());
		scalarValueEClass.getESuperTypes().add(this.getData());
		dataEClass.getESuperTypes().add(this.getAnalysisResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisResultEClass, AnalysisResult.class, "AnalysisResult", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plotEClass, Plot.class, "Plot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoDimensionalPlotEClass, TwoDimensionalPlot.class, "TwoDimensionalPlot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoDimensionalPlot_XLabel(), ecorePackage.getEString(), "xLabel", null, 0, 1,
				TwoDimensionalPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwoDimensionalPlot_YLabel(), ecorePackage.getEString(), "yLabel", null, 0, 1,
				TwoDimensionalPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(threeDimensionalPlotEClass, ThreeDimensionalPlot.class, "ThreeDimensionalPlot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreeDimensionalPlot_ZLabel(), ecorePackage.getEString(), "zLabel", null, 0, 1,
				ThreeDimensionalPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalarValueEClass, ScalarValue.class, "ScalarValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalarValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ScalarValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analysisExecutionEClass, AnalysisExecution.class, "AnalysisExecution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisExecution_AnalysisResults(), this.getAnalysisResult(), null, "analysisResults", null,
				0, -1, AnalysisExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisExecution_Started(), theCorePackage.getTimestamp(), "started", null, 0, 1,
				AnalysisExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisExecution_Finished(), theCorePackage.getTimestamp(), "finished", null, 0, 1,
				AnalysisExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisExecution_Analysis(), theAnalysisPackage.getAnalysis(), null, "analysis", null, 0, 1,
				AnalysisExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisExecution_RunOnModel(), thee4smPackage.getModel(), null, "runOnModel", null, 0, 1,
				AnalysisExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ResultsPackageImpl
