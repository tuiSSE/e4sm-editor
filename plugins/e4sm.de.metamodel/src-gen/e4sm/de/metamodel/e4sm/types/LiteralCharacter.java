/**
 */
package e4sm.de.metamodel.e4sm.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.types.LiteralCharacter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getLiteralCharacter()
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
	 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getLiteralCharacter_Value()
	 * @model dataType="e4sm.de.metamodel.e4sm.types.Character"
	 * @generated
	 */
	char getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.types.LiteralCharacter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(char value);

} // LiteralCharacter
