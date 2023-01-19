/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction <em>Enabling Function</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getImmediateTransitionType()
 * @model extendedMetaData="name='ImmediateTransitionType' kind='elementOnly'"
 * @generated
 */
public interface ImmediateTransitionType extends TransitionType {
	/**
	 * Returns the value of the '<em><b>Enabling Function</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabling Function</em>' attribute.
	 * @see #isSetEnablingFunction()
	 * @see #unsetEnablingFunction()
	 * @see #setEnablingFunction(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getImmediateTransitionType_EnablingFunction()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enablingFunction'"
	 * @generated
	 */
	String getEnablingFunction();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction <em>Enabling Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabling Function</em>' attribute.
	 * @see #isSetEnablingFunction()
	 * @see #unsetEnablingFunction()
	 * @see #getEnablingFunction()
	 * @generated
	 */
	void setEnablingFunction(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction <em>Enabling Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnablingFunction()
	 * @see #getEnablingFunction()
	 * @see #setEnablingFunction(String)
	 * @generated
	 */
	void unsetEnablingFunction();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction <em>Enabling Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabling Function</em>' attribute is set.
	 * @see #unsetEnablingFunction()
	 * @see #getEnablingFunction()
	 * @see #setEnablingFunction(String)
	 * @generated
	 */
	boolean isSetEnablingFunction();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getImmediateTransitionType_Priority()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #setWeight(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getImmediateTransitionType_Weight()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='weight'"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeight()
	 * @see #getWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	void unsetWeight();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight <em>Weight</em>}' attribute is set.
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
