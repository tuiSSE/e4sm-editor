/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralDouble()
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
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralDouble_Value()
	 * @model default="0.0" dataType="abcd.xy.metamodel.abcd.core.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralDouble#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralDouble
