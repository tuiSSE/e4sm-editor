/**
 */
package de.ilmenau.tu.timenet.schema.scpn.util;

import de.ilmenau.tu.timenet.schema.scpn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage
 * @generated
 */
public class scpnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static scpnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scpnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = scpnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scpnSwitch<Adapter> modelSwitch = new scpnSwitch<Adapter>() {
		@Override
		public Adapter caseAddDataType(AddDataType object) {
			return createAddDataTypeAdapter();
		}

		@Override
		public Adapter caseArcType(ArcType object) {
			return createArcTypeAdapter();
		}

		@Override
		public Adapter caseAttributeType(AttributeType object) {
			return createAttributeTypeAdapter();
		}

		@Override
		public Adapter caseCommentType(CommentType object) {
			return createCommentTypeAdapter();
		}

		@Override
		public Adapter caseConnectorType(ConnectorType object) {
			return createConnectorTypeAdapter();
		}

		@Override
		public Adapter caseDefinitionType(DefinitionType object) {
			return createDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseGraphicsType(GraphicsType object) {
			return createGraphicsTypeAdapter();
		}

		@Override
		public Adapter caseHandleType(HandleType object) {
			return createHandleTypeAdapter();
		}

		@Override
		public Adapter caseImmediateTransitionType(ImmediateTransitionType object) {
			return createImmediateTransitionTypeAdapter();
		}

		@Override
		public Adapter caseInscriptionTextType(InscriptionTextType object) {
			return createInscriptionTextTypeAdapter();
		}

		@Override
		public Adapter caseInscriptionType(InscriptionType object) {
			return createInscriptionTypeAdapter();
		}

		@Override
		public Adapter caseLabelType(LabelType object) {
			return createLabelTypeAdapter();
		}

		@Override
		public Adapter caseLibImportType(LibImportType object) {
			return createLibImportTypeAdapter();
		}

		@Override
		public Adapter caseMeasureType(MeasureType object) {
			return createMeasureTypeAdapter();
		}

		@Override
		public Adapter caseModuleImplementationType(ModuleImplementationType object) {
			return createModuleImplementationTypeAdapter();
		}

		@Override
		public Adapter caseModuleInstanceType(ModuleInstanceType object) {
			return createModuleInstanceTypeAdapter();
		}

		@Override
		public Adapter caseModulePinType(ModulePinType object) {
			return createModulePinTypeAdapter();
		}

		@Override
		public Adapter caseModuleType(ModuleType object) {
			return createModuleTypeAdapter();
		}

		@Override
		public Adapter caseNetType(NetType object) {
			return createNetTypeAdapter();
		}

		@Override
		public Adapter caseNodeType(NodeType object) {
			return createNodeTypeAdapter();
		}

		@Override
		public Adapter caseParameterType(ParameterType object) {
			return createParameterTypeAdapter();
		}

		@Override
		public Adapter caseParameterValueType(ParameterValueType object) {
			return createParameterValueTypeAdapter();
		}

		@Override
		public Adapter casePlaceType(PlaceType object) {
			return createPlaceTypeAdapter();
		}

		@Override
		public Adapter caseRecordTokentype(RecordTokentype object) {
			return createRecordTokentypeAdapter();
		}

		@Override
		public Adapter caseReplicationType(ReplicationType object) {
			return createReplicationTypeAdapter();
		}

		@Override
		public Adapter caseSCPNNet(SCPNNet object) {
			return createSCPNNetAdapter();
		}

		@Override
		public Adapter caseSubstitutionTransitionType(SubstitutionTransitionType object) {
			return createSubstitutionTransitionTypeAdapter();
		}

		@Override
		public Adapter caseTextType(TextType object) {
			return createTextTypeAdapter();
		}

		@Override
		public Adapter caseTimedTransitionType(TimedTransitionType object) {
			return createTimedTransitionTypeAdapter();
		}

		@Override
		public Adapter caseTransitionType(TransitionType object) {
			return createTransitionTypeAdapter();
		}

		@Override
		public Adapter caseTypedefType(TypedefType object) {
			return createTypedefTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.AddDataType <em>Add Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AddDataType
	 * @generated
	 */
	public Adapter createAddDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.GraphicsType
	 * @generated
	 */
	public Adapter createGraphicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.HandleType
	 * @generated
	 */
	public Adapter createHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType <em>Immediate Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType
	 * @generated
	 */
	public Adapter createImmediateTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType <em>Inscription Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType
	 * @generated
	 */
	public Adapter createInscriptionTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType <em>Inscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionType
	 * @generated
	 */
	public Adapter createInscriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.LibImportType <em>Lib Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LibImportType
	 * @generated
	 */
	public Adapter createLibImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType <em>Module Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType
	 * @generated
	 */
	public Adapter createModuleImplementationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType <em>Module Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType
	 * @generated
	 */
	public Adapter createModuleInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ModulePinType <em>Module Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModulePinType
	 * @generated
	 */
	public Adapter createModulePinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleType
	 * @generated
	 */
	public Adapter createModuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.NetType <em>Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType
	 * @generated
	 */
	public Adapter createNetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterValueType
	 * @generated
	 */
	public Adapter createParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType
	 * @generated
	 */
	public Adapter createPlaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.RecordTokentype <em>Record Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.RecordTokentype
	 * @generated
	 */
	public Adapter createRecordTokentypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType <em>Replication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType
	 * @generated
	 */
	public Adapter createReplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet <em>SCPN Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet
	 * @generated
	 */
	public Adapter createSCPNNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType <em>Substitution Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType
	 * @generated
	 */
	public Adapter createSubstitutionTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TextType
	 * @generated
	 */
	public Adapter createTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType <em>Timed Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType
	 * @generated
	 */
	public Adapter createTimedTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType
	 * @generated
	 */
	public Adapter createTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.scpn.TypedefType <em>Typedef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TypedefType
	 * @generated
	 */
	public Adapter createTypedefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //scpnAdapterFactory
