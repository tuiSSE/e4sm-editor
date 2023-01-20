/**
 */
package abcd.xy.metamodel.abcd.analysis.results.impl;

import abcd.xy.metamodel.abcd.analysis.results.ResultsPackage;
import abcd.xy.metamodel.abcd.analysis.results.TwoDimensionalPlot;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Dimensional Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl#getXLabel <em>XLabel</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.impl.TwoDimensionalPlotImpl#getYLabel <em>YLabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoDimensionalPlotImpl extends PlotImpl implements TwoDimensionalPlot {
	/**
	 * The default value of the '{@link #getXLabel() <em>XLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXLabel() <em>XLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLabel()
	 * @generated
	 * @ordered
	 */
	protected String xLabel = XLABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYLabel() <em>YLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYLabel() <em>YLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLabel()
	 * @generated
	 * @ordered
	 */
	protected String yLabel = YLABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoDimensionalPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.TWO_DIMENSIONAL_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXLabel() {
		return xLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXLabel(String newXLabel) {
		String oldXLabel = xLabel;
		xLabel = newXLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TWO_DIMENSIONAL_PLOT__XLABEL,
					oldXLabel, xLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYLabel() {
		return yLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYLabel(String newYLabel) {
		String oldYLabel = yLabel;
		yLabel = newYLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TWO_DIMENSIONAL_PLOT__YLABEL,
					oldYLabel, yLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__XLABEL:
			return getXLabel();
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__YLABEL:
			return getYLabel();
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
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__XLABEL:
			setXLabel((String) newValue);
			return;
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__YLABEL:
			setYLabel((String) newValue);
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
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__XLABEL:
			setXLabel(XLABEL_EDEFAULT);
			return;
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__YLABEL:
			setYLabel(YLABEL_EDEFAULT);
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
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__XLABEL:
			return XLABEL_EDEFAULT == null ? xLabel != null : !XLABEL_EDEFAULT.equals(xLabel);
		case ResultsPackage.TWO_DIMENSIONAL_PLOT__YLABEL:
			return YLABEL_EDEFAULT == null ? yLabel != null : !YLABEL_EDEFAULT.equals(yLabel);
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
		result.append(" (xLabel: ");
		result.append(xLabel);
		result.append(", yLabel: ");
		result.append(yLabel);
		result.append(')');
		return result.toString();
	}

} //TwoDimensionalPlotImpl
