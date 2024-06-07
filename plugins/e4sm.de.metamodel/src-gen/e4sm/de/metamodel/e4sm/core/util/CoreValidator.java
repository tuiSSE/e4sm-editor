/**
 */
package e4sm.de.metamodel.e4sm.core.util;

import e4sm.de.metamodel.e4sm.core.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "e4sm.de.metamodel.e4sm.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CorePackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case CorePackage.ELEMENT:
			return validateElement((Element) value, diagnostics, context);
		case CorePackage.LITERAL_SPECIFICATION:
			return validateLiteralSpecification((LiteralSpecification) value, diagnostics, context);
		case CorePackage.LITERAL_NULL:
			return validateLiteralNull((LiteralNull) value, diagnostics, context);
		case CorePackage.LITERAL_STRING:
			return validateLiteralString((LiteralString) value, diagnostics, context);
		case CorePackage.LITERAL_INTEGER:
			return validateLiteralInteger((LiteralInteger) value, diagnostics, context);
		case CorePackage.LITERAL_BOOLEAN:
			return validateLiteralBoolean((LiteralBoolean) value, diagnostics, context);
		case CorePackage.LITERAL_FLOAT:
			return validateLiteralFloat((LiteralFloat) value, diagnostics, context);
		case CorePackage.LITERAL_DOUBLE:
			return validateLiteralDouble((LiteralDouble) value, diagnostics, context);
		case CorePackage.LITERAL_LONG:
			return validateLiteralLong((LiteralLong) value, diagnostics, context);
		case CorePackage.LITERAL_SHORT:
			return validateLiteralShort((LiteralShort) value, diagnostics, context);
		case CorePackage.LITERAL_BYTE:
			return validateLiteralByte((LiteralByte) value, diagnostics, context);
		case CorePackage.LITERAL_CHARACTER:
			return validateLiteralCharacter((LiteralCharacter) value, diagnostics, context);
		case CorePackage.LITERAL_DATE:
			return validateLiteralDate((LiteralDate) value, diagnostics, context);
		case CorePackage.VALUE_SPECIFICATION:
			return validateValueSpecification((ValueSpecification) value, diagnostics, context);
		case CorePackage.TYPED_ELEMENT:
			return validateTypedElement((TypedElement) value, diagnostics, context);
		case CorePackage.VARIANT:
			return validateVariant((Variant) value, diagnostics, context);
		case CorePackage.TYPE_SPECIFICATION:
			return validateTypeSpecification((TypeSpecification) value, diagnostics, context);
		case CorePackage.ATTRIBUTE_SPECIFICATION:
			return validateAttributeSpecification((AttributeSpecification) value, diagnostics, context);
		case CorePackage.INTEGER_ATTRIBUTE:
			return validateIntegerAttribute((IntegerAttribute) value, diagnostics, context);
		case CorePackage.DOUBLE_ATTRIBUTE:
			return validateDoubleAttribute((DoubleAttribute) value, diagnostics, context);
		case CorePackage.STRING_ATTRIBUTE:
			return validateStringAttribute((StringAttribute) value, diagnostics, context);
		case CorePackage.BOOLEAN_ATTRIBUTE:
			return validateBooleanAttribute((BooleanAttribute) value, diagnostics, context);
		case CorePackage.CLASS_ATTRIBUTE:
			return validateClassAttribute((ClassAttribute) value, diagnostics, context);
		case CorePackage.DOCUMENTABLE_ELEMENT:
			return validateDocumentableElement((DocumentableElement) value, diagnostics, context);
		case CorePackage.UNIT_OF_MEASUREMENT:
			return validateUnitOfMeasurement((UnitOfMeasurement) value, diagnostics, context);
		case CorePackage.BOOLEAN:
			return validateBoolean((Boolean) value, diagnostics, context);
		case CorePackage.STRING:
			return validateString((String) value, diagnostics, context);
		case CorePackage.INTEGER:
			return validateInteger((Integer) value, diagnostics, context);
		case CorePackage.FLOAT:
			return validateFloat((Float) value, diagnostics, context);
		case CorePackage.DOUBLE:
			return validateDouble((Double) value, diagnostics, context);
		case CorePackage.LONG:
			return validateLong((Long) value, diagnostics, context);
		case CorePackage.SHORT:
			return validateShort((Short) value, diagnostics, context);
		case CorePackage.CHARACTER:
			return validateCharacter((Character) value, diagnostics, context);
		case CorePackage.BYTE:
			return validateByte((Byte) value, diagnostics, context);
		case CorePackage.DATE:
			return validateDate((LocalDate) value, diagnostics, context);
		case CorePackage.TIMESTAMP:
			return validateTimestamp((LocalDateTime) value, diagnostics, context);
		case CorePackage.TIME:
			return validateTime((LocalTime) value, diagnostics, context);
		case CorePackage.OBJECT:
			return validateObject(value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the C1 constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNamedElement_C1(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if ("".equals(namedElement.getName())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
								"C1: the name shall not be an empty string", getObjectLabel(namedElement, context) },
						new Object[] { namedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralSpecification(LiteralSpecification literalSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalSpecification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalNull, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalString, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalInteger, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalBoolean, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralFloat(LiteralFloat literalFloat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalFloat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalFloat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalFloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralDouble(LiteralDouble literalDouble, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalDouble, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralLong(LiteralLong literalLong, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalLong, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalLong, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalLong, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralShort(LiteralShort literalShort, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalShort, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalShort, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalShort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralByte(LiteralByte literalByte, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalByte, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalByte, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalByte, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralCharacter(LiteralCharacter literalCharacter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalCharacter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalCharacter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalCharacter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralDate(LiteralDate literalDate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalDate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(literalDate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(literalDate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(valueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariant(Variant variant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(variant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(variant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeSpecification(TypeSpecification typeSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typeSpecification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(typeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(typeSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeSpecification(AttributeSpecification attributeSpecification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeSpecification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(attributeSpecification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(attributeSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerAttribute(IntegerAttribute integerAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integerAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(integerAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleAttribute(DoubleAttribute doubleAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(doubleAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(doubleAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(doubleAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringAttribute(StringAttribute stringAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(stringAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(stringAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanAttribute(BooleanAttribute booleanAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booleanAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(booleanAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute(ClassAttribute classAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(classAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_C1(classAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentableElement(DocumentableElement documentableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(int integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShort(short short_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(char character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByte(byte byte_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(LocalDate date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimestamp(LocalDateTime timestamp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(LocalTime time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoreValidator
