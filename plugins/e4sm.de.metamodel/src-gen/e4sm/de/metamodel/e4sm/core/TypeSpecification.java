/**
 */
package e4sm.de.metamodel.e4sm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.TypeSpecification#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.TypeSpecification#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.TypeSpecification#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getTypeSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeSpecificationC1'"
 * @generated
 */
public interface TypeSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.core.AttributeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getTypeSpecification_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeSpecification> getAttributes();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(TypeSpecification)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getTypeSpecification_SuperType()
	 * @model
	 * @generated
	 */
	TypeSpecification getSuperType();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.TypeSpecification#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(TypeSpecification value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getTypeSpecification_Abstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.TypeSpecification#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

} // TypeSpecification
