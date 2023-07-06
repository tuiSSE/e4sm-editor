/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Known Security Threats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCves <em>Cves</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getKnownSecurityThreats()
 * @model
 * @generated
 */
public interface KnownSecurityThreats extends EObject {
	/**
	 * Returns the value of the '<em><b>Cves</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.CVE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cves</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getKnownSecurityThreats_Cves()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVE> getCves();

	/**
	 * Returns the value of the '<em><b>Cwes</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.CWE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwes</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getKnownSecurityThreats_Cwes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CWE> getCwes();

} // KnownSecurityThreats
