/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiclass Confusion Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getMulticlassConfusionMatrix()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MulticlassConfusionMatrixC1'"
 * @generated
 */
public interface MulticlassConfusionMatrix extends ConfusionMatrix {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.ConfusionMatrixEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getMulticlassConfusionMatrix_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfusionMatrixEntry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ClassificationClass> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getTP(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getFP(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getTN(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getFN(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeBalancedAccuracy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeClassAccuracy(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeClassRecall(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeClassPrecision(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeClassF1Score(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeClassSpecificity(ClassificationClass class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeProbabilityOfFirstWhenNotSecond(ClassificationClass first, ClassificationClass second);

} // MulticlassConfusionMatrix
