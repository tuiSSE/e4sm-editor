/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getLabelType()
 * @model extendedMetaData="name='LabelType' kind='elementOnly'"
 * @generated
 */
public interface LabelType extends TextType {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getLabelType_Text()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='text'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	boolean isSetText();

} // LabelType
