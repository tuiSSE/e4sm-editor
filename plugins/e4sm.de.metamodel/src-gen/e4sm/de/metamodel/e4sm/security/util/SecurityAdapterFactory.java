/**
 */
package e4sm.de.metamodel.e4sm.security.util;

import e4sm.de.metamodel.e4sm.security.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.security.SecurityPackage
 * @generated
 */
public class SecurityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySwitch<Adapter> modelSwitch = new SecuritySwitch<Adapter>() {
		@Override
		public Adapter caseAssetDefinition(AssetDefinition object) {
			return createAssetDefinitionAdapter();
		}

		@Override
		public Adapter caseSecurityGoal(SecurityGoal object) {
			return createSecurityGoalAdapter();
		}

		@Override
		public Adapter caseConfidentiality(Confidentiality object) {
			return createConfidentialityAdapter();
		}

		@Override
		public Adapter caseIntegrity(Integrity object) {
			return createIntegrityAdapter();
		}

		@Override
		public Adapter caseAvailability(Availability object) {
			return createAvailabilityAdapter();
		}

		@Override
		public Adapter caseCVE(CVE object) {
			return createCVEAdapter();
		}

		@Override
		public Adapter caseCWE(CWE object) {
			return createCWEAdapter();
		}

		@Override
		public Adapter caseThreatCondition(ThreatCondition object) {
			return createThreatConditionAdapter();
		}

		@Override
		public Adapter caseSecuritySpecification(SecuritySpecification object) {
			return createSecuritySpecificationAdapter();
		}

		@Override
		public Adapter caseKnownSecurityThreats(KnownSecurityThreats object) {
			return createKnownSecurityThreatsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.AssetDefinition <em>Asset Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.AssetDefinition
	 * @generated
	 */
	public Adapter createAssetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.SecurityGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.SecurityGoal
	 * @generated
	 */
	public Adapter createSecurityGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.Confidentiality
	 * @generated
	 */
	public Adapter createConfidentialityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.Integrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.Integrity
	 * @generated
	 */
	public Adapter createIntegrityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.CVE <em>CVE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.CVE
	 * @generated
	 */
	public Adapter createCVEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.CWE <em>CWE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.CWE
	 * @generated
	 */
	public Adapter createCWEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.ThreatCondition <em>Threat Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.ThreatCondition
	 * @generated
	 */
	public Adapter createThreatConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.SecuritySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.SecuritySpecification
	 * @generated
	 */
	public Adapter createSecuritySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.security.KnownSecurityThreats <em>Known Security Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.security.KnownSecurityThreats
	 * @generated
	 */
	public Adapter createKnownSecurityThreatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecurityAdapterFactory
