/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ConfusionMatrix;
import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Confusion Matrix</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConfusionMatrixImpl extends NamedElementImpl implements ConfusionMatrix {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfusionMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.CONFUSION_MATRIX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeAccuracy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeRecall() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computePrecision() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeF1Score() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHighestValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeSpecificity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.CONFUSION_MATRIX___COMPUTE_ACCURACY:
			return computeAccuracy();
		case e4smPackage.CONFUSION_MATRIX___COMPUTE_RECALL:
			return computeRecall();
		case e4smPackage.CONFUSION_MATRIX___COMPUTE_PRECISION:
			return computePrecision();
		case e4smPackage.CONFUSION_MATRIX___COMPUTE_F1_SCORE:
			return computeF1Score();
		case e4smPackage.CONFUSION_MATRIX___GET_HIGHEST_VALUE:
			return getHighestValue();
		case e4smPackage.CONFUSION_MATRIX___COMPUTE_SPECIFICITY:
			return computeSpecificity();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ConfusionMatrixImpl
