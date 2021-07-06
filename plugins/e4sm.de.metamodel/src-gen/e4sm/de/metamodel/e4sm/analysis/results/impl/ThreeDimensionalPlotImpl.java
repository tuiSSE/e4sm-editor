/**
 */
package e4sm.de.metamodel.e4sm.analysis.results.impl;

import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;
import e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Three Dimensional Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.ThreeDimensionalPlotImpl#getZLabel <em>ZLabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreeDimensionalPlotImpl extends TwoDimensionalPlotImpl implements ThreeDimensionalPlot {
	/**
	 * The default value of the '{@link #getZLabel() <em>ZLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ZLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZLabel() <em>ZLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLabel()
	 * @generated
	 * @ordered
	 */
	protected String zLabel = ZLABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreeDimensionalPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.THREE_DIMENSIONAL_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZLabel() {
		return zLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZLabel(String newZLabel) {
		String oldZLabel = zLabel;
		zLabel = newZLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.THREE_DIMENSIONAL_PLOT__ZLABEL,
					oldZLabel, zLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResultsPackage.THREE_DIMENSIONAL_PLOT__ZLABEL:
			return getZLabel();
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
		case ResultsPackage.THREE_DIMENSIONAL_PLOT__ZLABEL:
			setZLabel((String) newValue);
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
		case ResultsPackage.THREE_DIMENSIONAL_PLOT__ZLABEL:
			setZLabel(ZLABEL_EDEFAULT);
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
		case ResultsPackage.THREE_DIMENSIONAL_PLOT__ZLABEL:
			return ZLABEL_EDEFAULT == null ? zLabel != null : !ZLABEL_EDEFAULT.equals(zLabel);
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
		result.append(" (zLabel: ");
		result.append(zLabel);
		result.append(')');
		return result.toString();
	}

} //ThreeDimensionalPlotImpl
