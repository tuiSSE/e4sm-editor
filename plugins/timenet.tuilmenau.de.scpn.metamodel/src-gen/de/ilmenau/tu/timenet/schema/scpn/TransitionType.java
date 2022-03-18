/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getDisplayExpression <em>Display Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getGlobalGuard <em>Global Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLocalGuard <em>Local Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileDescription <em>Logfile Description</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileExpression <em>Logfile Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileName <em>Logfile Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getManualCode <em>Manual Code</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType <em>Server Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst <em>Take First</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getTimeGuard <em>Time Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType()
 * @model extendedMetaData="name='TransitionType' kind='elementOnly'"
 * @generated
 */
public interface TransitionType extends NodeType {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Expression</em>' attribute.
	 * @see #setDisplayExpression(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_DisplayExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayExpression'"
	 * @generated
	 */
	String getDisplayExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getDisplayExpression <em>Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Expression</em>' attribute.
	 * @see #getDisplayExpression()
	 * @generated
	 */
	void setDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>Global Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Guard</em>' attribute.
	 * @see #setGlobalGuard(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_GlobalGuard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='globalGuard'"
	 * @generated
	 */
	String getGlobalGuard();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getGlobalGuard <em>Global Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Guard</em>' attribute.
	 * @see #getGlobalGuard()
	 * @generated
	 */
	void setGlobalGuard(String value);

	/**
	 * Returns the value of the '<em><b>Local Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Guard</em>' attribute.
	 * @see #setLocalGuard(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_LocalGuard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='localGuard'"
	 * @generated
	 */
	String getLocalGuard();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLocalGuard <em>Local Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Guard</em>' attribute.
	 * @see #getLocalGuard()
	 * @generated
	 */
	void setLocalGuard(String value);

	/**
	 * Returns the value of the '<em><b>Logfile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logfile Description</em>' attribute.
	 * @see #setLogfileDescription(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_LogfileDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logfileDescription'"
	 * @generated
	 */
	String getLogfileDescription();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileDescription <em>Logfile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logfile Description</em>' attribute.
	 * @see #getLogfileDescription()
	 * @generated
	 */
	void setLogfileDescription(String value);

	/**
	 * Returns the value of the '<em><b>Logfile Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logfile Expression</em>' attribute.
	 * @see #setLogfileExpression(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_LogfileExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logfileExpression'"
	 * @generated
	 */
	String getLogfileExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileExpression <em>Logfile Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logfile Expression</em>' attribute.
	 * @see #getLogfileExpression()
	 * @generated
	 */
	void setLogfileExpression(String value);

	/**
	 * Returns the value of the '<em><b>Logfile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logfile Name</em>' attribute.
	 * @see #setLogfileName(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_LogfileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logfileName'"
	 * @generated
	 */
	String getLogfileName();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileName <em>Logfile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logfile Name</em>' attribute.
	 * @see #getLogfileName()
	 * @generated
	 */
	void setLogfileName(String value);

	/**
	 * Returns the value of the '<em><b>Manual Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Code</em>' attribute.
	 * @see #setManualCode(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_ManualCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manualCode'"
	 * @generated
	 */
	String getManualCode();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getManualCode <em>Manual Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Code</em>' attribute.
	 * @see #getManualCode()
	 * @generated
	 */
	void setManualCode(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Server Type</b></em>' attribute.
	 * The default value is <code>"ExclusiveServer"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.scpn.ServerTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #setServerType(ServerTypeType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_ServerType()
	 * @model default="ExclusiveServer" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='serverType'"
	 * @generated
	 */
	ServerTypeType getServerType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @generated
	 */
	void setServerType(ServerTypeType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ServerTypeType)
	 * @generated
	 */
	void unsetServerType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType <em>Server Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Type</em>' attribute is set.
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ServerTypeType)
	 * @generated
	 */
	boolean isSetServerType();

	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' attribute.
	 * The default value is <code>"Automatic"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.scpn.SpecTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @see #isSetSpecType()
	 * @see #unsetSpecType()
	 * @see #setSpecType(SpecTypeType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_SpecType()
	 * @model default="Automatic" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='specType'"
	 * @generated
	 */
	SpecTypeType getSpecType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @see #isSetSpecType()
	 * @see #unsetSpecType()
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(SpecTypeType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecType()
	 * @see #getSpecType()
	 * @see #setSpecType(SpecTypeType)
	 * @generated
	 */
	void unsetSpecType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType <em>Spec Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Type</em>' attribute is set.
	 * @see #unsetSpecType()
	 * @see #getSpecType()
	 * @see #setSpecType(SpecTypeType)
	 * @generated
	 */
	boolean isSetSpecType();

	/**
	 * Returns the value of the '<em><b>Take First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take First</em>' attribute.
	 * @see #isSetTakeFirst()
	 * @see #unsetTakeFirst()
	 * @see #setTakeFirst(boolean)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_TakeFirst()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='takeFirst'"
	 * @generated
	 */
	boolean isTakeFirst();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst <em>Take First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take First</em>' attribute.
	 * @see #isSetTakeFirst()
	 * @see #unsetTakeFirst()
	 * @see #isTakeFirst()
	 * @generated
	 */
	void setTakeFirst(boolean value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst <em>Take First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTakeFirst()
	 * @see #isTakeFirst()
	 * @see #setTakeFirst(boolean)
	 * @generated
	 */
	void unsetTakeFirst();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst <em>Take First</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Take First</em>' attribute is set.
	 * @see #unsetTakeFirst()
	 * @see #isTakeFirst()
	 * @see #setTakeFirst(boolean)
	 * @generated
	 */
	boolean isSetTakeFirst();

	/**
	 * Returns the value of the '<em><b>Time Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Guard</em>' attribute.
	 * @see #setTimeGuard(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_TimeGuard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeGuard'"
	 * @generated
	 */
	String getTimeGuard();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getTimeGuard <em>Time Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Guard</em>' attribute.
	 * @see #getTimeGuard()
	 * @generated
	 */
	void setTimeGuard(String value);

	/**
	 * Returns the value of the '<em><b>Watch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' attribute.
	 * @see #isSetWatch()
	 * @see #unsetWatch()
	 * @see #setWatch(boolean)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getTransitionType_Watch()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='watch'"
	 * @generated
	 */
	boolean isWatch();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch</em>' attribute.
	 * @see #isSetWatch()
	 * @see #unsetWatch()
	 * @see #isWatch()
	 * @generated
	 */
	void setWatch(boolean value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	void unsetWatch();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch <em>Watch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Watch</em>' attribute is set.
	 * @see #unsetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	boolean isSetWatch();

} // TransitionType
