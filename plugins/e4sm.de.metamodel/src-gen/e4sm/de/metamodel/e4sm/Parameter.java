/**
 */
package e4sm.de.metamodel.e4sm;

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
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition <em>Parameter Definition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getAppliesOnlyOnVariants <em>Applies Only On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getDoesNotApplyOnVariants <em>Does Not Apply On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_Value()
	 * @model unique="false" transient="true" volatile="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(ValueSpecification)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getInitialValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Parameter Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definition</em>' reference.
	 * @see #setParameterDefinition(ParameterDefinition)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_ParameterDefinition()
	 * @see e4sm.de.metamodel.e4sm.ParameterDefinition#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	ParameterDefinition getParameterDefinition();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition <em>Parameter Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Definition</em>' reference.
	 * @see #getParameterDefinition()
	 * @generated
	 */
	void setParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Applies Only On Variants</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Only On Variants</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_AppliesOnlyOnVariants()
	 * @model
	 * @generated
	 */
	EList<Variant> getAppliesOnlyOnVariants();

	/**
	 * Returns the value of the '<em><b>Does Not Apply On Variants</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Does Not Apply On Variants</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_DoesNotApplyOnVariants()
	 * @model
	 * @generated
	 */
	EList<Variant> getDoesNotApplyOnVariants();

} // Parameter
