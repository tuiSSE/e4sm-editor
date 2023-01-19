/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType <em>Server Type</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getExponentialTransitionType()
 * @model extendedMetaData="name='ExponentialTransitionType' kind='elementOnly'"
 * @generated
 */
public interface ExponentialTransitionType extends TransitionType {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #isSetDelay()
	 * @see #unsetDelay()
	 * @see #setDelay(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getExponentialTransitionType_Delay()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delay'"
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #isSetDelay()
	 * @see #unsetDelay()
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay()
	 * @see #getDelay()
	 * @see #setDelay(String)
	 * @generated
	 */
	void unsetDelay();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay <em>Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay</em>' attribute is set.
	 * @see #unsetDelay()
	 * @see #getDelay()
	 * @see #setDelay(String)
	 * @generated
	 */
	boolean isSetDelay();

	/**
	 * Returns the value of the '<em><b>Preemption Policy</b></em>' attribute.
	 * The default value is <code>"PRD"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption Policy</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @see #isSetPreemptionPolicy()
	 * @see #unsetPreemptionPolicy()
	 * @see #setPreemptionPolicy(PreemptionPolicyType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getExponentialTransitionType_PreemptionPolicy()
	 * @model default="PRD" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='preemptionPolicy'"
	 * @generated
	 */
	PreemptionPolicyType getPreemptionPolicy();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption Policy</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @see #isSetPreemptionPolicy()
	 * @see #unsetPreemptionPolicy()
	 * @see #getPreemptionPolicy()
	 * @generated
	 */
	void setPreemptionPolicy(PreemptionPolicyType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreemptionPolicy()
	 * @see #getPreemptionPolicy()
	 * @see #setPreemptionPolicy(PreemptionPolicyType)
	 * @generated
	 */
	void unsetPreemptionPolicy();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preemption Policy</em>' attribute is set.
	 * @see #unsetPreemptionPolicy()
	 * @see #getPreemptionPolicy()
	 * @see #setPreemptionPolicy(PreemptionPolicyType)
	 * @generated
	 */
	boolean isSetPreemptionPolicy();

	/**
	 * Returns the value of the '<em><b>Server Type</b></em>' attribute.
	 * The default value is <code>"ExclusiveServer"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #setServerType(ServerTypeType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getExponentialTransitionType_ServerType()
	 * @model default="ExclusiveServer" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='serverType'"
	 * @generated
	 */
	ServerTypeType getServerType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @generated
	 */
	void setServerType(ServerTypeType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ServerTypeType)
	 * @generated
	 */
	void unsetServerType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType <em>Server Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Type</em>' attribute is set.
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ServerTypeType)
	 * @generated
	 */
	boolean isSetServerType();

} // ExponentialTransitionType
