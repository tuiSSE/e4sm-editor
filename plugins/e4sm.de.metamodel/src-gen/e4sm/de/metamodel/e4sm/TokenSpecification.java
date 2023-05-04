/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.core.TypeSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.TokenSpecification#getInputSize <em>Input Size</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.TokenSpecification#getCollectSize <em>Collect Size</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.TokenSpecification#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getTokenSpecification()
 * @model
 * @generated
 */
public interface TokenSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Size</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.DataSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Size</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getTokenSpecification_InputSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSize> getInputSize();

	/**
	 * Returns the value of the '<em><b>Collect Size</b></em>' attribute.
	 * The default value is <code>"SUM"</code>.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.SizeComputation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collect Size</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.SizeComputation
	 * @see #setCollectSize(SizeComputation)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getTokenSpecification_CollectSize()
	 * @model default="SUM"
	 * @generated
	 */
	SizeComputation getCollectSize();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.TokenSpecification#getCollectSize <em>Collect Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collect Size</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.SizeComputation
	 * @see #getCollectSize()
	 * @generated
	 */
	void setCollectSize(SizeComputation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeSpecification)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getTokenSpecification_Type()
	 * @model
	 * @generated
	 */
	TypeSpecification getType();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.TokenSpecification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSpecification value);

} // TokenSpecification
