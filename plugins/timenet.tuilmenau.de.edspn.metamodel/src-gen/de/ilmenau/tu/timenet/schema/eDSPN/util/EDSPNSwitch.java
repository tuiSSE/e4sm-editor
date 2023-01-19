/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.util;

import de.ilmenau.tu.timenet.schema.eDSPN.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage
 * @generated
 */
public class EDSPNSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDSPNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNSwitch() {
		if (modelPackage == null) {
			modelPackage = EDSPNPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EDSPNPackage.ADD_DATA_TYPE: {
			AddDataType addDataType = (AddDataType) theEObject;
			T result = caseAddDataType(addDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.ARC_TYPE: {
			ArcType arcType = (ArcType) theEObject;
			T result = caseArcType(arcType);
			if (result == null)
				result = caseConnectorType(arcType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.COMMENT_TYPE: {
			CommentType commentType = (CommentType) theEObject;
			T result = caseCommentType(commentType);
			if (result == null)
				result = caseTextType(commentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.CONNECTOR_TYPE: {
			ConnectorType connectorType = (ConnectorType) theEObject;
			T result = caseConnectorType(connectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.DEFINITION_TYPE: {
			DefinitionType definitionType = (DefinitionType) theEObject;
			T result = caseDefinitionType(definitionType);
			if (result == null)
				result = caseTextType(definitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE: {
			DeterministicTransitionType deterministicTransitionType = (DeterministicTransitionType) theEObject;
			T result = caseDeterministicTransitionType(deterministicTransitionType);
			if (result == null)
				result = caseTransitionType(deterministicTransitionType);
			if (result == null)
				result = caseNodeType(deterministicTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.EDSPN_NET: {
			EDSPNNet edspnNet = (EDSPNNet) theEObject;
			T result = caseEDSPNNet(edspnNet);
			if (result == null)
				result = caseNetType(edspnNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.EXPONENTIAL_TRANSITION_TYPE: {
			ExponentialTransitionType exponentialTransitionType = (ExponentialTransitionType) theEObject;
			T result = caseExponentialTransitionType(exponentialTransitionType);
			if (result == null)
				result = caseTransitionType(exponentialTransitionType);
			if (result == null)
				result = caseNodeType(exponentialTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.GENERAL_TRANSITION_TYPE: {
			GeneralTransitionType generalTransitionType = (GeneralTransitionType) theEObject;
			T result = caseGeneralTransitionType(generalTransitionType);
			if (result == null)
				result = caseTransitionType(generalTransitionType);
			if (result == null)
				result = caseNodeType(generalTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.GRAPHICS_TYPE: {
			GraphicsType graphicsType = (GraphicsType) theEObject;
			T result = caseGraphicsType(graphicsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.HANDLE_TYPE: {
			HandleType handleType = (HandleType) theEObject;
			T result = caseHandleType(handleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE: {
			ImmediateTransitionType immediateTransitionType = (ImmediateTransitionType) theEObject;
			T result = caseImmediateTransitionType(immediateTransitionType);
			if (result == null)
				result = caseTransitionType(immediateTransitionType);
			if (result == null)
				result = caseNodeType(immediateTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.INHIBIT_TYPE: {
			InhibitType inhibitType = (InhibitType) theEObject;
			T result = caseInhibitType(inhibitType);
			if (result == null)
				result = caseConnectorType(inhibitType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.INSCRIPTION_TEXT_TYPE: {
			InscriptionTextType inscriptionTextType = (InscriptionTextType) theEObject;
			T result = caseInscriptionTextType(inscriptionTextType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.INSCRIPTION_TYPE: {
			InscriptionType inscriptionType = (InscriptionType) theEObject;
			T result = caseInscriptionType(inscriptionType);
			if (result == null)
				result = caseInscriptionTextType(inscriptionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.LABEL_TYPE: {
			LabelType labelType = (LabelType) theEObject;
			T result = caseLabelType(labelType);
			if (result == null)
				result = caseTextType(labelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.MEASURE_TYPE: {
			MeasureType measureType = (MeasureType) theEObject;
			T result = caseMeasureType(measureType);
			if (result == null)
				result = caseTextType(measureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.NET_TYPE: {
			NetType netType = (NetType) theEObject;
			T result = caseNetType(netType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.NODE_TYPE: {
			NodeType nodeType = (NodeType) theEObject;
			T result = caseNodeType(nodeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.PLACE_TYPE: {
			PlaceType placeType = (PlaceType) theEObject;
			T result = casePlaceType(placeType);
			if (result == null)
				result = caseNodeType(placeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.TEXT_TYPE: {
			TextType textType = (TextType) theEObject;
			T result = caseTextType(textType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EDSPNPackage.TRANSITION_TYPE: {
			TransitionType transitionType = (TransitionType) theEObject;
			T result = caseTransitionType(transitionType);
			if (result == null)
				result = caseNodeType(transitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddDataType(AddDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcType(ArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionType(DefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deterministic Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deterministic Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeterministicTransitionType(DeterministicTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDSPNNet(EDSPNNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentialTransitionType(ExponentialTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTransitionType(GeneralTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicsType(GraphicsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandleType(HandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateTransitionType(ImmediateTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inhibit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inhibit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInhibitType(InhibitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inscription Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inscription Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInscriptionTextType(InscriptionTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inscription Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inscription Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInscriptionType(InscriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetType(NetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeType(NodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceType(PlaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionType(TransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EDSPNSwitch
