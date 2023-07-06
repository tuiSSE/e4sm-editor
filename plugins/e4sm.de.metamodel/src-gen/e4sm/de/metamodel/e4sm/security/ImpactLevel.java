/**
 */
package e4sm.de.metamodel.e4sm.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Impact Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage#getImpactLevel()
 * @model
 * @generated
 */
public enum ImpactLevel implements Enumerator {
	/**
	 * The '<em><b>NO IMPACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_IMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_IMPACT(0, "NO_IMPACT", "NO_IMPACT"),

	/**
	 * The '<em><b>BUSINESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS(1, "BUSINESS", "BUSINESS"),

	/**
	 * The '<em><b>OPERATIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL(2, "OPERATIONAL", "OPERATIONAL"),

	/**
	 * The '<em><b>COMMERCIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	COMMERCIAL(3, "COMMERCIAL", "COMMERCIAL"),

	/**
	 * The '<em><b>SAFETY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(4, "SAFETY", "SAFETY");

	/**
	 * The '<em><b>NO IMPACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_IMPACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_IMPACT_VALUE = 0;

	/**
	 * The '<em><b>BUSINESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_VALUE = 1;

	/**
	 * The '<em><b>OPERATIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_VALUE = 2;

	/**
	 * The '<em><b>COMMERCIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMERCIAL_VALUE = 3;

	/**
	 * The '<em><b>SAFETY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Impact Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpactLevel[] VALUES_ARRAY = new ImpactLevel[] { NO_IMPACT, BUSINESS, OPERATIONAL, COMMERCIAL,
			SAFETY, };

	/**
	 * A public read-only list of all the '<em><b>Impact Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpactLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impact Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactLevel get(int value) {
		switch (value) {
		case NO_IMPACT_VALUE:
			return NO_IMPACT;
		case BUSINESS_VALUE:
			return BUSINESS;
		case OPERATIONAL_VALUE:
			return OPERATIONAL;
		case COMMERCIAL_VALUE:
			return COMMERCIAL;
		case SAFETY_VALUE:
			return SAFETY;
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
	private ImpactLevel(int value, String name, String literal) {
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

} //ImpactLevel
