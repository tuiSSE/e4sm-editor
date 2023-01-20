/**
 */
package abcd.xy.metamodel.abcd.core;

import abcd.xy.metamodel.abcd.execution.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralInteger()
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
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralInteger_Value()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Integer"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralInteger#getValue <em>Value</em>}' attribute.
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
