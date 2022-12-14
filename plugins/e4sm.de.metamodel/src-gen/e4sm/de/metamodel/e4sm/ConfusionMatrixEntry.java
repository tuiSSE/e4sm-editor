/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confusion Matrix Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getPredicted <em>Predicted</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getTruth <em>Truth</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConfusionMatrixEntry()
 * @model
 * @generated
 */
public interface ConfusionMatrixEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConfusionMatrixEntry_Value()
	 * @model default="0" dataType="e4sm.de.metamodel.e4sm.core.Integer"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Predicted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicted</em>' reference.
	 * @see #setPredicted(ClassificationClass)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConfusionMatrixEntry_Predicted()
	 * @model required="true"
	 * @generated
	 */
	ClassificationClass getPredicted();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getPredicted <em>Predicted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicted</em>' reference.
	 * @see #getPredicted()
	 * @generated
	 */
	void setPredicted(ClassificationClass value);

	/**
	 * Returns the value of the '<em><b>Truth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truth</em>' reference.
	 * @see #setTruth(ClassificationClass)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConfusionMatrixEntry_Truth()
	 * @model required="true"
	 * @generated
	 */
	ClassificationClass getTruth();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry#getTruth <em>Truth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truth</em>' reference.
	 * @see #getTruth()
	 * @generated
	 */
	void setTruth(ClassificationClass value);

} // ConfusionMatrixEntry
