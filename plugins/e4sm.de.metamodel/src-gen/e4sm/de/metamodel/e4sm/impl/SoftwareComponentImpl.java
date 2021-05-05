/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl#getOutputUncertainty <em>Output Uncertainty</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl#isSynchronous <em>Synchronous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareComponentImpl extends ComponentImpl implements SoftwareComponent {
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
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.SOFTWARE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY,
					oldOutputUncertainty, outputUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.SOFTWARE_COMPONENT__SYNCHRONOUS,
					oldSynchronous, synchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY:
			return getOutputUncertainty();
		case e4smPackage.SOFTWARE_COMPONENT__SYNCHRONOUS:
			return isSynchronous();
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY:
			setOutputUncertainty((Double) newValue);
			return;
		case e4smPackage.SOFTWARE_COMPONENT__SYNCHRONOUS:
			setSynchronous((Boolean) newValue);
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY:
			setOutputUncertainty(OUTPUT_UNCERTAINTY_EDEFAULT);
			return;
		case e4smPackage.SOFTWARE_COMPONENT__SYNCHRONOUS:
			setSynchronous(SYNCHRONOUS_EDEFAULT);
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY:
			return outputUncertainty != OUTPUT_UNCERTAINTY_EDEFAULT;
		case e4smPackage.SOFTWARE_COMPONENT__SYNCHRONOUS:
			return synchronous != SYNCHRONOUS_EDEFAULT;
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
		result.append(" (outputUncertainty: ");
		result.append(outputUncertainty);
		result.append(", synchronous: ");
		result.append(synchronous);
		result.append(')');
		return result.toString();
	}

} //SoftwareComponentImpl
