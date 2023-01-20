/**
 */
package abcd.xy.metamodel.abcd.analysis;

import abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getAnalysisManager()
 * @model
 * @generated
 */
public interface AnalysisManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model aMany="true"
	 * @generated
	 */
	AnalysisExecution start(EList<Analysis> a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean storeResult(AnalysisExecution res);

} // AnalysisManager
