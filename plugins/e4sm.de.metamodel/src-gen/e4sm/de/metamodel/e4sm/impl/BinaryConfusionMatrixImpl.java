/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.BinaryConfusionMatrix;
import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Confusion Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getTn <em>Tn</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getFp <em>Fp</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getPositiveClass <em>Positive Class</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.BinaryConfusionMatrixImpl#getNegativeClass <em>Negative Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryConfusionMatrixImpl extends ConfusionMatrixImpl implements BinaryConfusionMatrix {
	/**
	 * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTp()
	 * @generated
	 * @ordered
	 */
	protected static final int TP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTp()
	 * @generated
	 * @ordered
	 */
	protected int tp = TP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTn() <em>Tn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTn()
	 * @generated
	 * @ordered
	 */
	protected static final int TN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTn() <em>Tn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTn()
	 * @generated
	 * @ordered
	 */
	protected int tn = TN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFp() <em>Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFp()
	 * @generated
	 * @ordered
	 */
	protected static final int FP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFp() <em>Fp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFp()
	 * @generated
	 * @ordered
	 */
	protected int fp = FP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFn() <em>Fn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFn()
	 * @generated
	 * @ordered
	 */
	protected static final int FN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFn() <em>Fn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFn()
	 * @generated
	 * @ordered
	 */
	protected int fn = FN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPositiveClass() <em>Positive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveClass()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClass positiveClass;

	/**
	 * The cached value of the '{@link #getNegativeClass() <em>Negative Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeClass()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClass negativeClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryConfusionMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.BINARY_CONFUSION_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTp() {
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTp(int newTp) {
		int oldTp = tp;
		tp = newTp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__TP, oldTp, tp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTn() {
		return tn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTn(int newTn) {
		int oldTn = tn;
		tn = newTn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__TN, oldTn, tn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFp() {
		return fp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFp(int newFp) {
		int oldFp = fp;
		fp = newFp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__FP, oldFp, fp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFn() {
		return fn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFn(int newFn) {
		int oldFn = fn;
		fn = newFn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__FN, oldFn, fn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass getPositiveClass() {
		if (positiveClass != null && positiveClass.eIsProxy()) {
			InternalEObject oldPositiveClass = (InternalEObject) positiveClass;
			positiveClass = (ClassificationClass) eResolveProxy(oldPositiveClass);
			if (positiveClass != oldPositiveClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS, oldPositiveClass, positiveClass));
			}
		}
		return positiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClass basicGetPositiveClass() {
		return positiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositiveClass(ClassificationClass newPositiveClass) {
		ClassificationClass oldPositiveClass = positiveClass;
		positiveClass = newPositiveClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS,
					oldPositiveClass, positiveClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassificationClass getNegativeClass() {
		if (negativeClass != null && negativeClass.eIsProxy()) {
			InternalEObject oldNegativeClass = (InternalEObject) negativeClass;
			negativeClass = (ClassificationClass) eResolveProxy(oldNegativeClass);
			if (negativeClass != oldNegativeClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS, oldNegativeClass, negativeClass));
			}
		}
		return negativeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClass basicGetNegativeClass() {
		return negativeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegativeClass(ClassificationClass newNegativeClass) {
		ClassificationClass oldNegativeClass = negativeClass;
		negativeClass = newNegativeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS,
					oldNegativeClass, negativeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.BINARY_CONFUSION_MATRIX__TP:
			return getTp();
		case e4smPackage.BINARY_CONFUSION_MATRIX__TN:
			return getTn();
		case e4smPackage.BINARY_CONFUSION_MATRIX__FP:
			return getFp();
		case e4smPackage.BINARY_CONFUSION_MATRIX__FN:
			return getFn();
		case e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS:
			if (resolve)
				return getPositiveClass();
			return basicGetPositiveClass();
		case e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS:
			if (resolve)
				return getNegativeClass();
			return basicGetNegativeClass();
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
		case e4smPackage.BINARY_CONFUSION_MATRIX__TP:
			setTp((Integer) newValue);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__TN:
			setTn((Integer) newValue);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FP:
			setFp((Integer) newValue);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FN:
			setFn((Integer) newValue);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS:
			setPositiveClass((ClassificationClass) newValue);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS:
			setNegativeClass((ClassificationClass) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	public double computeAccuracy() throws ArithmeticException {
		double res = -1.0;
		try {
			res = ((double) tp + tn) / (tp + fp + tn + fn);
		} catch (ArithmeticException e) {
			System.out.println("Can not compute accuracy as the matrix is empty");
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the recall
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeRecall() {
		double res = -1.0;
		try {
			res = ((double) tp) / (tp + fn);
		} catch (ArithmeticException e) {
			System.out.println("Can not compute recall as the matrix TP and FN are 0");
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the precision
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computePrecision() {
		double res = -1.0;
		try {
			res = ((double) tp) / (tp + fp);
		} catch (ArithmeticException e) {
			System.out.println("Can not compute precision as the matrix TP and FP are empty");
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeSpecificity() {
		double res = -1.0;
		try {
			res = ((double) tn) / (tn + fp);
		} catch (ArithmeticException e) {
			System.out.println("Can not compute the specificity as the matrix TN and FP are empty");
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the macro F1 score
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeF1Score() {
		double recall = this.computeRecall();
		double precision = this.computePrecision();
		if (recall >= 0 && precision >= 0) {
			return 2 * (recall * precision) / (recall + precision);
		}
		System.out.println("Can not compute the F1 Score");
		return -1.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getHighestValue() {
		var max = tp;
		max = fn > max ? fn : max;
		max = fp > max ? fp : max;
		max = tn > max ? tn : max;
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case e4smPackage.BINARY_CONFUSION_MATRIX__TP:
			setTp(TP_EDEFAULT);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__TN:
			setTn(TN_EDEFAULT);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FP:
			setFp(FP_EDEFAULT);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FN:
			setFn(FN_EDEFAULT);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS:
			setPositiveClass((ClassificationClass) null);
			return;
		case e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS:
			setNegativeClass((ClassificationClass) null);
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
		case e4smPackage.BINARY_CONFUSION_MATRIX__TP:
			return tp != TP_EDEFAULT;
		case e4smPackage.BINARY_CONFUSION_MATRIX__TN:
			return tn != TN_EDEFAULT;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FP:
			return fp != FP_EDEFAULT;
		case e4smPackage.BINARY_CONFUSION_MATRIX__FN:
			return fn != FN_EDEFAULT;
		case e4smPackage.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS:
			return positiveClass != null;
		case e4smPackage.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS:
			return negativeClass != null;
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
		result.append(" (tp: ");
		result.append(tp);
		result.append(", tn: ");
		result.append(tn);
		result.append(", fp: ");
		result.append(fp);
		result.append(", fn: ");
		result.append(fn);
		result.append(')');
		return result.toString();
	}

} //BinaryConfusionMatrixImpl
