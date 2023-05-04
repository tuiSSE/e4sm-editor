/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;

import e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl;

import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;

import e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsPackageImpl;

import e4sm.de.metamodel.e4sm.core.CorePackage;

import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;

import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;

import e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl;

import e4sm.de.metamodel.e4sm.guava.GuavaPackage;

import e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl;

import e4sm.de.metamodel.e4sm.impl.e4smPackageImpl;

import e4sm.de.metamodel.e4sm.security.AssetDefinition;
import e4sm.de.metamodel.e4sm.security.AttackComplexity;
import e4sm.de.metamodel.e4sm.security.AttackVector;
import e4sm.de.metamodel.e4sm.security.Availability;
import e4sm.de.metamodel.e4sm.security.Confidentiality;
import e4sm.de.metamodel.e4sm.security.ConfidentialityImpact;
import e4sm.de.metamodel.e4sm.security.ImpactLevel;
import e4sm.de.metamodel.e4sm.security.Integrity;
import e4sm.de.metamodel.e4sm.security.KnownSecurityThreats;
import e4sm.de.metamodel.e4sm.security.PrivilegesRequired;
import e4sm.de.metamodel.e4sm.security.SecurityFactory;
import e4sm.de.metamodel.e4sm.security.SecurityGoal;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;
import e4sm.de.metamodel.e4sm.security.SecuritySpecification;
import e4sm.de.metamodel.e4sm.security.SeverityLevel;
import e4sm.de.metamodel.e4sm.security.State;
import e4sm.de.metamodel.e4sm.security.ThreatCondition;

