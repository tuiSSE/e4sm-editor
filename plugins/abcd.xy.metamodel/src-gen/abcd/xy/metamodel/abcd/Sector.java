/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.core.NamedElement;
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
 *   <li>{@link abcd.xy.metamodel.abcd.Sector#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Sector#getSectors <em>Sectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Sector#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getSector()
 * @model
 * @generated
 */
public interface Sector extends NamedElement, DocumentableElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references to components which are contained in this sector. Only Physical Components should be allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getSector_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Sectors</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Sector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of sectors contained by this sector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sectors</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getSector_Sectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSectors();

	/**
	 * Returns the value of the '<em><b>Datastores</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.DataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastores</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getSector_Datastores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStore> getDatastores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all components contained by this sector, even if wrapped by other sectors
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Component> getAllComponents();

} // Sector
