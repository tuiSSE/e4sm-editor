/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.AddDataType#getClassname <em>Classname</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getAddDataType()
 * @model extendedMetaData="name='AddDataType' kind='empty'"
 * @generated
 */
public interface AddDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see #setClassname(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getAddDataType_Classname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='classname'"
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.AddDataType#getClassname <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classname</em>' attribute.
	 * @see #getClassname()
	 * @generated
	 */
	void setClassname(String value);

} // AddDataType
