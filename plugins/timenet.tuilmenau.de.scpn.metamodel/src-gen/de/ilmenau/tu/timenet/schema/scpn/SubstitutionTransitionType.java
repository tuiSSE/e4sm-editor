/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getNet <em>Net</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication <em>Replication</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getSubstitutionTransitionType()
 * @model extendedMetaData="name='SubstitutionTransitionType' kind='elementOnly'"
 * @generated
 */
public interface SubstitutionTransitionType extends TransitionType {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getSubstitutionTransitionType_Net()
	 * @model containment="true" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReplicationType> getNet();

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #isSetReplication()
	 * @see #unsetReplication()
	 * @see #setReplication(BigInteger)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getSubstitutionTransitionType_Replication()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='replication'"
	 * @generated
	 */
	BigInteger getReplication();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #isSetReplication()
	 * @see #unsetReplication()
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(BigInteger value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplication()
	 * @see #getReplication()
	 * @see #setReplication(BigInteger)
	 * @generated
	 */
	void unsetReplication();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication <em>Replication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replication</em>' attribute is set.
	 * @see #unsetReplication()
	 * @see #getReplication()
	 * @see #setReplication(BigInteger)
	 * @generated
	 */
	boolean isSetReplication();

} // SubstitutionTransitionType
