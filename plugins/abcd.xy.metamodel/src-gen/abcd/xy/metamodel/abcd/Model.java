/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.core.TypeSpecification;
import abcd.xy.metamodel.abcd.core.Variant;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the ABCD Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getPackages <em>Packages</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getActors <em>Actors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getVariants <em>Variants</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Model#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement, ParameterizableElement, DocumentableElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of packages contained by this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<abcd.xy.metamodel.abcd.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of actors contained by this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_Actors()
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
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_PersonsPicturesPath()
	 * @model
	 * @generated
	 */
	String getPersonsPicturesPath();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Model#getPersonsPicturesPath <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persons Pictures Path</em>' attribute.
	 * @see #getPersonsPicturesPath()
	 * @generated
	 */
	void setPersonsPicturesPath(String value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.core.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variant> getVariants();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.core.TypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSpecification> getTypes();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isPersonPicturePathValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Model
