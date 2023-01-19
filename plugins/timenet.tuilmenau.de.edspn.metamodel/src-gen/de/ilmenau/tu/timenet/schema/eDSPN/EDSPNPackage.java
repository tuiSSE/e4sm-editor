/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNFactory
 * @model kind="package"
 * @generated
 */
public interface EDSPNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eDSPN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://timenet.tu-ilmenau.de/schema/eDSPN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eDSPN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDSPNPackage eINSTANCE = de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.AddDataTypeImpl <em>Add Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.AddDataTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getAddDataType()
	 * @generated
	 */
	int ADD_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_TYPE__CLASSNAME = 0;

	/**
	 * The number of structural features of the '<em>Add Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Add Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ConnectorTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__FROM_NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TO_NODE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ArcTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 1;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__FROM_NODE = CONNECTOR_TYPE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ID = CONNECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TO_NODE = CONNECTOR_TYPE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TYPE = CONNECTOR_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__INSCRIPTION = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__HANDLE = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_OPERATION_COUNT = CONNECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.TextTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__GRAPHICS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.CommentTypeImpl <em>Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.CommentTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Comment Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__COMMENT_TEXT = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl <em>Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefinitionType()
	 * @generated
	 */
	int DEFINITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__ADDITIONAL_DATA = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Def Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__DEF_TYPE = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__EXPRESSION = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__GRAPHICS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.TransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GRAPHICS = NODE_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ID = NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TYPE = NODE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LABEL = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl <em>Deterministic Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDeterministicTransitionType()
	 * @generated
	 */
	int DETERMINISTIC_TRANSITION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__DELAY = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preemption Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deterministic Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deterministic Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DocumentRootImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NET = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl <em>Net Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getNetType()
	 * @generated
	 */
	int NET_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE__GRID_ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE__NETCLASS = 2;

	/**
	 * The feature id for the '<em><b>Sharp Edges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE__SHARP_EDGES = 3;

	/**
	 * The number of structural features of the '<em>Net Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Net Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getEDSPNNet()
	 * @generated
	 */
	int EDSPN_NET = 7;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__GRID_ACTIVE = NET_TYPE__GRID_ACTIVE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__ID = NET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__NETCLASS = NET_TYPE__NETCLASS;

	/**
	 * The feature id for the '<em><b>Sharp Edges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__SHARP_EDGES = NET_TYPE__SHARP_EDGES;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__PLACE = NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exponential Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__EXPONENTIAL_TRANSITION = NET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__IMMEDIATE_TRANSITION = NET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deterministic Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__DETERMINISTIC_TRANSITION = NET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>General Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__GENERAL_TRANSITION = NET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__ARC = NET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inhibit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__INHIBIT = NET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__MEASURE = NET_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__DEFINITION = NET_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET__COMMENT = NET_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET_FEATURE_COUNT = NET_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSPN_NET_OPERATION_COUNT = NET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ExponentialTransitionTypeImpl <em>Exponential Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ExponentialTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getExponentialTransitionType()
	 * @generated
	 */
	int EXPONENTIAL_TRANSITION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__DELAY = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preemption Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__PREEMPTION_POLICY = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE__SERVER_TYPE = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exponential Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Exponential Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.GeneralTransitionTypeImpl <em>General Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.GeneralTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getGeneralTransitionType()
	 * @generated
	 */
	int GENERAL_TRANSITION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__DELAY = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preemption Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE__PREEMPTION_POLICY = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>General Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.GraphicsTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getGraphicsType()
	 * @generated
	 */
	int GRAPHICS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__ORIENTATION = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__Y = 2;

	/**
	 * The number of structural features of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.HandleTypeImpl <em>Handle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.HandleTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getHandleType()
	 * @generated
	 */
	int HANDLE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__GRAPHICS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Handle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Handle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl <em>Immediate Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getImmediateTransitionType()
	 * @generated
	 */
	int IMMEDIATE_TRANSITION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Enabling Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__PRIORITY = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__WEIGHT = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Immediate Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Immediate Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl <em>Inhibit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInhibitType()
	 * @generated
	 */
	int INHIBIT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__FROM_NODE = CONNECTOR_TYPE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__ID = CONNECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__TO_NODE = CONNECTOR_TYPE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__TYPE = CONNECTOR_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__INSCRIPTION = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE__HANDLE = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inhibit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inhibit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_TYPE_OPERATION_COUNT = CONNECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTextTypeImpl <em>Inscription Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTextTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInscriptionTextType()
	 * @generated
	 */
	int INSCRIPTION_TEXT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TEXT_TYPE__GRAPHICS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TEXT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TEXT_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Inscription Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inscription Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTypeImpl <em>Inscription Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInscriptionType()
	 * @generated
	 */
	int INSCRIPTION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE__GRAPHICS = INSCRIPTION_TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE__ID = INSCRIPTION_TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE__TYPE = INSCRIPTION_TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE__TEXT = INSCRIPTION_TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inscription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE_FEATURE_COUNT = INSCRIPTION_TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inscription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_TYPE_OPERATION_COUNT = INSCRIPTION_TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.LabelTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__TEXT = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ADDITIONAL_DATA = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__EXPRESSION = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__RESULT = TEXT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl <em>Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__GRAPHICS = NODE_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__ID = NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TYPE = NODE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__LABEL = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__INITIAL_MARKING = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.BooleanType <em>Boolean Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 23;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType <em>Def Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefTypeType()
	 * @generated
	 */
	int DEF_TYPE_TYPE = 24;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType <em>Preemption Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPreemptionPolicyType()
	 * @generated
	 */
	int PREEMPTION_POLICY_TYPE = 25;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType <em>Server Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getServerTypeType()
	 * @generated
	 */
	int SERVER_TYPE_TYPE = 26;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 27;

	/**
	 * The meta object id for the '<em>Boolean Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getBooleanTypeObject()
	 * @generated
	 */
	int BOOLEAN_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Def Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefTypeTypeObject()
	 * @generated
	 */
	int DEF_TYPE_TYPE_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Preemption Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPreemptionPolicyTypeObject()
	 * @generated
	 */
	int PREEMPTION_POLICY_TYPE_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Server Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getServerTypeTypeObject()
	 * @generated
	 */
	int SERVER_TYPE_TYPE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTypeObject()
	 * @generated
	 */
	int TYPE_OBJECT = 32;

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.AddDataType <em>Add Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Data Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.AddDataType
	 * @generated
	 */
	EClass getAddDataType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.AddDataType#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.AddDataType#getClassname()
	 * @see #getAddDataType()
	 * @generated
	 */
	EAttribute getAddDataType_Classname();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.ArcType#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ArcType#getInscription()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Inscription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.ArcType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handle</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ArcType#getHandle()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Handle();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.CommentType
	 * @generated
	 */
	EClass getCommentType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.CommentType#getCommentText <em>Comment Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.CommentType#getCommentText()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_CommentText();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Node</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getFromNode()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_FromNode();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Node</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getToNode()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ToNode();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ConnectorType#getType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType
	 * @generated
	 */
	EClass getDefinitionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Data</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getAdditionalData()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EReference getDefinitionType_AdditionalData();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType <em>Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getDefType()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_DefType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getExpression()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType#getName()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_Name();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType <em>Deterministic Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType
	 * @generated
	 */
	EClass getDeterministicTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType#getDelay()
	 * @see #getDeterministicTransitionType()
	 * @generated
	 */
	EAttribute getDeterministicTransitionType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Policy</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType#getPreemptionPolicy()
	 * @see #getDeterministicTransitionType()
	 * @generated
	 */
	EAttribute getDeterministicTransitionType_PreemptionPolicy();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DocumentRoot#getNet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Net();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet
	 * @generated
	 */
	EClass getEDSPNNet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getPlace()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getExponentialTransition <em>Exponential Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exponential Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getExponentialTransition()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_ExponentialTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Immediate Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getImmediateTransition()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_ImmediateTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDeterministicTransition <em>Deterministic Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deterministic Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDeterministicTransition()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_DeterministicTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getGeneralTransition <em>General Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getGeneralTransition()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_GeneralTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getArc()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Arc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getInhibit <em>Inhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inhibit</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getInhibit()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Inhibit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getMeasure()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getDefinition()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet#getComment()
	 * @see #getEDSPNNet()
	 * @generated
	 */
	EReference getEDSPNNet_Comment();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType <em>Exponential Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType
	 * @generated
	 */
	EClass getExponentialTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getDelay()
	 * @see #getExponentialTransitionType()
	 * @generated
	 */
	EAttribute getExponentialTransitionType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Policy</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getPreemptionPolicy()
	 * @see #getExponentialTransitionType()
	 * @generated
	 */
	EAttribute getExponentialTransitionType_PreemptionPolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType#getServerType()
	 * @see #getExponentialTransitionType()
	 * @generated
	 */
	EAttribute getExponentialTransitionType_ServerType();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType <em>General Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType
	 * @generated
	 */
	EClass getGeneralTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType#getDelay()
	 * @see #getGeneralTransitionType()
	 * @generated
	 */
	EAttribute getGeneralTransitionType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType#getPreemptionPolicy <em>Preemption Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Policy</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType#getPreemptionPolicy()
	 * @see #getGeneralTransitionType()
	 * @generated
	 */
	EAttribute getGeneralTransitionType_PreemptionPolicy();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType
	 * @generated
	 */
	EClass getGraphicsType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getOrientation()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getX()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_X();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType#getY()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Y();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.HandleType
	 * @generated
	 */
	EClass getHandleType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getGraphics()
	 * @see #getHandleType()
	 * @generated
	 */
	EReference getHandleType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.HandleType#getId()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_Id();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType <em>Immediate Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType
	 * @generated
	 */
	EClass getImmediateTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction <em>Enabling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabling Function</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getEnablingFunction()
	 * @see #getImmediateTransitionType()
	 * @generated
	 */
	EAttribute getImmediateTransitionType_EnablingFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getPriority()
	 * @see #getImmediateTransitionType()
	 * @generated
	 */
	EAttribute getImmediateTransitionType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType#getWeight()
	 * @see #getImmediateTransitionType()
	 * @generated
	 */
	EAttribute getImmediateTransitionType_Weight();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType <em>Inhibit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibit Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InhibitType
	 * @generated
	 */
	EClass getInhibitType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getInscription()
	 * @see #getInhibitType()
	 * @generated
	 */
	EReference getInhibitType_Inscription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handle</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InhibitType#getHandle()
	 * @see #getInhibitType()
	 * @generated
	 */
	EReference getInhibitType_Handle();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType <em>Inscription Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inscription Text Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType
	 * @generated
	 */
	EClass getInscriptionTextType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getGraphics()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EReference getInscriptionTextType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getId()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EAttribute getInscriptionTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionTextType#getType()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EAttribute getInscriptionTextType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType <em>Inscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inscription Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType
	 * @generated
	 */
	EClass getInscriptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType#getText()
	 * @see #getInscriptionType()
	 * @generated
	 */
	EAttribute getInscriptionType_Text();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.LabelType#getText()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Text();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType
	 * @generated
	 */
	EClass getMeasureType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Data</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getAdditionalData()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_AdditionalData();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getExpression()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getName()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.MeasureType#getResult()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Result();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType <em>Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType
	 * @generated
	 */
	EClass getNetType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive <em>Grid Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Active</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType#isGridActive()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_GridActive();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType#getId()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#getNetclass <em>Netclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Netclass</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType#getNetclass()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_Netclass();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges <em>Sharp Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharp Edges</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NetType#isSharpEdges()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_SharpEdges();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getGraphics()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getId()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.NodeType#getType()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PlaceType
	 * @generated
	 */
	EClass getPlaceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getLabel()
	 * @see #getPlaceType()
	 * @generated
	 */
	EReference getPlaceType_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Marking</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PlaceType#getInitialMarking()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_InitialMarking();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.TextType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TextType#getGraphics()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.TextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TextType#getId()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.eDSPN.TextType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TextType#getType()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.eDSPN.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.eDSPN.TransitionType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.TransitionType#getLabel()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Label();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.eDSPN.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
	 * @generated
	 */
	EEnum getBooleanType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType <em>Def Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Def Type Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @generated
	 */
	EEnum getDefTypeType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType <em>Preemption Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preemption Policy Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @generated
	 */
	EEnum getPreemptionPolicyType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType <em>Server Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Type Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @generated
	 */
	EEnum getServerTypeType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.eDSPN.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.eDSPN.BooleanType <em>Boolean Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.eDSPN.BooleanType"
	 *        extendedMetaData="name='BooleanType:Object' baseType='BooleanType'"
	 * @generated
	 */
	EDataType getBooleanTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType <em>Def Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Def Type Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType"
	 *        extendedMetaData="name='DefTypeType:Object' baseType='DefTypeType'"
	 * @generated
	 */
	EDataType getDefTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType <em>Preemption Policy Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Preemption Policy Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType"
	 *        extendedMetaData="name='PreemptionPolicyType:Object' baseType='PreemptionPolicyType'"
	 * @generated
	 */
	EDataType getPreemptionPolicyTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType <em>Server Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Server Type Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType"
	 *        extendedMetaData="name='ServerTypeType:Object' baseType='ServerTypeType'"
	 * @generated
	 */
	EDataType getServerTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.eDSPN.Type <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.eDSPN.Type"
	 *        extendedMetaData="name='Type:Object' baseType='Type'"
	 * @generated
	 */
	EDataType getTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDSPNFactory getEDSPNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.AddDataTypeImpl <em>Add Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.AddDataTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getAddDataType()
		 * @generated
		 */
		EClass ADD_DATA_TYPE = eINSTANCE.getAddDataType();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_DATA_TYPE__CLASSNAME = eINSTANCE.getAddDataType_Classname();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ArcTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TYPE__INSCRIPTION = eINSTANCE.getArcType_Inscription();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TYPE__HANDLE = eINSTANCE.getArcType_Handle();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.CommentTypeImpl <em>Comment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.CommentTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getCommentType()
		 * @generated
		 */
		EClass COMMENT_TYPE = eINSTANCE.getCommentType();

		/**
		 * The meta object literal for the '<em><b>Comment Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_TYPE__COMMENT_TEXT = eINSTANCE.getCommentType_CommentText();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ConnectorTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__FROM_NODE = eINSTANCE.getConnectorType_FromNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__ID = eINSTANCE.getConnectorType_Id();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__TO_NODE = eINSTANCE.getConnectorType_ToNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__TYPE = eINSTANCE.getConnectorType_Type();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl <em>Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefinitionType()
		 * @generated
		 */
		EClass DEFINITION_TYPE = eINSTANCE.getDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Additional Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE__ADDITIONAL_DATA = eINSTANCE.getDefinitionType_AdditionalData();

		/**
		 * The meta object literal for the '<em><b>Def Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE__DEF_TYPE = eINSTANCE.getDefinitionType_DefType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE__EXPRESSION = eINSTANCE.getDefinitionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE__NAME = eINSTANCE.getDefinitionType_Name();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl <em>Deterministic Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDeterministicTransitionType()
		 * @generated
		 */
		EClass DETERMINISTIC_TRANSITION_TYPE = eINSTANCE.getDeterministicTransitionType();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETERMINISTIC_TRANSITION_TYPE__DELAY = eINSTANCE.getDeterministicTransitionType_Delay();

		/**
		 * The meta object literal for the '<em><b>Preemption Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY = eINSTANCE
				.getDeterministicTransitionType_PreemptionPolicy();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.DocumentRootImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NET = eINSTANCE.getDocumentRoot_Net();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getEDSPNNet()
		 * @generated
		 */
		EClass EDSPN_NET = eINSTANCE.getEDSPNNet();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__PLACE = eINSTANCE.getEDSPNNet_Place();

		/**
		 * The meta object literal for the '<em><b>Exponential Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__EXPONENTIAL_TRANSITION = eINSTANCE.getEDSPNNet_ExponentialTransition();

		/**
		 * The meta object literal for the '<em><b>Immediate Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__IMMEDIATE_TRANSITION = eINSTANCE.getEDSPNNet_ImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Deterministic Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__DETERMINISTIC_TRANSITION = eINSTANCE.getEDSPNNet_DeterministicTransition();

		/**
		 * The meta object literal for the '<em><b>General Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__GENERAL_TRANSITION = eINSTANCE.getEDSPNNet_GeneralTransition();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__ARC = eINSTANCE.getEDSPNNet_Arc();

		/**
		 * The meta object literal for the '<em><b>Inhibit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__INHIBIT = eINSTANCE.getEDSPNNet_Inhibit();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__MEASURE = eINSTANCE.getEDSPNNet_Measure();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__DEFINITION = eINSTANCE.getEDSPNNet_Definition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSPN_NET__COMMENT = eINSTANCE.getEDSPNNet_Comment();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ExponentialTransitionTypeImpl <em>Exponential Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ExponentialTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getExponentialTransitionType()
		 * @generated
		 */
		EClass EXPONENTIAL_TRANSITION_TYPE = eINSTANCE.getExponentialTransitionType();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_TRANSITION_TYPE__DELAY = eINSTANCE.getExponentialTransitionType_Delay();

		/**
		 * The meta object literal for the '<em><b>Preemption Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_TRANSITION_TYPE__PREEMPTION_POLICY = eINSTANCE
				.getExponentialTransitionType_PreemptionPolicy();

		/**
		 * The meta object literal for the '<em><b>Server Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_TRANSITION_TYPE__SERVER_TYPE = eINSTANCE.getExponentialTransitionType_ServerType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.GeneralTransitionTypeImpl <em>General Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.GeneralTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getGeneralTransitionType()
		 * @generated
		 */
		EClass GENERAL_TRANSITION_TYPE = eINSTANCE.getGeneralTransitionType();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_TRANSITION_TYPE__DELAY = eINSTANCE.getGeneralTransitionType_Delay();

		/**
		 * The meta object literal for the '<em><b>Preemption Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_TRANSITION_TYPE__PREEMPTION_POLICY = eINSTANCE.getGeneralTransitionType_PreemptionPolicy();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.GraphicsTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getGraphicsType()
		 * @generated
		 */
		EClass GRAPHICS_TYPE = eINSTANCE.getGraphicsType();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_TYPE__ORIENTATION = eINSTANCE.getGraphicsType_Orientation();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_TYPE__X = eINSTANCE.getGraphicsType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_TYPE__Y = eINSTANCE.getGraphicsType_Y();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.HandleTypeImpl <em>Handle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.HandleTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getHandleType()
		 * @generated
		 */
		EClass HANDLE_TYPE = eINSTANCE.getHandleType();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLE_TYPE__GRAPHICS = eINSTANCE.getHandleType_Graphics();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE_TYPE__ID = eINSTANCE.getHandleType_Id();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl <em>Immediate Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getImmediateTransitionType()
		 * @generated
		 */
		EClass IMMEDIATE_TRANSITION_TYPE = eINSTANCE.getImmediateTransitionType();

		/**
		 * The meta object literal for the '<em><b>Enabling Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION = eINSTANCE
				.getImmediateTransitionType_EnablingFunction();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_TRANSITION_TYPE__PRIORITY = eINSTANCE.getImmediateTransitionType_Priority();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_TRANSITION_TYPE__WEIGHT = eINSTANCE.getImmediateTransitionType_Weight();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl <em>Inhibit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInhibitType()
		 * @generated
		 */
		EClass INHIBIT_TYPE = eINSTANCE.getInhibitType();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHIBIT_TYPE__INSCRIPTION = eINSTANCE.getInhibitType_Inscription();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHIBIT_TYPE__HANDLE = eINSTANCE.getInhibitType_Handle();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTextTypeImpl <em>Inscription Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTextTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInscriptionTextType()
		 * @generated
		 */
		EClass INSCRIPTION_TEXT_TYPE = eINSTANCE.getInscriptionTextType();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSCRIPTION_TEXT_TYPE__GRAPHICS = eINSTANCE.getInscriptionTextType_Graphics();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION_TEXT_TYPE__ID = eINSTANCE.getInscriptionTextType_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION_TEXT_TYPE__TYPE = eINSTANCE.getInscriptionTextType_Type();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTypeImpl <em>Inscription Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.InscriptionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getInscriptionType()
		 * @generated
		 */
		EClass INSCRIPTION_TYPE = eINSTANCE.getInscriptionType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION_TYPE__TEXT = eINSTANCE.getInscriptionType_Text();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.LabelTypeImpl <em>Label Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.LabelTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getLabelType()
		 * @generated
		 */
		EClass LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_TYPE__TEXT = eINSTANCE.getLabelType_Text();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getMeasureType()
		 * @generated
		 */
		EClass MEASURE_TYPE = eINSTANCE.getMeasureType();

		/**
		 * The meta object literal for the '<em><b>Additional Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_TYPE__ADDITIONAL_DATA = eINSTANCE.getMeasureType_AdditionalData();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__EXPRESSION = eINSTANCE.getMeasureType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__NAME = eINSTANCE.getMeasureType_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__RESULT = eINSTANCE.getMeasureType_Result();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl <em>Net Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getNetType()
		 * @generated
		 */
		EClass NET_TYPE = eINSTANCE.getNetType();

		/**
		 * The meta object literal for the '<em><b>Grid Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_TYPE__GRID_ACTIVE = eINSTANCE.getNetType_GridActive();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_TYPE__ID = eINSTANCE.getNetType_Id();

		/**
		 * The meta object literal for the '<em><b>Netclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_TYPE__NETCLASS = eINSTANCE.getNetType_Netclass();

		/**
		 * The meta object literal for the '<em><b>Sharp Edges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_TYPE__SHARP_EDGES = eINSTANCE.getNetType_SharpEdges();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__GRAPHICS = eINSTANCE.getNodeType_Graphics();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__ID = eINSTANCE.getNodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__TYPE = eINSTANCE.getNodeType_Type();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl <em>Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPlaceType()
		 * @generated
		 */
		EClass PLACE_TYPE = eINSTANCE.getPlaceType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TYPE__LABEL = eINSTANCE.getPlaceType_Label();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__INITIAL_MARKING = eINSTANCE.getPlaceType_InitialMarking();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.TextTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTextType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__GRAPHICS = eINSTANCE.getTextType_Graphics();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__ID = eINSTANCE.getTextType_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__TYPE = eINSTANCE.getTextType_Type();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.TransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__LABEL = eINSTANCE.getTransitionType_Label();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.BooleanType <em>Boolean Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getBooleanType()
		 * @generated
		 */
		EEnum BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType <em>Def Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefTypeType()
		 * @generated
		 */
		EEnum DEF_TYPE_TYPE = eINSTANCE.getDefTypeType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType <em>Preemption Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPreemptionPolicyType()
		 * @generated
		 */
		EEnum PREEMPTION_POLICY_TYPE = eINSTANCE.getPreemptionPolicyType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType <em>Server Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getServerTypeType()
		 * @generated
		 */
		EEnum SERVER_TYPE_TYPE = eINSTANCE.getServerTypeType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.eDSPN.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Boolean Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.BooleanType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getBooleanTypeObject()
		 * @generated
		 */
		EDataType BOOLEAN_TYPE_OBJECT = eINSTANCE.getBooleanTypeObject();

		/**
		 * The meta object literal for the '<em>Def Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getDefTypeTypeObject()
		 * @generated
		 */
		EDataType DEF_TYPE_TYPE_OBJECT = eINSTANCE.getDefTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Preemption Policy Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getPreemptionPolicyTypeObject()
		 * @generated
		 */
		EDataType PREEMPTION_POLICY_TYPE_OBJECT = eINSTANCE.getPreemptionPolicyTypeObject();

		/**
		 * The meta object literal for the '<em>Server Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.ServerTypeType
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getServerTypeTypeObject()
		 * @generated
		 */
		EDataType SERVER_TYPE_TYPE_OBJECT = eINSTANCE.getServerTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.Type
		 * @see de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNPackageImpl#getTypeObject()
		 * @generated
		 */
		EDataType TYPE_OBJECT = eINSTANCE.getTypeObject();

	}

} //EDSPNPackage
