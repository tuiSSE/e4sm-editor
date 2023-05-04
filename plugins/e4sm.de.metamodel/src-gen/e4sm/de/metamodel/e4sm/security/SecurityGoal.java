/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getSeverity <em>Severity</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecurityGoal()
 * @model abstract="true"
 * @generated
 */
public interface SecurityGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.security.SeverityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.SeverityLevel
	 * @see #setSeverity(SeverityLevel)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecurityGoal_Severity()
	 * @model
	 * @generated
	 */
	SeverityLevel getSeverity();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.SeverityLevel
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityLevel value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.security.ImpactLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.ImpactLevel
	 * @see #setImpact(ImpactLevel)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getSecurityGoal_Impact()
	 * @model
	 * @generated
	 */
	ImpactLevel getImpact();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.ImpactLevel
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(ImpactLevel value);

} // SecurityGoal
