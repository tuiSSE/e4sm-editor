/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.DataNode;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.analysis.Parameter;

import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.impl.TypedElementImpl;

import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
import e4sm.de.metamodel.e4sm.execution.ExecutionElement;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.DataNodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.DataNodeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataNodeImpl extends TypedElementImpl implements DataNode {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.DATA_NODE;
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
					e4smPackage.DATA_NODE__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.DATA_NODE__DOCUMENTATION,
					oldDocumentation, documentation));
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Connector> getOutgoingConnectors() {
		// get the containing package
		EList<Connector> resultList = new BasicEList<Connector>();
		EObject currentElement = this.eContainer();
		Package container = null;
		while (currentElement != null && container == null) {
			if (currentElement instanceof Package) {
				container = (Package) currentElement;
			}
			currentElement = currentElement.eContainer();
		}

		if (container == null) {
			// No containing package found
			System.err.println("Warning: no containing package found for this pin");
			return null;
		}

		container.getConnectors().stream().forEach(c -> {
			if (c.getSource().equals(this))
				resultList.add(c);
		});

		// also check in the container of the package (for connectors between component specifications)
		var superPackage = container.eContainer();
		if (superPackage instanceof Package) {
			((Package) superPackage).getConnectors().stream().forEach(c -> {
				if (c.getSource().equals(this))
					resultList.add(c);
			});
		}
		return resultList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Connector> getIncomingConnectors() {
		// get the containing package
		EList<Connector> resultList = new BasicEList<Connector>();
		EObject currentElement = this.eContainer();
		Package container = null;
		while (currentElement != null && container == null) {
			if (currentElement instanceof Package) {
				container = (Package) currentElement;
			}
			currentElement = currentElement.eContainer();
		}

		if (container == null) {
			// No containing package found
			System.err.println("Warning: no containing package found for this pin");
			return null;
		}

		container.getConnectors().stream().forEach(c -> {
			if (c.getTarget().equals(this))
				resultList.add(c);
		});

		// also check in the container of the package (for connectors between component specifications)
		var superPackage = container.eContainer();
		if (superPackage instanceof Package) {
			((Package) superPackage).getConnectors().stream().forEach(c -> {
				if (c.getTarget().equals(this))
					resultList.add(c);
			});
		}

		return resultList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.DATA_NODE__PARAMETERS:
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
		case e4smPackage.DATA_NODE__PARAMETERS:
			return getParameters();
		case e4smPackage.DATA_NODE__DOCUMENTATION:
			return getDocumentation();
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
		case e4smPackage.DATA_NODE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case e4smPackage.DATA_NODE__DOCUMENTATION:
			setDocumentation((String) newValue);
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
		case e4smPackage.DATA_NODE__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.DATA_NODE__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
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
		case e4smPackage.DATA_NODE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.DATA_NODE__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
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
		if (baseClass == ExecutionElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableNode.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ParameterizableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.DATA_NODE__PARAMETERS:
				return AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.DATA_NODE__DOCUMENTATION:
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
		if (baseClass == ExecutionElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableNode.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ParameterizableElement.class) {
			switch (baseFeatureID) {
			case AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS:
				return e4smPackage.DATA_NODE__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return e4smPackage.DATA_NODE__DOCUMENTATION;
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
		case e4smPackage.DATA_NODE___COMPUTE_NAME:
			return computeName();
		case e4smPackage.DATA_NODE___GET_OUTGOING_CONNECTORS:
			return getOutgoingConnectors();
		case e4smPackage.DATA_NODE___GET_INCOMING_CONNECTORS:
			return getIncomingConnectors();
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

} //DataNodeImpl
