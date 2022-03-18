/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue <em>Queue</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getTokentype <em>Tokentype</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType()
 * @model extendedMetaData="name='PlaceType' kind='elementOnly'"
 * @generated
 */
public interface PlaceType extends NodeType {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #isSetCapacity()
	 * @see #unsetCapacity()
	 * @see #setCapacity(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Capacity()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	String getCapacity();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #isSetCapacity()
	 * @see #unsetCapacity()
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacity()
	 * @see #getCapacity()
	 * @see #setCapacity(String)
	 * @generated
	 */
	void unsetCapacity();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity <em>Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity</em>' attribute is set.
	 * @see #unsetCapacity()
	 * @see #getCapacity()
	 * @see #setCapacity(String)
	 * @generated
	 */
	boolean isSetCapacity();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' attribute.
	 * @see #setInitialMarking(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_InitialMarking()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initialMarking'"
	 * @generated
	 */
	String getInitialMarking();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getInitialMarking <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' attribute.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.scpn.QueueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @see #isSetQueue()
	 * @see #unsetQueue()
	 * @see #setQueue(QueueType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Queue()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='queue'"
	 * @generated
	 */
	QueueType getQueue();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @see #isSetQueue()
	 * @see #unsetQueue()
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(QueueType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueue()
	 * @see #getQueue()
	 * @see #setQueue(QueueType)
	 * @generated
	 */
	void unsetQueue();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue <em>Queue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue</em>' attribute is set.
	 * @see #unsetQueue()
	 * @see #getQueue()
	 * @see #setQueue(QueueType)
	 * @generated
	 */
	boolean isSetQueue();

	/**
	 * Returns the value of the '<em><b>Tokentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokentype</em>' attribute.
	 * @see #setTokentype(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Tokentype()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tokentype'"
	 * @generated
	 */
	String getTokentype();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getTokentype <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokentype</em>' attribute.
	 * @see #getTokentype()
	 * @generated
	 */
	void setTokentype(String value);

	/**
	 * Returns the value of the '<em><b>Watch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' attribute.
	 * @see #isSetWatch()
	 * @see #unsetWatch()
	 * @see #setWatch(boolean)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getPlaceType_Watch()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='watch'"
	 * @generated
	 */
	boolean isWatch();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch <em>Watch</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	void unsetWatch();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch <em>Watch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Watch</em>' attribute is set.
	 * @see #unsetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	boolean isSetWatch();

} // PlaceType
