/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralBoolean#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralBoolean()
 * @model
 * @generated
 */
public interface LiteralBoolean extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralBoolean_Value()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Boolean"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralBoolean#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="abcd.xy.metamodel.abcd.core.Boolean"
	 * @generated
	 */
	boolean getValue();

} // LiteralBoolean
