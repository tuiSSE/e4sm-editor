/**
 */
package abcd.xy.metamodel.abcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.Import#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Model</em>' reference.
	 * @see #setReferencedModel(Model)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getImport_ReferencedModel()
	 * @model required="true"
	 * @generated
	 */
	Model getReferencedModel();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Import#getReferencedModel <em>Referenced Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Model</em>' reference.
	 * @see #getReferencedModel()
	 * @generated
	 */
	void setReferencedModel(Model value);

} // Import
