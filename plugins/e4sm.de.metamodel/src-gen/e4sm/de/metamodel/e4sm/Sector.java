/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of physical components that either logically or phisically belongs together
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Sector#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Sector#getSectors <em>Sectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Sector#getContainedBy <em>Contained By</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSector()
 * @model
 * @generated
 */
public interface Sector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references to components which are contained in this sector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSector_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Sectors</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Sector}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Sector#getContainedBy <em>Contained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectors</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSector_Sectors()
	 * @see e4sm.de.metamodel.e4sm.Sector#getContainedBy
	 * @model opposite="containedBy" containment="true"
	 * @generated
	 */
	EList<Sector> getSectors();

	/**
	 * Returns the value of the '<em><b>Contained By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Sector#getSectors <em>Sectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained By</em>' container reference.
	 * @see #setContainedBy(Sector)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSector_ContainedBy()
	 * @see e4sm.de.metamodel.e4sm.Sector#getSectors
	 * @model opposite="sectors" transient="false"
	 * @generated
	 */
	Sector getContainedBy();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Sector#getContainedBy <em>Contained By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained By</em>' container reference.
	 * @see #getContainedBy()
	 * @generated
	 */
	void setContainedBy(Sector value);

} // Sector
