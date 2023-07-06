/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Class Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getClassificationClass <em>Classification Class</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getClassificationClassDistribution()
 * @model
 * @generated
 */
public interface ClassificationClassDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Class</em>' reference.
	 * @see #setClassificationClass(ClassificationClass)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getClassificationClassDistribution_ClassificationClass()
	 * @model required="true"
	 * @generated
	 */
	ClassificationClass getClassificationClass();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getClassificationClass <em>Classification Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Class</em>' reference.
	 * @see #getClassificationClass()
	 * @generated
	 */
	void setClassificationClass(ClassificationClass value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getClassificationClassDistribution_Probability()
	 * @model required="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // ClassificationClassDistribution
