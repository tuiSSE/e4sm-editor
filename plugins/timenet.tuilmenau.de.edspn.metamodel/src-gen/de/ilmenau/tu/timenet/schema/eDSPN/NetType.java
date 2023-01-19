/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getNetclass <em>Netclass</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges <em>Sharp Edges</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getNetType()
 * @model extendedMetaData="name='NetType' kind='empty'"
 * @generated
 */
public interface NetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Grid Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Active</em>' attribute.
	 * @see #isSetGridActive()
	 * @see #unsetGridActive()
	 * @see #setGridActive(boolean)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getNetType_GridActive()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='gridActive'"
	 * @generated
	 */
	boolean isGridActive();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Active</em>' attribute.
	 * @see #isSetGridActive()
	 * @see #unsetGridActive()
	 * @see #isGridActive()
	 * @generated
	 */
	void setGridActive(boolean value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGridActive()
	 * @see #isGridActive()
	 * @see #setGridActive(boolean)
	 * @generated
	 */
	void unsetGridActive();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive <em>Grid Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grid Active</em>' attribute is set.
	 * @see #unsetGridActive()
	 * @see #isGridActive()
	 * @see #setGridActive(boolean)
	 * @generated
	 */
	boolean isSetGridActive();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getNetType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netclass</em>' attribute.
	 * @see #setNetclass(String)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getNetType_Netclass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='netclass'"
	 * @generated
	 */
	String getNetclass();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getNetclass <em>Netclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netclass</em>' attribute.
	 * @see #getNetclass()
	 * @generated
	 */
	void setNetclass(String value);

	/**
	 * Returns the value of the '<em><b>Sharp Edges</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharp Edges</em>' attribute.
	 * @see #isSetSharpEdges()
	 * @see #unsetSharpEdges()
	 * @see #setSharpEdges(boolean)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getNetType_SharpEdges()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sharpEdges'"
	 * @generated
	 */
	boolean isSharpEdges();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges <em>Sharp Edges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharp Edges</em>' attribute.
	 * @see #isSetSharpEdges()
	 * @see #unsetSharpEdges()
	 * @see #isSharpEdges()
	 * @generated
	 */
	void setSharpEdges(boolean value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges <em>Sharp Edges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSharpEdges()
	 * @see #isSharpEdges()
	 * @see #setSharpEdges(boolean)
	 * @generated
	 */
	void unsetSharpEdges();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges <em>Sharp Edges</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sharp Edges</em>' attribute is set.
	 * @see #unsetSharpEdges()
	 * @see #isSharpEdges()
	 * @see #setSharpEdges(boolean)
	 * @generated
	 */
	boolean isSetSharpEdges();

} // NetType
