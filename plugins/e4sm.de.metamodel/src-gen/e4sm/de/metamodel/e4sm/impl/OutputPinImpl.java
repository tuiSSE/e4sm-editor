/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.OutputPinImpl#getAmplify <em>Amplify</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.OutputPinImpl#getOutputUncertainty <em>Output Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputPinImpl extends PinImpl implements OutputPin {
	/**
	 * The default value of the '{@link #getAmplify() <em>Amplify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplify()
	 * @generated
	 * @ordered
	 */
	protected static final int AMPLIFY_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getAmplify() <em>Amplify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplify()
	 * @generated
	 * @ordered
	 */
	protected int amplify = AMPLIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputUncertainty() <em>Output Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final double OUTPUT_UNCERTAINTY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getOutputUncertainty() <em>Output Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputUncertainty()
	 * @generated
	 * @ordered
	 */
	protected double outputUncertainty = OUTPUT_UNCERTAINTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.OUTPUT_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmplify() {
		return amplify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmplify(int newAmplify) {
		int oldAmplify = amplify;
		amplify = newAmplify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.OUTPUT_PIN__AMPLIFY, oldAmplify,
					amplify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOutputUncertainty() {
		return outputUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputUncertainty(double newOutputUncertainty) {
		double oldOutputUncertainty = outputUncertainty;
		outputUncertainty = newOutputUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY,
					oldOutputUncertainty, outputUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeName() {
		if (this.getName() != null && !this.getName().isBlank()) {
			return this.getName();
		}
		var container = ((Component) this.eContainer());
		return container.getName() + "_out_" + container.getPins().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.OUTPUT_PIN__AMPLIFY:
			return getAmplify();
		case e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY:
			return getOutputUncertainty();
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
		case e4smPackage.OUTPUT_PIN__AMPLIFY:
			setAmplify((Integer) newValue);
			return;
		case e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY:
			setOutputUncertainty((Double) newValue);
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
		case e4smPackage.OUTPUT_PIN__AMPLIFY:
			setAmplify(AMPLIFY_EDEFAULT);
			return;
		case e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY:
			setOutputUncertainty(OUTPUT_UNCERTAINTY_EDEFAULT);
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
		case e4smPackage.OUTPUT_PIN__AMPLIFY:
			return amplify != AMPLIFY_EDEFAULT;
		case e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY:
			return outputUncertainty != OUTPUT_UNCERTAINTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.OUTPUT_PIN___COMPUTE_NAME:
			return computeName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (amplify: ");
		result.append(amplify);
		result.append(", outputUncertainty: ");
		result.append(outputUncertainty);
		result.append(')');
		return result.toString();
	}

} //OutputPinImpl
