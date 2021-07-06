/**
 */
package e4sm.de.metamodel.e4sm.analysis.results;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage
 * @generated
 */
public interface ResultsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsFactory eINSTANCE = e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Two Dimensional Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two Dimensional Plot</em>'.
	 * @generated
	 */
	TwoDimensionalPlot createTwoDimensionalPlot();

	/**
	 * Returns a new object of class '<em>Three Dimensional Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Three Dimensional Plot</em>'.
	 * @generated
	 */
	ThreeDimensionalPlot createThreeDimensionalPlot();

	/**
	 * Returns a new object of class '<em>Scalar Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Value</em>'.
	 * @generated
	 */
	ScalarValue createScalarValue();

	/**
	 * Returns a new object of class '<em>Analysis Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Execution</em>'.
	 * @generated
	 */
	AnalysisExecution createAnalysisExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultsPackage getResultsPackage();

} //ResultsFactory
