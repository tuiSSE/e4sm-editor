/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.analysis.Variant;
import e4sm.de.metamodel.e4sm.types.NamedElement;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Model#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement, ParameterizableElement {
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

	/**
	 * Returns the value of the '<em><b>Persons Pictures Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A workspace path pointing to a folder containing person's pictures. It must start and and with a /. Example: /My Model/img/
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persons Pictures Path</em>' attribute.
	 * @see #setPersonsPicturesPath(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel_PersonsPicturesPath()
	 * @model
	 * @generated
	 */
	String getPersonsPicturesPath();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persons Pictures Path</em>' attribute.
	 * @see #getPersonsPicturesPath()
	 * @generated
	 */
	void setPersonsPicturesPath(String value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.analysis.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getModel_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variant> getVariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isPersonPicturePathValid(DiagnosticChain diagnostics, Map context);

} // Model
