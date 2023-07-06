/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.security.KnownSecurityThreats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Threats Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.SecurityThreatsImport#getSecurityThreat <em>Security Threat</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSecurityThreatsImport()
 * @model
 * @generated
 */
public interface SecurityThreatsImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Threat</em>' reference.
	 * @see #setSecurityThreat(KnownSecurityThreats)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSecurityThreatsImport_SecurityThreat()
	 * @model required="true"
	 * @generated
	 */
	KnownSecurityThreats getSecurityThreat();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.SecurityThreatsImport#getSecurityThreat <em>Security Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Threat</em>' reference.
	 * @see #getSecurityThreat()
	 * @generated
	 */
	void setSecurityThreat(KnownSecurityThreats value);

} // SecurityThreatsImport
