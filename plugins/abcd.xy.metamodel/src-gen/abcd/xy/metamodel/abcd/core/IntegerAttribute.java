/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.IntegerAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getIntegerAttribute()
 * @model
 * @generated
 */
public interface IntegerAttribute extends AttributeSpecification {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getIntegerAttribute_DefaultValue()
	 * @model default="0"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.IntegerAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // IntegerAttribute
