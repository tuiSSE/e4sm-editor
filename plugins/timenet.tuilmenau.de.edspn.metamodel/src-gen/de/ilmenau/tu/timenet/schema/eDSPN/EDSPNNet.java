/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getPlace <em>Place</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getExponentialTransition <em>Exponential Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getImmediateTransition <em>Immediate Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDeterministicTransition <em>Deterministic Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getGeneralTransition <em>General Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getArc <em>Arc</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getInhibit <em>Inhibit</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet()
 * @model extendedMetaData="name='eDSPNNet' kind='elementOnly'"
 * @generated
 */
public interface EDSPNNet extends NetType {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Place()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='place' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlaceType> getPlace();

	/**
	 * Returns the value of the '<em><b>Exponential Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponential Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_ExponentialTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exponentialTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExponentialTransitionType> getExponentialTransition();

	/**
	 * Returns the value of the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_ImmediateTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='immediateTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmediateTransitionType> getImmediateTransition();

	/**
	 * Returns the value of the '<em><b>Deterministic Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deterministic Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_DeterministicTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deterministicTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeterministicTransitionType> getDeterministicTransition();

	/**
	 * Returns the value of the '<em><b>General Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Transition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_GeneralTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeneralTransitionType> getGeneralTransition();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.ArcType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Arc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArcType> getArc();

	/**
	 * Returns the value of the '<em><b>Inhibit</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhibit</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Inhibit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inhibit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InhibitType> getInhibit();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getMeasure();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefinitionType> getDefinition();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getEDSPNNet_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

} // EDSPNNet
