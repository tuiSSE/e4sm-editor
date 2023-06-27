/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.security.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SecurityFactory init() {
		try {
			SecurityFactory theSecurityFactory = (SecurityFactory) EPackage.Registry.INSTANCE
					.getEFactory(SecurityPackage.eNS_URI);
			if (theSecurityFactory != null) {
				return theSecurityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public SecurityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SecurityPackage.ASSET_DEFINITION:
			return createAssetDefinition();
		case SecurityPackage.CONFIDENTIALITY:
			return createConfidentiality();
		case SecurityPackage.INTEGRITY:
			return createIntegrity();
		case SecurityPackage.AVAILABILITY:
			return createAvailability();
		case SecurityPackage.CVE:
			return createCVE();
		case SecurityPackage.CWE:
			return createCWE();
		case SecurityPackage.THREAT_CONDITION:
			return createThreatCondition();
		case SecurityPackage.SECURITY_SPECIFICATION:
			return createSecuritySpecification();
		case SecurityPackage.KNOWN_SECURITY_THREATS:
			return createKnownSecurityThreats();
		case SecurityPackage.ATTACK_SURFACE:
			return createAttackSurface();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SecurityPackage.SEVERITY_LEVEL:
			return createSeverityLevelFromString(eDataType, initialValue);
		case SecurityPackage.IMPACT_LEVEL:
			return createImpactLevelFromString(eDataType, initialValue);
		case SecurityPackage.ATTACK_VECTOR:
			return createAttackVectorFromString(eDataType, initialValue);
		case SecurityPackage.ATTACK_COMPLEXITY:
			return createAttackComplexityFromString(eDataType, initialValue);
		case SecurityPackage.USER_INTERACTION:
			return createUserInteractionFromString(eDataType, initialValue);
		case SecurityPackage.PRIVILEGES_REQUIRED:
			return createPrivilegesRequiredFromString(eDataType, initialValue);
		case SecurityPackage.CONFIDENTIALITY_IMPACT:
			return createConfidentialityImpactFromString(eDataType, initialValue);
		case SecurityPackage.STATE:
			return createStateFromString(eDataType, initialValue);
		case SecurityPackage.CVE_ID:
			return createCVE_IDFromString(eDataType, initialValue);
		case SecurityPackage.CWE_ID:
			return createCWE_IDFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SecurityPackage.SEVERITY_LEVEL:
			return convertSeverityLevelToString(eDataType, instanceValue);
		case SecurityPackage.IMPACT_LEVEL:
			return convertImpactLevelToString(eDataType, instanceValue);
		case SecurityPackage.ATTACK_VECTOR:
			return convertAttackVectorToString(eDataType, instanceValue);
		case SecurityPackage.ATTACK_COMPLEXITY:
			return convertAttackComplexityToString(eDataType, instanceValue);
		case SecurityPackage.USER_INTERACTION:
			return convertUserInteractionToString(eDataType, instanceValue);
		case SecurityPackage.PRIVILEGES_REQUIRED:
			return convertPrivilegesRequiredToString(eDataType, instanceValue);
		case SecurityPackage.CONFIDENTIALITY_IMPACT:
			return convertConfidentialityImpactToString(eDataType, instanceValue);
		case SecurityPackage.STATE:
			return convertStateToString(eDataType, instanceValue);
		case SecurityPackage.CVE_ID:
			return convertCVE_IDToString(eDataType, instanceValue);
		case SecurityPackage.CWE_ID:
			return convertCWE_IDToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetDefinition createAssetDefinition() {
		AssetDefinitionImpl assetDefinition = new AssetDefinitionImpl();
		return assetDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Confidentiality createConfidentiality() {
		ConfidentialityImpl confidentiality = new ConfidentialityImpl();
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integrity createIntegrity() {
		IntegrityImpl integrity = new IntegrityImpl();
		return integrity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CVE createCVE() {
		CVEImpl cve = new CVEImpl();
		return cve;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CWE createCWE() {
		CWEImpl cwe = new CWEImpl();
		return cwe;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatCondition createThreatCondition() {
		ThreatConditionImpl threatCondition = new ThreatConditionImpl();
		return threatCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuritySpecification createSecuritySpecification() {
		SecuritySpecificationImpl securitySpecification = new SecuritySpecificationImpl();
		return securitySpecification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnownSecurityThreats createKnownSecurityThreats() {
		KnownSecurityThreatsImpl knownSecurityThreats = new KnownSecurityThreatsImpl();
		return knownSecurityThreats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackSurface createAttackSurface() {
		AttackSurfaceImpl attackSurface = new AttackSurfaceImpl();
		return attackSurface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityLevel createSeverityLevelFromString(EDataType eDataType, String initialValue) {
		SeverityLevel result = SeverityLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactLevel createImpactLevelFromString(EDataType eDataType, String initialValue) {
		ImpactLevel result = ImpactLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackVector createAttackVectorFromString(EDataType eDataType, String initialValue) {
		AttackVector result = AttackVector.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttackVectorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackComplexity createAttackComplexityFromString(EDataType eDataType, String initialValue) {
		AttackComplexity result = AttackComplexity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttackComplexityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInteraction createUserInteractionFromString(EDataType eDataType, String initialValue) {
		UserInteraction result = UserInteraction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivilegesRequired createPrivilegesRequiredFromString(EDataType eDataType, String initialValue) {
		PrivilegesRequired result = PrivilegesRequired.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivilegesRequiredToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityImpact createConfidentialityImpactFromString(EDataType eDataType, String initialValue) {
		ConfidentialityImpact result = ConfidentialityImpact.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityImpactToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String createCVE_IDFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}

		Pattern p = Pattern.compile("^CVE-[0-9]{4}-[0-9]{4,19}$");
		Matcher m = p.matcher(initialValue);
		if (!m.matches()) // Check that it matches the Regex ^CVE-[0-9]{4}-[0-9]{4,19}$
		{
			throw new IllegalArgumentException(
					"The given ID '" + initialValue + "' is not a valid CVE id e.g. CVE-1234-4534");
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertCVE_IDToString(EDataType eDataType, Object instanceValue) {
		return (String) instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCWE_IDFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCWE_IDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPackage getSecurityPackage() {
		return (SecurityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPackage getPackage() {
		return SecurityPackage.eINSTANCE;
	}

} // SecurityFactoryImpl
