/**
 */
package e4sm.de.metamodel.e4sm.core;

import e4sm.de.metamodel.e4sm.execution.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.LiteralInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralInteger()
 * @model
 * @generated
 */
public interface LiteralInteger extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralInteger_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.LiteralInteger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Expression getTangibleChild();

} // LiteralInteger
