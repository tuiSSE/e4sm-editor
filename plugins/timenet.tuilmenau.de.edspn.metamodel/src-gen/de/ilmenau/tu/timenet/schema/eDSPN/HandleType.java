/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getHandleType()
 * @model extendedMetaData="name='HandleType' kind='elementOnly'"
 * @generated
 */
public interface HandleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getHandleType_Graphics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsType getGraphics();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getGraphics <em>Graphics</em>}' containment reference.
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getHandleType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // HandleType
