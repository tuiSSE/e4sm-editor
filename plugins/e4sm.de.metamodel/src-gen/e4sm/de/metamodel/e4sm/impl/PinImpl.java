/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.RaceSemantic;
import e4sm.de.metamodel.e4sm.e4smPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pin</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#isGatewayPin <em>Gateway Pin</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#isStream <em>Stream</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getRaceSemantic <em>Race Semantic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinImpl extends DataNodeImpl implements Pin {
	/**
	 * The default value of the '{@link #isGatewayPin() <em>Gateway Pin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isGatewayPin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GATEWAY_PIN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isStream() <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STREAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStream() <em>Stream</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected boolean stream = STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaceSemantic() <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRaceSemantic()
	 * @generated
	 * @ordered
	 */
	protected static final RaceSemantic RACE_SEMANTIC_EDEFAULT = RaceSemantic.MERGE_AND_DUPLICATE;

	/**
	 * The cached value of the '{@link #getRaceSemantic() <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRaceSemantic()
	 * @generated
	 * @ordered
	 */
	protected RaceSemantic raceSemantic = RACE_SEMANTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGatewayPin() {
		return this.getOutgoingConnectors().size() >= 1 && this.getIncomingConnectors().size() >= 1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStream() {
		return stream;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStream(boolean newStream) {
		boolean oldStream = stream;
		stream = newStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PIN__STREAM, oldStream, stream));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaceSemantic getRaceSemantic() {
		return raceSemantic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRaceSemantic(RaceSemantic newRaceSemantic) {
		RaceSemantic oldRaceSemantic = raceSemantic;
		raceSemantic = newRaceSemantic == null ? RACE_SEMANTIC_EDEFAULT : newRaceSemantic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PIN__RACE_SEMANTIC, oldRaceSemantic,
					raceSemantic));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.PIN__GATEWAY_PIN:
			return isGatewayPin();
		case e4smPackage.PIN__STREAM:
			return isStream();
		case e4smPackage.PIN__RACE_SEMANTIC:
			return getRaceSemantic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case e4smPackage.PIN__STREAM:
			setStream((Boolean) newValue);
			return;
		case e4smPackage.PIN__RACE_SEMANTIC:
			setRaceSemantic((RaceSemantic) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case e4smPackage.PIN__STREAM:
			setStream(STREAM_EDEFAULT);
			return;
		case e4smPackage.PIN__RACE_SEMANTIC:
			setRaceSemantic(RACE_SEMANTIC_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case e4smPackage.PIN__GATEWAY_PIN:
			return isGatewayPin() != GATEWAY_PIN_EDEFAULT;
		case e4smPackage.PIN__STREAM:
			return stream != STREAM_EDEFAULT;
		case e4smPackage.PIN__RACE_SEMANTIC:
			return raceSemantic != RACE_SEMANTIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stream: ");
		result.append(stream);
		result.append(", raceSemantic: ");
		result.append(raceSemantic);
		result.append(')');
		return result.toString();
	}

} // PinImpl
