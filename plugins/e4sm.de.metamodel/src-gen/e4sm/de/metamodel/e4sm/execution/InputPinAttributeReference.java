/**
 */
package e4sm.de.metamodel.e4sm.execution;

import e4sm.de.metamodel.e4sm.core.AttributeSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Pin Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.InputPinAttributeReference#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getInputPinAttributeReference()
 * @model
 * @generated
 */
public interface InputPinAttributeReference extends InputPinReference {

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeSpecification)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getInputPinAttributeReference_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AttributeSpecification getAttribute();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.InputPinAttributeReference#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExecutionElement getActualParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Expression getTangibleChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();
} // InputPinAttributeReference
