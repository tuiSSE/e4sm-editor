/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Preemption Policy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage#getPreemptionPolicyType()
 * @model extendedMetaData="name='PreemptionPolicyType'"
 * @generated
 */
public enum PreemptionPolicyType implements Enumerator {
	/**
	 * The '<em><b>PRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRD_VALUE
	 * @generated
	 * @ordered
	 */
	PRD(0, "PRD", "PRD"),

	/**
	 * The '<em><b>PRS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRS_VALUE
	 * @generated
	 * @ordered
	 */
	PRS(1, "PRS", "PRS");

	/**
	 * The '<em><b>PRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRD_VALUE = 0;

	/**
	 * The '<em><b>PRS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Preemption Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PreemptionPolicyType[] VALUES_ARRAY = new PreemptionPolicyType[] { PRD, PRS, };

	/**
	 * A public read-only list of all the '<em><b>Preemption Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PreemptionPolicyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Preemption Policy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreemptionPolicyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreemptionPolicyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preemption Policy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreemptionPolicyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreemptionPolicyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preemption Policy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreemptionPolicyType get(int value) {
		switch (value) {
		case PRD_VALUE:
			return PRD;
		case PRS_VALUE:
			return PRS;
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
	private PreemptionPolicyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //PreemptionPolicyType
