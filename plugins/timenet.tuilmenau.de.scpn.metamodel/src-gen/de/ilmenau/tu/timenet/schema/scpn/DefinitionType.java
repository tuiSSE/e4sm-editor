/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getDefinitionType()
 * @model extendedMetaData="name='DefinitionType' kind='elementOnly'"
 * @generated
 */
public interface DefinitionType extends TextType {
	/**
	 * Returns the value of the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Data</em>' containment reference.
	 * @see #setAdditionalData(AddDataType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getDefinitionType_AdditionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDataType getAdditionalData();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getAdditionalData <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Data</em>' containment reference.
	 * @see #getAdditionalData()
	 * @generated
	 */
	void setAdditionalData(AddDataType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getDefinitionType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getDefinitionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getDefinitionType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // DefinitionType
