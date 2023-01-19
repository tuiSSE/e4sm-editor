/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType <em>Def Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getDefinitionType()
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getDefinitionType_AdditionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDataType getAdditionalData();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getAdditionalData <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Data</em>' containment reference.
	 * @see #getAdditionalData()
	 * @generated
	 */
	void setAdditionalData(AddDataType value);

	/**
	 * Returns the value of the '<em><b>Def Type</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @see #isSetDefType()
	 * @see #unsetDefType()
	 * @see #setDefType(DefTypeType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getDefinitionType_DefType()
	 * @model default="int" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='defType'"
	 * @generated
	 */
	DefTypeType getDefType();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType <em>Def Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Type</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @see #isSetDefType()
	 * @see #unsetDefType()
	 * @see #getDefType()
	 * @generated
	 */
	void setDefType(DefTypeType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType <em>Def Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefType()
	 * @see #getDefType()
	 * @see #setDefType(DefTypeType)
	 * @generated
	 */
	void unsetDefType();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType <em>Def Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Def Type</em>' attribute is set.
	 * @see #unsetDefType()
	 * @see #getDefType()
	 * @see #setDefType(DefTypeType)
	 * @generated
	 */
	boolean isSetDefType();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getDefinitionType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getExpression <em>Expression</em>}' attribute.
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getDefinitionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DefinitionType
