/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClassDistribution;
import e4sm.de.metamodel.e4sm.Environment;

import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;

import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.EnvironmentImpl#getOodProbability <em>Ood Probability</em>}</li>
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
	 * The default value of the '{@link #getOodProbability() <em>Ood Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOodProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double OOD_PROBABILITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getOodProbability() <em>Ood Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOodProbability()
	 * @generated
	 * @ordered
	 */
	protected double oodProbability = OOD_PROBABILITY_EDEFAULT;

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
	public double getOodProbability() {
		return oodProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOodProbability(double newOodProbability) {
		double oldOodProbability = oodProbability;
		oodProbability = newOodProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.ENVIRONMENT__OOD_PROBABILITY,
					oldOodProbability, oodProbability));
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
		case e4smPackage.ENVIRONMENT__OOD_PROBABILITY:
			return getOodProbability();
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
		case e4smPackage.ENVIRONMENT__OOD_PROBABILITY:
			setOodProbability((Double) newValue);
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
		case e4smPackage.ENVIRONMENT__OOD_PROBABILITY:
			setOodProbability(OOD_PROBABILITY_EDEFAULT);
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
		case e4smPackage.ENVIRONMENT__OOD_PROBABILITY:
			return oodProbability != OOD_PROBABILITY_EDEFAULT;
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
		result.append(" (oodProbability: ");
		result.append(oodProbability);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
