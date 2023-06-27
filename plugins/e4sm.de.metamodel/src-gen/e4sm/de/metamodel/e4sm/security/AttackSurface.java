/**
 */
package e4sm.de.metamodel.e4sm.security;

import e4sm.de.metamodel.e4sm.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.AttackSurface#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAttackSurface()
 * @model
 * @generated
 */
public interface AttackSurface extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAttackSurface_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.AttackSurface#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // AttackSurface
