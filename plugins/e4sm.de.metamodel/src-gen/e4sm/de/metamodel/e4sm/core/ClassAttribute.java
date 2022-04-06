/**
 */
package e4sm.de.metamodel.e4sm.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.ClassAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getClassAttribute()
 * @model
 * @generated
 */
public interface ClassAttribute extends AttributeSpecification {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeSpecification)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getClassAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeSpecification getType();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.ClassAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSpecification value);

} // ClassAttribute
