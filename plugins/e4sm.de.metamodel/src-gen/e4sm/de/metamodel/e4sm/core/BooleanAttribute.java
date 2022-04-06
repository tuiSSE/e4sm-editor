/**
 */
package e4sm.de.metamodel.e4sm.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.BooleanAttribute#isDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getBooleanAttribute()
 * @model
 * @generated
 */
public interface BooleanAttribute extends AttributeSpecification {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(boolean)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getBooleanAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	boolean isDefaultValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.BooleanAttribute#isDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isDefaultValue()
	 * @generated
	 */
	void setDefaultValue(boolean value);

} // BooleanAttribute
