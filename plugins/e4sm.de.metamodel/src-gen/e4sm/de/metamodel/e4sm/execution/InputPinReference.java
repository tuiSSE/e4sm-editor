/**
 */
package e4sm.de.metamodel.e4sm.execution;

import e4sm.de.metamodel.e4sm.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Pin Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.InputPinReference#getInputPin <em>Input Pin</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getInputPinReference()
 * @model
 * @generated
 */
public interface InputPinReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Input Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Pin</em>' reference.
	 * @see #setInputPin(InputPin)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getInputPinReference_InputPin()
	 * @model required="true"
	 * @generated
	 */
	InputPin getInputPin();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.InputPinReference#getInputPin <em>Input Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Pin</em>' reference.
	 * @see #getInputPin()
	 * @generated
	 */
	void setInputPin(InputPin value);

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

} // InputPinReference
