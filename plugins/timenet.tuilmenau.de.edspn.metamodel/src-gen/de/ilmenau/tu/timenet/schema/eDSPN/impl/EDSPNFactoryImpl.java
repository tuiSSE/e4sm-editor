/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDSPNFactoryImpl extends EFactoryImpl implements EDSPNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDSPNFactory init() {
		try {
			EDSPNFactory theEDSPNFactory = (EDSPNFactory) EPackage.Registry.INSTANCE.getEFactory(EDSPNPackage.eNS_URI);
			if (theEDSPNFactory != null) {
				return theEDSPNFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EDSPNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EDSPNPackage.ADD_DATA_TYPE:
			return createAddDataType();
		case EDSPNPackage.ARC_TYPE:
			return createArcType();
		case EDSPNPackage.COMMENT_TYPE:
			return createCommentType();
		case EDSPNPackage.CONNECTOR_TYPE:
			return createConnectorType();
		case EDSPNPackage.DEFINITION_TYPE:
			return createDefinitionType();
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE:
			return createDeterministicTransitionType();
		case EDSPNPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case EDSPNPackage.EDSPN_NET:
			return createEDSPNNet();
		case EDSPNPackage.EXPONENTIAL_TRANSITION_TYPE:
			return createExponentialTransitionType();
		case EDSPNPackage.GENERAL_TRANSITION_TYPE:
			return createGeneralTransitionType();
		case EDSPNPackage.GRAPHICS_TYPE:
			return createGraphicsType();
		case EDSPNPackage.HANDLE_TYPE:
			return createHandleType();
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE:
			return createImmediateTransitionType();
		case EDSPNPackage.INHIBIT_TYPE:
			return createInhibitType();
		case EDSPNPackage.INSCRIPTION_TEXT_TYPE:
			return createInscriptionTextType();
		case EDSPNPackage.INSCRIPTION_TYPE:
			return createInscriptionType();
		case EDSPNPackage.LABEL_TYPE:
			return createLabelType();
		case EDSPNPackage.MEASURE_TYPE:
			return createMeasureType();
		case EDSPNPackage.NET_TYPE:
			return createNetType();
		case EDSPNPackage.NODE_TYPE:
			return createNodeType();
		case EDSPNPackage.PLACE_TYPE:
			return createPlaceType();
		case EDSPNPackage.TEXT_TYPE:
			return createTextType();
		case EDSPNPackage.TRANSITION_TYPE:
			return createTransitionType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EDSPNPackage.BOOLEAN_TYPE:
			return createBooleanTypeFromString(eDataType, initialValue);
		case EDSPNPackage.DEF_TYPE_TYPE:
			return createDefTypeTypeFromString(eDataType, initialValue);
		case EDSPNPackage.PREEMPTION_POLICY_TYPE:
			return createPreemptionPolicyTypeFromString(eDataType, initialValue);
		case EDSPNPackage.SERVER_TYPE_TYPE:
			return createServerTypeTypeFromString(eDataType, initialValue);
		case EDSPNPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case EDSPNPackage.BOOLEAN_TYPE_OBJECT:
			return createBooleanTypeObjectFromString(eDataType, initialValue);
		case EDSPNPackage.DEF_TYPE_TYPE_OBJECT:
			return createDefTypeTypeObjectFromString(eDataType, initialValue);
		case EDSPNPackage.PREEMPTION_POLICY_TYPE_OBJECT:
			return createPreemptionPolicyTypeObjectFromString(eDataType, initialValue);
		case EDSPNPackage.SERVER_TYPE_TYPE_OBJECT:
			return createServerTypeTypeObjectFromString(eDataType, initialValue);
		case EDSPNPackage.TYPE_OBJECT:
			return createTypeObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EDSPNPackage.BOOLEAN_TYPE:
			return convertBooleanTypeToString(eDataType, instanceValue);
		case EDSPNPackage.DEF_TYPE_TYPE:
			return convertDefTypeTypeToString(eDataType, instanceValue);
		case EDSPNPackage.PREEMPTION_POLICY_TYPE:
			return convertPreemptionPolicyTypeToString(eDataType, instanceValue);
		case EDSPNPackage.SERVER_TYPE_TYPE:
			return convertServerTypeTypeToString(eDataType, instanceValue);
		case EDSPNPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case EDSPNPackage.BOOLEAN_TYPE_OBJECT:
			return convertBooleanTypeObjectToString(eDataType, instanceValue);
		case EDSPNPackage.DEF_TYPE_TYPE_OBJECT:
			return convertDefTypeTypeObjectToString(eDataType, instanceValue);
		case EDSPNPackage.PREEMPTION_POLICY_TYPE_OBJECT:
			return convertPreemptionPolicyTypeObjectToString(eDataType, instanceValue);
		case EDSPNPackage.SERVER_TYPE_TYPE_OBJECT:
			return convertServerTypeTypeObjectToString(eDataType, instanceValue);
		case EDSPNPackage.TYPE_OBJECT:
			return convertTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDataType createAddDataType() {
		AddDataTypeImpl addDataType = new AddDataTypeImpl();
		return addDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicTransitionType createDeterministicTransitionType() {
		DeterministicTransitionTypeImpl deterministicTransitionType = new DeterministicTransitionTypeImpl();
		return deterministicTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNNet createEDSPNNet() {
		EDSPNNetImpl edspnNet = new EDSPNNetImpl();
		return edspnNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialTransitionType createExponentialTransitionType() {
		ExponentialTransitionTypeImpl exponentialTransitionType = new ExponentialTransitionTypeImpl();
		return exponentialTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTransitionType createGeneralTransitionType() {
		GeneralTransitionTypeImpl generalTransitionType = new GeneralTransitionTypeImpl();
		return generalTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsType createGraphicsType() {
		GraphicsTypeImpl graphicsType = new GraphicsTypeImpl();
		return graphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleType createHandleType() {
		HandleTypeImpl handleType = new HandleTypeImpl();
		return handleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateTransitionType createImmediateTransitionType() {
		ImmediateTransitionTypeImpl immediateTransitionType = new ImmediateTransitionTypeImpl();
		return immediateTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InhibitType createInhibitType() {
		InhibitTypeImpl inhibitType = new InhibitTypeImpl();
		return inhibitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InscriptionTextType createInscriptionTextType() {
		InscriptionTextTypeImpl inscriptionTextType = new InscriptionTextTypeImpl();
		return inscriptionTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InscriptionType createInscriptionType() {
		InscriptionTypeImpl inscriptionType = new InscriptionTypeImpl();
		return inscriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetType createNetType() {
		NetTypeImpl netType = new NetTypeImpl();
		return netType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType createPlaceType() {
		PlaceTypeImpl placeType = new PlaceTypeImpl();
		return placeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanTypeFromString(EDataType eDataType, String initialValue) {
		BooleanType result = BooleanType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefTypeType createDefTypeTypeFromString(EDataType eDataType, String initialValue) {
		DefTypeType result = DefTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptionPolicyType createPreemptionPolicyTypeFromString(EDataType eDataType, String initialValue) {
		PreemptionPolicyType result = PreemptionPolicyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerTypeType createServerTypeTypeFromString(EDataType eDataType, String initialValue) {
		ServerTypeType result = ServerTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanTypeFromString(EDSPNPackage.Literals.BOOLEAN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanTypeToString(EDSPNPackage.Literals.BOOLEAN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefTypeType createDefTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefTypeTypeFromString(EDSPNPackage.Literals.DEF_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefTypeTypeToString(EDSPNPackage.Literals.DEF_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptionPolicyType createPreemptionPolicyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPreemptionPolicyTypeFromString(EDSPNPackage.Literals.PREEMPTION_POLICY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionPolicyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPreemptionPolicyTypeToString(EDSPNPackage.Literals.PREEMPTION_POLICY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerTypeType createServerTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createServerTypeTypeFromString(EDSPNPackage.Literals.SERVER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServerTypeTypeToString(EDSPNPackage.Literals.SERVER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeFromString(EDSPNPackage.Literals.TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeToString(EDSPNPackage.Literals.TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNPackage getEDSPNPackage() {
		return (EDSPNPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EDSPNPackage getPackage() {
		return EDSPNPackage.eINSTANCE;
	}

} //EDSPNFactoryImpl
