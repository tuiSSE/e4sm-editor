/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.analysis.Variant;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.types.impl.NamedElementImpl;
import e4sm.de.metamodel.e4sm.util.e4smValidator;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getPersonsPicturesPath <em>Persons Pictures Path</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends NamedElementImpl implements Model {
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<e4sm.de.metamodel.e4sm.Package> packages;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The default value of the '{@link #getPersonsPicturesPath() <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonsPicturesPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONS_PICTURES_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonsPicturesPath() <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonsPicturesPath()
	 * @generated
	 * @ordered
	 */
	protected String personsPicturesPath = PERSONS_PICTURES_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, e4smPackage.MODEL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<e4sm.de.metamodel.e4sm.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<e4sm.de.metamodel.e4sm.Package>(e4sm.de.metamodel.e4sm.Package.class,
					this, e4smPackage.MODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, e4smPackage.MODEL__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonsPicturesPath() {
		return personsPicturesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonsPicturesPath(String newPersonsPicturesPath) {
		String oldPersonsPicturesPath = personsPicturesPath;
		personsPicturesPath = newPersonsPicturesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.MODEL__PERSONS_PICTURES_PATH,
					oldPersonsPicturesPath, personsPicturesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<Variant>(Variant.class, this, e4smPackage.MODEL__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPersonPicturePathValid(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method! Remove if(false from the first if and find out why it doesn't work
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		URI uri = URI.createURI(personsPicturesPath);
		if (false && personsPicturesPath != null && personsPicturesPath.length() > 0
				&& Files.notExists(Paths.get(uri.toPlatformString(false)))) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, e4smValidator.DIAGNOSTIC_SOURCE,
						e4smValidator.MODEL__IS_PERSON_PICTURE_PATH_VALID,
						"The given path does not exists in this system or is not accessible",
						new Object[] { this, this.getPersonsPicturesPath() }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.MODEL__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__ACTORS:
			return ((InternalEList<?>) getActors()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__VARIANTS:
			return ((InternalEList<?>) getVariants()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.MODEL__PARAMETERS:
			return getParameters();
		case e4smPackage.MODEL__PACKAGES:
			return getPackages();
		case e4smPackage.MODEL__ACTORS:
			return getActors();
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			return getPersonsPicturesPath();
		case e4smPackage.MODEL__VARIANTS:
			return getVariants();
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
		case e4smPackage.MODEL__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case e4smPackage.MODEL__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends e4sm.de.metamodel.e4sm.Package>) newValue);
			return;
		case e4smPackage.MODEL__ACTORS:
			getActors().clear();
			getActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			setPersonsPicturesPath((String) newValue);
			return;
		case e4smPackage.MODEL__VARIANTS:
			getVariants().clear();
			getVariants().addAll((Collection<? extends Variant>) newValue);
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
		case e4smPackage.MODEL__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.MODEL__PACKAGES:
			getPackages().clear();
			return;
		case e4smPackage.MODEL__ACTORS:
			getActors().clear();
			return;
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			setPersonsPicturesPath(PERSONS_PICTURES_PATH_EDEFAULT);
			return;
		case e4smPackage.MODEL__VARIANTS:
			getVariants().clear();
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
		case e4smPackage.MODEL__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.MODEL__PACKAGES:
			return packages != null && !packages.isEmpty();
		case e4smPackage.MODEL__ACTORS:
			return actors != null && !actors.isEmpty();
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			return PERSONS_PICTURES_PATH_EDEFAULT == null ? personsPicturesPath != null
					: !PERSONS_PICTURES_PATH_EDEFAULT.equals(personsPicturesPath);
		case e4smPackage.MODEL__VARIANTS:
			return variants != null && !variants.isEmpty();
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
		if (baseClass == ParameterizableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.MODEL__PARAMETERS:
				return AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;
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
		if (baseClass == ParameterizableElement.class) {
			switch (baseFeatureID) {
			case AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS:
				return e4smPackage.MODEL__PARAMETERS;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.MODEL___IS_PERSON_PICTURE_PATH_VALID__DIAGNOSTICCHAIN_MAP:
			return isPersonPicturePathValid((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
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
		result.append(" (personsPicturesPath: ");
		result.append(personsPicturesPath);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
