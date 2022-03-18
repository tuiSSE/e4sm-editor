/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction <em>Time Function</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTimedTransitionType()
 * @model extendedMetaData="name='TimedTransitionType' kind='elementOnly'"
 * @generated
 */
public interface TimedTransitionType extends TransitionType {
	/**
	 * Returns the value of the '<em><b>Time Function</b></em>' attribute.
	 * The default value is <code>"EXP(1.0)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Function</em>' attribute.
	 * @see #isSetTimeFunction()
	 * @see #unsetTimeFunction()
	 * @see #setTimeFunction(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTimedTransitionType_TimeFunction()
	 * @model default="EXP(1.0)" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeFunction'"
	 * @generated
	 */
	String getTimeFunction();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction <em>Time Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Function</em>' attribute.
	 * @see #isSetTimeFunction()
	 * @see #unsetTimeFunction()
	 * @see #getTimeFunction()
	 * @generated
	 */
	void setTimeFunction(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction <em>Time Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeFunction()
	 * @see #getTimeFunction()
	 * @see #setTimeFunction(String)
	 * @generated
	 */
	void unsetTimeFunction();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction <em>Time Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Function</em>' attribute is set.
	 * @see #unsetTimeFunction()
	 * @see #getTimeFunction()
	 * @see #setTimeFunction(String)
	 * @generated
	 */
	boolean isSetTimeFunction();

} // TimedTransitionType
