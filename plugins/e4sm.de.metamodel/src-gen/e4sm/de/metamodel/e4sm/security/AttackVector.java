/**
 */
package e4sm.de.metamodel.e4sm.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attack Vector</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getAttackVector()
 * @model
 * @generated
 */
public enum AttackVector implements Enumerator {
	/**
	 * The '<em><b>NETWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(0, "NETWORK", "NETWORK"),
	/**
	* The '<em><b>ADJACENT NETWORK</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #ADJACENT_NETWORK_VALUE
	* @generated
	* @ordered
	*/
	ADJACENT_NETWORK(1, "ADJACENT_NETWORK", "ADJACENT_NETWORK"),
	/**
	* The '<em><b>LOCAL</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #LOCAL_VALUE
	* @generated
	* @ordered
	*/
	LOCAL(2, "LOCAL", "LOCAL"),
	/**
	* The '<em><b>PHYSICAL</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #PHYSICAL_VALUE
	* @generated
	* @ordered
	*/
	PHYSICAL(3, "PHYSICAL", "PHYSICAL");

	/**
	 * The '<em><b>NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 0;

	/**
	 * The '<em><b>ADJACENT NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJACENT_NETWORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADJACENT_NETWORK_VALUE = 1;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 2;

	/**
	 * The '<em><b>PHYSICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Attack Vector</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttackVector[] VALUES_ARRAY = new AttackVector[] { NETWORK, ADJACENT_NETWORK, LOCAL,
			PHYSICAL, };

	/**
	 * A public read-only list of all the '<em><b>Attack Vector</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttackVector> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attack Vector</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttackVector get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttackVector result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attack Vector</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttackVector getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttackVector result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attack Vector</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttackVector get(int value) {
		switch (value) {
		case NETWORK_VALUE:
			return NETWORK;
		case ADJACENT_NETWORK_VALUE:
			return ADJACENT_NETWORK;
		case LOCAL_VALUE:
			return LOCAL;
		case PHYSICAL_VALUE:
			return PHYSICAL;
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
	private AttackVector(int value, String name, String literal) {
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

} //AttackVector
