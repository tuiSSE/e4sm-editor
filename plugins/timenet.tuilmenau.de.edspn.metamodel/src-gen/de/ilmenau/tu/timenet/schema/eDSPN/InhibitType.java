/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhibit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getInscription <em>Inscription</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInhibitType()
 * @model extendedMetaData="name='InhibitType' kind='elementOnly'"
 * @generated
 */
public interface InhibitType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(InscriptionType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInhibitType_Inscription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inscription' namespace='##targetNamespace'"
	 * @generated
	 */
	InscriptionType getInscription();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(InscriptionType value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInhibitType_Handle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HandleType> getHandle();

} // InhibitType
