/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.security.CVE;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;

import e4sm.de.metamodel.e4sm.security.State;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getCvss <em>Cvss</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getCveId <em>Cve Id</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getState <em>State</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getVectorString <em>Vector String</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.CVEImpl#getAffectsComponents <em>Affects Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVEImpl extends MinimalEObjectImpl.Container implements CVE {
	/**
	 * The default value of the '{@link #getCvss() <em>Cvss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvss()
	 * @generated
	 * @ordered
	 */
	protected static final double CVSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCvss() <em>Cvss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvss()
	 * @generated
	 * @ordered
	 */
	protected double cvss = CVSS_EDEFAULT;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.PUBLISHED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected CVEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.CVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCvss() {
		return cvss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCvss(double newCvss) {
		double oldCvss = cvss;
		cvss = newCvss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CVE__CVSS, oldCvss, cvss));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CVE__CVE_ID, oldCveId, cveId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CVE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CVE__DESCRIPTION, oldDescription,
					description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CVE__VECTOR_STRING, oldVectorString,
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
					SecurityPackage.CVE__AFFECTS_COMPONENTS);
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
		case SecurityPackage.CVE__CVSS:
			return getCvss();
		case SecurityPackage.CVE__CVE_ID:
			return getCveId();
		case SecurityPackage.CVE__STATE:
			return getState();
		case SecurityPackage.CVE__DESCRIPTION:
			return getDescription();
		case SecurityPackage.CVE__VECTOR_STRING:
			return getVectorString();
		case SecurityPackage.CVE__AFFECTS_COMPONENTS:
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
		case SecurityPackage.CVE__CVSS:
			setCvss((Double) newValue);
			return;
		case SecurityPackage.CVE__CVE_ID:
			setCveId((String) newValue);
			return;
		case SecurityPackage.CVE__STATE:
			setState((State) newValue);
			return;
		case SecurityPackage.CVE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SecurityPackage.CVE__VECTOR_STRING:
			setVectorString((String) newValue);
			return;
		case SecurityPackage.CVE__AFFECTS_COMPONENTS:
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
		case SecurityPackage.CVE__CVSS:
			setCvss(CVSS_EDEFAULT);
			return;
		case SecurityPackage.CVE__CVE_ID:
			setCveId(CVE_ID_EDEFAULT);
			return;
		case SecurityPackage.CVE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case SecurityPackage.CVE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SecurityPackage.CVE__VECTOR_STRING:
			setVectorString(VECTOR_STRING_EDEFAULT);
			return;
		case SecurityPackage.CVE__AFFECTS_COMPONENTS:
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
		case SecurityPackage.CVE__CVSS:
			return cvss != CVSS_EDEFAULT;
		case SecurityPackage.CVE__CVE_ID:
			return CVE_ID_EDEFAULT == null ? cveId != null : !CVE_ID_EDEFAULT.equals(cveId);
		case SecurityPackage.CVE__STATE:
			return state != STATE_EDEFAULT;
		case SecurityPackage.CVE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SecurityPackage.CVE__VECTOR_STRING:
			return VECTOR_STRING_EDEFAULT == null ? vectorString != null : !VECTOR_STRING_EDEFAULT.equals(vectorString);
		case SecurityPackage.CVE__AFFECTS_COMPONENTS:
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
		result.append(" (cvss: ");
		result.append(cvss);
		result.append(", cveId: ");
		result.append(cveId);
		result.append(", state: ");
		result.append(state);
		result.append(", description: ");
		result.append(description);
		result.append(", vectorString: ");
		result.append(vectorString);
		result.append(')');
		return result.toString();
	}

} //CVEImpl
