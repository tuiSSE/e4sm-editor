/**
 */
package e4sm.de.metamodel.e4sm.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.types.LiteralString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getLiteralString()
 * @model
 * @generated
 */
public interface LiteralString extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getLiteralString_Value()
	 * @model dataType="e4sm.de.metamodel.e4sm.types.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.types.LiteralString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LiteralString
