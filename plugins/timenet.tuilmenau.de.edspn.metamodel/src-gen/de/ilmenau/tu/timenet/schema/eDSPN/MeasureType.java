/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getName <em>Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getMeasureType()
 * @model extendedMetaData="name='MeasureType' kind='elementOnly'"
 * @generated
 */
public interface MeasureType extends TextType {
	/**
	 * Returns the value of the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Data</em>' containment reference.
	 * @see #setAdditionalData(AddDataType)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getMeasureType_AdditionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDataType getAdditionalData();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getAdditionalData <em>Additional Data</em>}' containment reference.
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getMeasureType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getExpression <em>Expression</em>}' attribute.
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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getMeasureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getMeasureType_Result()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result'"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(String)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(String)
	 * @generated
	 */
	boolean isSetResult();

} // MeasureType
