/**
 */
package e4sm.de.metamodel.e4sm.core.impl;

import e4sm.de.metamodel.e4sm.core.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory) EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CorePackage.LITERAL_NULL:
			return createLiteralNull();
		case CorePackage.LITERAL_STRING:
			return createLiteralString();
		case CorePackage.LITERAL_INTEGER:
			return createLiteralInteger();
		case CorePackage.LITERAL_BOOLEAN:
			return createLiteralBoolean();
		case CorePackage.LITERAL_FLOAT:
			return createLiteralFloat();
		case CorePackage.LITERAL_DOUBLE:
			return createLiteralDouble();
		case CorePackage.LITERAL_LONG:
			return createLiteralLong();
		case CorePackage.LITERAL_SHORT:
			return createLiteralShort();
		case CorePackage.LITERAL_BYTE:
			return createLiteralByte();
		case CorePackage.LITERAL_CHARACTER:
			return createLiteralCharacter();
		case CorePackage.LITERAL_DATE:
			return createLiteralDate();
		case CorePackage.VARIANT:
			return createVariant();
		case CorePackage.TYPE_SPECIFICATION:
			return createTypeSpecification();
		case CorePackage.INTEGER_ATTRIBUTE:
			return createIntegerAttribute();
		case CorePackage.DOUBLE_ATTRIBUTE:
			return createDoubleAttribute();
		case CorePackage.STRING_ATTRIBUTE:
			return createStringAttribute();
		case CorePackage.BOOLEAN_ATTRIBUTE:
			return createBooleanAttribute();
		case CorePackage.CLASS_ATTRIBUTE:
			return createClassAttribute();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CorePackage.UNIT_OF_MEASUREMENT:
			return createUnitOfMeasurementFromString(eDataType, initialValue);
		case CorePackage.BOOLEAN:
			return createBooleanFromString(eDataType, initialValue);
		case CorePackage.STRING:
			return createStringFromString(eDataType, initialValue);
		case CorePackage.INTEGER:
			return createIntegerFromString(eDataType, initialValue);
		case CorePackage.FLOAT:
			return createFloatFromString(eDataType, initialValue);
		case CorePackage.DOUBLE:
			return createDoubleFromString(eDataType, initialValue);
		case CorePackage.LONG:
			return createLongFromString(eDataType, initialValue);
		case CorePackage.SHORT:
			return createShortFromString(eDataType, initialValue);
		case CorePackage.CHARACTER:
			return createCharacterFromString(eDataType, initialValue);
		case CorePackage.BYTE:
			return createByteFromString(eDataType, initialValue);
		case CorePackage.DATE:
			return createDateFromString(eDataType, initialValue);
		case CorePackage.TIMESTAMP:
			return createTimestampFromString(eDataType, initialValue);
		case CorePackage.TIME:
			return createTimeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CorePackage.UNIT_OF_MEASUREMENT:
			return convertUnitOfMeasurementToString(eDataType, instanceValue);
		case CorePackage.BOOLEAN:
			return convertBooleanToString(eDataType, instanceValue);
		case CorePackage.STRING:
			return convertStringToString(eDataType, instanceValue);
		case CorePackage.INTEGER:
			return convertIntegerToString(eDataType, instanceValue);
		case CorePackage.FLOAT:
			return convertFloatToString(eDataType, instanceValue);
		case CorePackage.DOUBLE:
			return convertDoubleToString(eDataType, instanceValue);
		case CorePackage.LONG:
			return convertLongToString(eDataType, instanceValue);
		case CorePackage.SHORT:
			return convertShortToString(eDataType, instanceValue);
		case CorePackage.CHARACTER:
			return convertCharacterToString(eDataType, instanceValue);
		case CorePackage.BYTE:
			return convertByteToString(eDataType, instanceValue);
		case CorePackage.DATE:
			return convertDateToString(eDataType, instanceValue);
		case CorePackage.TIMESTAMP:
			return convertTimestampToString(eDataType, instanceValue);
		case CorePackage.TIME:
			return convertTimeToString(eDataType, instanceValue);
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
	public LiteralNull createLiteralNull() {
		LiteralNullImpl literalNull = new LiteralNullImpl();
		return literalNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralFloat createLiteralFloat() {
		LiteralFloatImpl literalFloat = new LiteralFloatImpl();
		return literalFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralDouble createLiteralDouble() {
		LiteralDoubleImpl literalDouble = new LiteralDoubleImpl();
		return literalDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralLong createLiteralLong() {
		LiteralLongImpl literalLong = new LiteralLongImpl();
		return literalLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralShort createLiteralShort() {
		LiteralShortImpl literalShort = new LiteralShortImpl();
		return literalShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralByte createLiteralByte() {
		LiteralByteImpl literalByte = new LiteralByteImpl();
		return literalByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralCharacter createLiteralCharacter() {
		LiteralCharacterImpl literalCharacter = new LiteralCharacterImpl();
		return literalCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralDate createLiteralDate() {
		LiteralDateImpl literalDate = new LiteralDateImpl();
		return literalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSpecification createTypeSpecification() {
		TypeSpecificationImpl typeSpecification = new TypeSpecificationImpl();
		return typeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerAttribute createIntegerAttribute() {
		IntegerAttributeImpl integerAttribute = new IntegerAttributeImpl();
		return integerAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleAttribute createDoubleAttribute() {
		DoubleAttributeImpl doubleAttribute = new DoubleAttributeImpl();
		return doubleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringAttribute createStringAttribute() {
		StringAttributeImpl stringAttribute = new StringAttributeImpl();
		return stringAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanAttribute createBooleanAttribute() {
		BooleanAttributeImpl booleanAttribute = new BooleanAttributeImpl();
		return booleanAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassAttribute createClassAttribute() {
		ClassAttributeImpl classAttribute = new ClassAttributeImpl();
		return classAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasurement createUnitOfMeasurementFromString(EDataType eDataType, String initialValue) {
		UnitOfMeasurement result = UnitOfMeasurement.get(initialValue);
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
	public String convertUnitOfMeasurementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LocalDateTime createTimestampFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		return LocalDateTime.parse(initialValue, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		return ((LocalDateTime) instanceValue).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTime createTimeFromString(EDataType eDataType, String initialValue) {
		return (LocalTime) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Long createLongFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		return Long.parseLong(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertLongToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		return Long.toString((long) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Short createShortFromString(EDataType eDataType, String initialValue) {
		//return (Short) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		return Short.parseShort(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertShortToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Short.toString((short) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Character createCharacterFromString(EDataType eDataType, String initialValue) {
		//return (Character) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		return initialValue.charAt(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Character.toString((char) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Byte createByteFromString(EDataType eDataType, String initialValue) {
		//return (Byte) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		return Byte.parseByte(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertByteToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Byte.toString((byte) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public LocalDate createDateFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		return LocalDate.parse(initialValue, DateTimeFormatter.ISO_DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		return ((LocalDate) instanceValue).format(DateTimeFormatter.ISO_DATE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		return Boolean.parseBoolean(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Boolean.toString((boolean) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object createStringFromString(EDataType eDataType, String initialValue) {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return (String) instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return Integer.parseInt(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		//return (Float) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		return Float.parseFloat(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Float.toString((float) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		//return (Double) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		return Double.parseDouble(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		//return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		return Double.toString((double) instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorePackage getCorePackage() {
		return (CorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} // CoreFactoryImpl
