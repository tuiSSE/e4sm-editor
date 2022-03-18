/**
 */
package de.ilmenau.tu.timenet.schema.scpn;

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
 * @see de.ilmenau.tu.timenet.schema.scpn.scpnFactory
 * @model kind="package"
 * @generated
 */
public interface scpnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scpn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://timenet.tu-ilmenau.de/schema/SCPN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scpn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scpnPackage eINSTANCE = de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.AddDataTypeImpl <em>Add Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.AddDataTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getAddDataType()
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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 4;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ArcTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getArcType()
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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.AttributeTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TextTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 28;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.CommentTypeImpl <em>Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.CommentTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 3;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.DefinitionTypeImpl <em>Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.DefinitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getDefinitionType()
	 * @generated
	 */
	int DEFINITION_TYPE = 5;

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
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__EXPRESSION = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__PATH = TEXT_TYPE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.DocumentRootImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.GraphicsTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getGraphicsType()
	 * @generated
	 */
	int GRAPHICS_TYPE = 7;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.HandleTypeImpl <em>Handle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.HandleTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getHandleType()
	 * @generated
	 */
	int HANDLE_TYPE = 8;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.NodeTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 20;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 30;

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
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__DISPLAY_EXPRESSION = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GLOBAL_GUARD = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LOCAL_GUARD = NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logfile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LOGFILE_DESCRIPTION = NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Logfile Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LOGFILE_EXPRESSION = NODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Logfile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LOGFILE_NAME = NODE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Manual Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__MANUAL_CODE = NODE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__PATH = NODE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SERVER_TYPE = NODE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SPEC_TYPE = NODE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Take First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TAKE_FIRST = NODE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TIME_GUARD = NODE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__WATCH = NODE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ImmediateTransitionTypeImpl <em>Immediate Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ImmediateTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getImmediateTransitionType()
	 * @generated
	 */
	int IMMEDIATE_TRANSITION_TYPE = 9;

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
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__DISPLAY_EXPRESSION = TRANSITION_TYPE__DISPLAY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Global Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__GLOBAL_GUARD = TRANSITION_TYPE__GLOBAL_GUARD;

	/**
	 * The feature id for the '<em><b>Local Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__LOCAL_GUARD = TRANSITION_TYPE__LOCAL_GUARD;

	/**
	 * The feature id for the '<em><b>Logfile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__LOGFILE_DESCRIPTION = TRANSITION_TYPE__LOGFILE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logfile Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__LOGFILE_EXPRESSION = TRANSITION_TYPE__LOGFILE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logfile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__LOGFILE_NAME = TRANSITION_TYPE__LOGFILE_NAME;

	/**
	 * The feature id for the '<em><b>Manual Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__MANUAL_CODE = TRANSITION_TYPE__MANUAL_CODE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__PATH = TRANSITION_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__SERVER_TYPE = TRANSITION_TYPE__SERVER_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__SPEC_TYPE = TRANSITION_TYPE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Take First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__TAKE_FIRST = TRANSITION_TYPE__TAKE_FIRST;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__TIME_GUARD = TRANSITION_TYPE__TIME_GUARD;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__WATCH = TRANSITION_TYPE__WATCH;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__PRIORITY = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE__WEIGHT = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Immediate Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Immediate Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTextTypeImpl <em>Inscription Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTextTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getInscriptionTextType()
	 * @generated
	 */
	int INSCRIPTION_TEXT_TYPE = 10;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTypeImpl <em>Inscription Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getInscriptionType()
	 * @generated
	 */
	int INSCRIPTION_TYPE = 11;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.LabelTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 12;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.LibImportTypeImpl <em>Lib Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.LibImportTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getLibImportType()
	 * @generated
	 */
	int LIB_IMPORT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE__FILENAME = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lib Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lib Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_IMPORT_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 14;

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
	 * The feature id for the '<em><b>Eval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__EVAL = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__EXPRESSION = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__PATH = TEXT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__RESULT = TEXT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__WATCH = TEXT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.NetTypeImpl <em>Net Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.NetTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getNetType()
	 * @generated
	 */
	int NET_TYPE = 19;

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
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleImplementationTypeImpl <em>Module Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleImplementationTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleImplementationType()
	 * @generated
	 */
	int MODULE_IMPLEMENTATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__GRID_ACTIVE = NET_TYPE__GRID_ACTIVE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__ID = NET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__NETCLASS = NET_TYPE__NETCLASS;

	/**
	 * The feature id for the '<em><b>Sharp Edges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__SHARP_EDGES = NET_TYPE__SHARP_EDGES;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__LABEL = NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__PLACE = NET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timed Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION = NET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION = NET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Substitution Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION = NET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE = NET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__MODULE_PIN = NET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__ARC = NET_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__MEASURE = NET_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__DEFINITION = NET_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE__COMMENT = NET_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Module Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE_FEATURE_COUNT = NET_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Module Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_TYPE_OPERATION_COUNT = NET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl <em>Module Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleInstanceType()
	 * @generated
	 */
	int MODULE_INSTANCE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__GRAPHICS = NODE_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__ID = NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__TYPE = NODE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__LABEL = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__PARAMETER_VALUE = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__IMPLEMENTATION = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE__MODULE = NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Module Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModulePinTypeImpl <em>Module Pin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModulePinTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModulePinType()
	 * @generated
	 */
	int MODULE_PIN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE__GRAPHICS = NODE_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE__ID = NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE__TYPE = NODE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE__LABEL = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Pin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Pin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PIN_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleTypeImpl <em>Module Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleType()
	 * @generated
	 */
	int MODULE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__GRAPHICS = NODE_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__ID = NODE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__TYPE = NODE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__LABEL = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__NET = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__PARAMETER = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ParameterTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ParameterValueTypeImpl <em>Parameter Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ParameterValueTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getParameterValueType()
	 * @generated
	 */
	int PARAMETER_VALUE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl <em>Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 23;

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
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__CAPACITY = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__INITIAL_MARKING = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__PATH = NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__QUEUE = NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tokentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TOKENTYPE = NODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__WATCH = NODE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.RecordTokentypeImpl <em>Record Tokentype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.RecordTokentypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getRecordTokentype()
	 * @generated
	 */
	int RECORD_TOKENTYPE = 24;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE__ATTRIBUTE = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Record Tokentype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Record Tokentype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TOKENTYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl <em>Replication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getReplicationType()
	 * @generated
	 */
	int REPLICATION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__GRID_ACTIVE = NET_TYPE__GRID_ACTIVE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__ID = NET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__NETCLASS = NET_TYPE__NETCLASS;

	/**
	 * The feature id for the '<em><b>Sharp Edges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__SHARP_EDGES = NET_TYPE__SHARP_EDGES;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__PLACE = NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timed Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__TIMED_TRANSITION = NET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__IMMEDIATE_TRANSITION = NET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Substitution Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__SUBSTITUTION_TRANSITION = NET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__MODULE_INSTANCE = NET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__MODULE_PIN = NET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__ARC = NET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__MEASURE = NET_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__DEFINITION = NET_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE__COMMENT = NET_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Replication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE_FEATURE_COUNT = NET_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Replication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_TYPE_OPERATION_COUNT = NET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.SCPNNetImpl <em>SCPN Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.SCPNNetImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSCPNNet()
	 * @generated
	 */
	int SCPN_NET = 26;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__GRID_ACTIVE = NET_TYPE__GRID_ACTIVE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__ID = NET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Netclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__NETCLASS = NET_TYPE__NETCLASS;

	/**
	 * The feature id for the '<em><b>Sharp Edges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__SHARP_EDGES = NET_TYPE__SHARP_EDGES;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__PLACE = NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timed Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__TIMED_TRANSITION = NET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immediate Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__IMMEDIATE_TRANSITION = NET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Substitution Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__SUBSTITUTION_TRANSITION = NET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__MODULE = NET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__MODULE_INSTANCE = NET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__MODULE_PIN = NET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__ARC = NET_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__MEASURE = NET_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__DEFINITION = NET_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__COMMENT = NET_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Record Tokentype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__RECORD_TOKENTYPE = NET_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lib Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__LIB_IMPORT = NET_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET__PARAMETER = NET_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>SCPN Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET_FEATURE_COUNT = NET_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>SCPN Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCPN_NET_OPERATION_COUNT = NET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl <em>Substitution Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSubstitutionTransitionType()
	 * @generated
	 */
	int SUBSTITUTION_TRANSITION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__DISPLAY_EXPRESSION = TRANSITION_TYPE__DISPLAY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Global Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__GLOBAL_GUARD = TRANSITION_TYPE__GLOBAL_GUARD;

	/**
	 * The feature id for the '<em><b>Local Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__LOCAL_GUARD = TRANSITION_TYPE__LOCAL_GUARD;

	/**
	 * The feature id for the '<em><b>Logfile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__LOGFILE_DESCRIPTION = TRANSITION_TYPE__LOGFILE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logfile Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__LOGFILE_EXPRESSION = TRANSITION_TYPE__LOGFILE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logfile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__LOGFILE_NAME = TRANSITION_TYPE__LOGFILE_NAME;

	/**
	 * The feature id for the '<em><b>Manual Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__MANUAL_CODE = TRANSITION_TYPE__MANUAL_CODE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__PATH = TRANSITION_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__SERVER_TYPE = TRANSITION_TYPE__SERVER_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__SPEC_TYPE = TRANSITION_TYPE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Take First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__TAKE_FIRST = TRANSITION_TYPE__TAKE_FIRST;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__TIME_GUARD = TRANSITION_TYPE__TIME_GUARD;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__WATCH = TRANSITION_TYPE__WATCH;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__NET = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE__REPLICATION = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substitution Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Substitution Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TimedTransitionTypeImpl <em>Timed Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TimedTransitionTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTimedTransitionType()
	 * @generated
	 */
	int TIMED_TRANSITION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__GRAPHICS = TRANSITION_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__ID = TRANSITION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__TYPE = TRANSITION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__LABEL = TRANSITION_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__DISPLAY_EXPRESSION = TRANSITION_TYPE__DISPLAY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Global Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__GLOBAL_GUARD = TRANSITION_TYPE__GLOBAL_GUARD;

	/**
	 * The feature id for the '<em><b>Local Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__LOCAL_GUARD = TRANSITION_TYPE__LOCAL_GUARD;

	/**
	 * The feature id for the '<em><b>Logfile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__LOGFILE_DESCRIPTION = TRANSITION_TYPE__LOGFILE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logfile Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__LOGFILE_EXPRESSION = TRANSITION_TYPE__LOGFILE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logfile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__LOGFILE_NAME = TRANSITION_TYPE__LOGFILE_NAME;

	/**
	 * The feature id for the '<em><b>Manual Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__MANUAL_CODE = TRANSITION_TYPE__MANUAL_CODE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__PATH = TRANSITION_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__SERVER_TYPE = TRANSITION_TYPE__SERVER_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__SPEC_TYPE = TRANSITION_TYPE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Take First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__TAKE_FIRST = TRANSITION_TYPE__TAKE_FIRST;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__TIME_GUARD = TRANSITION_TYPE__TIME_GUARD;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__WATCH = TRANSITION_TYPE__WATCH;

	/**
	 * The feature id for the '<em><b>Time Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE__TIME_FUNCTION = TRANSITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE_FEATURE_COUNT = TRANSITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_TYPE_OPERATION_COUNT = TRANSITION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TypedefTypeImpl <em>Typedef Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TypedefTypeImpl
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTypedefType()
	 * @generated
	 */
	int TYPEDEF_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE__GRAPHICS = TEXT_TYPE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE__ID = TEXT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE__TYPE = TEXT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE__DEFINITION = TEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE__NAME = TEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typedef Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE_FEATURE_COUNT = TEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Typedef Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_TYPE_OPERATION_COUNT = TEXT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType <em>Measure Eval Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureEvalType()
	 * @generated
	 */
	int MEASURE_EVAL_TYPE = 32;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.QueueType <em>Queue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getQueueType()
	 * @generated
	 */
	int QUEUE_TYPE = 33;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.ServerTypeType <em>Server Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getServerTypeType()
	 * @generated
	 */
	int SERVER_TYPE_TYPE = 34;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.SpecTypeType <em>Spec Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSpecTypeType()
	 * @generated
	 */
	int SPEC_TYPE_TYPE = 35;

	/**
	 * The meta object id for the '{@link de.ilmenau.tu.timenet.schema.scpn.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.Type
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 36;

	/**
	 * The meta object id for the '<em>Measure Eval Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureEvalTypeObject()
	 * @generated
	 */
	int MEASURE_EVAL_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Queue Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getQueueTypeObject()
	 * @generated
	 */
	int QUEUE_TYPE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Server Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getServerTypeTypeObject()
	 * @generated
	 */
	int SERVER_TYPE_TYPE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Spec Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSpecTypeTypeObject()
	 * @generated
	 */
	int SPEC_TYPE_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ilmenau.tu.timenet.schema.scpn.Type
	 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTypeObject()
	 * @generated
	 */
	int TYPE_OBJECT = 41;

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.AddDataType <em>Add Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Data Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AddDataType
	 * @generated
	 */
	EClass getAddDataType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.AddDataType#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AddDataType#getClassname()
	 * @see #getAddDataType()
	 * @generated
	 */
	EAttribute getAddDataType_Classname();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.ArcType#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ArcType#getInscription()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Inscription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ArcType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handle</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ArcType#getHandle()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Handle();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.AttributeType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AttributeType#getDataType()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Name();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.CommentType
	 * @generated
	 */
	EClass getCommentType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.CommentType#getCommentText <em>Comment Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.CommentType#getCommentText()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_CommentText();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Node</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getFromNode()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_FromNode();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Node</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getToNode()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_ToNode();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ConnectorType#getType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType
	 * @generated
	 */
	EClass getDefinitionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Data</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getAdditionalData()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EReference getDefinitionType_AdditionalData();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getExpression()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getName()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DefinitionType#getPath()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EAttribute getDefinitionType_Path();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.DocumentRoot#getNet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Net();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.GraphicsType
	 * @generated
	 */
	EClass getGraphicsType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getOrientation()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getX()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_X();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.GraphicsType#getY()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Y();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.HandleType
	 * @generated
	 */
	EClass getHandleType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.HandleType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.HandleType#getGraphics()
	 * @see #getHandleType()
	 * @generated
	 */
	EReference getHandleType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.HandleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.HandleType#getId()
	 * @see #getHandleType()
	 * @generated
	 */
	EAttribute getHandleType_Id();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType <em>Immediate Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType
	 * @generated
	 */
	EClass getImmediateTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getPriority()
	 * @see #getImmediateTransitionType()
	 * @generated
	 */
	EAttribute getImmediateTransitionType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType#getWeight()
	 * @see #getImmediateTransitionType()
	 * @generated
	 */
	EAttribute getImmediateTransitionType_Weight();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType <em>Inscription Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inscription Text Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType
	 * @generated
	 */
	EClass getInscriptionTextType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getGraphics()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EReference getInscriptionTextType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getId()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EAttribute getInscriptionTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionTextType#getType()
	 * @see #getInscriptionTextType()
	 * @generated
	 */
	EAttribute getInscriptionTextType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType <em>Inscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inscription Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionType
	 * @generated
	 */
	EClass getInscriptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.InscriptionType#getText()
	 * @see #getInscriptionType()
	 * @generated
	 */
	EAttribute getInscriptionType_Text();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.LabelType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LabelType#getText()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Text();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.LibImportType <em>Lib Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lib Import Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LibImportType
	 * @generated
	 */
	EClass getLibImportType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.LibImportType#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.LibImportType#getFilename()
	 * @see #getLibImportType()
	 * @generated
	 */
	EAttribute getLibImportType_Filename();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType
	 * @generated
	 */
	EClass getMeasureType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Data</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getAdditionalData()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_AdditionalData();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eval</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getEval()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Eval();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getExpression()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getName()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getPath()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#getResult()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Result();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watch</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureType#isWatch()
	 * @see #getMeasureType()
	 * @generated
	 */
	EAttribute getMeasureType_Watch();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType <em>Module Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Implementation Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType
	 * @generated
	 */
	EClass getModuleImplementationType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getLabel()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getPlace()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getTimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timed Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getTimedTransition()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_TimedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Immediate Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getImmediateTransition()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_ImmediateTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getSubstitutionTransition <em>Substitution Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitution Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getSubstitutionTransition()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_SubstitutionTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getModuleInstance()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getModulePin <em>Module Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Pin</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getModulePin()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_ModulePin();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getArc()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Arc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getMeasure()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getDefinition()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType#getComment()
	 * @see #getModuleImplementationType()
	 * @generated
	 */
	EReference getModuleImplementationType_Comment();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType <em>Module Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instance Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType
	 * @generated
	 */
	EClass getModuleInstanceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getLabel()
	 * @see #getModuleInstanceType()
	 * @generated
	 */
	EReference getModuleInstanceType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getParameterValue()
	 * @see #getModuleInstanceType()
	 * @generated
	 */
	EReference getModuleInstanceType_ParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getImplementation()
	 * @see #getModuleInstanceType()
	 * @generated
	 */
	EAttribute getModuleInstanceType_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType#getModule()
	 * @see #getModuleInstanceType()
	 * @generated
	 */
	EAttribute getModuleInstanceType_Module();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ModulePinType <em>Module Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Pin Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModulePinType
	 * @generated
	 */
	EClass getModulePinType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.ModulePinType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModulePinType#getLabel()
	 * @see #getModulePinType()
	 * @generated
	 */
	EReference getModulePinType_Label();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleType
	 * @generated
	 */
	EClass getModuleType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleType#getLabel()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleType#getNet()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Net();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ModuleType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ModuleType#getParameter()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Parameter();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.NetType <em>Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType
	 * @generated
	 */
	EClass getNetType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NetType#isGridActive <em>Grid Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Active</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType#isGridActive()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_GridActive();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NetType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType#getId()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NetType#getNetclass <em>Netclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Netclass</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType#getNetclass()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_Netclass();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NetType#isSharpEdges <em>Sharp Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharp Edges</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NetType#isSharpEdges()
	 * @see #getNetType()
	 * @generated
	 */
	EAttribute getNetType_SharpEdges();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.NodeType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NodeType#getGraphics()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NodeType#getId()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.NodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.NodeType#getType()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDataType()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDefaultValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType#getDescription()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterValueType
	 * @generated
	 */
	EClass getParameterValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterValueType#getName()
	 * @see #getParameterValueType()
	 * @generated
	 */
	EAttribute getParameterValueType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.ParameterValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ParameterValueType#getValue()
	 * @see #getParameterValueType()
	 * @generated
	 */
	EAttribute getParameterValueType_Value();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType
	 * @generated
	 */
	EClass getPlaceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getLabel()
	 * @see #getPlaceType()
	 * @generated
	 */
	EReference getPlaceType_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getCapacity()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Marking</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getInitialMarking()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_InitialMarking();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getPath()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getQueue()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Queue();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#getTokentype <em>Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokentype</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#getTokentype()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Tokentype();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watch</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.PlaceType#isWatch()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Watch();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.RecordTokentype <em>Record Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Tokentype</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.RecordTokentype
	 * @generated
	 */
	EClass getRecordTokentype();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.RecordTokentype#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.RecordTokentype#getAttribute()
	 * @see #getRecordTokentype()
	 * @generated
	 */
	EReference getRecordTokentype_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.RecordTokentype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.RecordTokentype#getName()
	 * @see #getRecordTokentype()
	 * @generated
	 */
	EAttribute getRecordTokentype_Name();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType <em>Replication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replication Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType
	 * @generated
	 */
	EClass getReplicationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getPlace()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getTimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timed Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getTimedTransition()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_TimedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Immediate Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getImmediateTransition()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_ImmediateTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getSubstitutionTransition <em>Substitution Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitution Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getSubstitutionTransition()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_SubstitutionTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModuleInstance()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModulePin <em>Module Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Pin</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getModulePin()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_ModulePin();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getArc()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_Arc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getMeasure()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getDefinition()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ReplicationType#getComment()
	 * @see #getReplicationType()
	 * @generated
	 */
	EReference getReplicationType_Comment();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet <em>SCPN Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCPN Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet
	 * @generated
	 */
	EClass getSCPNNet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getPlace()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getTimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timed Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getTimedTransition()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_TimedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Immediate Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getImmediateTransition()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_ImmediateTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getSubstitutionTransition <em>Substitution Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitution Transition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getSubstitutionTransition()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_SubstitutionTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModule()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModuleInstance()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModulePin <em>Module Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Pin</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getModulePin()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_ModulePin();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getArc()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Arc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getMeasure()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getDefinition()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getComment()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getRecordTokentype <em>Record Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Tokentype</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getRecordTokentype()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_RecordTokentype();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getLibImport <em>Lib Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lib Import</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getLibImport()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_LibImport();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SCPNNet#getParameter()
	 * @see #getSCPNNet()
	 * @generated
	 */
	EReference getSCPNNet_Parameter();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType <em>Substitution Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType
	 * @generated
	 */
	EClass getSubstitutionTransitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getNet()
	 * @see #getSubstitutionTransitionType()
	 * @generated
	 */
	EReference getSubstitutionTransitionType_Net();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType#getReplication()
	 * @see #getSubstitutionTransitionType()
	 * @generated
	 */
	EAttribute getSubstitutionTransitionType_Replication();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.TextType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TextType#getGraphics()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TextType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TextType#getId()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TextType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TextType#getType()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Type();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType <em>Timed Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType
	 * @generated
	 */
	EClass getTimedTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction <em>Time Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Function</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType#getTimeFunction()
	 * @see #getTimedTransitionType()
	 * @generated
	 */
	EAttribute getTimedTransitionType_TimeFunction();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLabel()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getDisplayExpression <em>Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getDisplayExpression()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_DisplayExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getGlobalGuard <em>Global Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Guard</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getGlobalGuard()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_GlobalGuard();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLocalGuard <em>Local Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Guard</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLocalGuard()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_LocalGuard();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileDescription <em>Logfile Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logfile Description</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileDescription()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_LogfileDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileExpression <em>Logfile Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logfile Expression</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileExpression()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_LogfileExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileName <em>Logfile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logfile Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getLogfileName()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_LogfileName();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getManualCode <em>Manual Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Code</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getManualCode()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ManualCode();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getPath()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getServerType()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ServerType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getSpecType()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_SpecType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst <em>Take First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take First</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#isTakeFirst()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_TakeFirst();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#getTimeGuard <em>Time Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Guard</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#getTimeGuard()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_TimeGuard();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watch</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TransitionType#isWatch()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Watch();

	/**
	 * Returns the meta object for class '{@link de.ilmenau.tu.timenet.schema.scpn.TypedefType <em>Typedef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TypedefType
	 * @generated
	 */
	EClass getTypedefType();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TypedefType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TypedefType#getDefinition()
	 * @see #getTypedefType()
	 * @generated
	 */
	EAttribute getTypedefType_Definition();

	/**
	 * Returns the meta object for the attribute '{@link de.ilmenau.tu.timenet.schema.scpn.TypedefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.TypedefType#getName()
	 * @see #getTypedefType()
	 * @generated
	 */
	EAttribute getTypedefType_Name();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType <em>Measure Eval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Eval Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @generated
	 */
	EEnum getMeasureEvalType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.scpn.QueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @generated
	 */
	EEnum getQueueType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.scpn.ServerTypeType <em>Server Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Type Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @generated
	 */
	EEnum getServerTypeType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.scpn.SpecTypeType <em>Spec Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spec Type Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @generated
	 */
	EEnum getSpecTypeType();

	/**
	 * Returns the meta object for enum '{@link de.ilmenau.tu.timenet.schema.scpn.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType <em>Measure Eval Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measure Eval Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType"
	 *        extendedMetaData="name='MeasureEvalType:Object' baseType='MeasureEvalType'"
	 * @generated
	 */
	EDataType getMeasureEvalTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.scpn.QueueType <em>Queue Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Queue Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.scpn.QueueType"
	 *        extendedMetaData="name='QueueType:Object' baseType='QueueType'"
	 * @generated
	 */
	EDataType getQueueTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.scpn.ServerTypeType <em>Server Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Server Type Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.scpn.ServerTypeType"
	 *        extendedMetaData="name='ServerTypeType:Object' baseType='ServerTypeType'"
	 * @generated
	 */
	EDataType getServerTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.scpn.SpecTypeType <em>Spec Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Spec Type Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.scpn.SpecTypeType"
	 *        extendedMetaData="name='SpecTypeType:Object' baseType='SpecTypeType'"
	 * @generated
	 */
	EDataType getSpecTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.ilmenau.tu.timenet.schema.scpn.Type <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see de.ilmenau.tu.timenet.schema.scpn.Type
	 * @model instanceClass="de.ilmenau.tu.timenet.schema.scpn.Type"
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
	scpnFactory getscpnFactory();

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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.AddDataTypeImpl <em>Add Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.AddDataTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getAddDataType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ArcTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getArcType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.AttributeTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DATA_TYPE = eINSTANCE.getAttributeType_DataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.CommentTypeImpl <em>Comment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.CommentTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getCommentType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getConnectorType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.DefinitionTypeImpl <em>Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.DefinitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getDefinitionType()
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
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE__PATH = eINSTANCE.getDefinitionType_Path();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.DocumentRootImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.GraphicsTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getGraphicsType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.HandleTypeImpl <em>Handle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.HandleTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getHandleType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ImmediateTransitionTypeImpl <em>Immediate Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ImmediateTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getImmediateTransitionType()
		 * @generated
		 */
		EClass IMMEDIATE_TRANSITION_TYPE = eINSTANCE.getImmediateTransitionType();

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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTextTypeImpl <em>Inscription Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTextTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getInscriptionTextType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTypeImpl <em>Inscription Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.InscriptionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getInscriptionType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.LabelTypeImpl <em>Label Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.LabelTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getLabelType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.LibImportTypeImpl <em>Lib Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.LibImportTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getLibImportType()
		 * @generated
		 */
		EClass LIB_IMPORT_TYPE = eINSTANCE.getLibImportType();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_IMPORT_TYPE__FILENAME = eINSTANCE.getLibImportType_Filename();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureType()
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
		 * The meta object literal for the '<em><b>Eval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__EVAL = eINSTANCE.getMeasureType_Eval();

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
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__PATH = eINSTANCE.getMeasureType_Path();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__RESULT = eINSTANCE.getMeasureType_Result();

		/**
		 * The meta object literal for the '<em><b>Watch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_TYPE__WATCH = eINSTANCE.getMeasureType_Watch();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleImplementationTypeImpl <em>Module Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleImplementationTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleImplementationType()
		 * @generated
		 */
		EClass MODULE_IMPLEMENTATION_TYPE = eINSTANCE.getModuleImplementationType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__LABEL = eINSTANCE.getModuleImplementationType_Label();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__PLACE = eINSTANCE.getModuleImplementationType_Place();

		/**
		 * The meta object literal for the '<em><b>Timed Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION = eINSTANCE
				.getModuleImplementationType_TimedTransition();

		/**
		 * The meta object literal for the '<em><b>Immediate Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION = eINSTANCE
				.getModuleImplementationType_ImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Substitution Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION = eINSTANCE
				.getModuleImplementationType_SubstitutionTransition();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE = eINSTANCE.getModuleImplementationType_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Module Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__MODULE_PIN = eINSTANCE.getModuleImplementationType_ModulePin();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__ARC = eINSTANCE.getModuleImplementationType_Arc();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__MEASURE = eINSTANCE.getModuleImplementationType_Measure();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__DEFINITION = eINSTANCE.getModuleImplementationType_Definition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION_TYPE__COMMENT = eINSTANCE.getModuleImplementationType_Comment();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl <em>Module Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleInstanceType()
		 * @generated
		 */
		EClass MODULE_INSTANCE_TYPE = eINSTANCE.getModuleInstanceType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE_TYPE__LABEL = eINSTANCE.getModuleInstanceType_Label();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE_TYPE__PARAMETER_VALUE = eINSTANCE.getModuleInstanceType_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_INSTANCE_TYPE__IMPLEMENTATION = eINSTANCE.getModuleInstanceType_Implementation();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_INSTANCE_TYPE__MODULE = eINSTANCE.getModuleInstanceType_Module();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModulePinTypeImpl <em>Module Pin Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModulePinTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModulePinType()
		 * @generated
		 */
		EClass MODULE_PIN_TYPE = eINSTANCE.getModulePinType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PIN_TYPE__LABEL = eINSTANCE.getModulePinType_Label();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleTypeImpl <em>Module Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ModuleTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getModuleType()
		 * @generated
		 */
		EClass MODULE_TYPE = eINSTANCE.getModuleType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__LABEL = eINSTANCE.getModuleType_Label();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__NET = eINSTANCE.getModuleType_Net();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__PARAMETER = eINSTANCE.getModuleType_Parameter();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.NetTypeImpl <em>Net Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.NetTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getNetType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.NodeTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getNodeType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ParameterTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__DATA_TYPE = eINSTANCE.getParameterType_DataType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__DEFAULT_VALUE = eINSTANCE.getParameterType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__DESCRIPTION = eINSTANCE.getParameterType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ParameterValueTypeImpl <em>Parameter Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ParameterValueTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getParameterValueType()
		 * @generated
		 */
		EClass PARAMETER_VALUE_TYPE = eINSTANCE.getParameterValueType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_TYPE__NAME = eINSTANCE.getParameterValueType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_TYPE__VALUE = eINSTANCE.getParameterValueType_Value();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl <em>Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getPlaceType()
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
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__CAPACITY = eINSTANCE.getPlaceType_Capacity();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__INITIAL_MARKING = eINSTANCE.getPlaceType_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__PATH = eINSTANCE.getPlaceType_Path();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__QUEUE = eINSTANCE.getPlaceType_Queue();

		/**
		 * The meta object literal for the '<em><b>Tokentype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__TOKENTYPE = eINSTANCE.getPlaceType_Tokentype();

		/**
		 * The meta object literal for the '<em><b>Watch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__WATCH = eINSTANCE.getPlaceType_Watch();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.RecordTokentypeImpl <em>Record Tokentype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.RecordTokentypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getRecordTokentype()
		 * @generated
		 */
		EClass RECORD_TOKENTYPE = eINSTANCE.getRecordTokentype();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TOKENTYPE__ATTRIBUTE = eINSTANCE.getRecordTokentype_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TOKENTYPE__NAME = eINSTANCE.getRecordTokentype_Name();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl <em>Replication Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getReplicationType()
		 * @generated
		 */
		EClass REPLICATION_TYPE = eINSTANCE.getReplicationType();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__PLACE = eINSTANCE.getReplicationType_Place();

		/**
		 * The meta object literal for the '<em><b>Timed Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__TIMED_TRANSITION = eINSTANCE.getReplicationType_TimedTransition();

		/**
		 * The meta object literal for the '<em><b>Immediate Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__IMMEDIATE_TRANSITION = eINSTANCE.getReplicationType_ImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Substitution Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__SUBSTITUTION_TRANSITION = eINSTANCE.getReplicationType_SubstitutionTransition();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__MODULE_INSTANCE = eINSTANCE.getReplicationType_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Module Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__MODULE_PIN = eINSTANCE.getReplicationType_ModulePin();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__ARC = eINSTANCE.getReplicationType_Arc();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__MEASURE = eINSTANCE.getReplicationType_Measure();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__DEFINITION = eINSTANCE.getReplicationType_Definition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_TYPE__COMMENT = eINSTANCE.getReplicationType_Comment();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.SCPNNetImpl <em>SCPN Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.SCPNNetImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSCPNNet()
		 * @generated
		 */
		EClass SCPN_NET = eINSTANCE.getSCPNNet();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__PLACE = eINSTANCE.getSCPNNet_Place();

		/**
		 * The meta object literal for the '<em><b>Timed Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__TIMED_TRANSITION = eINSTANCE.getSCPNNet_TimedTransition();

		/**
		 * The meta object literal for the '<em><b>Immediate Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__IMMEDIATE_TRANSITION = eINSTANCE.getSCPNNet_ImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Substitution Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__SUBSTITUTION_TRANSITION = eINSTANCE.getSCPNNet_SubstitutionTransition();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__MODULE = eINSTANCE.getSCPNNet_Module();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__MODULE_INSTANCE = eINSTANCE.getSCPNNet_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Module Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__MODULE_PIN = eINSTANCE.getSCPNNet_ModulePin();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__ARC = eINSTANCE.getSCPNNet_Arc();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__MEASURE = eINSTANCE.getSCPNNet_Measure();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__DEFINITION = eINSTANCE.getSCPNNet_Definition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__COMMENT = eINSTANCE.getSCPNNet_Comment();

		/**
		 * The meta object literal for the '<em><b>Record Tokentype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__RECORD_TOKENTYPE = eINSTANCE.getSCPNNet_RecordTokentype();

		/**
		 * The meta object literal for the '<em><b>Lib Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__LIB_IMPORT = eINSTANCE.getSCPNNet_LibImport();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCPN_NET__PARAMETER = eINSTANCE.getSCPNNet_Parameter();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl <em>Substitution Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSubstitutionTransitionType()
		 * @generated
		 */
		EClass SUBSTITUTION_TRANSITION_TYPE = eINSTANCE.getSubstitutionTransitionType();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION_TRANSITION_TYPE__NET = eINSTANCE.getSubstitutionTransitionType_Net();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION_TRANSITION_TYPE__REPLICATION = eINSTANCE.getSubstitutionTransitionType_Replication();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TextTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTextType()
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
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TimedTransitionTypeImpl <em>Timed Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TimedTransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTimedTransitionType()
		 * @generated
		 */
		EClass TIMED_TRANSITION_TYPE = eINSTANCE.getTimedTransitionType();

		/**
		 * The meta object literal for the '<em><b>Time Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_TRANSITION_TYPE__TIME_FUNCTION = eINSTANCE.getTimedTransitionType_TimeFunction();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTransitionType()
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
		 * The meta object literal for the '<em><b>Display Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__DISPLAY_EXPRESSION = eINSTANCE.getTransitionType_DisplayExpression();

		/**
		 * The meta object literal for the '<em><b>Global Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__GLOBAL_GUARD = eINSTANCE.getTransitionType_GlobalGuard();

		/**
		 * The meta object literal for the '<em><b>Local Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__LOCAL_GUARD = eINSTANCE.getTransitionType_LocalGuard();

		/**
		 * The meta object literal for the '<em><b>Logfile Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__LOGFILE_DESCRIPTION = eINSTANCE.getTransitionType_LogfileDescription();

		/**
		 * The meta object literal for the '<em><b>Logfile Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__LOGFILE_EXPRESSION = eINSTANCE.getTransitionType_LogfileExpression();

		/**
		 * The meta object literal for the '<em><b>Logfile Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__LOGFILE_NAME = eINSTANCE.getTransitionType_LogfileName();

		/**
		 * The meta object literal for the '<em><b>Manual Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__MANUAL_CODE = eINSTANCE.getTransitionType_ManualCode();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__PATH = eINSTANCE.getTransitionType_Path();

		/**
		 * The meta object literal for the '<em><b>Server Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__SERVER_TYPE = eINSTANCE.getTransitionType_ServerType();

		/**
		 * The meta object literal for the '<em><b>Spec Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__SPEC_TYPE = eINSTANCE.getTransitionType_SpecType();

		/**
		 * The meta object literal for the '<em><b>Take First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TAKE_FIRST = eINSTANCE.getTransitionType_TakeFirst();

		/**
		 * The meta object literal for the '<em><b>Time Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TIME_GUARD = eINSTANCE.getTransitionType_TimeGuard();

		/**
		 * The meta object literal for the '<em><b>Watch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__WATCH = eINSTANCE.getTransitionType_Watch();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.impl.TypedefTypeImpl <em>Typedef Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.TypedefTypeImpl
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTypedefType()
		 * @generated
		 */
		EClass TYPEDEF_TYPE = eINSTANCE.getTypedefType();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPEDEF_TYPE__DEFINITION = eINSTANCE.getTypedefType_Definition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPEDEF_TYPE__NAME = eINSTANCE.getTypedefType_Name();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType <em>Measure Eval Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureEvalType()
		 * @generated
		 */
		EEnum MEASURE_EVAL_TYPE = eINSTANCE.getMeasureEvalType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.QueueType <em>Queue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getQueueType()
		 * @generated
		 */
		EEnum QUEUE_TYPE = eINSTANCE.getQueueType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.ServerTypeType <em>Server Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getServerTypeType()
		 * @generated
		 */
		EEnum SERVER_TYPE_TYPE = eINSTANCE.getServerTypeType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.SpecTypeType <em>Spec Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSpecTypeType()
		 * @generated
		 */
		EEnum SPEC_TYPE_TYPE = eINSTANCE.getSpecTypeType();

		/**
		 * The meta object literal for the '{@link de.ilmenau.tu.timenet.schema.scpn.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.Type
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Measure Eval Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getMeasureEvalTypeObject()
		 * @generated
		 */
		EDataType MEASURE_EVAL_TYPE_OBJECT = eINSTANCE.getMeasureEvalTypeObject();

		/**
		 * The meta object literal for the '<em>Queue Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.QueueType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getQueueTypeObject()
		 * @generated
		 */
		EDataType QUEUE_TYPE_OBJECT = eINSTANCE.getQueueTypeObject();

		/**
		 * The meta object literal for the '<em>Server Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.ServerTypeType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getServerTypeTypeObject()
		 * @generated
		 */
		EDataType SERVER_TYPE_TYPE_OBJECT = eINSTANCE.getServerTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Spec Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.SpecTypeType
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getSpecTypeTypeObject()
		 * @generated
		 */
		EDataType SPEC_TYPE_TYPE_OBJECT = eINSTANCE.getSpecTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ilmenau.tu.timenet.schema.scpn.Type
		 * @see de.ilmenau.tu.timenet.schema.scpn.impl.scpnPackageImpl#getTypeObject()
		 * @generated
		 */
		EDataType TYPE_OBJECT = eINSTANCE.getTypeObject();

	}

} //scpnPackage
