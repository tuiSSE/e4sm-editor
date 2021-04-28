/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the E4SM Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Model#getPackages <em>Packages</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Model#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of packages contained by this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<e4sm.de.metamodel.e4sm.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of actors contained by this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // Model
