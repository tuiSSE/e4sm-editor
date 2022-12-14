/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.ConfusionMatrixEntry;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confusion Matrix Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl#getPredicted <em>Predicted</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ConfusionMatrixEntryImpl#getTruth <em>Truth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfusionMatrixEntryImpl extends MinimalEObjectImpl.Container implements ConfusionMatrixEntry {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredicted() <em>Predicted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicted()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClass predicted;

	/**
	 * The cached value of the '{@link #getTruth() <em>Truth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruth()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClass truth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfusionMatrixEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.CONFUSION_MATRIX_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.CONFUSION_MATRIX_ENTRY__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass getPredicted() {
		if (predicted != null && predicted.eIsProxy()) {
			InternalEObject oldPredicted = (InternalEObject) predicted;
			predicted = (ClassificationClass) eResolveProxy(oldPredicted);
			if (predicted != oldPredicted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED, oldPredicted, predicted));
			}
		}
		return predicted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClass basicGetPredicted() {
		return predicted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicted(ClassificationClass newPredicted) {
		ClassificationClass oldPredicted = predicted;
		predicted = newPredicted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED,
					oldPredicted, predicted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass getTruth() {
		if (truth != null && truth.eIsProxy()) {
			InternalEObject oldTruth = (InternalEObject) truth;
			truth = (ClassificationClass) eResolveProxy(oldTruth);
			if (truth != oldTruth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH,
							oldTruth, truth));
			}
		}
		return truth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClass basicGetTruth() {
		return truth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruth(ClassificationClass newTruth) {
		ClassificationClass oldTruth = truth;
		truth = newTruth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH, oldTruth,
					truth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.CONFUSION_MATRIX_ENTRY__VALUE:
			return getValue();
		case e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED:
			if (resolve)
				return getPredicted();
			return basicGetPredicted();
		case e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH:
			if (resolve)
				return getTruth();
			return basicGetTruth();
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
		case e4smPackage.CONFUSION_MATRIX_ENTRY__VALUE:
			setValue((Integer) newValue);
			return;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED:
			setPredicted((ClassificationClass) newValue);
			return;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH:
			setTruth((ClassificationClass) newValue);
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
		case e4smPackage.CONFUSION_MATRIX_ENTRY__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED:
			setPredicted((ClassificationClass) null);
			return;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH:
			setTruth((ClassificationClass) null);
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
		case e4smPackage.CONFUSION_MATRIX_ENTRY__VALUE:
			return value != VALUE_EDEFAULT;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__PREDICTED:
			return predicted != null;
		case e4smPackage.CONFUSION_MATRIX_ENTRY__TRUTH:
			return truth != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConfusionMatrixEntryImpl
