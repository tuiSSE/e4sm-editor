/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.Connector;
import abcd.xy.metamodel.abcd.DataNode;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.Pin;
import abcd.xy.metamodel.abcd.analysis.Parameter;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.abcdPackage;

import java.lang.reflect.InvocationTargetException;
import abcd.xy.metamodel.abcd.core.Element;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.execution.TimeFunction;
import abcd.xy.metamodel.abcd.execution.TimeFunctions;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DataNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					abcdPackage.CONNECTOR__PARAMETERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONNECTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONNECTOR__DOCUMENTATION,
					oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataNode getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DataNode newSource) {
		DataNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataNode getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(DataNode newTarget) {
		DataNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeName() {
		if (this.getName() != null && !this.getName().isBlank()) {
			return this.getName();
		}
		if (this.getSource() != null && this.getTarget() != null) {
			return this.getSource().computeName() + "_to_" + this.getTarget().computeName();
		}
		return "Invalid connector"; //Do not change this string, it is used in the QVTo transformation too.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeFlow() {
		DataNode source = this.getSource();
		if (source != null && source instanceof Pin) {
			EObject sourceContainer = source.eContainer();
			if (sourceContainer != null && sourceContainer instanceof Component) {
				Component sourceComponent = (Component) sourceContainer;
				TimeFunction tf = sourceComponent.getTimeFunction();
				if (tf != null) {
					// Return the time function average
					TimeFunctions f = tf.getFunction();
					if (f == TimeFunctions.EXP) {
						return tf.getPar1();
					}
					if (f == TimeFunctions.DET) {
						return tf.getPar1();
					}
					// TODO: implement the average of other functions
					throw new IllegalArgumentException("Unexpected value: " + tf.getFunction());
				}
			}
		}
		if (source instanceof DataStore) {
			// TODO
			System.out.println("ConnectorImpl: ComputeFlow for DataStore nodes has not been implemented yet.");
			return 1.0;
		}
		// Default is EXP(1.0)
		return 1.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case abcdPackage.CONNECTOR__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case abcdPackage.CONNECTOR__PARAMETERS:
			return getParameters();
		case abcdPackage.CONNECTOR__NAME:
			return getName();
		case abcdPackage.CONNECTOR__DOCUMENTATION:
			return getDocumentation();
		case abcdPackage.CONNECTOR__SOURCE:
			return getSource();
		case abcdPackage.CONNECTOR__TARGET:
			return getTarget();
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
		case abcdPackage.CONNECTOR__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case abcdPackage.CONNECTOR__NAME:
			setName((String) newValue);
			return;
		case abcdPackage.CONNECTOR__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case abcdPackage.CONNECTOR__SOURCE:
			setSource((DataNode) newValue);
			return;
		case abcdPackage.CONNECTOR__TARGET:
			setTarget((DataNode) newValue);
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
		case abcdPackage.CONNECTOR__PARAMETERS:
			getParameters().clear();
			return;
		case abcdPackage.CONNECTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case abcdPackage.CONNECTOR__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case abcdPackage.CONNECTOR__SOURCE:
			setSource((DataNode) null);
			return;
		case abcdPackage.CONNECTOR__TARGET:
			setTarget((DataNode) null);
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
		case abcdPackage.CONNECTOR__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case abcdPackage.CONNECTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case abcdPackage.CONNECTOR__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case abcdPackage.CONNECTOR__SOURCE:
			return source != null;
		case abcdPackage.CONNECTOR__TARGET:
			return target != null;
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
			case abcdPackage.CONNECTOR__NAME:
				return CorePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.CONNECTOR__DOCUMENTATION:
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
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case CorePackage.NAMED_ELEMENT__NAME:
				return abcdPackage.CONNECTOR__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return abcdPackage.CONNECTOR__DOCUMENTATION;
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
		case abcdPackage.CONNECTOR___COMPUTE_NAME:
			return computeName();
		case abcdPackage.CONNECTOR___COMPUTE_FLOW:
			return computeFlow();
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
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
