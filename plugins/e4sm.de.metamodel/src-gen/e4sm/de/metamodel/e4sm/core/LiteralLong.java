/**
 */
package e4sm.de.metamodel.e4sm.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.LiteralLong#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralLong()
 * @model
 * @generated
 */
public interface LiteralLong extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralLong_Value()
	 * @model default="0" dataType="e4sm.de.metamodel.e4sm.core.Long"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.LiteralLong#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // LiteralLong