/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Import;
import abcd.xy.metamodel.abcd.Model;
import abcd.xy.metamodel.abcd.abcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ImportImpl#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The cached value of the '{@link #getReferencedModel() <em>Referenced Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModel()
	 * @generated
	 * @ordered
	 */
	protected Model referencedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getReferencedModel() {
		if (referencedModel != null && referencedModel.eIsProxy()) {
			InternalEObject oldReferencedModel = (InternalEObject) referencedModel;
			referencedModel = (Model) eResolveProxy(oldReferencedModel);
			if (referencedModel != oldReferencedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, abcdPackage.IMPORT__REFERENCED_MODEL,
							oldReferencedModel, referencedModel));
			}
		}
		return referencedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetReferencedModel() {
		return referencedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedModel(Model newReferencedModel) {
		Model oldReferencedModel = referencedModel;
		referencedModel = newReferencedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.IMPORT__REFERENCED_MODEL,
					oldReferencedModel, referencedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case abcdPackage.IMPORT__REFERENCED_MODEL:
			if (resolve)
				return getReferencedModel();
			return basicGetReferencedModel();
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
		case abcdPackage.IMPORT__REFERENCED_MODEL:
			setReferencedModel((Model) newValue);
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
		case abcdPackage.IMPORT__REFERENCED_MODEL:
			setReferencedModel((Model) null);
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
		case abcdPackage.IMPORT__REFERENCED_MODEL:
			return referencedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportImpl
