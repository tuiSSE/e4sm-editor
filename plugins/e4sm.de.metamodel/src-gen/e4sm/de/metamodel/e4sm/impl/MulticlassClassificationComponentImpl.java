/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.MulticlassClassificationComponent;
import e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiclass Classification Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.MulticlassClassificationComponentImpl#getConfusionMatrixes <em>Confusion Matrixes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticlassClassificationComponentImpl extends ClassificationComponentImpl
		implements MulticlassClassificationComponent {
	/**
	 * The cached value of the '{@link #getConfusionMatrixes() <em>Confusion Matrixes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfusionMatrixes()
	 * @generated
	 * @ordered
	 */
	protected EList<MulticlassConfusionMatrix> confusionMatrixes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticlassClassificationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.MULTICLASS_CLASSIFICATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MulticlassConfusionMatrix> getConfusionMatrixes() {
		if (confusionMatrixes == null) {
			confusionMatrixes = new EObjectContainmentEList<MulticlassConfusionMatrix>(MulticlassConfusionMatrix.class,
					this, e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES);
		}
		return confusionMatrixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES:
			return ((InternalEList<?>) getConfusionMatrixes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES:
			return getConfusionMatrixes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES:
			getConfusionMatrixes().clear();
			getConfusionMatrixes().addAll((Collection<? extends MulticlassConfusionMatrix>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES:
			getConfusionMatrixes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT__CONFUSION_MATRIXES:
			return confusionMatrixes != null && !confusionMatrixes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MulticlassClassificationComponentImpl
