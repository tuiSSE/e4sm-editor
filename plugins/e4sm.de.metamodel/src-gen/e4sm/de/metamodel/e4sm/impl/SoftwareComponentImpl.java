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
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SoftwareComponentImpl#getOutputUncertanty <em>Output Uncertanty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareComponentImpl extends ComponentImpl implements SoftwareComponent {
	/**
	 * The default value of the '{@link #getOutputUncertanty() <em>Output Uncertanty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputUncertanty()
	 * @generated
	 * @ordered
	 */
	protected static final double OUTPUT_UNCERTANTY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOutputUncertanty() <em>Output Uncertanty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputUncertanty()
	 * @generated
	 * @ordered
	 */
	protected double outputUncertanty = OUTPUT_UNCERTANTY_EDEFAULT;

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
	public double getOutputUncertanty() {
		return outputUncertanty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputUncertanty(double newOutputUncertanty) {
		double oldOutputUncertanty = outputUncertanty;
		outputUncertanty = newOutputUncertanty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTANTY,
					oldOutputUncertanty, outputUncertanty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTANTY:
			return getOutputUncertanty();
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTANTY:
			setOutputUncertanty((Double) newValue);
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTANTY:
			setOutputUncertanty(OUTPUT_UNCERTANTY_EDEFAULT);
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
		case e4smPackage.SOFTWARE_COMPONENT__OUTPUT_UNCERTANTY:
			return outputUncertanty != OUTPUT_UNCERTANTY_EDEFAULT;
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
		result.append(" (OutputUncertanty: ");
		result.append(outputUncertanty);
		result.append(')');
		return result.toString();
	}

} //SoftwareComponentImpl
