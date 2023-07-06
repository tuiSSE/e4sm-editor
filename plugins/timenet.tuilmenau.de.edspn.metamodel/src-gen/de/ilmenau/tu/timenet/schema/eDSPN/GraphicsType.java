/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getX <em>X</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getGraphicsType()
 * @model extendedMetaData="name='GraphicsType' kind='empty'"
 * @generated
 */
public interface GraphicsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(BigInteger)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getGraphicsType_Orientation()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	BigInteger getOrientation();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(BigInteger value);

	/**
	 * Unsets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(BigInteger)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(BigInteger)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigInteger)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getGraphicsType_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	BigInteger getX();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigInteger)
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getGraphicsType_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	BigInteger getY();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigInteger value);

} // GraphicsType
