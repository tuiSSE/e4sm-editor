/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.util;

import de.ilmenau.tu.timenet.schema.eDSPN.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage
 * @generated
 */
public class EDSPNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDSPNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EDSPNPackage.eINSTANCE;
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
	protected EDSPNSwitch<Adapter> modelSwitch = new EDSPNSwitch<Adapter>() {
		@Override
		public Adapter caseAddDataType(AddDataType object) {
			return createAddDataTypeAdapter();
		}

		@Override
		public Adapter caseArcType(ArcType object) {
			return createArcTypeAdapter();
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
		public Adapter caseDeterministicTransitionType(DeterministicTransitionType object) {
			return createDeterministicTransitionTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseEDSPNNet(EDSPNNet object) {
			return createEDSPNNetAdapter();
		}

		@Override
		public Adapter caseExponentialTransitionType(ExponentialTransitionType object) {
			return createExponentialTransitionTypeAdapter();
		}

		@Override
		public Adapter caseGeneralTransitionType(GeneralTransitionType object) {
			return createGeneralTransitionTypeAdapter();
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
		public Adapter caseInhibitType(InhibitType object) {
			return createInhibitTypeAdapter();
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
		public Adapter caseMeasureType(MeasureType object) {
			return createMeasureTypeAdapter();
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
		public Adapter casePlaceType(PlaceType object) {
			return createPlaceTypeAdapter();
		}

		@Override
		public Adapter caseTextType(TextType object) {
			return createTextTypeAdapter();
		}

		@Override
		public Adapter caseTransitionType(TransitionType object) {
			return createTransitionTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.AddDataType <em>Add Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.AddDataType
	 * @generated
	 */
	public Adapter createAddDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType <em>Deterministic Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType
	 * @generated
	 */
	public Adapter createDeterministicTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet
	 * @generated
	 */
	public Adapter createEDSPNNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType <em>Exponential Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType
	 * @generated
	 */
	public Adapter createExponentialTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType <em>General Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType
	 * @generated
	 */
	public Adapter createGeneralTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType
	 * @generated
	 */
	public Adapter createGraphicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.HandleType
	 * @generated
	 */
	public Adapter createHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType <em>Immediate Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType
	 * @generated
	 */
	public Adapter createImmediateTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType <em>Inhibit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InhibitType
	 * @generated
	 */
	public Adapter createInhibitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType <em>Inscription Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType
	 * @generated
	 */
	public Adapter createInscriptionTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType <em>Inscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType
	 * @generated
	 */
	public Adapter createInscriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType <em>Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType
	 * @generated
	 */
	public Adapter createNetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PlaceType
	 * @generated
	 */
	public Adapter createPlaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TextType
	 * @generated
	 */
	public Adapter createTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ilmenau.tu.timenet.schema.eDSPN.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TransitionType
	 * @generated
	 */
	public Adapter createTransitionTypeAdapter() {
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

} //EDSPNAdapterFactory
