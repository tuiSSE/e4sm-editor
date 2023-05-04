/**
 */
package e4sm.de.metamodel.e4sm.security;

import e4sm.de.metamodel.e4sm.Component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.AssetDefinition#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.AssetDefinition#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAssetDefinition()
 * @model
 * @generated
 */
public interface AssetDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAssetDefinition_SecurityGoals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGoal> getSecurityGoals();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAssetDefinition_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.AssetDefinition#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // AssetDefinition
