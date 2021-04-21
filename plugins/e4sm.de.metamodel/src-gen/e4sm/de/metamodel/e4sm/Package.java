/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Package#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Package#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Package#getPhisicalComponents <em>Phisical Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Package#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Package#getSectors <em>Sectors</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Software Components</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.SoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Components</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage_SoftwareComponents()
	 * @model derived="true"
	 * @generated
	 */
	EList<SoftwareComponent> getSoftwareComponents();

	/**
	 * Returns the value of the '<em><b>Phisical Components</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phisical Components</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage_PhisicalComponents()
	 * @model derived="true"
	 * @generated
	 */
	EList<PhysicalComponent> getPhisicalComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Sectors</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Sector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectors</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPackage_Sectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSectors();

} // Package
