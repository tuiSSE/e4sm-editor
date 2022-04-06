/**
 */
package e4sm.de.metamodel.e4sm.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.AttributeSpecification#isArray <em>Array</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getAttributeSpecification()
 * @model abstract="true"
 * @generated
 */
public interface AttributeSpecification extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getAttributeSpecification_Array()
	 * @model default="false"
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.AttributeSpecification#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);
} // AttributeSpecification
