/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getNet <em>Net</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleType()
 * @model extendedMetaData="name='ModuleType' kind='elementOnly'"
 * @generated
 */
public interface ModuleType extends NodeType {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleType_Net()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleImplementationType> getNet();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType> getParameter();

} // ModuleType
