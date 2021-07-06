/**
 */
package e4sm.de.metamodel.e4sm.analysis;

import e4sm.de.metamodel.e4sm.types.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getAnalysisDefinition()
 * @model
 * @generated
 */
public interface AnalysisDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definitions</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getAnalysisDefinition_ParameterDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDefinition> getParameterDefinitions();

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference.
	 * @see #setAnalysis(Analysis)
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getAnalysisDefinition_Analysis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getAnalysis <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' containment reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(Analysis value);

} // AnalysisDefinition
