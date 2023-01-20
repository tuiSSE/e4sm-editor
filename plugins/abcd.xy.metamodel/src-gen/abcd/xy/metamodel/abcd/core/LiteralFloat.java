/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.LiteralFloat#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralFloat()
 * @model
 * @generated
 */
public interface LiteralFloat extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getLiteralFloat_Value()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Float"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.LiteralFloat#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // LiteralFloat
