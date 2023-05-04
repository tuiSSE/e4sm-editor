/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = e4sm.de.metamodel.e4sm.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Asset Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Definition</em>'.
	 * @generated
	 */
	AssetDefinition createAssetDefinition();

	/**
	 * Returns a new object of class '<em>Confidentiality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidentiality</em>'.
	 * @generated
	 */
	Confidentiality createConfidentiality();

	/**
	 * Returns a new object of class '<em>Integrity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrity</em>'.
	 * @generated
	 */
	Integrity createIntegrity();

	/**
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns a new object of class '<em>CVE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVE</em>'.
	 * @generated
	 */
	CVE createCVE();

	/**
	 * Returns a new object of class '<em>CWE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWE</em>'.
	 * @generated
	 */
	CWE createCWE();

	/**
	 * Returns a new object of class '<em>Threat Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Condition</em>'.
	 * @generated
	 */
	ThreatCondition createThreatCondition();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	SecuritySpecification createSecuritySpecification();

	/**
	 * Returns a new object of class '<em>Known Security Threats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Known Security Threats</em>'.
	 * @generated
	 */
	KnownSecurityThreats createKnownSecurityThreats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
