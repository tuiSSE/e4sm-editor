/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Confusion Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * If positive and negative classes are not provided: true | false is assumed.
 * If only positive is provided, then positive | not positive is assumed.
 * If both are provided, they must not be equal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTp <em>Tp</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTn <em>Tn</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFp <em>Fp</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFn <em>Fn</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getPositiveClass <em>Positive Class</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface BinaryConfusionMatrix extends ConfusionMatrix {
	/**
	 * Returns the value of the '<em><b>Tp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tp</em>' attribute.
	 * @see #setTp(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix_Tp()
	 * @model default="0"
	 * @generated
	 */
	int getTp();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTp <em>Tp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tp</em>' attribute.
	 * @see #getTp()
	 * @generated
	 */
	void setTp(int value);

	/**
	 * Returns the value of the '<em><b>Tn</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tn</em>' attribute.
	 * @see #setTn(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix_Tn()
	 * @model default="0"
	 * @generated
	 */
	int getTn();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getTn <em>Tn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tn</em>' attribute.
	 * @see #getTn()
	 * @generated
	 */
	void setTn(int value);

	/**
	 * Returns the value of the '<em><b>Fp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp</em>' attribute.
	 * @see #setFp(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix_Fp()
	 * @model default="0"
	 * @generated
	 */
	int getFp();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFp <em>Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp</em>' attribute.
	 * @see #getFp()
	 * @generated
	 */
	void setFp(int value);

	/**
	 * Returns the value of the '<em><b>Fn</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fn</em>' attribute.
	 * @see #setFn(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix_Fn()
	 * @model default="0"
	 * @generated
	 */
	int getFn();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getFn <em>Fn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fn</em>' attribute.
	 * @see #getFn()
	 * @generated
	 */
	void setFn(int value);

	/**
	 * Returns the value of the '<em><b>Positive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Class</em>' reference.
	 * @see #setPositiveClass(ClassificationClass)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryConfusionMatrix_PositiveClass()
	 * @model required="true"
	 * @generated
	 */
	ClassificationClass getPositiveClass();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix#getPositiveClass <em>Positive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Class</em>' reference.
	 * @see #getPositiveClass()
	 * @generated
	 */
	void setPositiveClass(ClassificationClass value);

} // BinaryConfusionMatrix
