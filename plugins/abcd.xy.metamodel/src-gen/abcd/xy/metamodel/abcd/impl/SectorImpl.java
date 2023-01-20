/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.abcdPackage;
import abcd.xy.metamodel.abcd.core.impl.NamedElementImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.SectorImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.SectorImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.SectorImpl#getSectors <em>Sectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.SectorImpl#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectorImpl extends NamedElementImpl implements Sector {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getSectors() <em>Sectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sector> sectors;

	/**
	 * The cached value of the '{@link #getDatastores() <em>Datastores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastores()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStore> datastores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.SECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.SECTOR__DOCUMENTATION, oldDocumentation,
					documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, abcdPackage.SECTOR__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sector> getSectors() {
		if (sectors == null) {
			sectors = new EObjectContainmentEList<Sector>(Sector.class, this, abcdPackage.SECTOR__SECTORS);
		}
		return sectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataStore> getDatastores() {
		if (datastores == null) {
			datastores = new EObjectContainmentEList<DataStore>(DataStore.class, this, abcdPackage.SECTOR__DATASTORES);
		}
		return datastores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAllComponents() {
		EList<Component> res = ECollections.newBasicEList(this.getComponents());
		this.getSectors().forEach(s -> {
			res.addAll(s.getAllComponents());
		});
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case abcdPackage.SECTOR__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case abcdPackage.SECTOR__SECTORS:
			return ((InternalEList<?>) getSectors()).basicRemove(otherEnd, msgs);
		case abcdPackage.SECTOR__DATASTORES:
			return ((InternalEList<?>) getDatastores()).basicRemove(otherEnd, msgs);
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
		case abcdPackage.SECTOR__DOCUMENTATION:
			return getDocumentation();
		case abcdPackage.SECTOR__COMPONENTS:
			return getComponents();
		case abcdPackage.SECTOR__SECTORS:
			return getSectors();
		case abcdPackage.SECTOR__DATASTORES:
			return getDatastores();
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
		case abcdPackage.SECTOR__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case abcdPackage.SECTOR__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case abcdPackage.SECTOR__SECTORS:
			getSectors().clear();
			getSectors().addAll((Collection<? extends Sector>) newValue);
			return;
		case abcdPackage.SECTOR__DATASTORES:
			getDatastores().clear();
			getDatastores().addAll((Collection<? extends DataStore>) newValue);
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
		case abcdPackage.SECTOR__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case abcdPackage.SECTOR__COMPONENTS:
			getComponents().clear();
			return;
		case abcdPackage.SECTOR__SECTORS:
			getSectors().clear();
			return;
		case abcdPackage.SECTOR__DATASTORES:
			getDatastores().clear();
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
		case abcdPackage.SECTOR__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case abcdPackage.SECTOR__COMPONENTS:
			return components != null && !components.isEmpty();
		case abcdPackage.SECTOR__SECTORS:
			return sectors != null && !sectors.isEmpty();
		case abcdPackage.SECTOR__DATASTORES:
			return datastores != null && !datastores.isEmpty();
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
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.SECTOR__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
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
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return abcdPackage.SECTOR__DOCUMENTATION;
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
		case abcdPackage.SECTOR___GET_ALL_COMPONENTS:
			return getAllComponents();
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //SectorImpl
