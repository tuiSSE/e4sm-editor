/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/edapt historyURI='e4sm.history'"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/e4sm/security/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl <em>Asset Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAssetDefinition()
	 * @generated
	 */
	int ASSET_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Security Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DEFINITION__SECURITY_GOALS = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DEFINITION__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Asset Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Asset Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.SecurityGoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityGoalImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSecurityGoal()
	 * @generated
	 */
	int SECURITY_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__IMPACT = 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.ConfidentialityImpl <em>Confidentiality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.ConfidentialityImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getConfidentiality()
	 * @generated
	 */
	int CONFIDENTIALITY = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY__SEVERITY = SECURITY_GOAL__SEVERITY;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY__IMPACT = SECURITY_GOAL__IMPACT;

	/**
	 * The number of structural features of the '<em>Confidentiality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_FEATURE_COUNT = SECURITY_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Confidentiality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_OPERATION_COUNT = SECURITY_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.IntegrityImpl <em>Integrity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.IntegrityImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getIntegrity()
	 * @generated
	 */
	int INTEGRITY = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__SEVERITY = SECURITY_GOAL__SEVERITY;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__IMPACT = SECURITY_GOAL__IMPACT;

	/**
	 * The number of structural features of the '<em>Integrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_FEATURE_COUNT = SECURITY_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_OPERATION_COUNT = SECURITY_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.AvailabilityImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 4;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__SEVERITY = SECURITY_GOAL__SEVERITY;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__IMPACT = SECURITY_GOAL__IMPACT;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = SECURITY_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = SECURITY_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl <em>CVE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.CVEImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCVE()
	 * @generated
	 */
	int CVE = 5;

	/**
	 * The feature id for the '<em><b>Cvss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__CVSS = 0;

	/**
	 * The feature id for the '<em><b>Cve Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__CVE_ID = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__STATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Vector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__VECTOR_STRING = 4;

	/**
	 * The feature id for the '<em><b>Affects Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE__AFFECTS_COMPONENTS = 5;

	/**
	 * The number of structural features of the '<em>CVE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CVE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl <em>CWE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.CWEImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCWE()
	 * @generated
	 */
	int CWE = 6;

	/**
	 * The feature id for the '<em><b>Cwss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__CWSS = 0;

	/**
	 * The feature id for the '<em><b>Cve Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__CVE_ID = 1;

	/**
	 * The feature id for the '<em><b>Vector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__VECTOR_STRING = 2;

	/**
	 * The feature id for the '<em><b>Affects Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__AFFECTS_COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>CWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>CWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl <em>Threat Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getThreatCondition()
	 * @generated
	 */
	int THREAT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Security Goals</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CONDITION__SECURITY_GOALS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CONDITION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Threat Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Threat Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSecuritySpecification()
	 * @generated
	 */
	int SECURITY_SPECIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Asset Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SPECIFICATION__ASSET_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Threat Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SPECIFICATION__THREAT_CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl <em>Known Security Threats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getKnownSecurityThreats()
	 * @generated
	 */
	int KNOWN_SECURITY_THREATS = 9;

	/**
	 * The feature id for the '<em><b>Cves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_SECURITY_THREATS__CVES = 0;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_SECURITY_THREATS__CWES = 1;

	/**
	 * The number of structural features of the '<em>Known Security Threats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_SECURITY_THREATS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Known Security Threats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_SECURITY_THREATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.SeverityLevel <em>Severity Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.SeverityLevel
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSeverityLevel()
	 * @generated
	 */
	int SEVERITY_LEVEL = 10;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.ImpactLevel <em>Impact Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.ImpactLevel
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getImpactLevel()
	 * @generated
	 */
	int IMPACT_LEVEL = 11;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.AttackVector <em>Attack Vector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.AttackVector
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAttackVector()
	 * @generated
	 */
	int ATTACK_VECTOR = 12;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.AttackComplexity <em>Attack Complexity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.AttackComplexity
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAttackComplexity()
	 * @generated
	 */
	int ATTACK_COMPLEXITY = 13;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.UserInteraction <em>User Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.UserInteraction
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getUserInteraction()
	 * @generated
	 */
	int USER_INTERACTION = 14;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.PrivilegesRequired <em>Privileges Required</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.PrivilegesRequired
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getPrivilegesRequired()
	 * @generated
	 */
	int PRIVILEGES_REQUIRED = 15;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.ConfidentialityImpact <em>Confidentiality Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.ConfidentialityImpact
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getConfidentialityImpact()
	 * @generated
	 */
	int CONFIDENTIALITY_IMPACT = 16;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.security.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.security.State
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getState()
	 * @generated
	 */
	int STATE = 17;

	/**
	 * The meta object id for the '<em>CVE ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCVE_ID()
	 * @generated
	 */
	int CVE_ID = 18;

	/**
	 * The meta object id for the '<em>CWE ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCWE_ID()
	 * @generated
	 */
	int CWE_ID = 19;

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.AssetDefinition <em>Asset Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Definition</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.AssetDefinition
	 * @generated
	 */
	EClass getAssetDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.security.AssetDefinition#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Goals</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.AssetDefinition#getSecurityGoals()
	 * @see #getAssetDefinition()
	 * @generated
	 */
	EReference getAssetDefinition_SecurityGoals();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.security.AssetDefinition#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.AssetDefinition#getComponent()
	 * @see #getAssetDefinition()
	 * @generated
	 */
	EReference getAssetDefinition_Component();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityGoal
	 * @generated
	 */
	EClass getSecurityGoal();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityGoal#getSeverity()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Severity();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityGoal#getImpact()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Impact();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidentiality</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.Confidentiality
	 * @generated
	 */
	EClass getConfidentiality();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.Integrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.Integrity
	 * @generated
	 */
	EClass getIntegrity();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.CVE <em>CVE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVE</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE
	 * @generated
	 */
	EClass getCVE();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CVE#getCvss <em>Cvss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvss</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getCvss()
	 * @see #getCVE()
	 * @generated
	 */
	EAttribute getCVE_Cvss();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CVE#getCveId <em>Cve Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cve Id</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getCveId()
	 * @see #getCVE()
	 * @generated
	 */
	EAttribute getCVE_CveId();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CVE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getState()
	 * @see #getCVE()
	 * @generated
	 */
	EAttribute getCVE_State();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CVE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getDescription()
	 * @see #getCVE()
	 * @generated
	 */
	EAttribute getCVE_Description();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CVE#getVectorString <em>Vector String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector String</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getVectorString()
	 * @see #getCVE()
	 * @generated
	 */
	EAttribute getCVE_VectorString();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.security.CVE#getAffectsComponents <em>Affects Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affects Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CVE#getAffectsComponents()
	 * @see #getCVE()
	 * @generated
	 */
	EReference getCVE_AffectsComponents();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.CWE <em>CWE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CWE
	 * @generated
	 */
	EClass getCWE();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CWE#getCwss <em>Cwss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cwss</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CWE#getCwss()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_Cwss();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CWE#getCveId <em>Cve Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cve Id</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CWE#getCveId()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_CveId();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.CWE#getVectorString <em>Vector String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector String</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CWE#getVectorString()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_VectorString();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.security.CWE#getAffectsComponents <em>Affects Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affects Components</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.CWE#getAffectsComponents()
	 * @see #getCWE()
	 * @generated
	 */
	EReference getCWE_AffectsComponents();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition <em>Threat Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Condition</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.ThreatCondition
	 * @generated
	 */
	EClass getThreatCondition();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Goals</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.ThreatCondition#getSecurityGoals()
	 * @see #getThreatCondition()
	 * @generated
	 */
	EReference getThreatCondition_SecurityGoals();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.ThreatCondition#getDescription()
	 * @see #getThreatCondition()
	 * @generated
	 */
	EAttribute getThreatCondition_Description();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecuritySpecification
	 * @generated
	 */
	EClass getSecuritySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification#getAssetDefinitions <em>Asset Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset Definitions</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecuritySpecification#getAssetDefinitions()
	 * @see #getSecuritySpecification()
	 * @generated
	 */
	EReference getSecuritySpecification_AssetDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification#getThreatConditions <em>Threat Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat Conditions</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SecuritySpecification#getThreatConditions()
	 * @see #getSecuritySpecification()
	 * @generated
	 */
	EReference getSecuritySpecification_ThreatConditions();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats <em>Known Security Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Known Security Threats</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.KnownSecurityThreats
	 * @generated
	 */
	EClass getKnownSecurityThreats();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCves <em>Cves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cves</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCves()
	 * @see #getKnownSecurityThreats()
	 * @generated
	 */
	EReference getKnownSecurityThreats_Cves();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cwes</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.KnownSecurityThreats#getCwes()
	 * @see #getKnownSecurityThreats()
	 * @generated
	 */
	EReference getKnownSecurityThreats_Cwes();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.SeverityLevel <em>Severity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Level</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.SeverityLevel
	 * @generated
	 */
	EEnum getSeverityLevel();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.ImpactLevel <em>Impact Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Level</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.ImpactLevel
	 * @generated
	 */
	EEnum getImpactLevel();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.AttackVector <em>Attack Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attack Vector</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.AttackVector
	 * @generated
	 */
	EEnum getAttackVector();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.AttackComplexity <em>Attack Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attack Complexity</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.AttackComplexity
	 * @generated
	 */
	EEnum getAttackComplexity();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Interaction</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.UserInteraction
	 * @generated
	 */
	EEnum getUserInteraction();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.PrivilegesRequired <em>Privileges Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Privileges Required</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.PrivilegesRequired
	 * @generated
	 */
	EEnum getPrivilegesRequired();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.ConfidentialityImpact <em>Confidentiality Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality Impact</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.ConfidentialityImpact
	 * @generated
	 */
	EEnum getConfidentialityImpact();

	/**
	 * Returns the meta object for enum '{@link e4sm.de.metamodel.e4sm.security.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see e4sm.de.metamodel.e4sm.security.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CVE ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CVE ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCVE_ID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CWE ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CWE ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCWE_ID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl <em>Asset Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAssetDefinition()
		 * @generated
		 */
		EClass ASSET_DEFINITION = eINSTANCE.getAssetDefinition();

		/**
		 * The meta object literal for the '<em><b>Security Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_DEFINITION__SECURITY_GOALS = eINSTANCE.getAssetDefinition_SecurityGoals();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_DEFINITION__COMPONENT = eINSTANCE.getAssetDefinition_Component();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.SecurityGoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityGoalImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSecurityGoal()
		 * @generated
		 */
		EClass SECURITY_GOAL = eINSTANCE.getSecurityGoal();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__SEVERITY = eINSTANCE.getSecurityGoal_Severity();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__IMPACT = eINSTANCE.getSecurityGoal_Impact();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.ConfidentialityImpl <em>Confidentiality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.ConfidentialityImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getConfidentiality()
		 * @generated
		 */
		EClass CONFIDENTIALITY = eINSTANCE.getConfidentiality();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.IntegrityImpl <em>Integrity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.IntegrityImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getIntegrity()
		 * @generated
		 */
		EClass INTEGRITY = eINSTANCE.getIntegrity();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.AvailabilityImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl <em>CVE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.CVEImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCVE()
		 * @generated
		 */
		EClass CVE = eINSTANCE.getCVE();

		/**
		 * The meta object literal for the '<em><b>Cvss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVE__CVSS = eINSTANCE.getCVE_Cvss();

		/**
		 * The meta object literal for the '<em><b>Cve Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVE__CVE_ID = eINSTANCE.getCVE_CveId();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVE__STATE = eINSTANCE.getCVE_State();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVE__DESCRIPTION = eINSTANCE.getCVE_Description();

		/**
		 * The meta object literal for the '<em><b>Vector String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVE__VECTOR_STRING = eINSTANCE.getCVE_VectorString();

		/**
		 * The meta object literal for the '<em><b>Affects Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CVE__AFFECTS_COMPONENTS = eINSTANCE.getCVE_AffectsComponents();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl <em>CWE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.CWEImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCWE()
		 * @generated
		 */
		EClass CWE = eINSTANCE.getCWE();

		/**
		 * The meta object literal for the '<em><b>Cwss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__CWSS = eINSTANCE.getCWE_Cwss();

		/**
		 * The meta object literal for the '<em><b>Cve Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__CVE_ID = eINSTANCE.getCWE_CveId();

		/**
		 * The meta object literal for the '<em><b>Vector String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__VECTOR_STRING = eINSTANCE.getCWE_VectorString();

		/**
		 * The meta object literal for the '<em><b>Affects Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWE__AFFECTS_COMPONENTS = eINSTANCE.getCWE_AffectsComponents();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl <em>Threat Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getThreatCondition()
		 * @generated
		 */
		EClass THREAT_CONDITION = eINSTANCE.getThreatCondition();

		/**
		 * The meta object literal for the '<em><b>Security Goals</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_CONDITION__SECURITY_GOALS = eINSTANCE.getThreatCondition_SecurityGoals();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_CONDITION__DESCRIPTION = eINSTANCE.getThreatCondition_Description();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSecuritySpecification()
		 * @generated
		 */
		EClass SECURITY_SPECIFICATION = eINSTANCE.getSecuritySpecification();

		/**
		 * The meta object literal for the '<em><b>Asset Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SPECIFICATION__ASSET_DEFINITIONS = eINSTANCE.getSecuritySpecification_AssetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Threat Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SPECIFICATION__THREAT_CONDITIONS = eINSTANCE.getSecuritySpecification_ThreatConditions();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl <em>Known Security Threats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getKnownSecurityThreats()
		 * @generated
		 */
		EClass KNOWN_SECURITY_THREATS = eINSTANCE.getKnownSecurityThreats();

		/**
		 * The meta object literal for the '<em><b>Cves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWN_SECURITY_THREATS__CVES = eINSTANCE.getKnownSecurityThreats_Cves();

		/**
		 * The meta object literal for the '<em><b>Cwes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWN_SECURITY_THREATS__CWES = eINSTANCE.getKnownSecurityThreats_Cwes();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.SeverityLevel <em>Severity Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.SeverityLevel
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getSeverityLevel()
		 * @generated
		 */
		EEnum SEVERITY_LEVEL = eINSTANCE.getSeverityLevel();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.ImpactLevel <em>Impact Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.ImpactLevel
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getImpactLevel()
		 * @generated
		 */
		EEnum IMPACT_LEVEL = eINSTANCE.getImpactLevel();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.AttackVector <em>Attack Vector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.AttackVector
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAttackVector()
		 * @generated
		 */
		EEnum ATTACK_VECTOR = eINSTANCE.getAttackVector();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.AttackComplexity <em>Attack Complexity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.AttackComplexity
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getAttackComplexity()
		 * @generated
		 */
		EEnum ATTACK_COMPLEXITY = eINSTANCE.getAttackComplexity();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.UserInteraction <em>User Interaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.UserInteraction
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getUserInteraction()
		 * @generated
		 */
		EEnum USER_INTERACTION = eINSTANCE.getUserInteraction();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.PrivilegesRequired <em>Privileges Required</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.PrivilegesRequired
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getPrivilegesRequired()
		 * @generated
		 */
		EEnum PRIVILEGES_REQUIRED = eINSTANCE.getPrivilegesRequired();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.ConfidentialityImpact <em>Confidentiality Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.ConfidentialityImpact
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getConfidentialityImpact()
		 * @generated
		 */
		EEnum CONFIDENTIALITY_IMPACT = eINSTANCE.getConfidentialityImpact();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.security.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.security.State
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em>CVE ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCVE_ID()
		 * @generated
		 */
		EDataType CVE_ID = eINSTANCE.getCVE_ID();

		/**
		 * The meta object literal for the '<em>CWE ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see e4sm.de.metamodel.e4sm.security.impl.SecurityPackageImpl#getCWE_ID()
		 * @generated
		 */
		EDataType CWE_ID = eINSTANCE.getCWE_ID();

	}

} //SecurityPackage
