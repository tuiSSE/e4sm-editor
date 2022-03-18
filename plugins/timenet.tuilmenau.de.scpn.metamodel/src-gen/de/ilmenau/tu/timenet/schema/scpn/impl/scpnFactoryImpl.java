/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.*;

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
public class scpnFactoryImpl extends EFactoryImpl implements scpnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static scpnFactory init() {
		try {
			scpnFactory thescpnFactory = (scpnFactory) EPackage.Registry.INSTANCE.getEFactory(scpnPackage.eNS_URI);
			if (thescpnFactory != null) {
				return thescpnFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new scpnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scpnFactoryImpl() {
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
		case scpnPackage.ADD_DATA_TYPE:
			return createAddDataType();
		case scpnPackage.ARC_TYPE:
			return createArcType();
		case scpnPackage.ATTRIBUTE_TYPE:
			return createAttributeType();
		case scpnPackage.COMMENT_TYPE:
			return createCommentType();
		case scpnPackage.CONNECTOR_TYPE:
			return createConnectorType();
		case scpnPackage.DEFINITION_TYPE:
			return createDefinitionType();
		case scpnPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case scpnPackage.GRAPHICS_TYPE:
			return createGraphicsType();
		case scpnPackage.HANDLE_TYPE:
			return createHandleType();
		case scpnPackage.IMMEDIATE_TRANSITION_TYPE:
			return createImmediateTransitionType();
		case scpnPackage.INSCRIPTION_TEXT_TYPE:
			return createInscriptionTextType();
		case scpnPackage.INSCRIPTION_TYPE:
			return createInscriptionType();
		case scpnPackage.LABEL_TYPE:
			return createLabelType();
		case scpnPackage.LIB_IMPORT_TYPE:
			return createLibImportType();
		case scpnPackage.MEASURE_TYPE:
			return createMeasureType();
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE:
			return createModuleImplementationType();
		case scpnPackage.MODULE_INSTANCE_TYPE:
			return createModuleInstanceType();
		case scpnPackage.MODULE_PIN_TYPE:
			return createModulePinType();
		case scpnPackage.MODULE_TYPE:
			return createModuleType();
		case scpnPackage.NET_TYPE:
			return createNetType();
		case scpnPackage.NODE_TYPE:
			return createNodeType();
		case scpnPackage.PARAMETER_TYPE:
			return createParameterType();
		case scpnPackage.PARAMETER_VALUE_TYPE:
			return createParameterValueType();
		case scpnPackage.PLACE_TYPE:
			return createPlaceType();
		case scpnPackage.RECORD_TOKENTYPE:
			return createRecordTokentype();
		case scpnPackage.REPLICATION_TYPE:
			return createReplicationType();
		case scpnPackage.SCPN_NET:
			return createSCPNNet();
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE:
			return createSubstitutionTransitionType();
		case scpnPackage.TEXT_TYPE:
			return createTextType();
		case scpnPackage.TIMED_TRANSITION_TYPE:
			return createTimedTransitionType();
		case scpnPackage.TRANSITION_TYPE:
			return createTransitionType();
		case scpnPackage.TYPEDEF_TYPE:
			return createTypedefType();
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
		case scpnPackage.MEASURE_EVAL_TYPE:
			return createMeasureEvalTypeFromString(eDataType, initialValue);
		case scpnPackage.QUEUE_TYPE:
			return createQueueTypeFromString(eDataType, initialValue);
		case scpnPackage.SERVER_TYPE_TYPE:
			return createServerTypeTypeFromString(eDataType, initialValue);
		case scpnPackage.SPEC_TYPE_TYPE:
			return createSpecTypeTypeFromString(eDataType, initialValue);
		case scpnPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case scpnPackage.MEASURE_EVAL_TYPE_OBJECT:
			return createMeasureEvalTypeObjectFromString(eDataType, initialValue);
		case scpnPackage.QUEUE_TYPE_OBJECT:
			return createQueueTypeObjectFromString(eDataType, initialValue);
		case scpnPackage.SERVER_TYPE_TYPE_OBJECT:
			return createServerTypeTypeObjectFromString(eDataType, initialValue);
		case scpnPackage.SPEC_TYPE_TYPE_OBJECT:
			return createSpecTypeTypeObjectFromString(eDataType, initialValue);
		case scpnPackage.TYPE_OBJECT:
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
		case scpnPackage.MEASURE_EVAL_TYPE:
			return convertMeasureEvalTypeToString(eDataType, instanceValue);
		case scpnPackage.QUEUE_TYPE:
			return convertQueueTypeToString(eDataType, instanceValue);
		case scpnPackage.SERVER_TYPE_TYPE:
			return convertServerTypeTypeToString(eDataType, instanceValue);
		case scpnPackage.SPEC_TYPE_TYPE:
			return convertSpecTypeTypeToString(eDataType, instanceValue);
		case scpnPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case scpnPackage.MEASURE_EVAL_TYPE_OBJECT:
			return convertMeasureEvalTypeObjectToString(eDataType, instanceValue);
		case scpnPackage.QUEUE_TYPE_OBJECT:
			return convertQueueTypeObjectToString(eDataType, instanceValue);
		case scpnPackage.SERVER_TYPE_TYPE_OBJECT:
			return convertServerTypeTypeObjectToString(eDataType, instanceValue);
		case scpnPackage.SPEC_TYPE_TYPE_OBJECT:
			return convertSpecTypeTypeObjectToString(eDataType, instanceValue);
		case scpnPackage.TYPE_OBJECT:
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
	@Override
	public AddDataType createAddDataType() {
		AddDataTypeImpl addDataType = new AddDataTypeImpl();
		return addDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicsType createGraphicsType() {
		GraphicsTypeImpl graphicsType = new GraphicsTypeImpl();
		return graphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandleType createHandleType() {
		HandleTypeImpl handleType = new HandleTypeImpl();
		return handleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransitionType createImmediateTransitionType() {
		ImmediateTransitionTypeImpl immediateTransitionType = new ImmediateTransitionTypeImpl();
		return immediateTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InscriptionTextType createInscriptionTextType() {
		InscriptionTextTypeImpl inscriptionTextType = new InscriptionTextTypeImpl();
		return inscriptionTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InscriptionType createInscriptionType() {
		InscriptionTypeImpl inscriptionType = new InscriptionTypeImpl();
		return inscriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LibImportType createLibImportType() {
		LibImportTypeImpl libImportType = new LibImportTypeImpl();
		return libImportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleImplementationType createModuleImplementationType() {
		ModuleImplementationTypeImpl moduleImplementationType = new ModuleImplementationTypeImpl();
		return moduleImplementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleInstanceType createModuleInstanceType() {
		ModuleInstanceTypeImpl moduleInstanceType = new ModuleInstanceTypeImpl();
		return moduleInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModulePinType createModulePinType() {
		ModulePinTypeImpl modulePinType = new ModulePinTypeImpl();
		return modulePinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleType createModuleType() {
		ModuleTypeImpl moduleType = new ModuleTypeImpl();
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetType createNetType() {
		NetTypeImpl netType = new NetTypeImpl();
		return netType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueType createParameterValueType() {
		ParameterValueTypeImpl parameterValueType = new ParameterValueTypeImpl();
		return parameterValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaceType createPlaceType() {
		PlaceTypeImpl placeType = new PlaceTypeImpl();
		return placeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTokentype createRecordTokentype() {
		RecordTokentypeImpl recordTokentype = new RecordTokentypeImpl();
		return recordTokentype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplicationType createReplicationType() {
		ReplicationTypeImpl replicationType = new ReplicationTypeImpl();
		return replicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCPNNet createSCPNNet() {
		SCPNNetImpl scpnNet = new SCPNNetImpl();
		return scpnNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstitutionTransitionType createSubstitutionTransitionType() {
		SubstitutionTransitionTypeImpl substitutionTransitionType = new SubstitutionTransitionTypeImpl();
		return substitutionTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimedTransitionType createTimedTransitionType() {
		TimedTransitionTypeImpl timedTransitionType = new TimedTransitionTypeImpl();
		return timedTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedefType createTypedefType() {
		TypedefTypeImpl typedefType = new TypedefTypeImpl();
		return typedefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureEvalType createMeasureEvalTypeFromString(EDataType eDataType, String initialValue) {
		MeasureEvalType result = MeasureEvalType.get(initialValue);
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
	public String convertMeasureEvalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueType createQueueTypeFromString(EDataType eDataType, String initialValue) {
		QueueType result = QueueType.get(initialValue);
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
	public String convertQueueTypeToString(EDataType eDataType, Object instanceValue) {
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
	public SpecTypeType createSpecTypeTypeFromString(EDataType eDataType, String initialValue) {
		SpecTypeType result = SpecTypeType.get(initialValue);
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
	public String convertSpecTypeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public MeasureEvalType createMeasureEvalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureEvalTypeFromString(scpnPackage.Literals.MEASURE_EVAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureEvalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureEvalTypeToString(scpnPackage.Literals.MEASURE_EVAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueType createQueueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createQueueTypeFromString(scpnPackage.Literals.QUEUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQueueTypeToString(scpnPackage.Literals.QUEUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerTypeType createServerTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createServerTypeTypeFromString(scpnPackage.Literals.SERVER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServerTypeTypeToString(scpnPackage.Literals.SERVER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecTypeType createSpecTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecTypeTypeFromString(scpnPackage.Literals.SPEC_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecTypeTypeToString(scpnPackage.Literals.SPEC_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeFromString(scpnPackage.Literals.TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeToString(scpnPackage.Literals.TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public scpnPackage getscpnPackage() {
		return (scpnPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static scpnPackage getPackage() {
		return scpnPackage.eINSTANCE;
	}

} //scpnFactoryImpl
