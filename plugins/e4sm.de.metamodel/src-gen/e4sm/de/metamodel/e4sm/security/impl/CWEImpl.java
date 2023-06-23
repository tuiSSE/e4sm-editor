/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.security.CWE;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl#getCwss <em>Cwss</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl#getCveId <em>Cve Id</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl#getVectorString <em>Vector String</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CWEImpl#getAffectsComponents <em>Affects Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CWEImpl extends MinimalEObjectImpl.Container implements CWE {
	/**
	 * The default value of the '{@link #getCwss() <em>Cwss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCwss()
	 * @generated
	 * @ordered
	 */
	protected static final double CWSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCwss() <em>Cwss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCwss()
	 * @generated
	 * @ordered
	 */
	protected double cwss = CWSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCveId() <em>Cve Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCveId()
	 * @generated
	 * @ordered
	 */
	protected static final String CVE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCveId() <em>Cve Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCveId()
	 * @generated
	 * @ordered
	 */
	protected String cveId = CVE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVectorString() <em>Vector String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorString()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVectorString() <em>Vector String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorString()
	 * @generated
	 * @ordered
	 */
	protected String vectorString = VECTOR_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffectsComponents() <em>Affects Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectsComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> affectsComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.CWE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCwss() {
		return cwss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCwss(double newCwss) {
		double oldCwss = cwss;
		cwss = newCwss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CWE__CWSS, oldCwss, cwss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCveId() {
		return cveId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCveId(String newCveId) {
		String oldCveId = cveId;
		cveId = newCveId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CWE__CVE_ID, oldCveId, cveId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVectorString() {
		return vectorString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVectorString(String newVectorString) {
		String oldVectorString = vectorString;
		vectorString = newVectorString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CWE__VECTOR_STRING, oldVectorString,
					vectorString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAffectsComponents() {
		if (affectsComponents == null) {
			affectsComponents = new EObjectResolvingEList<Component>(Component.class, this,
					SecurityPackage.CWE__AFFECTS_COMPONENTS);
		}
		return affectsComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecurityPackage.CWE__CWSS:
			return getCwss();
		case SecurityPackage.CWE__CVE_ID:
			return getCveId();
		case SecurityPackage.CWE__VECTOR_STRING:
			return getVectorString();
		case SecurityPackage.CWE__AFFECTS_COMPONENTS:
			return getAffectsComponents();
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
		case SecurityPackage.CWE__CWSS:
			setCwss((Double) newValue);
			return;
		case SecurityPackage.CWE__CVE_ID:
			setCveId((String) newValue);
			return;
		case SecurityPackage.CWE__VECTOR_STRING:
			setVectorString((String) newValue);
			return;
		case SecurityPackage.CWE__AFFECTS_COMPONENTS:
			getAffectsComponents().clear();
			getAffectsComponents().addAll((Collection<? extends Component>) newValue);
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
		case SecurityPackage.CWE__CWSS:
			setCwss(CWSS_EDEFAULT);
			return;
		case SecurityPackage.CWE__CVE_ID:
			setCveId(CVE_ID_EDEFAULT);
			return;
		case SecurityPackage.CWE__VECTOR_STRING:
			setVectorString(VECTOR_STRING_EDEFAULT);
			return;
		case SecurityPackage.CWE__AFFECTS_COMPONENTS:
			getAffectsComponents().clear();
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
		case SecurityPackage.CWE__CWSS:
			return cwss != CWSS_EDEFAULT;
		case SecurityPackage.CWE__CVE_ID:
			return CVE_ID_EDEFAULT == null ? cveId != null : !CVE_ID_EDEFAULT.equals(cveId);
		case SecurityPackage.CWE__VECTOR_STRING:
			return VECTOR_STRING_EDEFAULT == null ? vectorString != null : !VECTOR_STRING_EDEFAULT.equals(vectorString);
		case SecurityPackage.CWE__AFFECTS_COMPONENTS:
			return affectsComponents != null && !affectsComponents.isEmpty();
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
		result.append(" (cwss: ");
		result.append(cwss);
		result.append(", cveId: ");
		result.append(cveId);
		result.append(", vectorString: ");
		result.append(vectorString);
		result.append(')');
		return result.toString();
	}

} //CWEImpl
