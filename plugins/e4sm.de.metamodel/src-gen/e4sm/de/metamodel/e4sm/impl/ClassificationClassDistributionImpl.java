/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.ClassificationClassDistribution;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Class Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl#getClassificationClass <em>Classification Class</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ClassificationClassDistributionImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationClassDistributionImpl extends MinimalEObjectImpl.Container
		implements ClassificationClassDistribution {
	/**
	 * The cached value of the '{@link #getClassificationClass() <em>Classification Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationClass()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClass classificationClass;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationClassDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.CLASSIFICATION_CLASS_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass getClassificationClass() {
		if (classificationClass != null && classificationClass.eIsProxy()) {
			InternalEObject oldClassificationClass = (InternalEObject) classificationClass;
			classificationClass = (ClassificationClass) eResolveProxy(oldClassificationClass);
			if (classificationClass != oldClassificationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS, oldClassificationClass,
							classificationClass));
			}
		}
		return classificationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClass basicGetClassificationClass() {
		return classificationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationClass(ClassificationClass newClassificationClass) {
		ClassificationClass oldClassificationClass = classificationClass;
		classificationClass = newClassificationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS, oldClassificationClass,
					classificationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS:
			if (resolve)
				return getClassificationClass();
			return basicGetClassificationClass();
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY:
			return getProbability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS:
			setClassificationClass((ClassificationClass) newValue);
			return;
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY:
			setProbability((Double) newValue);
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
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS:
			setClassificationClass((ClassificationClass) null);
			return;
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY:
			setProbability(PROBABILITY_EDEFAULT);
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
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__CLASSIFICATION_CLASS:
			return classificationClass != null;
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION__PROBABILITY:
			return probability != PROBABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ClassificationClassDistributionImpl
