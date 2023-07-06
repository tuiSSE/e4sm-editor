/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking <em>Initial Marking</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getPlaceType()
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getPlaceType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' attribute.
	 * @see #isSetInitialMarking()
	 * @see #unsetInitialMarking()
	 * @see #setInitialMarking(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getPlaceType_InitialMarking()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initialMarking'"
	 * @generated
	 */
	String getInitialMarking();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' attribute.
	 * @see #isSetInitialMarking()
	 * @see #unsetInitialMarking()
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialMarking()
	 * @see #getInitialMarking()
	 * @see #setInitialMarking(String)
	 * @generated
	 */
	void unsetInitialMarking();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking <em>Initial Marking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Marking</em>' attribute is set.
	 * @see #unsetInitialMarking()
	 * @see #getInitialMarking()
	 * @see #setInitialMarking(String)
	 * @generated
	 */
	boolean isSetInitialMarking();

} // PlaceType
