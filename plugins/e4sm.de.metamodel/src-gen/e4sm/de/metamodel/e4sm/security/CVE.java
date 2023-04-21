/**
 */
package e4sm.de.metamodel.e4sm.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getCvss <em>Cvss</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getCveId <em>Cve Id</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getState <em>State</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE()
 * @model
 * @generated
 */
public interface CVE extends EObject {
	/**
	 * Returns the value of the '<em><b>Cvss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value must be greater or equal to 0 and lesser or equal to 10
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cvss</em>' attribute.
	 * @see #setCvss(double)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_Cvss()
	 * @model
	 * @generated
	 */
	double getCvss();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CVE#getCvss <em>Cvss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvss</em>' attribute.
	 * @see #getCvss()
	 * @generated
	 */
	void setCvss(double value);

	/**
	 * Returns the value of the '<em><b>Cve Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cve Id</em>' attribute.
	 * @see #setCveId(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_CveId()
	 * @model id="true" dataType="e4sm.de.metamodel.e4sm.security.CVE_ID" required="true"
	 * @generated
	 */
	String getCveId();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CVE#getCveId <em>Cve Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cve Id</em>' attribute.
	 * @see #getCveId()
	 * @generated
	 */
	void setCveId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.security.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.State
	 * @see #setState(State)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CVE#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CVE#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CVE
