/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.AddDataType;
import de.ilmenau.tu.timenet.schema.eDSPN.ArcType;
import de.ilmenau.tu.timenet.schema.eDSPN.BooleanType;
import de.ilmenau.tu.timenet.schema.eDSPN.CommentType;
import de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType;
import de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType;
import de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNFactory;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType;
import de.ilmenau.tu.timenet.schema.eDSPN.HandleType;
import de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.InhibitType;
import de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType;
import de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType;
import de.ilmenau.tu.timenet.schema.eDSPN.LabelType;
import de.ilmenau.tu.timenet.schema.eDSPN.MeasureType;
import de.ilmenau.tu.timenet.schema.eDSPN.NetType;
import de.ilmenau.tu.timenet.schema.eDSPN.NodeType;
import de.ilmenau.tu.timenet.schema.eDSPN.PlaceType;
import de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType;
import de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType;
import de.ilmenau.tu.timenet.schema.eDSPN.TextType;
import de.ilmenau.tu.timenet.schema.eDSPN.TransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.Type;

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
public class EDSPNPackageImpl extends EPackageImpl implements EDSPNPackage {
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
	private EClass deterministicTransitionTypeEClass = null;

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
	private EClass edspnNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalTransitionTypeEClass = null;

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
	private EClass inhibitTypeEClass = null;

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
	private EClass measureTypeEClass = null;

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
	private EClass placeTypeEClass = null;

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
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preemptionPolicyTypeEEnum = null;

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
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preemptionPolicyTypeObjectEDataType = null;

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
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EDSPNPackageImpl() {
		super(eNS_URI, EDSPNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EDSPNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EDSPNPackage init() {
		if (isInited)
			return (EDSPNPackage) EPackage.Registry.INSTANCE.getEPackage(EDSPNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEDSPNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EDSPNPackageImpl theEDSPNPackage = registeredEDSPNPackage instanceof EDSPNPackageImpl
				? (EDSPNPackageImpl) registeredEDSPNPackage
				: new EDSPNPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEDSPNPackage.createPackageContents();

		// Initialize created meta-data
		theEDSPNPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEDSPNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EDSPNPackage.eNS_URI, theEDSPNPackage);
		return theEDSPNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddDataType() {
		return addDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddDataType_Classname() {
		return (EAttribute) addDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcType_Inscription() {
		return (EReference) arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcType_Handle() {
		return (EReference) arcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentType() {
		return commentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentType_CommentText() {
		return (EAttribute) commentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_FromNode() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Id() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_ToNode() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Type() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionType() {
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionType_AdditionalData() {
		return (EReference) definitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_DefType() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_Expression() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_Name() {
		return (EAttribute) definitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicTransitionType() {
		return deterministicTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeterministicTransitionType_Delay() {
		return (EAttribute) deterministicTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeterministicTransitionType_PreemptionPolicy() {
		return (EAttribute) deterministicTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Net() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDSPNNet() {
		return edspnNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Place() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_ExponentialTransition() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_ImmediateTransition() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_DeterministicTransition() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_GeneralTransition() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Arc() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Inhibit() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Measure() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Definition() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDSPNNet_Comment() {
		return (EReference) edspnNetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialTransitionType() {
		return exponentialTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialTransitionType_Delay() {
		return (EAttribute) exponentialTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialTransitionType_PreemptionPolicy() {
		return (EAttribute) exponentialTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialTransitionType_ServerType() {
		return (EAttribute) exponentialTransitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralTransitionType() {
		return generalTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransitionType_Delay() {
		return (EAttribute) generalTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransitionType_PreemptionPolicy() {
		return (EAttribute) generalTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsType() {
		return graphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsType_Orientation() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsType_X() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsType_Y() {
		return (EAttribute) graphicsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandleType() {
		return handleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandleType_Graphics() {
		return (EReference) handleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_Id() {
		return (EAttribute) handleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateTransitionType() {
		return immediateTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateTransitionType_EnablingFunction() {
		return (EAttribute) immediateTransitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateTransitionType_Priority() {
		return (EAttribute) immediateTransitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateTransitionType_Weight() {
		return (EAttribute) immediateTransitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInhibitType() {
		return inhibitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInhibitType_Inscription() {
		return (EReference) inhibitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInhibitType_Handle() {
		return (EReference) inhibitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInscriptionTextType() {
		return inscriptionTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInscriptionTextType_Graphics() {
		return (EReference) inscriptionTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInscriptionTextType_Id() {
		return (EAttribute) inscriptionTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInscriptionTextType_Type() {
		return (EAttribute) inscriptionTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInscriptionType() {
		return inscriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInscriptionType_Text() {
		return (EAttribute) inscriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelType() {
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelType_Text() {
		return (EAttribute) labelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType() {
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_AdditionalData() {
		return (EReference) measureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Expression() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Name() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Result() {
		return (EAttribute) measureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetType() {
		return netTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetType_GridActive() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetType_Id() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetType_Netclass() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetType_SharpEdges() {
		return (EAttribute) netTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Graphics() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Id() {
		return (EAttribute) nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Type() {
		return (EAttribute) nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceType() {
		return placeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceType_Label() {
		return (EReference) placeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceType_InitialMarking() {
		return (EAttribute) placeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Graphics() {
		return (EReference) textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Id() {
		return (EAttribute) textTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Type() {
		return (EAttribute) textTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionType_Label() {
		return (EReference) transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanType() {
		return booleanTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefTypeType() {
		return defTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreemptionPolicyType() {
		return preemptionPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerTypeType() {
		return serverTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanTypeObject() {
		return booleanTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefTypeTypeObject() {
		return defTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreemptionPolicyTypeObject() {
		return preemptionPolicyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServerTypeTypeObject() {
		return serverTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeObject() {
		return typeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNFactory getEDSPNFactory() {
		return (EDSPNFactory) getEFactoryInstance();
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

		commentTypeEClass = createEClass(COMMENT_TYPE);
		createEAttribute(commentTypeEClass, COMMENT_TYPE__COMMENT_TEXT);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__FROM_NODE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__ID);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__TO_NODE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__TYPE);

		definitionTypeEClass = createEClass(DEFINITION_TYPE);
		createEReference(definitionTypeEClass, DEFINITION_TYPE__ADDITIONAL_DATA);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__DEF_TYPE);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__EXPRESSION);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__NAME);

		deterministicTransitionTypeEClass = createEClass(DETERMINISTIC_TRANSITION_TYPE);
		createEAttribute(deterministicTransitionTypeEClass, DETERMINISTIC_TRANSITION_TYPE__DELAY);
		createEAttribute(deterministicTransitionTypeEClass, DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NET);

		edspnNetEClass = createEClass(EDSPN_NET);
		createEReference(edspnNetEClass, EDSPN_NET__PLACE);
		createEReference(edspnNetEClass, EDSPN_NET__EXPONENTIAL_TRANSITION);
		createEReference(edspnNetEClass, EDSPN_NET__IMMEDIATE_TRANSITION);
		createEReference(edspnNetEClass, EDSPN_NET__DETERMINISTIC_TRANSITION);
		createEReference(edspnNetEClass, EDSPN_NET__GENERAL_TRANSITION);
		createEReference(edspnNetEClass, EDSPN_NET__ARC);
		createEReference(edspnNetEClass, EDSPN_NET__INHIBIT);
		createEReference(edspnNetEClass, EDSPN_NET__MEASURE);
		createEReference(edspnNetEClass, EDSPN_NET__DEFINITION);
		createEReference(edspnNetEClass, EDSPN_NET__COMMENT);

		exponentialTransitionTypeEClass = createEClass(EXPONENTIAL_TRANSITION_TYPE);
		createEAttribute(exponentialTransitionTypeEClass, EXPONENTIAL_TRANSITION_TYPE__DELAY);
		createEAttribute(exponentialTransitionTypeEClass, EXPONENTIAL_TRANSITION_TYPE__PREEMPTION_POLICY);
		createEAttribute(exponentialTransitionTypeEClass, EXPONENTIAL_TRANSITION_TYPE__SERVER_TYPE);

		generalTransitionTypeEClass = createEClass(GENERAL_TRANSITION_TYPE);
		createEAttribute(generalTransitionTypeEClass, GENERAL_TRANSITION_TYPE__DELAY);
		createEAttribute(generalTransitionTypeEClass, GENERAL_TRANSITION_TYPE__PREEMPTION_POLICY);

		graphicsTypeEClass = createEClass(GRAPHICS_TYPE);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__ORIENTATION);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__X);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__Y);

		handleTypeEClass = createEClass(HANDLE_TYPE);
		createEReference(handleTypeEClass, HANDLE_TYPE__GRAPHICS);
		createEAttribute(handleTypeEClass, HANDLE_TYPE__ID);

		immediateTransitionTypeEClass = createEClass(IMMEDIATE_TRANSITION_TYPE);
		createEAttribute(immediateTransitionTypeEClass, IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION);
		createEAttribute(immediateTransitionTypeEClass, IMMEDIATE_TRANSITION_TYPE__PRIORITY);
		createEAttribute(immediateTransitionTypeEClass, IMMEDIATE_TRANSITION_TYPE__WEIGHT);

		inhibitTypeEClass = createEClass(INHIBIT_TYPE);
		createEReference(inhibitTypeEClass, INHIBIT_TYPE__INSCRIPTION);
		createEReference(inhibitTypeEClass, INHIBIT_TYPE__HANDLE);

		inscriptionTextTypeEClass = createEClass(INSCRIPTION_TEXT_TYPE);
		createEReference(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__GRAPHICS);
		createEAttribute(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__ID);
		createEAttribute(inscriptionTextTypeEClass, INSCRIPTION_TEXT_TYPE__TYPE);

		inscriptionTypeEClass = createEClass(INSCRIPTION_TYPE);
		createEAttribute(inscriptionTypeEClass, INSCRIPTION_TYPE__TEXT);

		labelTypeEClass = createEClass(LABEL_TYPE);
		createEAttribute(labelTypeEClass, LABEL_TYPE__TEXT);

		measureTypeEClass = createEClass(MEASURE_TYPE);
		createEReference(measureTypeEClass, MEASURE_TYPE__ADDITIONAL_DATA);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__EXPRESSION);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__NAME);
		createEAttribute(measureTypeEClass, MEASURE_TYPE__RESULT);

		netTypeEClass = createEClass(NET_TYPE);
		createEAttribute(netTypeEClass, NET_TYPE__GRID_ACTIVE);
		createEAttribute(netTypeEClass, NET_TYPE__ID);
		createEAttribute(netTypeEClass, NET_TYPE__NETCLASS);
		createEAttribute(netTypeEClass, NET_TYPE__SHARP_EDGES);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEReference(nodeTypeEClass, NODE_TYPE__GRAPHICS);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ID);
		createEAttribute(nodeTypeEClass, NODE_TYPE__TYPE);

		placeTypeEClass = createEClass(PLACE_TYPE);
		createEReference(placeTypeEClass, PLACE_TYPE__LABEL);
		createEAttribute(placeTypeEClass, PLACE_TYPE__INITIAL_MARKING);

		textTypeEClass = createEClass(TEXT_TYPE);
		createEReference(textTypeEClass, TEXT_TYPE__GRAPHICS);
		createEAttribute(textTypeEClass, TEXT_TYPE__ID);
		createEAttribute(textTypeEClass, TEXT_TYPE__TYPE);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEReference(transitionTypeEClass, TRANSITION_TYPE__LABEL);

		// Create enums
		booleanTypeEEnum = createEEnum(BOOLEAN_TYPE);
		defTypeTypeEEnum = createEEnum(DEF_TYPE_TYPE);
		preemptionPolicyTypeEEnum = createEEnum(PREEMPTION_POLICY_TYPE);
		serverTypeTypeEEnum = createEEnum(SERVER_TYPE_TYPE);
		typeEEnum = createEEnum(TYPE);

		// Create data types
		booleanTypeObjectEDataType = createEDataType(BOOLEAN_TYPE_OBJECT);
		defTypeTypeObjectEDataType = createEDataType(DEF_TYPE_TYPE_OBJECT);
		preemptionPolicyTypeObjectEDataType = createEDataType(PREEMPTION_POLICY_TYPE_OBJECT);
		serverTypeTypeObjectEDataType = createEDataType(SERVER_TYPE_TYPE_OBJECT);
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
		deterministicTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		edspnNetEClass.getESuperTypes().add(this.getNetType());
		exponentialTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		generalTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		immediateTransitionTypeEClass.getESuperTypes().add(this.getTransitionType());
		inhibitTypeEClass.getESuperTypes().add(this.getConnectorType());
		inscriptionTypeEClass.getESuperTypes().add(this.getInscriptionTextType());
		labelTypeEClass.getESuperTypes().add(this.getTextType());
		measureTypeEClass.getESuperTypes().add(this.getTextType());
		placeTypeEClass.getESuperTypes().add(this.getNodeType());
		transitionTypeEClass.getESuperTypes().add(this.getNodeType());

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
		initEAttribute(getDefinitionType_DefType(), this.getDefTypeType(), "defType", "int", 0, 1, DefinitionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				DefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deterministicTransitionTypeEClass, DeterministicTransitionType.class, "DeterministicTransitionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeterministicTransitionType_Delay(), theXMLTypePackage.getString(), "delay", "1.0", 0, 1,
				DeterministicTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeterministicTransitionType_PreemptionPolicy(), this.getPreemptionPolicyType(),
				"preemptionPolicy", "PRD", 0, 1, DeterministicTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDocumentRoot_Net(), this.getEDSPNNet(), null, "net", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(edspnNetEClass, EDSPNNet.class, "EDSPNNet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDSPNNet_Place(), this.getPlaceType(), null, "place", null, 0, -1, EDSPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_ExponentialTransition(), this.getExponentialTransitionType(), null,
				"exponentialTransition", null, 0, -1, EDSPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_ImmediateTransition(), this.getImmediateTransitionType(), null,
				"immediateTransition", null, 0, -1, EDSPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_DeterministicTransition(), this.getDeterministicTransitionType(), null,
				"deterministicTransition", null, 0, -1, EDSPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_GeneralTransition(), this.getGeneralTransitionType(), null, "generalTransition",
				null, 0, -1, EDSPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_Arc(), this.getArcType(), null, "arc", null, 0, -1, EDSPNNet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEDSPNNet_Inhibit(), this.getInhibitType(), null, "inhibit", null, 0, -1, EDSPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_Measure(), this.getMeasureType(), null, "measure", null, 0, -1, EDSPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_Definition(), this.getDefinitionType(), null, "definition", null, 0, -1,
				EDSPNNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDSPNNet_Comment(), this.getCommentType(), null, "comment", null, 0, -1, EDSPNNet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialTransitionTypeEClass, ExponentialTransitionType.class, "ExponentialTransitionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialTransitionType_Delay(), theXMLTypePackage.getString(), "delay", "1.0", 0, 1,
				ExponentialTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialTransitionType_PreemptionPolicy(), this.getPreemptionPolicyType(),
				"preemptionPolicy", "PRD", 0, 1, ExponentialTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialTransitionType_ServerType(), this.getServerTypeType(), "serverType",
				"ExclusiveServer", 0, 1, ExponentialTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalTransitionTypeEClass, GeneralTransitionType.class, "GeneralTransitionType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralTransitionType_Delay(), theXMLTypePackage.getString(), "delay", "UNIFORM(0.0,1.0);", 0,
				1, GeneralTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralTransitionType_PreemptionPolicy(), this.getPreemptionPolicyType(), "preemptionPolicy",
				"PRD", 0, 1, GeneralTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getImmediateTransitionType_EnablingFunction(), theXMLTypePackage.getString(), "enablingFunction",
				"", 0, 1, ImmediateTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateTransitionType_Priority(), theXMLTypePackage.getString(), "priority", "1", 0, 1,
				ImmediateTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateTransitionType_Weight(), theXMLTypePackage.getString(), "weight", "1", 0, 1,
				ImmediateTransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inhibitTypeEClass, InhibitType.class, "InhibitType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInhibitType_Inscription(), this.getInscriptionType(), null, "inscription", null, 1, 1,
				InhibitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInhibitType_Handle(), this.getHandleType(), null, "handle", null, 0, -1, InhibitType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
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
		initEAttribute(getInscriptionType_Text(), theXMLTypePackage.getString(), "text", "1", 0, 1,
				InscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(labelTypeEClass, LabelType.class, "LabelType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelType_Text(), theXMLTypePackage.getString(), "text", "", 0, 1, LabelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureType_AdditionalData(), this.getAddDataType(), null, "additionalData", null, 0, 1,
				MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1,
				MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureType_Result(), theXMLTypePackage.getString(), "result", "", 0, 1, MeasureType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(placeTypeEClass, PlaceType.class, "PlaceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceType_Label(), this.getLabelType(), null, "label", null, 1, 1, PlaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceType_InitialMarking(), theXMLTypePackage.getString(), "initialMarking", "0", 0, 1,
				PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextType_Graphics(), this.getGraphicsType(), null, "graphics", null, 1, 1, TextType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, TextType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Type(), this.getType(), "type", "text", 1, 1, TextType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionType_Label(), this.getLabelType(), null, "label", null, 1, 1, TransitionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanTypeEEnum, BooleanType.class, "BooleanType");
		addEEnumLiteral(booleanTypeEEnum, BooleanType.TRUE);
		addEEnumLiteral(booleanTypeEEnum, BooleanType.FALSE);

		initEEnum(defTypeTypeEEnum, DefTypeType.class, "DefTypeType");
		addEEnumLiteral(defTypeTypeEEnum, DefTypeType.INT);
		addEEnumLiteral(defTypeTypeEEnum, DefTypeType.REAL);

		initEEnum(preemptionPolicyTypeEEnum, PreemptionPolicyType.class, "PreemptionPolicyType");
		addEEnumLiteral(preemptionPolicyTypeEEnum, PreemptionPolicyType.PRD);
		addEEnumLiteral(preemptionPolicyTypeEEnum, PreemptionPolicyType.PRS);

		initEEnum(serverTypeTypeEEnum, ServerTypeType.class, "ServerTypeType");
		addEEnumLiteral(serverTypeTypeEEnum, ServerTypeType.INFINITE_SERVER);
		addEEnumLiteral(serverTypeTypeEEnum, ServerTypeType.EXCLUSIVE_SERVER);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.NODE);
		addEEnumLiteral(typeEEnum, Type.CONNECTOR);
		addEEnumLiteral(typeEEnum, Type.TEXT);
		addEEnumLiteral(typeEEnum, Type.INSCRIPTION_TEXT);

		// Initialize data types
		initEDataType(booleanTypeObjectEDataType, BooleanType.class, "BooleanTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defTypeTypeObjectEDataType, DefTypeType.class, "DefTypeTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preemptionPolicyTypeObjectEDataType, PreemptionPolicyType.class, "PreemptionPolicyTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serverTypeTypeObjectEDataType, ServerTypeType.class, "ServerTypeTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeObjectEDataType, Type.class, "TypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

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
		addAnnotation(booleanTypeEEnum, source, new String[] { "name", "BooleanType" });
		addAnnotation(booleanTypeObjectEDataType, source,
				new String[] { "name", "BooleanType:Object", "baseType", "BooleanType" });
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
		addAnnotation(getDefinitionType_DefType(), source, new String[] { "kind", "attribute", "name", "defType" });
		addAnnotation(getDefinitionType_Expression(), source,
				new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getDefinitionType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(defTypeTypeEEnum, source, new String[] { "name", "DefTypeType" });
		addAnnotation(defTypeTypeObjectEDataType, source,
				new String[] { "name", "DefTypeType:Object", "baseType", "DefTypeType" });
		addAnnotation(deterministicTransitionTypeEClass, source,
				new String[] { "name", "DeterministicTransitionType", "kind", "elementOnly" });
		addAnnotation(getDeterministicTransitionType_Delay(), source,
				new String[] { "kind", "attribute", "name", "delay" });
		addAnnotation(getDeterministicTransitionType_PreemptionPolicy(), source,
				new String[] { "kind", "attribute", "name", "preemptionPolicy" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Net(), source,
				new String[] { "kind", "element", "name", "net", "namespace", "##targetNamespace" });
		addAnnotation(edspnNetEClass, source, new String[] { "name", "eDSPNNet", "kind", "elementOnly" });
		addAnnotation(getEDSPNNet_Place(), source,
				new String[] { "kind", "element", "name", "place", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_ExponentialTransition(), source,
				new String[] { "kind", "element", "name", "exponentialTransition", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_ImmediateTransition(), source,
				new String[] { "kind", "element", "name", "immediateTransition", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_DeterministicTransition(), source, new String[] { "kind", "element", "name",
				"deterministicTransition", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_GeneralTransition(), source,
				new String[] { "kind", "element", "name", "generalTransition", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_Arc(), source,
				new String[] { "kind", "element", "name", "arc", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_Inhibit(), source,
				new String[] { "kind", "element", "name", "inhibit", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_Measure(), source,
				new String[] { "kind", "element", "name", "measure", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_Definition(), source,
				new String[] { "kind", "element", "name", "definition", "namespace", "##targetNamespace" });
		addAnnotation(getEDSPNNet_Comment(), source,
				new String[] { "kind", "element", "name", "comment", "namespace", "##targetNamespace" });
		addAnnotation(exponentialTransitionTypeEClass, source,
				new String[] { "name", "ExponentialTransitionType", "kind", "elementOnly" });
		addAnnotation(getExponentialTransitionType_Delay(), source,
				new String[] { "kind", "attribute", "name", "delay" });
		addAnnotation(getExponentialTransitionType_PreemptionPolicy(), source,
				new String[] { "kind", "attribute", "name", "preemptionPolicy" });
		addAnnotation(getExponentialTransitionType_ServerType(), source,
				new String[] { "kind", "attribute", "name", "serverType" });
		addAnnotation(generalTransitionTypeEClass, source,
				new String[] { "name", "GeneralTransitionType", "kind", "elementOnly" });
		addAnnotation(getGeneralTransitionType_Delay(), source, new String[] { "kind", "attribute", "name", "delay" });
		addAnnotation(getGeneralTransitionType_PreemptionPolicy(), source,
				new String[] { "kind", "attribute", "name", "preemptionPolicy" });
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
		addAnnotation(getImmediateTransitionType_EnablingFunction(), source,
				new String[] { "kind", "attribute", "name", "enablingFunction" });
		addAnnotation(getImmediateTransitionType_Priority(), source,
				new String[] { "kind", "attribute", "name", "priority" });
		addAnnotation(getImmediateTransitionType_Weight(), source,
				new String[] { "kind", "attribute", "name", "weight" });
		addAnnotation(inhibitTypeEClass, source, new String[] { "name", "InhibitType", "kind", "elementOnly" });
		addAnnotation(getInhibitType_Inscription(), source,
				new String[] { "kind", "element", "name", "inscription", "namespace", "##targetNamespace" });
		addAnnotation(getInhibitType_Handle(), source,
				new String[] { "kind", "element", "name", "handle", "namespace", "##targetNamespace" });
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
		addAnnotation(measureTypeEClass, source, new String[] { "name", "MeasureType", "kind", "elementOnly" });
		addAnnotation(getMeasureType_AdditionalData(), source,
				new String[] { "kind", "element", "name", "additionalData", "namespace", "##targetNamespace" });
		addAnnotation(getMeasureType_Expression(), source, new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getMeasureType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getMeasureType_Result(), source, new String[] { "kind", "attribute", "name", "result" });
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
		addAnnotation(placeTypeEClass, source, new String[] { "name", "PlaceType", "kind", "elementOnly" });
		addAnnotation(getPlaceType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(getPlaceType_InitialMarking(), source,
				new String[] { "kind", "attribute", "name", "initialMarking" });
		addAnnotation(preemptionPolicyTypeEEnum, source, new String[] { "name", "PreemptionPolicyType" });
		addAnnotation(preemptionPolicyTypeObjectEDataType, source,
				new String[] { "name", "PreemptionPolicyType:Object", "baseType", "PreemptionPolicyType" });
		addAnnotation(serverTypeTypeEEnum, source, new String[] { "name", "ServerTypeType" });
		addAnnotation(serverTypeTypeObjectEDataType, source,
				new String[] { "name", "ServerTypeType:Object", "baseType", "ServerTypeType" });
		addAnnotation(textTypeEClass, source, new String[] { "name", "TextType", "kind", "elementOnly" });
		addAnnotation(getTextType_Graphics(), source,
				new String[] { "kind", "element", "name", "graphics", "namespace", "##targetNamespace" });
		addAnnotation(getTextType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getTextType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(transitionTypeEClass, source, new String[] { "name", "TransitionType", "kind", "elementOnly" });
		addAnnotation(getTransitionType_Label(), source,
				new String[] { "kind", "element", "name", "label", "namespace", "##targetNamespace" });
		addAnnotation(typeEEnum, source, new String[] { "name", "Type" });
		addAnnotation(typeObjectEDataType, source, new String[] { "name", "Type:Object", "baseType", "Type" });
	}

} //EDSPNPackageImpl
