/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inscription Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getInscriptionType()
 * @model extendedMetaData="name='InscriptionType' kind='elementOnly'"
 * @generated
 */
public interface InscriptionType extends InscriptionTextType {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"x"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getInscriptionType_Text()
	 * @model default="x" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='text'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText <em>Text</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	boolean isSetText();

} // InscriptionType
