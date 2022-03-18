/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getImmediateTransitionType()
 * @model extendedMetaData="name='ImmediateTransitionType' kind='elementOnly'"
 * @generated
 */
public interface ImmediateTransitionType extends TransitionType {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(BigInteger)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getImmediateTransitionType_Priority()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(BigInteger)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(BigInteger)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #setWeight(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getImmediateTransitionType_Weight()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='weight'"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeight()
	 * @see #getWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	void unsetWeight();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weight</em>' attribute is set.
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	boolean isSetWeight();

} // ImmediateTransitionType
