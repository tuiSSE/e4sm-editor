/**
 */
package abcd.xy.metamodel.abcd.analysis;

import abcd.xy.metamodel.abcd.core.Element;
import abcd.xy.metamodel.abcd.core.ValueSpecification;
import abcd.xy.metamodel.abcd.core.Variant;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.Parameter#getParameterDefinition <em>Parameter Definition</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.Parameter#getAppliesOnlyOnVariants <em>Applies Only On Variants</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.Parameter#getDoesNotApplyOnVariants <em>Does Not Apply On Variants</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.Parameter#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.Parameter#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Element {
	/**
	 * Returns the value of the '<em><b>Parameter Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link abcd.xy.metamodel.abcd.analysis.ParameterDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definition</em>' reference.
	 * @see #setParameterDefinition(ParameterDefinition)
	 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter_ParameterDefinition()
	 * @see abcd.xy.metamodel.abcd.analysis.ParameterDefinition#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	ParameterDefinition getParameterDefinition();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.Parameter#getParameterDefinition <em>Parameter Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Definition</em>' reference.
	 * @see #getParameterDefinition()
	 * @generated
	 */
	void setParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Applies Only On Variants</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.core.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Only On Variants</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter_AppliesOnlyOnVariants()
	 * @model
	 * @generated
	 */
	EList<Variant> getAppliesOnlyOnVariants();

	/**
	 * Returns the value of the '<em><b>Does Not Apply On Variants</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.core.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Does Not Apply On Variants</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter_DoesNotApplyOnVariants()
	 * @model
	 * @generated
	 */
	EList<Variant> getDoesNotApplyOnVariants();

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(ValueSpecification)
	 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getInitialValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.Parameter#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(ValueSpecification)
	 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getParameter_CurrentValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getCurrentValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.Parameter#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

} // Parameter
