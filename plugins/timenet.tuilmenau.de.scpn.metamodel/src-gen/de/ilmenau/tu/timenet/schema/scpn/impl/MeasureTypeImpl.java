/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.AddDataType;
import de.ilmenau.tu.timenet.schema.scpn.MeasureEvalType;
import de.ilmenau.tu.timenet.schema.scpn.MeasureType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getEval <em>Eval</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.MeasureTypeImpl#isWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureTypeImpl extends TextTypeImpl implements MeasureType {
	/**
	 * The cached value of the '{@link #getAdditionalData() <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalData()
	 * @generated
	 * @ordered
	 */
	protected AddDataType additionalData;

	/**
	 * The default value of the '{@link #getEval() <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEval()
	 * @generated
	 * @ordered
	 */
	protected static final MeasureEvalType EVAL_EDEFAULT = MeasureEvalType.TIME_AVERAGE;

	/**
	 * The cached value of the '{@link #getEval() <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEval()
	 * @generated
	 * @ordered
	 */
	protected MeasureEvalType eval = EVAL_EDEFAULT;

	/**
	 * This is true if the Eval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean evalESet;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected boolean watch = WATCH_EDEFAULT;

	/**
	 * This is true if the Watch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean watchESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.MEASURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddDataType getAdditionalData() {
		return additionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalData(AddDataType newAdditionalData, NotificationChain msgs) {
		AddDataType oldAdditionalData = additionalData;
		additionalData = newAdditionalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA, oldAdditionalData, newAdditionalData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalData(AddDataType newAdditionalData) {
		if (newAdditionalData != additionalData) {
			NotificationChain msgs = null;
			if (additionalData != null)
				msgs = ((InternalEObject) additionalData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA, null, msgs);
			if (newAdditionalData != null)
				msgs = ((InternalEObject) newAdditionalData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA, null, msgs);
			msgs = basicSetAdditionalData(newAdditionalData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA,
					newAdditionalData, newAdditionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureEvalType getEval() {
		return eval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEval(MeasureEvalType newEval) {
		MeasureEvalType oldEval = eval;
		eval = newEval == null ? EVAL_EDEFAULT : newEval;
		boolean oldEvalESet = evalESet;
		evalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__EVAL, oldEval, eval,
					!oldEvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEval() {
		MeasureEvalType oldEval = eval;
		boolean oldEvalESet = evalESet;
		eval = EVAL_EDEFAULT;
		evalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.MEASURE_TYPE__EVAL, oldEval,
					EVAL_EDEFAULT, oldEvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEval() {
		return evalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWatch() {
		return watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatch(boolean newWatch) {
		boolean oldWatch = watch;
		watch = newWatch;
		boolean oldWatchESet = watchESet;
		watchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MEASURE_TYPE__WATCH, oldWatch, watch,
					!oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWatch() {
		boolean oldWatch = watch;
		boolean oldWatchESet = watchESet;
		watch = WATCH_EDEFAULT;
		watchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.MEASURE_TYPE__WATCH, oldWatch,
					WATCH_EDEFAULT, oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWatch() {
		return watchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return basicSetAdditionalData(null, msgs);
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
		case scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return getAdditionalData();
		case scpnPackage.MEASURE_TYPE__EVAL:
			return getEval();
		case scpnPackage.MEASURE_TYPE__EXPRESSION:
			return getExpression();
		case scpnPackage.MEASURE_TYPE__NAME:
			return getName();
		case scpnPackage.MEASURE_TYPE__PATH:
			return getPath();
		case scpnPackage.MEASURE_TYPE__RESULT:
			return getResult();
		case scpnPackage.MEASURE_TYPE__WATCH:
			return isWatch();
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
		case scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__EVAL:
			setEval((MeasureEvalType) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__NAME:
			setName((String) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__PATH:
			setPath((String) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__RESULT:
			setResult((String) newValue);
			return;
		case scpnPackage.MEASURE_TYPE__WATCH:
			setWatch((Boolean) newValue);
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
		case scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) null);
			return;
		case scpnPackage.MEASURE_TYPE__EVAL:
			unsetEval();
			return;
		case scpnPackage.MEASURE_TYPE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case scpnPackage.MEASURE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case scpnPackage.MEASURE_TYPE__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case scpnPackage.MEASURE_TYPE__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case scpnPackage.MEASURE_TYPE__WATCH:
			unsetWatch();
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
		case scpnPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return additionalData != null;
		case scpnPackage.MEASURE_TYPE__EVAL:
			return isSetEval();
		case scpnPackage.MEASURE_TYPE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case scpnPackage.MEASURE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case scpnPackage.MEASURE_TYPE__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case scpnPackage.MEASURE_TYPE__RESULT:
			return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
		case scpnPackage.MEASURE_TYPE__WATCH:
			return isSetWatch();
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
		result.append(" (eval: ");
		if (evalESet)
			result.append(eval);
		else
			result.append("<unset>");
		result.append(", expression: ");
		result.append(expression);
		result.append(", name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", result: ");
		result.append(result);
		result.append(", watch: ");
		if (watchESet)
			result.append(watch);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MeasureTypeImpl
