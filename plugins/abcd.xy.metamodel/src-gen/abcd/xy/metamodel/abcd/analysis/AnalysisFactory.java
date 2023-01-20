/**
 */
package abcd.xy.metamodel.abcd.analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisFactory eINSTANCE = abcd.xy.metamodel.abcd.analysis.impl.AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	AnalysisManager createAnalysisManager();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	AnalysisDefinition createAnalysisDefinition();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Memory Less Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Less Graph Analysis</em>'.
	 * @generated
	 */
	<C> MemoryLessGraphAnalysis<C> createMemoryLessGraphAnalysis();

	/**
	 * Returns a new object of class '<em>Entire Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entire Graph Analysis</em>'.
	 * @generated
	 */
	<C> EntireGraphAnalysis<C> createEntireGraphAnalysis();

	/**
	 * Returns a new object of class '<em>Package Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Analysis</em>'.
	 * @generated
	 */
	PackageAnalysis createPackageAnalysis();

	/**
	 * Returns a new object of class '<em>Previous Node Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previous Node Graph Analysis</em>'.
	 * @generated
	 */
	<C> PreviousNodeGraphAnalysis<C> createPreviousNodeGraphAnalysis();

	/**
	 * Returns a new object of class '<em>Network Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Generator</em>'.
	 * @generated
	 */
	NetworkGenerator createNetworkGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
