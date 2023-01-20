/**
 */
package abcd.xy.metamodel.abcd.analysis.results.impl;

import abcd.xy.metamodel.abcd.analysis.results.*;

import org.eclipse.emf.ecore.EClass;
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
public class ResultsFactoryImpl extends EFactoryImpl implements ResultsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultsFactory init() {
		try {
			ResultsFactory theResultsFactory = (ResultsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ResultsPackage.eNS_URI);
			if (theResultsFactory != null) {
				return theResultsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsFactoryImpl() {
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
		case ResultsPackage.TWO_DIMENSIONAL_PLOT:
			return createTwoDimensionalPlot();
		case ResultsPackage.THREE_DIMENSIONAL_PLOT:
			return createThreeDimensionalPlot();
		case ResultsPackage.SCALAR_VALUE:
			return createScalarValue();
		case ResultsPackage.ANALYSIS_EXECUTION:
			return createAnalysisExecution();
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
	public TwoDimensionalPlot createTwoDimensionalPlot() {
		TwoDimensionalPlotImpl twoDimensionalPlot = new TwoDimensionalPlotImpl();
		return twoDimensionalPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreeDimensionalPlot createThreeDimensionalPlot() {
		ThreeDimensionalPlotImpl threeDimensionalPlot = new ThreeDimensionalPlotImpl();
		return threeDimensionalPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarValue createScalarValue() {
		ScalarValueImpl scalarValue = new ScalarValueImpl();
		return scalarValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisExecution createAnalysisExecution() {
		AnalysisExecutionImpl analysisExecution = new AnalysisExecutionImpl();
		return analysisExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsPackage getResultsPackage() {
		return (ResultsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultsPackage getPackage() {
		return ResultsPackage.eINSTANCE;
	}

} //ResultsFactoryImpl