import e4sm.de.metamodel.e4sm.security.UserInteraction;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knownSecurityThreatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attackVectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attackComplexityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privilegesRequiredEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityImpactEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cvE_IDEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited)
			return (SecurityPackage) EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl
				? (SecurityPackageImpl) registeredSecurityPackage
				: new SecurityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);
		e4smPackageImpl thee4smPackage = (e4smPackageImpl) (registeredPackage instanceof e4smPackageImpl
				? registeredPackage
				: e4smPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl) (registeredPackage instanceof ResultsPackageImpl
				? registeredPackage
				: ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl) (registeredPackage instanceof AnalysisPackageImpl
				? registeredPackage
				: AnalysisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl) (registeredPackage instanceof ExecutionPackageImpl
				? registeredPackage
				: ExecutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GuavaPackage.eNS_URI);
		GuavaPackageImpl theGuavaPackage = (GuavaPackageImpl) (registeredPackage instanceof GuavaPackageImpl
				? registeredPackage
				: GuavaPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();
		thee4smPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theAnalysisPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theGuavaPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();
		thee4smPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theGuavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetDefinition() {
		return assetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetDefinition_SecurityGoals() {
		return (EReference) assetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetDefinition_Component() {
		return (EReference) assetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGoal() {
		return securityGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGoal_Severity() {
		return (EAttribute) securityGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGoal_Impact() {
		return (EAttribute) securityGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidentiality() {
		return confidentialityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrity() {
		return integrityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCVE() {
		return cveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCVE_Cvss() {
		return (EAttribute) cveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCVE_CveId() {
		return (EAttribute) cveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCVE_State() {
		return (EAttribute) cveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCVE_Description() {
		return (EAttribute) cveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCWE() {
		return cweEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCWE_Cwss() {
		return (EAttribute) cweEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatCondition() {
		return threatConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatCondition_SecurityGoals() {
		return (EReference) threatConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatCondition_Description() {
		return (EAttribute) threatConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecuritySpecification() {
		return securitySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecuritySpecification_AssetDefinitions() {
		return (EReference) securitySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecuritySpecification_ThreatConditions() {
		return (EReference) securitySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnownSecurityThreats() {
		return knownSecurityThreatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnownSecurityThreats_Cves() {
		return (EReference) knownSecurityThreatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnownSecurityThreats_Cwes() {
		return (EReference) knownSecurityThreatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverityLevel() {
		return severityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactLevel() {
		return impactLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttackVector() {
		return attackVectorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttackComplexity() {
		return attackComplexityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserInteraction() {
		return userInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrivilegesRequired() {
		return privilegesRequiredEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConfidentialityImpact() {
		return confidentialityImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCVE_ID() {
		return cvE_IDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		assetDefinitionEClass = createEClass(ASSET_DEFINITION);
		createEReference(assetDefinitionEClass, ASSET_DEFINITION__SECURITY_GOALS);
		createEReference(assetDefinitionEClass, ASSET_DEFINITION__COMPONENT);

		securityGoalEClass = createEClass(SECURITY_GOAL);
		createEAttribute(securityGoalEClass, SECURITY_GOAL__SEVERITY);
		createEAttribute(securityGoalEClass, SECURITY_GOAL__IMPACT);

		confidentialityEClass = createEClass(CONFIDENTIALITY);

		integrityEClass = createEClass(INTEGRITY);

		availabilityEClass = createEClass(AVAILABILITY);

		cveEClass = createEClass(CVE);
		createEAttribute(cveEClass, CVE__CVSS);
		createEAttribute(cveEClass, CVE__CVE_ID);
		createEAttribute(cveEClass, CVE__STATE);
		createEAttribute(cveEClass, CVE__DESCRIPTION);

		cweEClass = createEClass(CWE);
		createEAttribute(cweEClass, CWE__CWSS);

		threatConditionEClass = createEClass(THREAT_CONDITION);
		createEReference(threatConditionEClass, THREAT_CONDITION__SECURITY_GOALS);
		createEAttribute(threatConditionEClass, THREAT_CONDITION__DESCRIPTION);

		securitySpecificationEClass = createEClass(SECURITY_SPECIFICATION);
		createEReference(securitySpecificationEClass, SECURITY_SPECIFICATION__ASSET_DEFINITIONS);
		createEReference(securitySpecificationEClass, SECURITY_SPECIFICATION__THREAT_CONDITIONS);

		knownSecurityThreatsEClass = createEClass(KNOWN_SECURITY_THREATS);
		createEReference(knownSecurityThreatsEClass, KNOWN_SECURITY_THREATS__CVES);
		createEReference(knownSecurityThreatsEClass, KNOWN_SECURITY_THREATS__CWES);

		// Create enums
		severityLevelEEnum = createEEnum(SEVERITY_LEVEL);
		impactLevelEEnum = createEEnum(IMPACT_LEVEL);
		attackVectorEEnum = createEEnum(ATTACK_VECTOR);
		attackComplexityEEnum = createEEnum(ATTACK_COMPLEXITY);
		userInteractionEEnum = createEEnum(USER_INTERACTION);
		privilegesRequiredEEnum = createEEnum(PRIVILEGES_REQUIRED);
		confidentialityImpactEEnum = createEEnum(CONFIDENTIALITY_IMPACT);
		stateEEnum = createEEnum(STATE);

		// Create data types
		cvE_IDEDataType = createEDataType(CVE_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		e4smPackage thee4smPackage = (e4smPackage) EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		confidentialityEClass.getESuperTypes().add(this.getSecurityGoal());
		integrityEClass.getESuperTypes().add(this.getSecurityGoal());
		availabilityEClass.getESuperTypes().add(this.getSecurityGoal());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetDefinitionEClass, AssetDefinition.class, "AssetDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetDefinition_SecurityGoals(), this.getSecurityGoal(), null, "securityGoals", null, 0, -1,
				AssetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetDefinition_Component(), thee4smPackage.getComponent(), null, "component", null, 1, 1,
				AssetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGoalEClass, SecurityGoal.class, "SecurityGoal", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGoal_Severity(), this.getSeverityLevel(), "severity", null, 0, 1, SecurityGoal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGoal_Impact(), this.getImpactLevel(), "impact", null, 0, 1, SecurityGoal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confidentialityEClass, Confidentiality.class, "Confidentiality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrityEClass, Integrity.class, "Integrity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cveEClass, e4sm.de.metamodel.e4sm.security.CVE.class, "CVE", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVE_Cvss(), theEcorePackage.getEDouble(), "cvss", null, 0, 1,
				e4sm.de.metamodel.e4sm.security.CVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVE_CveId(), this.getCVE_ID(), "cveId", null, 1, 1, e4sm.de.metamodel.e4sm.security.CVE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVE_State(), this.getState(), "state", null, 0, 1, e4sm.de.metamodel.e4sm.security.CVE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVE_Description(), theEcorePackage.getEString(), "description", null, 0, 1,
				e4sm.de.metamodel.e4sm.security.CVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweEClass, e4sm.de.metamodel.e4sm.security.CWE.class, "CWE", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCWE_Cwss(), theEcorePackage.getEDouble(), "cwss", "0.0", 0, 1,
				e4sm.de.metamodel.e4sm.security.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatConditionEClass, ThreatCondition.class, "ThreatCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreatCondition_SecurityGoals(), this.getSecurityGoal(), null, "securityGoals", null, 0, 1,
				ThreatCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatCondition_Description(), theEcorePackage.getEString(), "description", null, 0, 1,
				ThreatCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(securitySpecificationEClass, SecuritySpecification.class, "SecuritySpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecuritySpecification_AssetDefinitions(), this.getAssetDefinition(), null, "assetDefinitions",
				null, 0, -1, SecuritySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecuritySpecification_ThreatConditions(), this.getThreatCondition(), null, "threatConditions",
				null, 0, -1, SecuritySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knownSecurityThreatsEClass, KnownSecurityThreats.class, "KnownSecurityThreats", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnownSecurityThreats_Cves(), this.getCVE(), null, "cves", null, 0, -1,
				KnownSecurityThreats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnownSecurityThreats_Cwes(), this.getCWE(), null, "cwes", null, 0, -1,
				KnownSecurityThreats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityLevelEEnum, SeverityLevel.class, "SeverityLevel");
		addEEnumLiteral(severityLevelEEnum, SeverityLevel.LOW);
		addEEnumLiteral(severityLevelEEnum, SeverityLevel.MEDIUM);
		addEEnumLiteral(severityLevelEEnum, SeverityLevel.HIGH);
		addEEnumLiteral(severityLevelEEnum, SeverityLevel.CRITICAL);
		addEEnumLiteral(severityLevelEEnum, SeverityLevel.NONE);

		initEEnum(impactLevelEEnum, ImpactLevel.class, "ImpactLevel");
		addEEnumLiteral(impactLevelEEnum, ImpactLevel.NO_IMPACT);
		addEEnumLiteral(impactLevelEEnum, ImpactLevel.BUSINESS);
		addEEnumLiteral(impactLevelEEnum, ImpactLevel.OPERATIONAL);
		addEEnumLiteral(impactLevelEEnum, ImpactLevel.COMMERCIAL);
		addEEnumLiteral(impactLevelEEnum, ImpactLevel.SAFETY);

		initEEnum(attackVectorEEnum, AttackVector.class, "AttackVector");
		addEEnumLiteral(attackVectorEEnum, AttackVector.NETWORK);

		initEEnum(attackComplexityEEnum, AttackComplexity.class, "AttackComplexity");
		addEEnumLiteral(attackComplexityEEnum, AttackComplexity.LOW);
		addEEnumLiteral(attackComplexityEEnum, AttackComplexity.HIGH);

		initEEnum(userInteractionEEnum, UserInteraction.class, "UserInteraction");
		addEEnumLiteral(userInteractionEEnum, UserInteraction.NONE);
		addEEnumLiteral(userInteractionEEnum, UserInteraction.REQUIRED);

		initEEnum(privilegesRequiredEEnum, PrivilegesRequired.class, "PrivilegesRequired");
		addEEnumLiteral(privilegesRequiredEEnum, PrivilegesRequired.HIGH);
		addEEnumLiteral(privilegesRequiredEEnum, PrivilegesRequired.LOW);
		addEEnumLiteral(privilegesRequiredEEnum, PrivilegesRequired.NONE);

		initEEnum(confidentialityImpactEEnum, ConfidentialityImpact.class, "ConfidentialityImpact");
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.LOW);
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.NONE);
		addEEnumLiteral(confidentialityImpactEEnum, ConfidentialityImpact.HIGH);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.PUBLISHED);
		addEEnumLiteral(stateEEnum, State.REJECTED);

		// Initialize data types
		initEDataType(cvE_IDEDataType, String.class, "CVE_ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/edapt
		createEdaptAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/edapt</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdaptAnnotations() {
		String source = "http://www.eclipse.org/edapt";
		addAnnotation(this, source, new String[] { "historyURI", "e4sm.history" });
	}

} //SecurityPackageImpl
