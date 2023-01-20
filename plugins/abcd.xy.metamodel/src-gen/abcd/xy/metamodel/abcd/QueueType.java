/**
 */
package abcd.xy.metamodel.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Queue Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.abcdPackage#getQueueType()
 * @model
 * @generated
 */
public enum QueueType implements Enumerator {
	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First in, first out
	 * <!-- end-model-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(0, "FIFO", "FIFO"),

	/**
	 * The '<em><b>LIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last in, Last out (stack)
	 * <!-- end-model-doc -->
	 * @see #LIFO_VALUE
	 * @generated
	 * @ordered
	 */
	LIFO(1, "LIFO", "LIFO"),

	/**
	 * The '<em><b>RANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element of the queue is picked randomly
	 * <!-- end-model-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(2, "RANDOM", "RANDOM"),

	/**
	 * The '<em><b>LATEST ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is no queue, only the latest received element remain stored. Once consumed, the pin does not have any other data available until it receives a new one.
	 * <!-- end-model-doc -->
	 * @see #LATEST_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LATEST_ONLY(3, "LATEST_ONLY", "LATEST_ONLY"),

	/**
	 * The '<em><b>STORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data remain stored in the pin. If new data arrives, it replace the currently stored data.
	 * <!-- end-model-doc -->
	 * @see #STORE_VALUE
	 * @generated
	 * @ordered
	 */
	STORE(4, "STORE", "STORE");

	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First in, first out
	 * <!-- end-model-doc -->
	 * @see #FIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 0;

	/**
	 * The '<em><b>LIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last in, Last out (stack)
	 * <!-- end-model-doc -->
	 * @see #LIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIFO_VALUE = 1;

	/**
	 * The '<em><b>RANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element of the queue is picked randomly
	 * <!-- end-model-doc -->
	 * @see #RANDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 2;

	/**
	 * The '<em><b>LATEST ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is no queue, only the latest received element remain stored. Once consumed, the pin does not have any other data available until it receives a new one.
	 * <!-- end-model-doc -->
	 * @see #LATEST_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATEST_ONLY_VALUE = 3;

	/**
	 * The '<em><b>STORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data remain stored in the pin. If new data arrives, it replace the currently stored data.
	 * <!-- end-model-doc -->
	 * @see #STORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Queue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueueType[] VALUES_ARRAY = new QueueType[] { FIFO, LIFO, RANDOM, LATEST_ONLY, STORE, };

	/**
	 * A public read-only list of all the '<em><b>Queue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Queue Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Queue Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Queue Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueueType get(int value) {
		switch (value) {
		case FIFO_VALUE:
			return FIFO;
		case LIFO_VALUE:
			return LIFO;
		case RANDOM_VALUE:
			return RANDOM;
		case LATEST_ONLY_VALUE:
			return LATEST_ONLY;
		case STORE_VALUE:
			return STORE;
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
	private QueueType(int value, String name, String literal) {
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

} //QueueType
