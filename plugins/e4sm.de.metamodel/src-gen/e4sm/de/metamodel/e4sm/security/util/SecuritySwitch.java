/**
 */
package e4sm.de.metamodel.e4sm.security.util;

import e4sm.de.metamodel.e4sm.security.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage
 * @generated
 */
public class SecuritySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SecurityPackage.ASSET_DEFINITION: {
			AssetDefinition assetDefinition = (AssetDefinition) theEObject;
			T result = caseAssetDefinition(assetDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.SECURITY_GOAL: {
			SecurityGoal securityGoal = (SecurityGoal) theEObject;
			T result = caseSecurityGoal(securityGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.CONFIDENTIALITY: {
			Confidentiality confidentiality = (Confidentiality) theEObject;
			T result = caseConfidentiality(confidentiality);
			if (result == null)
				result = caseSecurityGoal(confidentiality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.INTEGRITY: {
			Integrity integrity = (Integrity) theEObject;
			T result = caseIntegrity(integrity);
			if (result == null)
				result = caseSecurityGoal(integrity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.AVAILABILITY: {
			Availability availability = (Availability) theEObject;
			T result = caseAvailability(availability);
			if (result == null)
				result = caseSecurityGoal(availability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.CVE: {
			CVE cve = (CVE) theEObject;
			T result = caseCVE(cve);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.CWE: {
			CWE cwe = (CWE) theEObject;
			T result = caseCWE(cwe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.THREAT_CONDITION: {
			ThreatCondition threatCondition = (ThreatCondition) theEObject;
			T result = caseThreatCondition(threatCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.SECURITY_SPECIFICATION: {
			SecuritySpecification securitySpecification = (SecuritySpecification) theEObject;
			T result = caseSecuritySpecification(securitySpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecurityPackage.KNOWN_SECURITY_THREATS: {
			KnownSecurityThreats knownSecurityThreats = (KnownSecurityThreats) theEObject;
			T result = caseKnownSecurityThreats(knownSecurityThreats);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetDefinition(AssetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGoal(SecurityGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidentiality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidentiality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidentiality(Confidentiality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrity(Integrity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailability(Availability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVE(CVE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCWE(CWE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatCondition(ThreatCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritySpecification(SecuritySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Known Security Threats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Known Security Threats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnownSecurityThreats(KnownSecurityThreats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecuritySwitch
