/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getFromNode <em>From Node</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getToNode <em>To Node</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getConnectorType()
 * @model extendedMetaData="name='ConnectorType' kind='empty'"
 * @generated
 */
public interface ConnectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' attribute.
	 * @see #setFromNode(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getConnectorType_FromNode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fromNode'"
	 * @generated
	 */
	String getFromNode();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getFromNode <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' attribute.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getConnectorType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' attribute.
	 * @see #setToNode(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getConnectorType_ToNode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='toNode'"
	 * @generated
	 */
	String getToNode();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getToNode <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' attribute.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"connector"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.eDSPN.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Type)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getConnectorType_Type()
	 * @model default="connector" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	boolean isSetType();

} // ConnectorType
