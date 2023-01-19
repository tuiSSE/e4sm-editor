/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inscription Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInscriptionTextType()
 * @model extendedMetaData="name='InscriptionTextType' kind='elementOnly'"
 * @generated
 */
public interface InscriptionTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInscriptionTextType_Graphics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsType getGraphics();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(GraphicsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInscriptionTextType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"inscriptionText"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.eDSPN.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Type)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getInscriptionTextType_Type()
	 * @model default="inscriptionText" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	boolean isSetType();

} // InscriptionTextType
