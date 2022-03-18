/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.RaceSemantic;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import e4sm.de.metamodel.e4sm.core.Element;
import e4sm.de.metamodel.e4sm.core.NamedElement;
import e4sm.de.metamodel.e4sm.core.TypedElement;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getName <em>Name</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getType <em>Type</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#isGatewayPin <em>Gateway Pin</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#isStream <em>Stream</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PinImpl#getRaceSemantic <em>Race Semantic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinImpl extends MinimalEObjectImpl.Container implements Pin {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDataType type;

	/**
	 * The cached value of the '{@link #getOutgoingConnectors() <em>Outgoing Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> outgoingConnectors;

	/**
	 * The cached value of the '{@link #getIncomingConnectors() <em>Incoming Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> incomingConnectors;

	/**
	 * The default value of the '{@link #isGatewayPin() <em>Gateway Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGatewayPin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GATEWAY_PIN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isStream() <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STREAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStream() <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected boolean stream = STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaceSemantic() <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaceSemantic()
	 * @generated
	 * @ordered
	 */
	protected static final RaceSemantic RACE_SEMANTIC_EDEFAULT = RaceSemantic.MERGE_AND_DUPLICATE;

	/**
	 * The cached value of the '{@link #getRaceSemantic() <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaceSemantic()
	 * @generated
	 * @ordered
	 */
	protected RaceSemantic raceSemantic = RACE_SEMANTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, e4smPackage.PIN__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EDataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.PIN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EDataType newType) {
		EDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getOutgoingConnectors() {
		if (outgoingConnectors == null) {
			outgoingConnectors = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					e4smPackage.PIN__OUTGOING_CONNECTORS, e4smPackage.CONNECTOR__SOURCE);
		}
		return outgoingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getIncomingConnectors() {
		if (incomingConnectors == null) {
			incomingConnectors = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					e4smPackage.PIN__INCOMING_CONNECTORS, e4smPackage.CONNECTOR__TARGET);
		}
		return incomingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGatewayPin() {
		return this.getOutgoingConnectors().size() >= 1 && this.getIncomingConnectors().size() >= 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStream() {
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaceSemantic getRaceSemantic() {
		return raceSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingConnectors()).basicAdd(otherEnd,
					msgs);
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConnectors()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PIN__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			return ((InternalEList<?>) getOutgoingConnectors()).basicRemove(otherEnd, msgs);
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			return ((InternalEList<?>) getIncomingConnectors()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.PIN__PARAMETERS:
			return getParameters();
		case e4smPackage.PIN__NAME:
			return getName();
		case e4smPackage.PIN__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			return getOutgoingConnectors();
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			return getIncomingConnectors();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case e4smPackage.PIN__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case e4smPackage.PIN__NAME:
			setName((String) newValue);
			return;
		case e4smPackage.PIN__TYPE:
			setType((EDataType) newValue);
			return;
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			getOutgoingConnectors().clear();
			getOutgoingConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			getIncomingConnectors().clear();
			getIncomingConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case e4smPackage.PIN__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.PIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case e4smPackage.PIN__TYPE:
			setType((EDataType) null);
			return;
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			getOutgoingConnectors().clear();
			return;
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			getIncomingConnectors().clear();
			return;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case e4smPackage.PIN__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.PIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case e4smPackage.PIN__TYPE:
			return type != null;
		case e4smPackage.PIN__OUTGOING_CONNECTORS:
			return outgoingConnectors != null && !outgoingConnectors.isEmpty();
		case e4smPackage.PIN__INCOMING_CONNECTORS:
			return incomingConnectors != null && !incomingConnectors.isEmpty();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.PIN__NAME:
				return CorePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.PIN__TYPE:
				return CorePackage.TYPED_ELEMENT__TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case CorePackage.NAMED_ELEMENT__NAME:
				return e4smPackage.PIN__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case CorePackage.TYPED_ELEMENT__TYPE:
				return e4smPackage.PIN__TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.PIN___COMPUTE_NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", stream: ");
		result.append(stream);
		result.append(", raceSemantic: ");
		result.append(raceSemantic);
		result.append(')');
		return result.toString();
	}

} //PinImpl
