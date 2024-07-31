/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.e4smPackage;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SensorImpl#getClassificationClasses <em>Classification Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends PhysicalComponentImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getClassificationClasses() <em>Classification Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationClass> classificationClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassificationClass> getClassificationClasses() {
		if (classificationClasses == null) {
			classificationClasses = new EObjectResolvingEList<ClassificationClass>(ClassificationClass.class, this,
					e4smPackage.SENSOR__CLASSIFICATION_CLASSES);
		}
		return classificationClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.SENSOR__CLASSIFICATION_CLASSES:
			return getClassificationClasses();
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
		case e4smPackage.SENSOR__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
			getClassificationClasses().addAll((Collection<? extends ClassificationClass>) newValue);
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
		case e4smPackage.SENSOR__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
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
		case e4smPackage.SENSOR__CLASSIFICATION_CLASSES:
			return classificationClasses != null && !classificationClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
