/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getThreatCondition()
 * @model
 * @generated
 */
public interface ThreatCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' reference.
	 * @see #setSecurityGoals(SecurityGoal)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getThreatCondition_SecurityGoals()
	 * @model
	 * @generated
	 */
	SecurityGoal getSecurityGoals();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getSecurityGoals <em>Security Goals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Goals</em>' reference.
	 * @see #getSecurityGoals()
	 * @generated
	 */
	void setSecurityGoals(SecurityGoal value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getThreatCondition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ThreatCondition
