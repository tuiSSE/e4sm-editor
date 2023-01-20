/**
 */
package abcd.xy.metamodel.abcd.execution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Functions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getTimeFunctions()
 * @model
 * @generated
 */
public enum TimeFunctions implements Enumerator {
	/**
	 * The '<em><b>Det</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DET_VALUE
	 * @generated
	 * @ordered
	 */
	DET(0, "Det", "Det"),

	/**
	 * The '<em><b>Exp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP_VALUE
	 * @generated
	 * @ordered
	 */
	EXP(1, "Exp", "Exp"),

	/**
	 * The '<em><b>Uni</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNI_VALUE
	 * @generated
	 * @ordered
	 */
	UNI(2, "Uni", "Uni"),

	/**
	 * The '<em><b>DUni</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUNI_VALUE
	 * @generated
	 * @ordered
	 */
	DUNI(3, "DUni", "DUni"),

	/**
	 * The '<em><b>Norm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORM_VALUE
	 * @generated
	 * @ordered
	 */
	NORM(4, "Norm", "Norm"),

	/**
	 * The '<em><b>Log Norm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_NORM_VALUE
	 * @generated
	 * @ordered
	 */
	LOG_NORM(5, "LogNorm", "LogNorm"),

	/**
	 * The '<em><b>Wei</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEI_VALUE
	 * @generated
	 * @ordered
	 */
	WEI(6, "Wei", "Wei"),

	/**
	 * The '<em><b>Triang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANG_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANG(7, "Triang", "Triang");

	/**
	 * The '<em><b>Det</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DET
	 * @model name="Det"
	 * @generated
	 * @ordered
	 */
	public static final int DET_VALUE = 0;

	/**
	 * The '<em><b>Exp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP
	 * @model name="Exp"
	 * @generated
	 * @ordered
	 */
	public static final int EXP_VALUE = 1;

	/**
	 * The '<em><b>Uni</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNI
	 * @model name="Uni"
	 * @generated
	 * @ordered
	 */
	public static final int UNI_VALUE = 2;

	/**
	 * The '<em><b>DUni</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUNI
	 * @model name="DUni"
	 * @generated
	 * @ordered
	 */
	public static final int DUNI_VALUE = 3;

	/**
	 * The '<em><b>Norm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORM
	 * @model name="Norm"
	 * @generated
	 * @ordered
	 */
	public static final int NORM_VALUE = 4;

	/**
	 * The '<em><b>Log Norm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_NORM
	 * @model name="LogNorm"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_NORM_VALUE = 5;

	/**
	 * The '<em><b>Wei</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEI
	 * @model name="Wei"
	 * @generated
	 * @ordered
	 */
	public static final int WEI_VALUE = 6;

	/**
	 * The '<em><b>Triang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANG
	 * @model name="Triang"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANG_VALUE = 7;

	/**
	 * An array of all the '<em><b>Time Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeFunctions[] VALUES_ARRAY = new TimeFunctions[] { DET, EXP, UNI, DUNI, NORM, LOG_NORM, WEI,
			TRIANG, };

	/**
	 * A public read-only list of all the '<em><b>Time Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeFunctions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Functions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFunctions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFunctions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Functions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFunctions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFunctions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Functions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFunctions get(int value) {
		switch (value) {
		case DET_VALUE:
			return DET;
		case EXP_VALUE:
			return EXP;
		case UNI_VALUE:
			return UNI;
		case DUNI_VALUE:
			return DUNI;
		case NORM_VALUE:
			return NORM;
		case LOG_NORM_VALUE:
			return LOG_NORM;
		case WEI_VALUE:
			return WEI;
		case TRIANG_VALUE:
			return TRIANG;
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
	private TimeFunctions(int value, String name, String literal) {
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

} //TimeFunctions
