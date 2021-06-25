/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Short</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.LiteralShort#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getLiteralShort()
 * @model
 * @generated
 */
public interface LiteralShort extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getLiteralShort_Value()
	 * @model default="0" dataType="e4sm.de.metamodel.e4sm.types.Short"
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.LiteralShort#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // LiteralShort
