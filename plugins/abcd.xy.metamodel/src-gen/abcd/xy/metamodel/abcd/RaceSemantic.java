/**
 */
package abcd.xy.metamodel.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Race Semantic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * When multiple connectors are connected to a pin, the race semantic specifies how the data gets sent forward.
 * <!-- end-model-doc -->
 * @see abcd.xy.metamodel.abcd.abcdPackage#getRaceSemantic()
 * @model
 * @generated
 */
public enum RaceSemantic implements Enumerator {
	/**
	 * The '<em><b>FCFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FCFS - First come, first served.
	 * In this mode, the output is consumed by one of the following components.
	 * <!-- end-model-doc -->
	 * @see #FCFS_VALUE
	 * @generated
	 * @ordered
	 */
	FCFS(0, "FCFS", "FCFS"),

	/**
	 * The '<em><b>DUPLICATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, the data is duplicated and made available to each and every following components. This value is only valid for pins with multiple outgoing connectors.
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(1, "DUPLICATE", "DUPLICATE"),

	/**
	 * The '<em><b>MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, a value is required from each incoming connector, before the execution can continue with one single token. This value is only valid on pins with multiple incoming connectors.
	 * <!-- end-model-doc -->
	 * @see #MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE(2, "MERGE", "MERGE"),

	/**
	 * The '<em><b>MERGE AND DUPLICATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, a value is required from each incoming connector, before the execution can continue with one single token, which will be duplicated on all outgoing edges. 
	 * This value is only valid on pins with multiple incoming and outgoing connectors.
	 * <!-- end-model-doc -->
	 * @see #MERGE_AND_DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_AND_DUPLICATE(3, "MERGE_AND_DUPLICATE", "MERGE_AND_DUPLICATE");

	/**
	 * The '<em><b>FCFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FCFS - First come, first served.
	 * In this mode, the output is consumed by one of the following components.
	 * <!-- end-model-doc -->
	 * @see #FCFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FCFS_VALUE = 0;

	/**
	 * The '<em><b>DUPLICATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, the data is duplicated and made available to each and every following components. This value is only valid for pins with multiple outgoing connectors.
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 1;

	/**
	 * The '<em><b>MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, a value is required from each incoming connector, before the execution can continue with one single token. This value is only valid on pins with multiple incoming connectors.
	 * <!-- end-model-doc -->
	 * @see #MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_VALUE = 2;

	/**
	 * The '<em><b>MERGE AND DUPLICATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this mode, a value is required from each incoming connector, before the execution can continue with one single token, which will be duplicated on all outgoing edges. 
	 * This value is only valid on pins with multiple incoming and outgoing connectors.
	 * <!-- end-model-doc -->
	 * @see #MERGE_AND_DUPLICATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_AND_DUPLICATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Race Semantic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RaceSemantic[] VALUES_ARRAY = new RaceSemantic[] { FCFS, DUPLICATE, MERGE,
			MERGE_AND_DUPLICATE, };

	/**
	 * A public read-only list of all the '<em><b>Race Semantic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RaceSemantic> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Race Semantic</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RaceSemantic get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RaceSemantic result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Race Semantic</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RaceSemantic getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RaceSemantic result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Race Semantic</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RaceSemantic get(int value) {
		switch (value) {
		case FCFS_VALUE:
			return FCFS;
		case DUPLICATE_VALUE:
			return DUPLICATE;
		case MERGE_VALUE:
			return MERGE;
		case MERGE_AND_DUPLICATE_VALUE:
			return MERGE_AND_DUPLICATE;
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
	private RaceSemantic(int value, String name, String literal) {
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

} //RaceSemantic
