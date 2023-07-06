/**
 */
package e4sm.de.metamodel.e4sm.security;

import e4sm.de.metamodel.e4sm.Component;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getDescription <em>Description</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getVectorString <em>Vector String</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getAffectsComponents <em>Affects Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CVE#getConfidentialityImpact <em>Confidentiality Impact</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Vector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector String</em>' attribute.
	 * @see #setVectorString(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_VectorString()
	 * @model
	 * @generated
	 */
	String getVectorString();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CVE#getVectorString <em>Vector String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector String</em>' attribute.
	 * @see #getVectorString()
	 * @generated
	 */
	void setVectorString(String value);

	/**
	 * Returns the value of the '<em><b>Affects Components</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects Components</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_AffectsComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getAffectsComponents();

	/**
	 * Returns the value of the '<em><b>Confidentiality Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.security.ConfidentialityImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality Impact</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.security.ConfidentialityImpact
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCVE_ConfidentialityImpact()
	 * @model unique="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	ConfidentialityImpact getConfidentialityImpact();

} // CVE
