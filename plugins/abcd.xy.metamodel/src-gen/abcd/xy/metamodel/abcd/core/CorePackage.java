/**
 */
package abcd.xy.metamodel.abcd.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see abcd.xy.metamodel.abcd.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 *        annotation="http://www.eclipse.org/edapt historyURI='abcd.history'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/abcd/core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = abcd.xy.metamodel.abcd.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.ElementImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.NamedElementImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.TypedElementImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.ValueSpecificationImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___BOOLEAN_VALUE = TYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___INTEGER_VALUE = TYPED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_COMPUTABLE = TYPED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___TO_STRING = TYPED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___GET_TANGIBLE_CHILD = TYPED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___GET_ACTUAL_PARENT = TYPED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralSpecificationImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralSpecification()
	 * @generated
	 */
	int LITERAL_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___TO_STRING = VALUE_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD = VALUE_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___GET_ACTUAL_PARENT = VALUE_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralNullImpl <em>Literal Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralNullImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralNull()
	 * @generated
	 */
	int LITERAL_NULL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralStringImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralIntegerImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralBooleanImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___GET_VALUE = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralFloatImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralFloat()
	 * @generated
	 */
	int LITERAL_FLOAT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FLOAT_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralDoubleImpl <em>Literal Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralDoubleImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralDouble()
	 * @generated
	 */
	int LITERAL_DOUBLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralLongImpl <em>Literal Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralLongImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralLong()
	 * @generated
	 */
	int LITERAL_LONG = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LONG_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralShortImpl <em>Literal Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralShortImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralShort()
	 * @generated
	 */
	int LITERAL_SHORT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SHORT_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralByteImpl <em>Literal Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralByteImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralByte()
	 * @generated
	 */
	int LITERAL_BYTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BYTE_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralCharacterImpl <em>Literal Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralCharacterImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralCharacter()
	 * @generated
	 */
	int LITERAL_CHARACTER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHARACTER_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralDateImpl <em>Literal Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.LiteralDateImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralDate()
	 * @generated
	 */
	int LITERAL_DATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___TO_STRING = LITERAL_SPECIFICATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Tangible Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___GET_TANGIBLE_CHILD = LITERAL_SPECIFICATION___GET_TANGIBLE_CHILD;

	/**
	 * The operation id for the '<em>Get Actual Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE___GET_ACTUAL_PARENT = LITERAL_SPECIFICATION___GET_ACTUAL_PARENT;

	/**
	 * The number of operations of the '<em>Literal Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DATE_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.VariantImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.TypeSpecificationImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTypeSpecification()
	 * @generated
	 */
	int TYPE_SPECIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__SUPER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.AttributeSpecificationImpl <em>Attribute Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.AttributeSpecificationImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getAttributeSpecification()
	 * @generated
	 */
	int ATTRIBUTE_SPECIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__ARRAY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.IntegerAttributeImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getIntegerAttribute()
	 * @generated
	 */
	int INTEGER_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__NAME = ATTRIBUTE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__ARRAY = ATTRIBUTE_SPECIFICATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.DoubleAttributeImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDoubleAttribute()
	 * @generated
	 */
	int DOUBLE_ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__NAME = ATTRIBUTE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__ARRAY = ATTRIBUTE_SPECIFICATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.StringAttributeImpl <em>String Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.StringAttributeImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getStringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__NAME = ATTRIBUTE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__ARRAY = ATTRIBUTE_SPECIFICATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.BooleanAttributeImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getBooleanAttribute()
	 * @generated
	 */
	int BOOLEAN_ATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__NAME = ATTRIBUTE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__ARRAY = ATTRIBUTE_SPECIFICATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.ClassAttributeImpl
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getClassAttribute()
	 * @generated
	 */
	int CLASS_ATTRIBUTE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__NAME = ATTRIBUTE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__ARRAY = ATTRIBUTE_SPECIFICATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__TYPE = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.DocumentableElement <em>Documentable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.DocumentableElement
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDocumentableElement()
	 * @generated
	 */
	int DOCUMENTABLE_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Documentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Documentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link abcd.xy.metamodel.abcd.core.UnitOfMeasurement <em>Unit Of Measurement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.UnitOfMeasurement
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getUnitOfMeasurement()
	 * @generated
	 */
	int UNIT_OF_MEASUREMENT = 25;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDate
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 35;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDateTime
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 36;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalTime
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 37;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 38;

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see abcd.xy.metamodel.abcd.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abcd.xy.metamodel.abcd.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see abcd.xy.metamodel.abcd.core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Specification</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralSpecification
	 * @generated
	 */
	EClass getLiteralSpecification();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Null</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralNull
	 * @generated
	 */
	EClass getLiteralNull();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.LiteralInteger#getTangibleChild() <em>Get Tangible Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tangible Child</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.LiteralInteger#getTangibleChild()
	 * @generated
	 */
	EOperation getLiteralInteger__GetTangibleChild();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.LiteralBoolean#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.LiteralBoolean#getValue()
	 * @generated
	 */
	EOperation getLiteralBoolean__GetValue();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralFloat <em>Literal Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Float</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralFloat
	 * @generated
	 */
	EClass getLiteralFloat();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralFloat#getValue()
	 * @see #getLiteralFloat()
	 * @generated
	 */
	EAttribute getLiteralFloat_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralDouble <em>Literal Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Double</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralDouble
	 * @generated
	 */
	EClass getLiteralDouble();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralDouble#getValue()
	 * @see #getLiteralDouble()
	 * @generated
	 */
	EAttribute getLiteralDouble_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralLong <em>Literal Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Long</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralLong
	 * @generated
	 */
	EClass getLiteralLong();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralLong#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralLong#getValue()
	 * @see #getLiteralLong()
	 * @generated
	 */
	EAttribute getLiteralLong_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralShort <em>Literal Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Short</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralShort
	 * @generated
	 */
	EClass getLiteralShort();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralShort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralShort#getValue()
	 * @see #getLiteralShort()
	 * @generated
	 */
	EAttribute getLiteralShort_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralByte <em>Literal Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Byte</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralByte
	 * @generated
	 */
	EClass getLiteralByte();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralByte#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralByte#getValue()
	 * @see #getLiteralByte()
	 * @generated
	 */
	EAttribute getLiteralByte_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralCharacter <em>Literal Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Character</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralCharacter
	 * @generated
	 */
	EClass getLiteralCharacter();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralCharacter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralCharacter#getValue()
	 * @see #getLiteralCharacter()
	 * @generated
	 */
	EAttribute getLiteralCharacter_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.LiteralDate <em>Literal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Date</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralDate
	 * @generated
	 */
	EClass getLiteralDate();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.LiteralDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.LiteralDate#getValue()
	 * @see #getLiteralDate()
	 * @generated
	 */
	EAttribute getLiteralDate_Value();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boolean Value</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#booleanValue()
	 * @generated
	 */
	EOperation getValueSpecification__BooleanValue();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Integer Value</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#integerValue()
	 * @generated
	 */
	EOperation getValueSpecification__IntegerValue();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Computable</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#isComputable()
	 * @generated
	 */
	EOperation getValueSpecification__IsComputable();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#toString()
	 * @generated
	 */
	EOperation getValueSpecification__ToString();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#getTangibleChild() <em>Get Tangible Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tangible Child</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#getTangibleChild()
	 * @generated
	 */
	EOperation getValueSpecification__GetTangibleChild();

	/**
	 * Returns the meta object for the '{@link abcd.xy.metamodel.abcd.core.ValueSpecification#getActualParent() <em>Get Actual Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actual Parent</em>' operation.
	 * @see abcd.xy.metamodel.abcd.core.ValueSpecification#getActualParent()
	 * @generated
	 */
	EOperation getValueSpecification__GetActualParent();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.core.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see abcd.xy.metamodel.abcd.core.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.TypeSpecification <em>Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specification</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypeSpecification
	 * @generated
	 */
	EClass getTypeSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link abcd.xy.metamodel.abcd.core.TypeSpecification#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypeSpecification#getAttributes()
	 * @see #getTypeSpecification()
	 * @generated
	 */
	EReference getTypeSpecification_Attributes();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.core.TypeSpecification#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypeSpecification#getSuperType()
	 * @see #getTypeSpecification()
	 * @generated
	 */
	EReference getTypeSpecification_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.TypeSpecification#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see abcd.xy.metamodel.abcd.core.TypeSpecification#isAbstract()
	 * @see #getTypeSpecification()
	 * @generated
	 */
	EAttribute getTypeSpecification_Abstract();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.AttributeSpecification <em>Attribute Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Specification</em>'.
	 * @see abcd.xy.metamodel.abcd.core.AttributeSpecification
	 * @generated
	 */
	EClass getAttributeSpecification();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.AttributeSpecification#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see abcd.xy.metamodel.abcd.core.AttributeSpecification#isArray()
	 * @see #getAttributeSpecification()
	 * @generated
	 */
	EAttribute getAttributeSpecification_Array();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.IntegerAttribute <em>Integer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Attribute</em>'.
	 * @see abcd.xy.metamodel.abcd.core.IntegerAttribute
	 * @generated
	 */
	EClass getIntegerAttribute();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.IntegerAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.IntegerAttribute#getDefaultValue()
	 * @see #getIntegerAttribute()
	 * @generated
	 */
	EAttribute getIntegerAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.DoubleAttribute <em>Double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Attribute</em>'.
	 * @see abcd.xy.metamodel.abcd.core.DoubleAttribute
	 * @generated
	 */
	EClass getDoubleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.DoubleAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.DoubleAttribute#getDefaultValue()
	 * @see #getDoubleAttribute()
	 * @generated
	 */
	EAttribute getDoubleAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.StringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute</em>'.
	 * @see abcd.xy.metamodel.abcd.core.StringAttribute
	 * @generated
	 */
	EClass getStringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.StringAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.StringAttribute#getDefaultValue()
	 * @see #getStringAttribute()
	 * @generated
	 */
	EAttribute getStringAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.BooleanAttribute <em>Boolean Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Attribute</em>'.
	 * @see abcd.xy.metamodel.abcd.core.BooleanAttribute
	 * @generated
	 */
	EClass getBooleanAttribute();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.BooleanAttribute#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abcd.xy.metamodel.abcd.core.BooleanAttribute#isDefaultValue()
	 * @see #getBooleanAttribute()
	 * @generated
	 */
	EAttribute getBooleanAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see abcd.xy.metamodel.abcd.core.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute();

	/**
	 * Returns the meta object for the reference '{@link abcd.xy.metamodel.abcd.core.ClassAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see abcd.xy.metamodel.abcd.core.ClassAttribute#getType()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Type();

	/**
	 * Returns the meta object for class '{@link abcd.xy.metamodel.abcd.core.DocumentableElement <em>Documentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable Element</em>'.
	 * @see abcd.xy.metamodel.abcd.core.DocumentableElement
	 * @generated
	 */
	EClass getDocumentableElement();

	/**
	 * Returns the meta object for the attribute '{@link abcd.xy.metamodel.abcd.core.DocumentableElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abcd.xy.metamodel.abcd.core.DocumentableElement#getDocumentation()
	 * @see #getDocumentableElement()
	 * @generated
	 */
	EAttribute getDocumentableElement_Documentation();

	/**
	 * Returns the meta object for enum '{@link abcd.xy.metamodel.abcd.core.UnitOfMeasurement <em>Unit Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Measurement</em>'.
	 * @see abcd.xy.metamodel.abcd.core.UnitOfMeasurement
	 * @generated
	 */
	EEnum getUnitOfMeasurement();

	/**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLong()
	 * @generated
	 */
	int LONG = 31;

	/**
	 * The meta object id for the '<em>Short</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 32;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 33;

	/**
	 * The meta object id for the '<em>Byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 34;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 26;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getString()
	 * @generated
	 */
	int STRING = 27;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 28;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 29;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 30;

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.time.LocalDate
	 * @model instanceClass="java.time.LocalDate"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDateTime <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.time.LocalDateTime
	 * @model instanceClass="java.time.LocalDateTime"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @see java.time.LocalTime
	 * @model instanceClass="java.time.LocalTime"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long</em>'.
	 * @model instanceClass="long"
	 * @generated
	 */
	EDataType getLong();

	/**
	 * Returns the meta object for data type '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Short</em>'.
	 * @model instanceClass="short"
	 * @generated
	 */
	EDataType getShort();

	/**
	 * Returns the meta object for data type '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
	EDataType getCharacter();

	/**
	 * Returns the meta object for data type '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte</em>'.
	 * @model instanceClass="byte"
	 * @generated
	 */
	EDataType getByte();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @model instanceClass="float"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.NamedElementImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.ElementImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralSpecificationImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralSpecification()
		 * @generated
		 */
		EClass LITERAL_SPECIFICATION = eINSTANCE.getLiteralSpecification();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralNullImpl <em>Literal Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralNullImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralNull()
		 * @generated
		 */
		EClass LITERAL_NULL = eINSTANCE.getLiteralNull();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralStringImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralIntegerImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the '<em><b>Get Tangible Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LITERAL_INTEGER___GET_TANGIBLE_CHILD = eINSTANCE.getLiteralInteger__GetTangibleChild();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralBooleanImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LITERAL_BOOLEAN___GET_VALUE = eINSTANCE.getLiteralBoolean__GetValue();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralFloatImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralFloat()
		 * @generated
		 */
		EClass LITERAL_FLOAT = eINSTANCE.getLiteralFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_FLOAT__VALUE = eINSTANCE.getLiteralFloat_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralDoubleImpl <em>Literal Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralDoubleImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralDouble()
		 * @generated
		 */
		EClass LITERAL_DOUBLE = eINSTANCE.getLiteralDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_DOUBLE__VALUE = eINSTANCE.getLiteralDouble_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralLongImpl <em>Literal Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralLongImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralLong()
		 * @generated
		 */
		EClass LITERAL_LONG = eINSTANCE.getLiteralLong();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_LONG__VALUE = eINSTANCE.getLiteralLong_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralShortImpl <em>Literal Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralShortImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralShort()
		 * @generated
		 */
		EClass LITERAL_SHORT = eINSTANCE.getLiteralShort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_SHORT__VALUE = eINSTANCE.getLiteralShort_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralByteImpl <em>Literal Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralByteImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralByte()
		 * @generated
		 */
		EClass LITERAL_BYTE = eINSTANCE.getLiteralByte();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BYTE__VALUE = eINSTANCE.getLiteralByte_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralCharacterImpl <em>Literal Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralCharacterImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralCharacter()
		 * @generated
		 */
		EClass LITERAL_CHARACTER = eINSTANCE.getLiteralCharacter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_CHARACTER__VALUE = eINSTANCE.getLiteralCharacter_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.LiteralDateImpl <em>Literal Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.LiteralDateImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLiteralDate()
		 * @generated
		 */
		EClass LITERAL_DATE = eINSTANCE.getLiteralDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_DATE__VALUE = eINSTANCE.getLiteralDate_Value();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.ValueSpecificationImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___BOOLEAN_VALUE = eINSTANCE.getValueSpecification__BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___INTEGER_VALUE = eINSTANCE.getValueSpecification__IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Is Computable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___IS_COMPUTABLE = eINSTANCE.getValueSpecification__IsComputable();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___TO_STRING = eINSTANCE.getValueSpecification__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Tangible Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___GET_TANGIBLE_CHILD = eINSTANCE.getValueSpecification__GetTangibleChild();

		/**
		 * The meta object literal for the '<em><b>Get Actual Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___GET_ACTUAL_PARENT = eINSTANCE.getValueSpecification__GetActualParent();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.TypedElementImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.VariantImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.TypeSpecificationImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTypeSpecification()
		 * @generated
		 */
		EClass TYPE_SPECIFICATION = eINSTANCE.getTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPECIFICATION__ATTRIBUTES = eINSTANCE.getTypeSpecification_Attributes();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPECIFICATION__SUPER_TYPE = eINSTANCE.getTypeSpecification_SuperType();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPECIFICATION__ABSTRACT = eINSTANCE.getTypeSpecification_Abstract();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.AttributeSpecificationImpl <em>Attribute Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.AttributeSpecificationImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getAttributeSpecification()
		 * @generated
		 */
		EClass ATTRIBUTE_SPECIFICATION = eINSTANCE.getAttributeSpecification();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SPECIFICATION__ARRAY = eINSTANCE.getAttributeSpecification_Array();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.IntegerAttributeImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getIntegerAttribute()
		 * @generated
		 */
		EClass INTEGER_ATTRIBUTE = eINSTANCE.getIntegerAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getIntegerAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.DoubleAttributeImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDoubleAttribute()
		 * @generated
		 */
		EClass DOUBLE_ATTRIBUTE = eINSTANCE.getDoubleAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getDoubleAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.StringAttributeImpl <em>String Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.StringAttributeImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getStringAttribute()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE = eINSTANCE.getStringAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getStringAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.BooleanAttributeImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getBooleanAttribute()
		 * @generated
		 */
		EClass BOOLEAN_ATTRIBUTE = eINSTANCE.getBooleanAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getBooleanAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.ClassAttributeImpl
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass CLASS_ATTRIBUTE = eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATTRIBUTE__TYPE = eINSTANCE.getClassAttribute_Type();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.DocumentableElement <em>Documentable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.DocumentableElement
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDocumentableElement()
		 * @generated
		 */
		EClass DOCUMENTABLE_ELEMENT = eINSTANCE.getDocumentableElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTABLE_ELEMENT__DOCUMENTATION = eINSTANCE.getDocumentableElement_Documentation();

		/**
		 * The meta object literal for the '{@link abcd.xy.metamodel.abcd.core.UnitOfMeasurement <em>Unit Of Measurement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.UnitOfMeasurement
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getUnitOfMeasurement()
		 * @generated
		 */
		EEnum UNIT_OF_MEASUREMENT = eINSTANCE.getUnitOfMeasurement();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDateTime
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalTime
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getLong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '<em>Short</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getShort()
		 * @generated
		 */
		EDataType SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getByte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abcd.xy.metamodel.abcd.core.impl.CorePackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

	}

} //CorePackage
