/**
 */
package e4sm.de.metamodel.e4sm.security;

import e4sm.de.metamodel.e4sm.Component;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CWE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CWE#getCwss <em>Cwss</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CWE#getCveId <em>Cve Id</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CWE#getVectorString <em>Vector String</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.CWE#getAffectsComponents <em>Affects Components</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCWE()
 * @model
 * @generated
 */
public interface CWE extends EObject {
	/**
	 * Returns the value of the '<em><b>Cwss</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwss</em>' attribute.
	 * @see #setCwss(double)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCWE_Cwss()
	 * @model default="0.0"
	 * @generated
	 */
	double getCwss();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CWE#getCwss <em>Cwss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cwss</em>' attribute.
	 * @see #getCwss()
	 * @generated
	 */
	void setCwss(double value);

	/**
	 * Returns the value of the '<em><b>Cve Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cve Id</em>' attribute.
	 * @see #setCveId(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCWE_CveId()
	 * @model id="true" dataType="e4sm.de.metamodel.e4sm.security.CWE_ID" required="true"
	 * @generated
	 */
	String getCveId();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CWE#getCveId <em>Cve Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cve Id</em>' attribute.
	 * @see #getCveId()
	 * @generated
	 */
	void setCveId(String value);

	/**
	 * Returns the value of the '<em><b>Vector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector String</em>' attribute.
	 * @see #setVectorString(String)
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCWE_VectorString()
	 * @model
	 * @generated
	 */
	String getVectorString();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.security.CWE#getVectorString <em>Vector String</em>}' attribute.
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
	 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getCWE_AffectsComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getAffectsComponents();

} // CWE
