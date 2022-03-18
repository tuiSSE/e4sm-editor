/**
 */
package de.ilmenau.tu.timenet.schema.scpn.util;

import de.ilmenau.tu.timenet.schema.scpn.*;

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
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage
 * @generated
 */
public class scpnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static scpnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scpnSwitch() {
		if (modelPackage == null) {
			modelPackage = scpnPackage.eINSTANCE;
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
		case scpnPackage.ADD_DATA_TYPE: {
			AddDataType addDataType = (AddDataType) theEObject;
			T result = caseAddDataType(addDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.ARC_TYPE: {
			ArcType arcType = (ArcType) theEObject;
			T result = caseArcType(arcType);
			if (result == null)
				result = caseConnectorType(arcType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.ATTRIBUTE_TYPE: {
			AttributeType attributeType = (AttributeType) theEObject;
			T result = caseAttributeType(attributeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.COMMENT_TYPE: {
			CommentType commentType = (CommentType) theEObject;
			T result = caseCommentType(commentType);
			if (result == null)
				result = caseTextType(commentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.CONNECTOR_TYPE: {
			ConnectorType connectorType = (ConnectorType) theEObject;
			T result = caseConnectorType(connectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.DEFINITION_TYPE: {
			DefinitionType definitionType = (DefinitionType) theEObject;
			T result = caseDefinitionType(definitionType);
			if (result == null)
				result = caseTextType(definitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.GRAPHICS_TYPE: {
			GraphicsType graphicsType = (GraphicsType) theEObject;
			T result = caseGraphicsType(graphicsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.HANDLE_TYPE: {
			HandleType handleType = (HandleType) theEObject;
			T result = caseHandleType(handleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.IMMEDIATE_TRANSITION_TYPE: {
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
		case scpnPackage.INSCRIPTION_TEXT_TYPE: {
			InscriptionTextType inscriptionTextType = (InscriptionTextType) theEObject;
			T result = caseInscriptionTextType(inscriptionTextType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.INSCRIPTION_TYPE: {
			InscriptionType inscriptionType = (InscriptionType) theEObject;
			T result = caseInscriptionType(inscriptionType);
			if (result == null)
				result = caseInscriptionTextType(inscriptionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.LABEL_TYPE: {
			LabelType labelType = (LabelType) theEObject;
			T result = caseLabelType(labelType);
			if (result == null)
				result = caseTextType(labelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.LIB_IMPORT_TYPE: {
			LibImportType libImportType = (LibImportType) theEObject;
			T result = caseLibImportType(libImportType);
			if (result == null)
				result = caseTextType(libImportType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.MEASURE_TYPE: {
			MeasureType measureType = (MeasureType) theEObject;
			T result = caseMeasureType(measureType);
			if (result == null)
				result = caseTextType(measureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE: {
			ModuleImplementationType moduleImplementationType = (ModuleImplementationType) theEObject;
			T result = caseModuleImplementationType(moduleImplementationType);
			if (result == null)
				result = caseNetType(moduleImplementationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.MODULE_INSTANCE_TYPE: {
			ModuleInstanceType moduleInstanceType = (ModuleInstanceType) theEObject;
			T result = caseModuleInstanceType(moduleInstanceType);
			if (result == null)
				result = caseNodeType(moduleInstanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.MODULE_PIN_TYPE: {
			ModulePinType modulePinType = (ModulePinType) theEObject;
			T result = caseModulePinType(modulePinType);
			if (result == null)
				result = caseNodeType(modulePinType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.MODULE_TYPE: {
			ModuleType moduleType = (ModuleType) theEObject;
			T result = caseModuleType(moduleType);
			if (result == null)
				result = caseNodeType(moduleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.NET_TYPE: {
			NetType netType = (NetType) theEObject;
			T result = caseNetType(netType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.NODE_TYPE: {
			NodeType nodeType = (NodeType) theEObject;
			T result = caseNodeType(nodeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.PARAMETER_TYPE: {
			ParameterType parameterType = (ParameterType) theEObject;
			T result = caseParameterType(parameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.PARAMETER_VALUE_TYPE: {
			ParameterValueType parameterValueType = (ParameterValueType) theEObject;
			T result = caseParameterValueType(parameterValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.PLACE_TYPE: {
			PlaceType placeType = (PlaceType) theEObject;
			T result = casePlaceType(placeType);
			if (result == null)
				result = caseNodeType(placeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.RECORD_TOKENTYPE: {
			RecordTokentype recordTokentype = (RecordTokentype) theEObject;
			T result = caseRecordTokentype(recordTokentype);
			if (result == null)
				result = caseTextType(recordTokentype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.REPLICATION_TYPE: {
			ReplicationType replicationType = (ReplicationType) theEObject;
			T result = caseReplicationType(replicationType);
			if (result == null)
				result = caseNetType(replicationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.SCPN_NET: {
			SCPNNet scpnNet = (SCPNNet) theEObject;
			T result = caseSCPNNet(scpnNet);
			if (result == null)
				result = caseNetType(scpnNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE: {
			SubstitutionTransitionType substitutionTransitionType = (SubstitutionTransitionType) theEObject;
			T result = caseSubstitutionTransitionType(substitutionTransitionType);
			if (result == null)
				result = caseTransitionType(substitutionTransitionType);
			if (result == null)
				result = caseNodeType(substitutionTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.TEXT_TYPE: {
			TextType textType = (TextType) theEObject;
			T result = caseTextType(textType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.TIMED_TRANSITION_TYPE: {
			TimedTransitionType timedTransitionType = (TimedTransitionType) theEObject;
			T result = caseTimedTransitionType(timedTransitionType);
			if (result == null)
				result = caseTransitionType(timedTransitionType);
			if (result == null)
				result = caseNodeType(timedTransitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.TRANSITION_TYPE: {
			TransitionType transitionType = (TransitionType) theEObject;
			T result = caseTransitionType(transitionType);
			if (result == null)
				result = caseNodeType(transitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case scpnPackage.TYPEDEF_TYPE: {
			TypedefType typedefType = (TypedefType) theEObject;
			T result = caseTypedefType(typedefType);
			if (result == null)
				result = caseTextType(typedefType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Lib Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lib Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibImportType(LibImportType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Module Implementation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Implementation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleImplementationType(ModuleImplementationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInstanceType(ModuleInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Pin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Pin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulePinType(ModulePinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleType(ModuleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueType(ParameterValueType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Record Tokentype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Tokentype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTokentype(RecordTokentype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplicationType(ReplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCPN Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCPN Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCPNNet(SCPNNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutionTransitionType(SubstitutionTransitionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Timed Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedTransitionType(TimedTransitionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Typedef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefType(TypedefType object) {
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

} //scpnSwitch
