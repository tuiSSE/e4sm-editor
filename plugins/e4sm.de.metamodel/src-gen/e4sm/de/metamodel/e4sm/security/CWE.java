/**
 */
package e4sm.de.metamodel.e4sm.security;

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

} // CWE
