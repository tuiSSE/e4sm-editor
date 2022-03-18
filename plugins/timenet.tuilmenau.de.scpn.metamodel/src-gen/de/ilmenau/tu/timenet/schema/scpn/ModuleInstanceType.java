/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleInstanceType()
 * @model extendedMetaData="name='ModuleInstanceType' kind='elementOnly'"
 * @generated
 */
public interface ModuleInstanceType extends NodeType {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleInstanceType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ParameterValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleInstanceType_ParameterValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterValueType> getParameterValue();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleInstanceType_Implementation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='implementation'"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getModuleInstanceType_Module()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='module'"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

} // ModuleInstanceType
