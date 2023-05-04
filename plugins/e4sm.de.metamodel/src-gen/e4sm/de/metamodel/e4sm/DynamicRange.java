/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The value of the input can change between the given minimum and maximum (or infinity, if empty)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.DynamicRange#getMin <em>Min</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.DynamicRange#getMax <em>Max</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.DynamicRange#getSizeFactor <em>Size Factor</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getDynamicRange()
 * @model
 * @generated
 */
public interface DynamicRange extends DataSize {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getDynamicRange_Min()
	 * @model default="0"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.DynamicRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getDynamicRange_Max()
	 * @model default="0"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.DynamicRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Size Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Factor</em>' attribute.
	 * @see #setSizeFactor(double)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getDynamicRange_SizeFactor()
	 * @model
	 * @generated
	 */
	double getSizeFactor();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.DynamicRange#getSizeFactor <em>Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Factor</em>' attribute.
	 * @see #getSizeFactor()
	 * @generated
	 */
	void setSizeFactor(double value);

} // DynamicRange
