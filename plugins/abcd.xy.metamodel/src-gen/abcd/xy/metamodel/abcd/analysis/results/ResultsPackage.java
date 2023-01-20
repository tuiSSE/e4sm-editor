/**
 */
package abcd.xy.metamodel.abcd.analysis.results;

import abcd.xy.metamodel.abcd.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/edapt historyURI='abcd.history'"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "results";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/abcd/analysis/results/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "results";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisResultImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getAnalysisResult()
	 * @generated
	 */
	int ANALYSIS_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.DiagramImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = ANALYSIS_RESULT__NAME;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = ANALYSIS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = ANALYSIS_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.PlotImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__NAME = DIAGRAM__NAME;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl <em>Two Dimensional Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getTwoDimensionalPlot()
	 * @generated
	 */
	int TWO_DIMENSIONAL_PLOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DIMENSIONAL_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DIMENSIONAL_PLOT__XLABEL = PLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DIMENSIONAL_PLOT__YLABEL = PLOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Two Dimensional Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DIMENSIONAL_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Two Dimensional Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DIMENSIONAL_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.ThreeDimensionalPlotImpl <em>Three Dimensional Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ThreeDimensionalPlotImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getThreeDimensionalPlot()
	 * @generated
	 */
	int THREE_DIMENSIONAL_PLOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT__NAME = TWO_DIMENSIONAL_PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT__XLABEL = TWO_DIMENSIONAL_PLOT__XLABEL;

	/**
	 * The feature id for the '<em><b>YLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT__YLABEL = TWO_DIMENSIONAL_PLOT__YLABEL;

	/**
	 * The feature id for the '<em><b>ZLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT__ZLABEL = TWO_DIMENSIONAL_PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Three Dimensional Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT_FEATURE_COUNT = TWO_DIMENSIONAL_PLOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Three Dimensional Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DIMENSIONAL_PLOT_OPERATION_COUNT = TWO_DIMENSIONAL_PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.DataImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ANALYSIS_RESULT__NAME;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ANALYSIS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ANALYSIS_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.ScalarValueImpl <em>Scalar Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ScalarValueImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getScalarValue()
	 * @generated
	 */
	int SCALAR_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scalar Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalar Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisExecutionImpl <em>Analysis Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisExecutionImpl
	 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getAnalysisExecution()
	 * @generated
	 */
	int ANALYSIS_EXECUTION = 7;

	/**
	 * The feature id for the '<em><b>Analysis Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION__ANALYSIS_RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION__STARTED = 1;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION__FINISHED = 2;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION__ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Run On Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION__RUN_ON_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Analysis Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Analysis Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_EXECUTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisResult
	 * @generated
	 */
	EClass getAnalysisResult();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot <em>Two Dimensional Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Dimensional Plot</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot
	 * @generated
	 */
	EClass getTwoDimensionalPlot();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot#getXLabel <em>XLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XLabel</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot#getXLabel()
	 * @see #getTwoDimensionalPlot()
	 * @generated
	 */
	EAttribute getTwoDimensionalPlot_XLabel();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot#getYLabel <em>YLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YLabel</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot#getYLabel()
	 * @see #getTwoDimensionalPlot()
	 * @generated
	 */
	EAttribute getTwoDimensionalPlot_YLabel();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.ThreeDimensionalPlot <em>Three Dimensional Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Three Dimensional Plot</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.ThreeDimensionalPlot
	 * @generated
	 */
	EClass getThreeDimensionalPlot();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.ThreeDimensionalPlot#getZLabel <em>ZLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZLabel</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.ThreeDimensionalPlot#getZLabel()
	 * @see #getThreeDimensionalPlot()
	 * @generated
	 */
	EAttribute getThreeDimensionalPlot_ZLabel();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.ScalarValue <em>Scalar Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Value</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.ScalarValue
	 * @generated
	 */
	EClass getScalarValue();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.ScalarValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.ScalarValue#getValue()
	 * @see #getScalarValue()
	 * @generated
	 */
	EAttribute getScalarValue_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution <em>Analysis Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Execution</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution
	 * @generated
	 */
	EClass getAnalysisExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysisResults <em>Analysis Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis Results</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysisResults()
	 * @see #getAnalysisExecution()
	 * @generated
	 */
	EReference getAnalysisExecution_AnalysisResults();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getStarted()
	 * @see #getAnalysisExecution()
	 * @generated
	 */
	EAttribute getAnalysisExecution_Started();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getFinished()
	 * @see #getAnalysisExecution()
	 * @generated
	 */
	EAttribute getAnalysisExecution_Finished();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysis()
	 * @see #getAnalysisExecution()
	 * @generated
	 */
	EReference getAnalysisExecution_Analysis();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getRunOnModel <em>Run On Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Run On Model</em>'.
	 * @see abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getRunOnModel()
	 * @see #getAnalysisExecution()
	 * @generated
	 */
	EReference getAnalysisExecution_RunOnModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisResultImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getAnalysisResult()
		 * @generated
		 */
		EClass ANALYSIS_RESULT = eINSTANCE.getAnalysisResult();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.DiagramImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.PlotImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl <em>Two Dimensional Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getTwoDimensionalPlot()
		 * @generated
		 */
		EClass TWO_DIMENSIONAL_PLOT = eINSTANCE.getTwoDimensionalPlot();

		/**
		 * The meta object literal for the '<em><b>XLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_DIMENSIONAL_PLOT__XLABEL = eINSTANCE.getTwoDimensionalPlot_XLabel();

		/**
		 * The meta object literal for the '<em><b>YLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_DIMENSIONAL_PLOT__YLABEL = eINSTANCE.getTwoDimensionalPlot_YLabel();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.ThreeDimensionalPlotImpl <em>Three Dimensional Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ThreeDimensionalPlotImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getThreeDimensionalPlot()
		 * @generated
		 */
		EClass THREE_DIMENSIONAL_PLOT = eINSTANCE.getThreeDimensionalPlot();

		/**
		 * The meta object literal for the '<em><b>ZLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREE_DIMENSIONAL_PLOT__ZLABEL = eINSTANCE.getThreeDimensionalPlot_ZLabel();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.ScalarValueImpl <em>Scalar Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ScalarValueImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getScalarValue()
		 * @generated
		 */
		EClass SCALAR_VALUE = eINSTANCE.getScalarValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALAR_VALUE__VALUE = eINSTANCE.getScalarValue_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.DataImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisExecutionImpl <em>Analysis Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.AnalysisExecutionImpl
		 * @see abcd.xy.metamodel.abcd.analysis.results.impl.ResultsPackageImpl#getAnalysisExecution()
		 * @generated
		 */
		EClass ANALYSIS_EXECUTION = eINSTANCE.getAnalysisExecution();

		/**
		 * The meta object literal for the '<em><b>Analysis Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_EXECUTION__ANALYSIS_RESULTS = eINSTANCE.getAnalysisExecution_AnalysisResults();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_EXECUTION__STARTED = eINSTANCE.getAnalysisExecution_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_EXECUTION__FINISHED = eINSTANCE.getAnalysisExecution_Finished();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_EXECUTION__ANALYSIS = eINSTANCE.getAnalysisExecution_Analysis();

		/**
		 * The meta object literal for the '<em><b>Run On Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_EXECUTION__RUN_ON_MODEL = eINSTANCE.getAnalysisExecution_RunOnModel();

	}

} //ResultsPackage
