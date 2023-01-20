/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.StringAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getStringAttribute()
 * @model
 * @generated
 */
public interface StringAttribute extends AttributeSpecification {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getStringAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.StringAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // StringAttribute
