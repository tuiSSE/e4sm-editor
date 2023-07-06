/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification#getAssetDefinitions <em>Asset Definitions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification#getThreatConditions <em>Threat Conditions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification#getAttackSurfaces <em>Attack Surfaces</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecuritySpecification()
 * @model
 * @generated
 */
public interface SecuritySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.AssetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Definitions</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecuritySpecification_AssetDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetDefinition> getAssetDefinitions();

	/**
	 * Returns the value of the '<em><b>Threat Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.ThreatCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Conditions</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecuritySpecification_ThreatConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatCondition> getThreatConditions();

	/**
	 * Returns the value of the '<em><b>Attack Surfaces</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.security.AttackSurface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Surfaces</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecuritySpecification_AttackSurfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackSurface> getAttackSurfaces();

} // SecuritySpecification
