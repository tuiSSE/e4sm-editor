/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Byte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralByte#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralByte()
 * @model
 * @generated
 */
public interface LiteralByte extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralByte_Value()
	 * @model default="0" dataType="abcd.xy.metamodel.abcd.core.Byte"
	 * @generated
	 */
	byte getValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralByte#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte value);

} // LiteralByte
