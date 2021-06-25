/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.LiteralDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getLiteralDouble()
 * @model
 * @generated
 */
public interface LiteralDouble extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getLiteralDouble_Value()
	 * @model default="0.0" dataType="e4sm.de.metamodel.e4sm.types.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.LiteralDouble#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralDouble
