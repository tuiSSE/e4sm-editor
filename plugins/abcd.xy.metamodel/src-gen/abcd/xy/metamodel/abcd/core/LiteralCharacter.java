/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralCharacter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralCharacter()
 * @model
 * @generated
 */
public interface LiteralCharacter extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(char)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralCharacter_Value()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Character"
	 * @generated
	 */
	char getValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralCharacter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(char value);

} // LiteralCharacter
