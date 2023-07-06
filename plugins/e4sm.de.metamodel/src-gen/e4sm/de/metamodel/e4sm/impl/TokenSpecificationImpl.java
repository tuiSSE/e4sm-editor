/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.DataSize;
import e4sm.de.metamodel.e4sm.SizeComputation;
import e4sm.de.metamodel.e4sm.TokenSpecification;

import e4sm.de.metamodel.e4sm.core.TypeSpecification;

import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl#getInputSize <em>Input Size</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl#getCollectSize <em>Collect Size</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.TokenSpecificationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenSpecificationImpl extends MinimalEObjectImpl.Container implements TokenSpecification {
	/**
	 * The cached value of the '{@link #getInputSize() <em>Input Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSize()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSize> inputSize;

	/**
	 * The default value of the '{@link #getCollectSize() <em>Collect Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectSize()
	 * @generated
	 * @ordered
	 */
	protected static final SizeComputation COLLECT_SIZE_EDEFAULT = SizeComputation.SUM;

	/**
	 * The cached value of the '{@link #getCollectSize() <em>Collect Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectSize()
	 * @generated
	 * @ordered
	 */
	protected SizeComputation collectSize = COLLECT_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecification type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.TOKEN_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSize> getInputSize() {
		if (inputSize == null) {
			inputSize = new EObjectContainmentEList<DataSize>(DataSize.class, this,
					e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE);
		}
		return inputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeComputation getCollectSize() {
		return collectSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectSize(SizeComputation newCollectSize) {
		SizeComputation oldCollectSize = collectSize;
		collectSize = newCollectSize == null ? COLLECT_SIZE_EDEFAULT : newCollectSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.TOKEN_SPECIFICATION__COLLECT_SIZE,
					oldCollectSize, collectSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSpecification getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (TypeSpecification) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.TOKEN_SPECIFICATION__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecification basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeSpecification newType) {
		TypeSpecification oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.TOKEN_SPECIFICATION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE:
			return ((InternalEList<?>) getInputSize()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE:
			return getInputSize();
		case e4smPackage.TOKEN_SPECIFICATION__COLLECT_SIZE:
			return getCollectSize();
		case e4smPackage.TOKEN_SPECIFICATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE:
			getInputSize().clear();
			getInputSize().addAll((Collection<? extends DataSize>) newValue);
			return;
		case e4smPackage.TOKEN_SPECIFICATION__COLLECT_SIZE:
			setCollectSize((SizeComputation) newValue);
			return;
		case e4smPackage.TOKEN_SPECIFICATION__TYPE:
			setType((TypeSpecification) newValue);
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
		case e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE:
			getInputSize().clear();
			return;
		case e4smPackage.TOKEN_SPECIFICATION__COLLECT_SIZE:
			setCollectSize(COLLECT_SIZE_EDEFAULT);
			return;
		case e4smPackage.TOKEN_SPECIFICATION__TYPE:
			setType((TypeSpecification) null);
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
		case e4smPackage.TOKEN_SPECIFICATION__INPUT_SIZE:
			return inputSize != null && !inputSize.isEmpty();
		case e4smPackage.TOKEN_SPECIFICATION__COLLECT_SIZE:
			return collectSize != COLLECT_SIZE_EDEFAULT;
		case e4smPackage.TOKEN_SPECIFICATION__TYPE:
			return type != null;
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
		result.append(" (collectSize: ");
		result.append(collectSize);
		result.append(')');
		return result.toString();
	}

} //TokenSpecificationImpl
