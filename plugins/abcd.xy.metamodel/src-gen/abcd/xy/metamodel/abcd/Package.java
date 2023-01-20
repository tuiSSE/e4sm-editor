/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.core.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package contains a set of Components and their connections.
 * Constraints:
 * - C1: all owned packages must have "specifiesComponent" set to a component owned by this package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getPhysicalComponents <em>Physical Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getSectors <em>Sectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getPackages <em>Packages</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getSpecifiesComponent <em>Specifies Component</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Package#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PackageC1'"
 * @generated
 */
public interface Package extends NamedElement, ParameterizableElement, DocumentableElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of components contained in this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Software Components</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.SoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subset of components only containing software components
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Components</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_SoftwareComponents()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<SoftwareComponent> getSoftwareComponents();

	/**
	 * Returns the value of the '<em><b>Physical Components</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subset of components only containing physical components
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Components</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_PhysicalComponents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PhysicalComponent> getPhysicalComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of connectors contained in this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Sectors</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Sector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of sectors contained in this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sectors</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_Sectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSectors();

	/**
	 * Returns the value of the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The main responsible for the realisation of this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Responsible</em>' reference.
	 * @see #setMainResponsible(Person)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_MainResponsible()
	 * @model
	 * @generated
	 */
	Person getMainResponsible();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Package#getMainResponsible <em>Main Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Responsible</em>' reference.
	 * @see #getMainResponsible()
	 * @generated
	 */
	void setMainResponsible(Person value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A package may contains subpackages, which specify one of the components owned by this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Specifies Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage <em>Specified In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This package is the detailed representation of another component (optional)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specifies Component</em>' reference.
	 * @see #setSpecifiesComponent(Component)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_SpecifiesComponent()
	 * @see abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage
	 * @model opposite="specifiedInPackage"
	 * @generated
	 */
	Component getSpecifiesComponent();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Package#getSpecifiesComponent <em>Specifies Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifies Component</em>' reference.
	 * @see #getSpecifiesComponent()
	 * @generated
	 */
	void setSpecifiesComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Datastores</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.DataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastores</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPackage_Datastores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStore> getDatastores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all components directly contained by this package, including those inside sectors.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Component> getAllComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getMaxFlow();

} // Package
