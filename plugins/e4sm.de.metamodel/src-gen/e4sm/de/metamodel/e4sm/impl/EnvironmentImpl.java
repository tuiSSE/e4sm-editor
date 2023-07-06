/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClassDistribution;
import e4sm.de.metamodel.e4sm.Environment;

import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;

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
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.EnvironmentImpl#getClassificationClasses <em>Classification Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends NamedElementImpl implements Environment {
	/**
	 * The cached value of the '{@link #getClassificationClasses() <em>Classification Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationClassDistribution> classificationClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassificationClassDistribution> getClassificationClasses() {
		if (classificationClasses == null) {
			classificationClasses = new EObjectContainmentEList<ClassificationClassDistribution>(
					ClassificationClassDistribution.class, this, e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES);
		}
		return classificationClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES:
			return ((InternalEList<?>) getClassificationClasses()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES:
			return getClassificationClasses();
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
		case e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
			getClassificationClasses().addAll((Collection<? extends ClassificationClassDistribution>) newValue);
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
		case e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
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
		case e4smPackage.ENVIRONMENT__CLASSIFICATION_CLASSES:
			return classificationClasses != null && !classificationClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
