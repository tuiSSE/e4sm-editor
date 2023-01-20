/**
 */
package abcd.xy.metamodel.abcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.UnitPrefix#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getUnitPrefix()
 * @model
 * @generated
 */
public interface UnitPrefix extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getUnitPrefix_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.UnitPrefix#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(int)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getUnitPrefix_ConversionFactor()
	 * @model
	 * @generated
	 */
	int getConversionFactor();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(int value);

} // UnitPrefix
