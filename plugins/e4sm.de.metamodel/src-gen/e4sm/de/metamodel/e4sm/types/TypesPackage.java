/**
 */
package e4sm.de.metamodel.e4sm.types;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see e4sm.de.metamodel.e4sm.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/e4sm/types/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 9;

	/**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 5;

	/**
	 * The meta object id for the '<em>Short</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 6;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 7;

	/**
	 * The meta object id for the '<em>Byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 8;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 1;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 2;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 3;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 4;

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

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
	 * Returns the meta object for data type '{@link java.lang.Object <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
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
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getLong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '<em>Short</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getShort()
		 * @generated
		 */
		EDataType SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getByte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.types.impl.TypesPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

	}

} //TypesPackage
