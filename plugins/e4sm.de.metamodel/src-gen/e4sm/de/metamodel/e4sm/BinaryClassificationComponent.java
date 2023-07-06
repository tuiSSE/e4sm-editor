/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Classification Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.BinaryClassificationComponent#getConfusionMatrixes <em>Confusion Matrixes</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryClassificationComponent()
 * @model
 * @generated
 */
public interface BinaryClassificationComponent extends ClassificationComponent {
	/**
	 * Returns the value of the '<em><b>Confusion Matrixes</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confusion Matrixes</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getBinaryClassificationComponent_ConfusionMatrixes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryConfusionMatrix> getConfusionMatrixes();

} // BinaryClassificationComponent
