/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType#getCommentText <em>Comment Text</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getCommentType()
 * @model extendedMetaData="name='CommentType' kind='elementOnly'"
 * @generated
 */
public interface CommentType extends TextType {
	/**
	 * Returns the value of the '<em><b>Comment Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Text</em>' attribute.
	 * @see #setCommentText(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getCommentType_CommentText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='commentText'"
	 * @generated
	 */
	String getCommentText();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType#getCommentText <em>Comment Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Text</em>' attribute.
	 * @see #getCommentText()
	 * @generated
	 */
	void setCommentText(String value);

} // CommentType
