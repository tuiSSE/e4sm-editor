/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval <em>Eval</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getName <em>Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getResult <em>Result</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType()
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
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_AdditionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDataType getAdditionalData();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getAdditionalData <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Data</em>' containment reference.
	 * @see #getAdditionalData()
	 * @generated
	 */
	void setAdditionalData(AddDataType value);

	/**
	 * Returns the value of the '<em><b>Eval</b></em>' attribute.
	 * The default value is <code>"TimeAverage"</code>.
	 * The literals are from the enumeration {@link de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @see #isSetEval()
	 * @see #unsetEval()
	 * @see #setEval(MeasureEvalType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Eval()
	 * @model default="TimeAverage" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='eval'"
	 * @generated
	 */
	MeasureEvalType getEval();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval</em>' attribute.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @see #isSetEval()
	 * @see #unsetEval()
	 * @see #getEval()
	 * @generated
	 */
	void setEval(MeasureEvalType value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEval()
	 * @see #getEval()
	 * @see #setEval(MeasureEvalType)
	 * @generated
	 */
	void unsetEval();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval <em>Eval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eval</em>' attribute is set.
	 * @see #unsetEval()
	 * @see #getEval()
	 * @see #setEval(MeasureEvalType)
	 * @generated
	 */
	boolean isSetEval();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getExpression <em>Expression</em>}' attribute.
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
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getName <em>Name</em>}' attribute.
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
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Result()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='result'"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Watch</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' attribute.
	 * @see #isSetWatch()
	 * @see #unsetWatch()
	 * @see #setWatch(boolean)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getMeasureType_Watch()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='watch'"
	 * @generated
	 */
	boolean isWatch();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch <em>Watch</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	void unsetWatch();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch <em>Watch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Watch</em>' attribute is set.
	 * @see #unsetWatch()
	 * @see #isWatch()
	 * @see #setWatch(boolean)
	 * @generated
	 */
	boolean isSetWatch();

} // MeasureType
