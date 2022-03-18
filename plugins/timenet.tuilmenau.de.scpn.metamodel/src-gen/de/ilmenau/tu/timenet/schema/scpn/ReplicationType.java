/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getPlace <em>Place</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getTimedTransition <em>Timed Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getImmediateTransition <em>Immediate Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getSubstitutionTransition <em>Substitution Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModulePin <em>Module Pin</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getArc <em>Arc</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType()
 * @model extendedMetaData="name='ReplicationType' kind='elementOnly'"
 * @generated
 */
public interface ReplicationType extends NetType {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.PlaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_Place()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='place' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlaceType> getPlace();

	/**
	 * Returns the value of the '<em><b>Timed Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timed Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_TimedTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timedTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimedTransitionType> getTimedTransition();

	/**
	 * Returns the value of the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_ImmediateTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='immediateTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmediateTransitionType> getImmediateTransition();

	/**
	 * Returns the value of the '<em><b>Substitution Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_SubstitutionTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitutionTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstitutionTransitionType> getSubstitutionTransition();

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Instance</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_ModuleInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleInstanceType> getModuleInstance();

	/**
	 * Returns the value of the '<em><b>Module Pin</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ModulePinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Pin</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_ModulePin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modulePin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModulePinType> getModulePin();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.ArcType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_Arc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArcType> getArc();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getMeasure();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefinitionType> getDefinition();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.scpn.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#getReplicationType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

} // ReplicationType
