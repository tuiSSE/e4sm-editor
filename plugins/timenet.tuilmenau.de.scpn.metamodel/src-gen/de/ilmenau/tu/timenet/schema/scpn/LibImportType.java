/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lib Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.LibImportType#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getLibImportType()
 * @model extendedMetaData="name='LibImportType' kind='elementOnly'"
 * @generated
 */
public interface LibImportType extends TextType {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getLibImportType_Filename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='filename'"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.LibImportType#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // LibImportType
