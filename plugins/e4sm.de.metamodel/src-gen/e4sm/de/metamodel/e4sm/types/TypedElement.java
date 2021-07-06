/**
 */
package e4sm.de.metamodel.e4sm.types;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.types.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDataType)
	 * @see e4sm.de.metamodel.e4sm.types.TypesPackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.types.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

} // TypedElement
