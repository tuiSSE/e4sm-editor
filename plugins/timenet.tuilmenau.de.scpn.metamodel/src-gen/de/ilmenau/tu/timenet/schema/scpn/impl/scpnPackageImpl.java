/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.AddDataType;
import de.ilmenau.tu.timenet.schema.scpn.ArcType;
import de.ilmenau.tu.timenet.schema.scpn.AttributeType;
import de.ilmenau.tu.timenet.schema.scpn.CommentType;
import de.ilmenau.tu.timenet.schema.scpn.ConnectorType;
import de.ilmenau.tu.timenet.schema.scpn.DefinitionType;
import de.ilmenau.tu.timenet.schema.scpn.DocumentRoot;
import de.ilmenau.tu.timenet.schema.scpn.GraphicsType;
import de.ilmenau.tu.timenet.schema.scpn.HandleType;
import de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType;
import de.ilmenau.tu.timenet.schema.scpn.InscriptionType;
import de.ilmenau.tu.timenet.schema.scpn.LabelType;
import de.ilmenau.tu.timenet.schema.scpn.LibImportType;
import de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType;
import de.ilmenau.tu.timenet.schema.scpn.MeasureType;
import de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType;
import de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType;
import de.ilmenau.tu.timenet.schema.scpn.ModulePinType;
import de.ilmenau.tu.timenet.schema.scpn.ModuleType;
import de.ilmenau.tu.timenet.schema.scpn.NetType;
import de.ilmenau.tu.timenet.schema.scpn.NodeType;
import de.ilmenau.tu.timenet.schema.scpn.ParameterType;
import de.ilmenau.tu.timenet.schema.scpn.ParameterValueType;
import de.ilmenau.tu.timenet.schema.scpn.PlaceType;
import de.ilmenau.tu.timenet.schema.scpn.QueueType;
import de.ilmenau.tu.timenet.schema.scpn.RecordTokentype;
import de.ilmenau.tu.timenet.schema.scpn.ReplicationType;
import de.ilmenau.tu.timenet.schema.scpn.SCPNNet;
import de.ilmenau.tu.timenet.schema.scpn.ServerTypeType;
import de.ilmenau.tu.timenet.schema.scpn.SpecTypeType;
import de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.TextType;
import de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.TransitionType;
import de.ilmenau.tu.timenet.schema.scpn.Type;
import de.ilmenau.tu.timenet.schema.scpn.TypedefType;
import de.ilmenau.tu.timenet.schema.scpn.scpnFactory;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scpnPackageImpl extends EPackageImpl implements scpnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inscriptionTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inscriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libImportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleImplementationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTokentypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scpnNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureEvalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measureEvalTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serverTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ilmenau.tu.timenet.schema.scpn.scpnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private scpnPackageImpl() {
		super(eNS_URI, scpnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link scpnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static scpnPackage init() {
		if (isInited)
			return (scpnPackage) EPackage.Registry.INSTANCE.getEPackage(scpnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredscpnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		scpnPackageImpl thescpnPackage = registeredscpnPackage instanceof scpnPackageImpl
				? (scpnPackageImpl) registeredscpnPackage
				: new scpnPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thescpnPackage.createPackageContents();

		// Initialize created meta-data
		thescpnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thescpnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(scpnPackage.eNS_URI, thescpnPackage);
		return thescpnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddDataType() {
		return addDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddDataType_Classname() {
		return (EAttribute) addDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcType_Inscription() {
		return (EReference) arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcType_Handle() {
		return (EReference) arcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeType_DataType() {
		return (EAttribute) attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeType_Name() {
		return (EAttribute) attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentType() {
		return commentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentType_CommentText() {
		return (EAttribute) commentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_FromNode() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_Id() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_ToNode() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_Type() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionType() {
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionType_AdditionalData() {
		return (EReference) definitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionType_Expression() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionType_Name() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionType_Path() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Net() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicsType() {
		return graphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicsType_Orientation() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicsType_X() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicsType_Y() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHandleType() {
		return handleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHandleType_Graphics() {
		return (EReference) handleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHandleType_Id() {
		return (EAttribute) handleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransitionType() {
		return immediateTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImmediateTransitionType_Priority() {
		return (EAttribute) immediateTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImmediateTransitionType_Weight() {
		return (EAttribute) immediateTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInscriptionTextType() {
		return inscriptionTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInscriptionTextType_Graphics() {
		return (EReference) inscriptionTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscriptionTextType_Id() {
		return (EAttribute) inscriptionTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscriptionTextType_Type() {
		return (EAttribute) inscriptionTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInscriptionType() {
		return inscriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscriptionType_Text() {
		return (EAttribute) inscriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType() {
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType_Text() {
		return (EAttribute) labelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibImportType() {
		return libImportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibImportType_Filename() {
		return (EAttribute) libImportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasureType() {
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasureType_AdditionalData() {
		return (EReference) measureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Eval() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Expression() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Name() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Path() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Result() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureType_Watch() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleImplementationType() {
		return moduleImplementationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Label() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Place() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_TimedTransition() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_ImmediateTransition() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_SubstitutionTransition() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_ModuleInstance() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_ModulePin() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Arc() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Measure() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Definition() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementationType_Comment() {
		return (EReference) moduleImplementationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleInstanceType() {
		return moduleInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstanceType_Label() {
		return (EReference) moduleInstanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstanceType_ParameterValue() {
		return (EReference) moduleInstanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleInstanceType_Implementation() {
		return (EAttribute) moduleInstanceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleInstanceType_Module() {
		return (EAttribute) moduleInstanceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModulePinType() {
		return modulePinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModulePinType_Label() {
		return (EReference) modulePinTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleType() {
		return moduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Label() {
		return (EReference) moduleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Net() {
		return (EReference) moduleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Parameter() {
		return (EReference) moduleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetType() {
		return netTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetType_GridActive() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetType_Id() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetType_Netclass() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetType_SharpEdges() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeType_Graphics() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeType_Id() {
		return (EAttribute) nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeType_Type() {
		return (EAttribute) nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_DataType() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_DefaultValue() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_Description() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_Name() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterValueType() {
		return parameterValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterValueType_Name() {
		return (EAttribute) parameterValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterValueType_Value() {
		return (EAttribute) parameterValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaceType() {
		return placeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaceType_Label() {
		return (EReference) placeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_Capacity() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_InitialMarking() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_Path() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_Queue() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_Tokentype() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceType_Watch() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordTokentype() {
		return recordTokentypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordTokentype_Attribute() {
		return (EReference) recordTokentypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecordTokentype_Name() {
		return (EAttribute) recordTokentypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReplicationType() {
		return replicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_Place() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_TimedTransition() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_ImmediateTransition() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_SubstitutionTransition() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_ModuleInstance() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_ModulePin() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_Arc() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_Measure() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_Definition() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicationType_Comment() {
		return (EReference) replicationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCPNNet() {
		return scpnNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Place() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_TimedTransition() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_ImmediateTransition() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_SubstitutionTransition() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Module() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_ModuleInstance() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_ModulePin() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Arc() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Measure() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Definition() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Comment() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_RecordTokentype() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_LibImport() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCPNNet_Parameter() {
		return (EReference) scpnNetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstitutionTransitionType() {
		return substitutionTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstitutionTransitionType_Net() {
		return (EReference) substitutionTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubstitutionTransitionType_Replication() {
		return (EAttribute) substitutionTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextType_Graphics() {
		return (EReference) textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextType_Id() {
		return (EAttribute) textTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextType_Type() {
		return (EAttribute) textTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimedTransitionType() {
		return timedTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimedTransitionType_TimeFunction() {
		return (EAttribute) timedTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionType_Label() {
		return (EReference) transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_DisplayExpression() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_GlobalGuard() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_LocalGuard() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_LogfileDescription() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_LogfileExpression() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_LogfileName() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_ManualCode() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_Path() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_ServerType() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_SpecType() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_TakeFirst() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_TimeGuard() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionType_Watch() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedefType() {
		return typedefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedefType_Definition() {
		return (EAttribute) typedefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedefType_Name() {
		return (EAttribute) typedefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasureEvalType() {
		return measureEvalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQueueType() {
		return queueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServerTypeType() {
		return serverTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecTypeType() {
		return specTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeasureEvalTypeObject() {
		return measureEvalTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueueTypeObject() {
		return queueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getServerTypeTypeObject() {
		return serverTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpecTypeTypeObject() {
		return specTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeObject() {
		return typeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public scpnFactory getscpnFactory() {
		return (scpnFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		addDataTypeEClass = createEClass(ADD_DATA_TYPE);
		createEAttribute(addDataTypeEClass, ADD_DATA_TYPE__CLASSNAME);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEReference(arcTypeEClass, ARC_TYPE__INSCRIPTION);
		createEReference(arcTypeEClass, ARC_TYPE__HANDLE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DATA_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);

		commentTypeEClass = createEClass(COMMENT_TYPE);
		createEAttribute(commentTypeEClass, COMMENT_TYPE__COMMENT_TEXT);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__FROM_NODE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__ID);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__TO_NODE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__TYPE);

		definitionTypeEClass = createEClass(DEFINITION_TYPE);
		createEReference(definitionTypeEClass, DEFINITION_TYPE__ADDITIONAL_DATA);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__EXPRESSION);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__NAME);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__PATH);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NET);

		graphicsTypeEClass = createEClass(GRAPHICS_TYPE);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__ORIENTATION);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__X);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__Y);

		handleTypeEClass = createEClass(HANDLE_TYPE);
		createEReference(handleTypeEClass, HANDLE_TYPE__GRAPHICS);
		createEAttribute(handleTypeEClass, HANDLE_TYPE__ID);

		immediateTransitionTypeEClass = createEClass(IMMEDIATE_TRANSITION_TYPE);
		createEAttribute(immediateTransitionTypeEClass, IMMEDIATE_TRANSITION_TYPE__PRIORITY);
		createEAttribute(immediateTransitionTypeEClass, IMMEDIATE_TRANSITION_TYPE__WEIGHT);

		inscriptionTextTypeEClass = createEClass(INSCRIPTION_TEXT_TYPE);
		createEReference(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__GRAPHICS);
		createEAttribute(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__ID);
		createEAttribute(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__TYPE);

		inscriptionTypeEClass = createEClass(INSCRIPTION_TYPE);
		createEAttribute(inscriptionTypeEClass, INSCRIPTION_TYPE__TEXT);

		labelTypeEClass = createEClass(LABEL_TYPE);
		createEAttribute(labelTypeEClass, LABEL_TYPE__TEXT);

		libImportTypeEClass = createEClass(LIB_IMPORT_TYPE);
		createEAttribute(libImportTypeEClass, LIB_IMPORT_TYPE__FILENAME);

		measureTypeEClass = createEClass(MEASURE_TYPE);
		createEReference(measureTypeEClass, MEASURE_TYPE__ADDITIONAL_DATA);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__EVAL);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__EXPRESSION);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__NAME);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__PATH);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__RESULT);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__WATCH);

		moduleImplementationTypeEClass = createEClass(MODULE_IMPLEMENTATION_TYPE);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__LABEL);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__PLACE);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__MODULE_PIN);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__ARC);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__MEASURE);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__DEFINITION);
		createEReference(moduleImplementationTypeEClass, MODULE_IMPLEMENTATION_TYPE__COMMENT);

		moduleInstanceTypeEClass = createEClass(MODULE_INSTANCE_TYPE);
		createEReference(moduleInstanceTypeEClass, MODULE_INSTANCE_TYPE__LABEL);
		createEReference(moduleInstanceTypeEClass, MODULE_INSTANCE_TYPE__PARAMETER_VALUE);
		createEAttribute(moduleInstanceTypeEClass, MODULE_INSTANCE_TYPE__IMPLEMENTATION);
		createEAttribute(moduleInstanceTypeEClass, MODULE_INSTANCE_TYPE__MODULE);

		modulePinTypeEClass = createEClass(MODULE_PIN_TYPE);
		createEReference(modulePinTypeEClass, MODULE_PIN_TYPE__LABEL);

		moduleTypeEClass = createEClass(MODULE_TYPE);
		createEReference(moduleTypeEClass, MODULE_TYPE__LABEL);
		createEReference(moduleTypeEClass, MODULE_TYPE__NET);
		createEReference(moduleTypeEClass, MODULE_TYPE__PARAMETER);

		netTypeEClass = createEClass(NET_TYPE);
		createEAttribute(netTypeEClass, NET_TYPE__GRID_ACTIVE);
		createEAttribute(netTypeEClass, NET_TYPE__ID);
		createEAttribute(netTypeEClass, NET_TYPE__NETCLASS);
		createEAttribute(netTypeEClass, NET_TYPE__SHARP_EDGES);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEReference(nodeTypeEClass, NODE_TYPE__GRAPHICS);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ID);
		createEAttribute(nodeTypeEClass, NODE_TYPE__TYPE);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__DATA_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__DEFAULT_VALUE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__DESCRIPTION);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);

		parameterValueTypeEClass = createEClass(PARAMETER_VALUE_TYPE);
		createEAttribute(parameterValueTypeEClass, PARAMETER_VALUE_TYPE__NAME);
		createEAttribute(parameterValueTypeEClass, PARAMETER_VALUE_TYPE__VALUE);

		placeTypeEClass = createEClass(PLACE_TYPE);
		createEReference(placeTypeEClass, PLACE_TYPE__LABEL);
		createEAttribute(placeTypeEClass, PLACE_TYPE__CAPACITY);
		createEAttribute(placeTypeEClass, PLACE_TYPE__INITIAL_MARKING);
		createEAttribute(placeTypeEClass, PLACE_TYPE__PATH);
		createEAttribute(placeTypeEClass, PLACE_TYPE__QUEUE);
		createEAttribute(placeTypeEClass, PLACE_TYPE__TOKENTYPE);
		createEAttribute(placeTypeEClass, PLACE_TYPE__WATCH);

		recordTokentypeEClass = createEClass(RECORD_TOKENTYPE);
		createEReference(recordTokentypeEClass, RECORD_TOKENTYPE__ATTRIBUTE);
		createEAttribute(recordTokentypeEClass, RECORD_TOKENTYPE__NAME);

		replicationTypeEClass = createEClass(REPLICATION_TYPE);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__PLACE);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__TIMED_TRANSITION);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__IMMEDIATE_TRANSITION);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__SUBSTITUTION_TRANSITION);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__MODULE_INSTANCE);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__MODULE_PIN);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__ARC);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__MEASURE);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__DEFINITION);
		createEReference(replicationTypeEClass, REPLICATION_TYPE__COMMENT);

		scpnNetEClass = createEClass(SCPN_NET);
		createEReference(scpnNetEClass, SCPN_NET__PLACE);
		createEReference(scpnNetEClass, SCPN_NET__TIMED_TRANSITION);
		createEReference(scpnNetEClass, SCPN_NET__IMMEDIATE_TRANSITION);
		createEReference(scpnNetEClass, SCPN_NET__SUBSTITUTION_TRANSITION);
		createEReference(scpnNetEClass, SCPN_NET__MODULE);
		createEReference(scpnNetEClass, SCPN_NET__MODULE_INSTANCE);
		createEReference(scpnNetEClass, SCPN_NET__MODULE_PIN);
		createEReference(scpnNetEClass, SCPN_NET__ARC);
		createEReference(scpnNetEClass, SCPN_NET__MEASURE);
		createEReference(scpnNetEClass, SCPN_NET__DEFINITION);
		createEReference(scpnNetEClass, SCPN_NET__COMMENT);
		createEReference(scpnNetEClass, SCPN_NET__RECORD_TOKENTYPE);
		createEReference(scpnNetEClass, SCPN_NET__LIB_IMPORT);
		createEReference(scpnNetEClass, SCPN_NET__PARAMETER);

		substitutionTransitionTypeEClass = createEClass(SUBSTITUTION_TRANSITION_TYPE);
		createEReference(substitutionTransitionTypeEClass, SUBSTITUTION_TRANSITION_TYPE__NET);
		createEAttribute(substitutionTransitionTypeEClass, SUBSTITUTION_TRANSITION_TYPE__REPLICATION);

		textTypeEClass = createEClass(TEXT_TYPE);
		createEReference(textTypeEClass, TEXT_TYPE__GRAPHICS);
		createEAttribute(textTypeEClass, TEXT_TYPE__ID);
		createEAttribute(textTypeEClass, TEXT_TYPE__TYPE);

		timedTransitionTypeEClass = createEClass(TIMED_TRANSITION_TYPE);
		createEAttribute(timedTransitionTypeEClass, TIMED_TRANSITION_TYPE__TIME_FUNCTION);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEReference(transitionTypeEClass, TRANSITION_TYPE__LABEL);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__DISPLAY_EXPRESSION);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__GLOBAL_GUARD);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__LOCAL_GUARD);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__LOGFILE_DESCRIPTION);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__LOGFILE_EXPRESSION);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__LOGFILE_NAME);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__MANUAL_CODE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__PATH);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__SERVER_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__SPEC_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TAKE_FIRST);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TIME_GUARD);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__WATCH);

		typedefTypeEClass = createEClass(TYPEDEF_TYPE);
		createEAttribute(typedefTypeEClass, TYPEDEF_TYPE__DEFINITION);
		createEAttribute(typedefTypeEClass, TYPEDEF_TYPE__NAME);

		// Create enums
		measureEvalTypeEEnum = createEEnum(MEASURE_EVAL_TYPE);
		queueTypeEEnum = createEEnum(QUEUE_TYPE);
		serverTypeTypeEEnum = createEEnum(SERVER_TYPE_TYPE);
		specTypeTypeEEnum = createEEnum(SPEC_TYPE_TYPE);
		typeEEnum = createEEnum(TYPE);

		// Create data types
		measureEvalTypeObjectEDataType = createEDataType(MEASURE_EVAL_TYPE_OBJECT);
		queueTypeObjectEDataType = createEDataType(QUEUE_TYPE_OBJECT);
		serverTypeTypeObjectEDataType = createEDataType(SERVER_TYPE_TYPE_OBJECT);
		specTypeTypeObjectEDataType = createEDataType(SPEC_TYPE_TYPE_OBJECT);
		typeObjectEDataType = createEDataType(TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arcTypeEClass.getESuperTypes().add(this.getConnectorType());
		commentTypeEClass.getESuperTypes().add(this.getTextType());
		definitionTypeEClass.getESuperTypes().add(this.getTextType());
		immediateTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		inscriptionTypeEClass.getESuperTypes().add(this.getInscriptionTextType());
		labelTypeEClass.getESuperTypes().add(this.getTextType());
		libImportTypeEClass.getESuperTypes().add(this.getTextType());
		measureTypeEClass.getESuperTypes().add(this.getTextType());
		moduleImplementationTypeEClass.getESuperTypes().add(this.getNetType());
		moduleInstanceTypeEClass.getESuperTypes().add(this.getNodeType());
		modulePinTypeEClass.getESuperTypes().add(this.getNodeType());
		moduleTypeEClass.getESuperTypes().add(this.getNodeType());
		placeTypeEClass.getESuperTypes().add(this.getNodeType());
		recordTokentypeEClass.getESuperTypes().add(this.getTextType());
		replicationTypeEClass.getESuperTypes().add(this.getNetType());
		scpnNetEClass.getESuperTypes().add(this.getNetType());
		substitutionTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		timedTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		transitionTypeEClass.getESuperTypes().add(this.getNodeType());
		typedefTypeEClass.getESuperTypes().add(this.getTextType());

		// Initialize classes, features, and operations; add parameters
		initEClass(addDataTypeEClass, AddDataType.class, "AddDataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddDataType_Classname(), theXMLTypePackage.getString(), "classname", null, 1, 1,
				AddDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcType_Inscription(), this.getInscriptionType(), null, "inscription", null, 1, 1,
				ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcType_Handle(), this.getHandleType(), null, "handle", null, 0, -1, ArcType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_DataType(), theXMLTypePackage.getString(), "dataType", null, 1, 1,
				AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentTypeEClass, CommentType.class, "CommentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentType_CommentText(), theXMLTypePackage.getNormalizedString(), "commentText", null, 1, 1,
				CommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorType_FromNode(), theXMLTypePackage.getString(), "fromNode", null, 1, 1,
				ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorType_ToNode(), theXMLTypePackage.getString(), "toNode", null, 1, 1,
				ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorType_Type(), this.getType(), "type", "connector", 1, 1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionTypeEClass, DefinitionType.class, "DefinitionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionType_AdditionalData(), this.getAddDataType(), null, "additionalData", null, 0, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Net(), this.getSCPNNet(), null, "net", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(graphicsTypeEClass, GraphicsType.class, "GraphicsType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicsType_Orientation(), theXMLTypePackage.getInteger(), "orientation", "0", 0, 1,
				GraphicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsType_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, GraphicsType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsType_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, GraphicsType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handleTypeEClass, HandleType.class, "HandleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandleType_Graphics(), this.getGraphicsType(), null, "graphics", null, 1, 1, HandleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandleType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, HandleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(immediateTransitionTypeEClass, ImmediateTransitionType.class, "ImmediateTransitionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImmediateTransitionType_Priority(), theXMLTypePackage.getPositiveInteger(), "priority", "1",
				0, 1, ImmediateTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateTransitionType_Weight(), theXMLTypePackage.getString(), "weight", "1.0", 0, 1,
				ImmediateTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inscriptionTextTypeEClass, InscriptionTextType.class, "InscriptionTextType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInscriptionTextType_Graphics(), this.getGraphicsType(), null, "graphics", null, 1, 1,
				InscriptionTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInscriptionTextType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1,
				InscriptionTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInscriptionTextType_Type(), this.getType(), "type", "inscriptionText", 1, 1,
				InscriptionTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inscriptionTypeEClass, InscriptionType.class, "InscriptionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInscriptionType_Text(), theXMLTypePackage.getString(), "text", "x", 0, 1,
				InscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(labelTypeEClass, LabelType.class, "LabelType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelType_Text(), theXMLTypePackage.getString(), "text", "", 0, 1, LabelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libImportTypeEClass, LibImportType.class, "LibImportType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibImportType_Filename(), theXMLTypePackage.getString(), "filename", null, 0, 1,
				LibImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureType_AdditionalData(), this.getAddDataType(), null, "additionalData", null, 0, 1,
				MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Eval(), this.getMeasureEvalType(), "eval", "TimeAverage", 0, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1,
				MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Result(), theXMLTypePackage.getString(), "result", null, 1, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Watch(), theXMLTypePackage.getBoolean(), "watch", "true", 0, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleImplementationTypeEClass, ModuleImplementationType.class, "ModuleImplementationType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleImplementationType_Label(), this.getLabelType(), null, "label", null, 1, 1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_Place(), this.getPlaceType(), null, "place", null, 0, -1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_TimedTransition(), this.getTimedTransitionType(), null,
				"timedTransition", null, 0, -1, ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_ImmediateTransition(), this.getImmediateTransitionType(), null,
				"immediateTransition", null, 0, -1, ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_SubstitutionTransition(), this.getSubstitutionTransitionType(), null,
				"substitutionTransition", null, 0, -1, ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_ModuleInstance(), this.getModuleInstanceType(), null,
				"moduleInstance", null, 0, -1, ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_ModulePin(), this.getModulePinType(), null, "modulePin", null, 0, -1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_Arc(), this.getArcType(), null, "arc", null, 0, -1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_Measure(), this.getMeasureType(), null, "measure", null, 0, -1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_Definition(), this.getDefinitionType(), null, "definition", null, 0,
				-1, ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementationType_Comment(), this.getCommentType(), null, "comment", null, 0, -1,
				ModuleImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleInstanceTypeEClass, ModuleInstanceType.class, "ModuleInstanceType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstanceType_Label(), this.getLabelType(), null, "label", null, 1, 1,
				ModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstanceType_ParameterValue(), this.getParameterValueType(), null, "parameterValue",
				null, 0, -1, ModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleInstanceType_Implementation(), theXMLTypePackage.getString(), "implementation", null, 1,
				1, ModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleInstanceType_Module(), theXMLTypePackage.getString(), "module", null, 1, 1,
				ModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modulePinTypeEClass, ModulePinType.class, "ModulePinType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulePinType_Label(), this.getLabelType(), null, "label", null, 1, 1, ModulePinType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleTypeEClass, ModuleType.class, "ModuleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleType_Label(), this.getLabelType(), null, "label", null, 1, 1, ModuleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Net(), this.getModuleImplementationType(), null, "net", null, 1, -1,
				ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1,
				ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netTypeEClass, NetType.class, "NetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetType_GridActive(), theXMLTypePackage.getBoolean(), "gridActive", "true", 0, 1,
				NetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, NetType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetType_Netclass(), theXMLTypePackage.getString(), "netclass", null, 1, 1, NetType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetType_SharpEdges(), theXMLTypePackage.getBoolean(), "sharpEdges", "false", 0, 1,
				NetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeType_Graphics(), this.getGraphicsType(), null, "graphics", null, 1, 1, NodeType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, NodeType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Type(), this.getType(), "type", "node", 1, 1, NodeType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_DataType(), theXMLTypePackage.getString(), "dataType", null, 1, 1,
				ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1,
				ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ParameterType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueTypeEClass, ParameterValueType.class, "ParameterValueType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValueType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				ParameterValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1,
				ParameterValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(placeTypeEClass, PlaceType.class, "PlaceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceType_Label(), this.getLabelType(), null, "label", null, 1, 1, PlaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_Capacity(), theXMLTypePackage.getString(), "capacity", "0", 0, 1, PlaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_InitialMarking(), theXMLTypePackage.getString(), "initialMarking", null, 0, 1,
				PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, PlaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_Queue(), this.getQueueType(), "queue", null, 1, 1, PlaceType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_Tokentype(), theXMLTypePackage.getString(), "tokentype", null, 1, 1,
				PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_Watch(), theXMLTypePackage.getBoolean(), "watch", "false", 0, 1, PlaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordTokentypeEClass, RecordTokentype.class, "RecordTokentype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordTokentype_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1,
				RecordTokentype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordTokentype_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				RecordTokentype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(replicationTypeEClass, ReplicationType.class, "ReplicationType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplicationType_Place(), this.getPlaceType(), null, "place", null, 0, -1,
				ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_TimedTransition(), this.getTimedTransitionType(), null, "timedTransition",
				null, 0, -1, ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_ImmediateTransition(), this.getImmediateTransitionType(), null,
				"immediateTransition", null, 0, -1, ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_SubstitutionTransition(), this.getSubstitutionTransitionType(), null,
				"substitutionTransition", null, 0, -1, ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_ModuleInstance(), this.getModuleInstanceType(), null, "moduleInstance", null,
				0, -1, ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_ModulePin(), this.getModulePinType(), null, "modulePin", null, 0, -1,
				ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_Arc(), this.getArcType(), null, "arc", null, 0, -1, ReplicationType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_Measure(), this.getMeasureType(), null, "measure", null, 0, -1,
				ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_Definition(), this.getDefinitionType(), null, "definition", null, 0, -1,
				ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicationType_Comment(), this.getCommentType(), null, "comment", null, 0, -1,
				ReplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scpnNetEClass, SCPNNet.class, "SCPNNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSCPNNet_Place(), this.getPlaceType(), null, "place", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_TimedTransition(), this.getTimedTransitionType(), null, "timedTransition", null, 0,
				-1, SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_ImmediateTransition(), this.getImmediateTransitionType(), null, "immediateTransition",
				null, 0, -1, SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_SubstitutionTransition(), this.getSubstitutionTransitionType(), null,
				"substitutionTransition", null, 0, -1, SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_Module(), this.getModuleType(), null, "module", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_ModuleInstance(), this.getModuleInstanceType(), null, "moduleInstance", null, 0, -1,
				SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_ModulePin(), this.getModulePinType(), null, "modulePin", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_Arc(), this.getArcType(), null, "arc", null, 0, -1, SCPNNet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSCPNNet_Measure(), this.getMeasureType(), null, "measure", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_Definition(), this.getDefinitionType(), null, "definition", null, 0, -1,
				SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_Comment(), this.getCommentType(), null, "comment", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_RecordTokentype(), this.getRecordTokentype(), null, "recordTokentype", null, 0, -1,
				SCPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_LibImport(), this.getLibImportType(), null, "libImport", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCPNNet_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, SCPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutionTransitionTypeEClass, SubstitutionTransitionType.class, "SubstitutionTransitionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstitutionTransitionType_Net(), this.getReplicationType(), null, "net", null, 1, 10,
				SubstitutionTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstitutionTransitionType_Replication(), theXMLTypePackage.getInteger(), "replication", "0",
				0, 1, SubstitutionTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextType_Graphics(), this.getGraphicsType(), null, "graphics", null, 1, 1, TextType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, TextType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Type(), this.getType(), "type", "text", 1, 1, TextType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedTransitionTypeEClass, TimedTransitionType.class, "TimedTransitionType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedTransitionType_TimeFunction(), theXMLTypePackage.getString(), "timeFunction", "EXP(1.0)",
				0, 1, TimedTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionType_Label(), this.getLabelType(), null, "label", null, 1, 1, TransitionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_DisplayExpression(), theXMLTypePackage.getString(), "displayExpression", null,
				0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_GlobalGuard(), theXMLTypePackage.getString(), "globalGuard", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_LocalGuard(), theXMLTypePackage.getString(), "localGuard", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_LogfileDescription(), theXMLTypePackage.getString(), "logfileDescription",
				null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_LogfileExpression(), theXMLTypePackage.getString(), "logfileExpression", null,
				0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_LogfileName(), theXMLTypePackage.getString(), "logfileName", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ManualCode(), theXMLTypePackage.getString(), "manualCode", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ServerType(), this.getServerTypeType(), "serverType", "ExclusiveServer", 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_SpecType(), this.getSpecTypeType(), "specType", "Automatic", 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_TakeFirst(), theXMLTypePackage.getBoolean(), "takeFirst", "false", 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_TimeGuard(), theXMLTypePackage.getString(), "timeGuard", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_Watch(), theXMLTypePackage.getBoolean(), "watch", "false", 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(typedefTypeEClass, TypedefType.class, "TypedefType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedefType_Definition(), theXMLTypePackage.getString(), "definition", null, 1, 1,
				TypedefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedefType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypedefType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(measureEvalTypeEEnum, MeasureEvalType.class, "MeasureEvalType");
		addEEnumLiteral(measureEvalTypeEEnum, MeasureEvalType.INSTANTANEOUS);
		addEEnumLiteral(measureEvalTypeEEnum, MeasureEvalType.CUMULATIVE);
		addEEnumLiteral(measureEvalTypeEEnum, MeasureEvalType.TIME_AVERAGE);

		initEEnum(queueTypeEEnum, QueueType.class, "QueueType");
		addEEnumLiteral(queueTypeEEnum, QueueType.RANDOM);
		addEEnumLiteral(queueTypeEEnum, QueueType.FIFO);
		addEEnumLiteral(queueTypeEEnum, QueueType.LIFO);

		initEEnum(serverTypeTypeEEnum, ServerTypeType.class, "ServerTypeType");
		addEEnumLiteral(serverTypeTypeEEnum, ServerTypeType.INFINITE_SERVER);
		addEEnumLiteral(serverTypeTypeEEnum, ServerTypeType.EXCLUSIVE_SERVER);

		initEEnum(specTypeTypeEEnum, SpecTypeType.class, "SpecTypeType");
		addEEnumLiteral(specTypeTypeEEnum, SpecTypeType.MANUAL);
		addEEnumLiteral(specTypeTypeEEnum, SpecTypeType.AUTOMATIC);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.NODE);
		addEEnumLiteral(typeEEnum, Type.CONNECTOR);
		addEEnumLiteral(typeEEnum, Type.TEXT);
		addEEnumLiteral(typeEEnum, Type.INSCRIPTION_TEXT);

		// Initialize data types
		initEDataType(measureEvalTypeObjectEDataType, MeasureEvalType.class, "MeasureEvalTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queueTypeObjectEDataType, QueueType.class, "QueueTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serverTypeTypeObjectEDataType, ServerTypeType.class, "ServerTypeTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(specTypeTypeObjectEDataType, SpecTypeType.class, "SpecTypeTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeObjectEDataType, Type.class, "TypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}
	
	

//	@Override
//	protected Resource createResource(String uri) {
//		return super.createResource("http://timenet.tu-ilmenau.de/schema/SCPN etc/schemas/SCPN.xsd");
//	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(addDataTypeEClass, source, new String[] { "name", "AddDataType", "kind", "empty" });
		addAnnotation(getAddDataType_Classname(), source, new String[] { "kind", "attribute", "name", "classname" });
		addAnnotation(arcTypeEClass, source, new String[] { "name", "ArcType", "kind", "elementOnly" });
		addAnnotation(getArcType_Inscription(), source,
				new String[] { "kind", "element", "name", "inscription", "namespace", "##targetNamespace" });
		addAnnotation(getArcType_Handle(), source,
				new String[] { "kind", "element", "name", "handle", "namespace", "##targetNamespace" });
		addAnnotation(attributeTypeEClass, source, new String[] { "name", "AttributeType", "kind", "empty" });
		addAnnotation(getAttributeType_DataType(), source, new String[] { "kind", "attribute", "name", "dataType" });
		addAnnotation(getAttributeType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(commentTypeEClass, source, new String[] { "name", "CommentType", "kind", "elementOnly" });
		addAnnotation(getCommentType_CommentText(), source,
				new String[] { "kind", "attribute", "name", "commentText" });
		addAnnotation(connectorTypeEClass, source, new String[] { "name", "ConnectorType", "kind", "empty" });
		addAnnotation(getConnectorType_FromNode(), source, new String[] { "kind", "attribute", "name", "fromNode" });
		addAnnotation(getConnectorType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getConnectorType_ToNode(), source, new String[] { "kind", "attribute", "name", "toNode" });
		addAnnotation(getConnectorType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(definitionTypeEClass, source, new String[] { "name", "DefinitionType", "kind", "elementOnly" });
		addAnnotation(getDefinitionType_AdditionalData(), source,
				new String[] { "kind", "element", "name", "additionalData", "namespace", "##targetNamespace" });
		addAnnotation(getDefinitionType_Expression(), source,
				new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getDefinitionType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getDefinitionType_Path(), source, new String[] { "kind", "attribute", "name", "path" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Net(), source,
				new String[] { "kind", "element", "name", "net", "namespace", "##targetNamespace" });
		addAnnotation(graphicsTypeEClass, source, new String[] { "name", "GraphicsType", "kind", "empty" });
		addAnnotation(getGraphicsType_Orientation(), source,
				new String[] { "kind", "attribute", "name", "orientation" });
		addAnnotation(getGraphicsType_X(), source, new String[] { "kind", "attribute", "name", "x" });
		addAnnotation(getGraphicsType_Y(), source, new String[] { "kind", "attribute", "name", "y" });
		addAnnotation(handleTypeEClass, source, new String[] { "name", "HandleType", "kind", "elementOnly" });
		addAnnotation(getHandleType_Graphics(), source,
				new String[] { "kind", "element", "name", "graphics", "namespace", "##targetNamespace" });
		addAnnotation(getHandleType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(immediateTransitionTypeEClass, source,
				new String[] { "name", "ImmediateTransitionType", "kind", "elementOnly" });
		addAnnotation(getImmediateTransitionType_Priority(), source,
				new String[] { "kind", "attribute", "name", "priority" });
		addAnnotation(getImmediateTransitionType_Weight(), source,
				new String[] { "kind", "attribute", "name", "weight" });
		addAnnotation(inscriptionTextTypeEClass, source,
				new String[] { "name", "InscriptionTextType", "kind", "elementOnly" });
		addAnnotation(getInscriptionTextType_Graphics(), source,
				new String[] { "kind", "element", "name", "graphics", "namespace", "##targetNamespace" });
		addAnnotation(getInscriptionTextType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getInscriptionTextType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(inscriptionTypeEClass, source, new String[] { "name", "InscriptionType", "kind", "elementOnly" });
		addAnnotation(getInscriptionType_Text(), source, new String[] { "kind", "attribute", "name", "text" });
		addAnnotation(labelTypeEClass, source, new String[] { "name", "LabelType", "kind", "elementOnly" });
		addAnnotation(getLabelType_Text(), source, new String[] { "kind", "attribute", "name", "text" });
		addAnnotation(libImportTypeEClass, source, new String[] { "name", "LibImportType", "kind", "elementOnly" });
		addAnnotation(getLibImportType_Filename(), source, new String[] { "kind", "attribute", "name", "filename" });
		addAnnotation(measureEvalTypeEEnum, source, new String[] { "name", "MeasureEvalType" });
		addAnnotation(measureEvalTypeObjectEDataType, source,
				new String[] { "name", "MeasureEvalType:Object", "baseType", "MeasureEvalType" });
		addAnnotation(measureTypeEClass, source, new String[] { "name", "MeasureType", "kind", "elementOnly" });
		addAnnotation(getMeasureType_AdditionalData(), source,
				new String[] { "kind", "element", "name", "additionalData", "namespace", "##targetNamespace" });
		addAnnotation(getMeasureType_Eval(), source, new String[] { "kind", "attribute", "name", "eval" });
		addAnnotation(getMeasureType_Expression(), source, new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getMeasureType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getMeasureType_Path(), source, new String[] { "kind", "attribute", "name", "path" });
		addAnnotation(getMeasureType_Result(), source, new String[] { "kind", "attribute", "name", "result" });
		addAnnotation(getMeasureType_Watch(), source, new String[] { "kind", "attribute", "name", "watch" });
		addAnnotation(moduleImplementationTypeEClass, source,
				new String[] { "name", "ModuleImplementationType", "kind", "elementOnly" });
		addAnnotation(getModuleImplementationType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_Place(), source,
				new String[] { "kind", "element", "name", "place", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_TimedTransition(), source,
				new String[] { "kind", "element", "name", "timedTransition", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_ImmediateTransition(), source,
				new String[] { "kind", "element", "name", "immediateTransition", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_SubstitutionTransition(), source,
				new String[] { "kind", "element", "name", "substitutionTransition", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_ModuleInstance(), source,
				new String[] { "kind", "element", "name", "moduleInstance", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_ModulePin(), source,
				new String[] { "kind", "element", "name", "modulePin", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_Arc(), source,
				new String[] { "kind", "element", "name", "arc", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_Measure(), source,
				new String[] { "kind", "element", "name", "measure", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_Definition(), source,
				new String[] { "kind", "element", "name", "definition", "namespace", "##targetNamespace" });
		addAnnotation(getModuleImplementationType_Comment(), source,
				new String[] { "kind", "element", "name", "comment", "namespace", "##targetNamespace" });
		addAnnotation(moduleInstanceTypeEClass, source,
				new String[] { "name", "ModuleInstanceType", "kind", "elementOnly" });
		addAnnotation(getModuleInstanceType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getModuleInstanceType_ParameterValue(), source,
				new String[] { "kind", "element", "name", "parameterValue", "namespace", "##targetNamespace" });
		addAnnotation(getModuleInstanceType_Implementation(), source,
				new String[] { "kind", "attribute", "name", "implementation" });
		addAnnotation(getModuleInstanceType_Module(), source, new String[] { "kind", "attribute", "name", "module" });
		addAnnotation(modulePinTypeEClass, source, new String[] { "name", "ModulePinType", "kind", "elementOnly" });
		addAnnotation(getModulePinType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(moduleTypeEClass, source, new String[] { "name", "ModuleType", "kind", "elementOnly" });
		addAnnotation(getModuleType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getModuleType_Net(), source,
				new String[] { "kind", "element", "name", "net", "namespace", "##targetNamespace" });
		addAnnotation(getModuleType_Parameter(), source,
				new String[] { "kind", "element", "name", "parameter", "namespace", "##targetNamespace" });
		addAnnotation(netTypeEClass, source, new String[] { "name", "NetType", "kind", "empty" });
		addAnnotation(getNetType_GridActive(), source, new String[] { "kind", "attribute", "name", "gridActive" });
		addAnnotation(getNetType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getNetType_Netclass(), source, new String[] { "kind", "attribute", "name", "netclass" });
		addAnnotation(getNetType_SharpEdges(), source, new String[] { "kind", "attribute", "name", "sharpEdges" });
		addAnnotation(nodeTypeEClass, source, new String[] { "name", "NodeType", "kind", "elementOnly" });
		addAnnotation(getNodeType_Graphics(), source,
				new String[] { "kind", "element", "name", "graphics", "namespace", "##targetNamespace" });
		addAnnotation(getNodeType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getNodeType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(parameterTypeEClass, source, new String[] { "name", "ParameterType", "kind", "empty" });
		addAnnotation(getParameterType_DataType(), source, new String[] { "kind", "attribute", "name", "dataType" });
		addAnnotation(getParameterType_DefaultValue(), source,
				new String[] { "kind", "attribute", "name", "defaultValue" });
		addAnnotation(getParameterType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getParameterType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(parameterValueTypeEClass, source, new String[] { "name", "ParameterValueType", "kind", "empty" });
		addAnnotation(getParameterValueType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getParameterValueType_Value(), source, new String[] { "kind", "attribute", "name", "value" });
		addAnnotation(placeTypeEClass, source, new String[] { "name", "PlaceType", "kind", "elementOnly" });
		addAnnotation(getPlaceType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getPlaceType_Capacity(), source, new String[] { "kind", "attribute", "name", "capacity" });
		addAnnotation(getPlaceType_InitialMarking(), source,
				new String[] { "kind", "attribute", "name", "initialMarking" });
		addAnnotation(getPlaceType_Path(), source, new String[] { "kind", "attribute", "name", "path" });
		addAnnotation(getPlaceType_Queue(), source, new String[] { "kind", "attribute", "name", "queue" });
		addAnnotation(getPlaceType_Tokentype(), source, new String[] { "kind", "attribute", "name", "tokentype" });
		addAnnotation(getPlaceType_Watch(), source, new String[] { "kind", "attribute", "name", "watch" });
		addAnnotation(queueTypeEEnum, source, new String[] { "name", "QueueType" });
		addAnnotation(queueTypeObjectEDataType, source,
				new String[] { "name", "QueueType:Object", "baseType", "QueueType" });
		addAnnotation(recordTokentypeEClass, source, new String[] { "name", "RecordTokentype", "kind", "elementOnly" });
		addAnnotation(getRecordTokentype_Attribute(), source,
				new String[] { "kind", "element", "name", "attribute", "namespace", "##targetNamespace" });
		addAnnotation(getRecordTokentype_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(replicationTypeEClass, source, new String[] { "name", "ReplicationType", "kind", "elementOnly" });
		addAnnotation(getReplicationType_Place(), source,
				new String[] { "kind", "element", "name", "place", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_TimedTransition(), source,
				new String[] { "kind", "element", "name", "timedTransition", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_ImmediateTransition(), source,
				new String[] { "kind", "element", "name", "immediateTransition", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_SubstitutionTransition(), source,
				new String[] { "kind", "element", "name", "substitutionTransition", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_ModuleInstance(), source,
				new String[] { "kind", "element", "name", "moduleInstance", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_ModulePin(), source,
				new String[] { "kind", "element", "name", "modulePin", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_Arc(), source,
				new String[] { "kind", "element", "name", "arc", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_Measure(), source,
				new String[] { "kind", "element", "name", "measure", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_Definition(), source,
				new String[] { "kind", "element", "name", "definition", "namespace", "##targetNamespace" });
		addAnnotation(getReplicationType_Comment(), source,
				new String[] { "kind", "element", "name", "comment", "namespace", "##targetNamespace" });
		addAnnotation(scpnNetEClass, source, new String[] { "name", "SCPNNet", "kind", "elementOnly" });
		addAnnotation(getSCPNNet_Place(), source,
				new String[] { "kind", "element", "name", "place", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_TimedTransition(), source,
				new String[] { "kind", "element", "name", "timedTransition", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_ImmediateTransition(), source,
				new String[] { "kind", "element", "name", "immediateTransition", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_SubstitutionTransition(), source,
				new String[] { "kind", "element", "name", "substitutionTransition", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Module(), source,
				new String[] { "kind", "element", "name", "module", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_ModuleInstance(), source,
				new String[] { "kind", "element", "name", "moduleInstance", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_ModulePin(), source,
				new String[] { "kind", "element", "name", "modulePin", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Arc(), source,
				new String[] { "kind", "element", "name", "arc", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Measure(), source,
				new String[] { "kind", "element", "name", "measure", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Definition(), source,
				new String[] { "kind", "element", "name", "definition", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Comment(), source,
				new String[] { "kind", "element", "name", "comment", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_RecordTokentype(), source,
				new String[] { "kind", "element", "name", "recordTokentype", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_LibImport(), source,
				new String[] { "kind", "element", "name", "libImport", "namespace", "##targetNamespace" });
		addAnnotation(getSCPNNet_Parameter(), source,
				new String[] { "kind", "element", "name", "parameter", "namespace", "##targetNamespace" });
		addAnnotation(serverTypeTypeEEnum, source, new String[] { "name", "ServerTypeType" });
		addAnnotation(serverTypeTypeObjectEDataType, source,
				new String[] { "name", "ServerTypeType:Object", "baseType", "ServerTypeType" });
		addAnnotation(specTypeTypeEEnum, source, new String[] { "name", "SpecTypeType" });
		addAnnotation(specTypeTypeObjectEDataType, source,
				new String[] { "name", "SpecTypeType:Object", "baseType", "SpecTypeType" });
		addAnnotation(substitutionTransitionTypeEClass, source,
				new String[] { "name", "SubstitutionTransitionType", "kind", "elementOnly" });
		addAnnotation(getSubstitutionTransitionType_Net(), source,
				new String[] { "kind", "element", "name", "net", "namespace", "##targetNamespace" });
		addAnnotation(getSubstitutionTransitionType_Replication(), source,
				new String[] { "kind", "attribute", "name", "replication" });
		addAnnotation(textTypeEClass, source, new String[] { "name", "TextType", "kind", "elementOnly" });
		addAnnotation(getTextType_Graphics(), source,
				new String[] { "kind", "element", "name", "graphics", "namespace", "##targetNamespace" });
		addAnnotation(getTextType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getTextType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(timedTransitionTypeEClass, source,
				new String[] { "name", "TimedTransitionType", "kind", "elementOnly" });
		addAnnotation(getTimedTransitionType_TimeFunction(), source,
				new String[] { "kind", "attribute", "name", "timeFunction" });
		addAnnotation(transitionTypeEClass, source, new String[] { "name", "TransitionType", "kind", "elementOnly" });
		addAnnotation(getTransitionType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getTransitionType_DisplayExpression(), source,
				new String[] { "kind", "attribute", "name", "displayExpression" });
		addAnnotation(getTransitionType_GlobalGuard(), source,
				new String[] { "kind", "attribute", "name", "globalGuard" });
		addAnnotation(getTransitionType_LocalGuard(), source,
				new String[] { "kind", "attribute", "name", "localGuard" });
		addAnnotation(getTransitionType_LogfileDescription(), source,
				new String[] { "kind", "attribute", "name", "logfileDescription" });
		addAnnotation(getTransitionType_LogfileExpression(), source,
				new String[] { "kind", "attribute", "name", "logfileExpression" });
		addAnnotation(getTransitionType_LogfileName(), source,
				new String[] { "kind", "attribute", "name", "logfileName" });
		addAnnotation(getTransitionType_ManualCode(), source,
				new String[] { "kind", "attribute", "name", "manualCode" });
		addAnnotation(getTransitionType_Path(), source, new String[] { "kind", "attribute", "name", "path" });
		addAnnotation(getTransitionType_ServerType(), source,
				new String[] { "kind", "attribute", "name", "serverType" });
		addAnnotation(getTransitionType_SpecType(), source, new String[] { "kind", "attribute", "name", "specType" });
		addAnnotation(getTransitionType_TakeFirst(), source, new String[] { "kind", "attribute", "name", "takeFirst" });
		addAnnotation(getTransitionType_TimeGuard(), source, new String[] { "kind", "attribute", "name", "timeGuard" });
		addAnnotation(getTransitionType_Watch(), source, new String[] { "kind", "attribute", "name", "watch" });
		addAnnotation(typeEEnum, source, new String[] { "name", "Type" });
		addAnnotation(typedefTypeEClass, source, new String[] { "name", "TypedefType", "kind", "elementOnly" });
		addAnnotation(getTypedefType_Definition(), source, new String[] { "kind", "attribute", "name", "definition" });
		addAnnotation(getTypedefType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(typeObjectEDataType, source, new String[] { "name", "Type:Object", "baseType", "Type" });
	}

} //scpnPackageImpl
