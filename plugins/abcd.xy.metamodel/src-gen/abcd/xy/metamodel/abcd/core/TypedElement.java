/**
 */
package abcd.xy.metamodel.abcd.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeSpecification)
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	TypeSpecification getType();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.core.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSpecification value);

} // TypedElement
