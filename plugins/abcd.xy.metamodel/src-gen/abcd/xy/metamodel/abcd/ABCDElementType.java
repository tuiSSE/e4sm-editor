/**
 */
package abcd.xy.metamodel.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ABCD Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.abcdPackage#getABCDElementType()
 * @model
 * @generated
 */
public enum ABCDElementType implements Enumerator {
	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(0, "Component", "Component"),

	/**
	 * The '<em><b>Connector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR(1, "Connector", "Connector"),

	/**
	 * The '<em><b>Physical Connector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_CONNECTOR(2, "PhysicalConnector", "PhysicalConnector"),

	/**
	 * The '<em><b>Software Connector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_CONNECTOR(3, "SoftwareConnector", "SoftwareConnector"),

	/**
	 * The '<em><b>Pin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_VALUE
	 * @generated
	 * @ordered
	 */
	PIN(4, "Pin", "Pin"),

	/**
	 * The '<em><b>Input Pin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_PIN_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_PIN(5, "InputPin", "InputPin"),

	/**
	 * The '<em><b>Output Pin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_PIN_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_PIN(6, "OutputPin", "OutputPin");

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>Connector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR
	 * @model name="Connector"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_VALUE = 1;

	/**
	 * The '<em><b>Physical Connector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_CONNECTOR
	 * @model name="PhysicalConnector"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_CONNECTOR_VALUE = 2;

	/**
	 * The '<em><b>Software Connector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_CONNECTOR
	 * @model name="SoftwareConnector"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_CONNECTOR_VALUE = 3;

	/**
	 * The '<em><b>Pin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN
	 * @model name="Pin"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_VALUE = 4;

	/**
	 * The '<em><b>Input Pin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_PIN
	 * @model name="InputPin"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_PIN_VALUE = 5;

	/**
	 * The '<em><b>Output Pin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_PIN
	 * @model name="OutputPin"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_PIN_VALUE = 6;

	/**
	 * An array of all the '<em><b>ABCD Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ABCDElementType[] VALUES_ARRAY = new ABCDElementType[] { COMPONENT, CONNECTOR,
			PHYSICAL_CONNECTOR, SOFTWARE_CONNECTOR, PIN, INPUT_PIN, OUTPUT_PIN, };

	/**
	 * A public read-only list of all the '<em><b>ABCD Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ABCDElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ABCD Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABCDElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABCDElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABCD Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABCDElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABCDElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABCD Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABCDElementType get(int value) {
		switch (value) {
		case COMPONENT_VALUE:
			return COMPONENT;
		case CONNECTOR_VALUE:
			return CONNECTOR;
		case PHYSICAL_CONNECTOR_VALUE:
			return PHYSICAL_CONNECTOR;
		case SOFTWARE_CONNECTOR_VALUE:
			return SOFTWARE_CONNECTOR;
		case PIN_VALUE:
			return PIN;
		case INPUT_PIN_VALUE:
			return INPUT_PIN;
		case OUTPUT_PIN_VALUE:
			return OUTPUT_PIN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ABCDElementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ABCDElementType
