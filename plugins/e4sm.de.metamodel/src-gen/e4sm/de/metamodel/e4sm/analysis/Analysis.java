/**
 */
package e4sm.de.metamodel.e4sm.analysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getAnalysis()
 * @model abstract="true"
 * @generated
 */
public interface Analysis extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exec();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postExecution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean run();

} // Analysis
