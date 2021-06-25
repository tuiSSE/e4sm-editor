/**
 */
package e4sm.de.metamodel.e4sm.types.impl;

import e4sm.de.metamodel.e4sm.types.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory) EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
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
		case TypesPackage.BOOLEAN:
			return createBooleanFromString(eDataType, initialValue);
		case TypesPackage.STRING:
			return createStringFromString(eDataType, initialValue);
		case TypesPackage.INTEGER:
			return createIntegerFromString(eDataType, initialValue);
		case TypesPackage.FLOAT:
			return createFloatFromString(eDataType, initialValue);
		case TypesPackage.DOUBLE:
			return createDoubleFromString(eDataType, initialValue);
		case TypesPackage.LONG:
			return createLongFromString(eDataType, initialValue);
		case TypesPackage.SHORT:
			return createShortFromString(eDataType, initialValue);
		case TypesPackage.CHARACTER:
			return createCharacterFromString(eDataType, initialValue);
		case TypesPackage.BYTE:
			return createByteFromString(eDataType, initialValue);
		case TypesPackage.DATE:
			return createDateFromString(eDataType, initialValue);
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
		case TypesPackage.BOOLEAN:
			return convertBooleanToString(eDataType, instanceValue);
		case TypesPackage.STRING:
			return convertStringToString(eDataType, instanceValue);
		case TypesPackage.INTEGER:
			return convertIntegerToString(eDataType, instanceValue);
		case TypesPackage.FLOAT:
			return convertFloatToString(eDataType, instanceValue);
		case TypesPackage.DOUBLE:
			return convertDoubleToString(eDataType, instanceValue);
		case TypesPackage.LONG:
			return convertLongToString(eDataType, instanceValue);
		case TypesPackage.SHORT:
			return convertShortToString(eDataType, instanceValue);
		case TypesPackage.CHARACTER:
			return convertCharacterToString(eDataType, instanceValue);
		case TypesPackage.BYTE:
			return convertByteToString(eDataType, instanceValue);
		case TypesPackage.DATE:
			return convertDateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		return Integer.parseInt(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		return Integer.toString((int) instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		// return (Date) super.createFromString(eDataType, initialValue);
		if (initialValue == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition position = new ParsePosition(0);
		Date result = format.parse(initialValue, position);
		if (position.getIndex() == 0) {
			throw new IllegalArgumentException("Date must be of format " + format.toPattern());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		// return super.convertToString(eDataType, instanceValue);
		if (instanceValue == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format((Date) instanceValue);

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
	public TypesPackage getTypesPackage() {
		return (TypesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} // TypesFactoryImpl
