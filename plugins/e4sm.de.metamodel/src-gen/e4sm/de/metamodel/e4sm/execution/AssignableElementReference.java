/**
 */
package e4sm.de.metamodel.e4sm.execution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.AssignableElementReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAssignableElementReference()
 * @model
 * @generated
 */
public interface AssignableElementReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(AssignableElement)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAssignableElementReference_Ref()
	 * @model required="true"
	 * @generated
	 */
	AssignableElement getRef();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.AssignableElementReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(AssignableElement value);

} // AssignableElementReference
