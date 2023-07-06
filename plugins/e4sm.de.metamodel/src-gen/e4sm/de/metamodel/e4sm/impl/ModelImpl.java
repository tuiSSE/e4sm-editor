/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.Environment;
import e4sm.de.metamodel.e4sm.Import;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.SecurityThreatsImport;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.TypeSpecification;
import e4sm.de.metamodel.e4sm.core.Variant;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.security.KnownSecurityThreats;
import e4sm.de.metamodel.e4sm.security.SecuritySpecification;
import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;
import e4sm.de.metamodel.e4sm.util.e4smValidator;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getPersonsPicturesPath <em>Persons Pictures Path</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getClassificationClasses <em>Classification Classes</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getSecurityThreatsDefinition <em>Security Threats Definition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getSecurityThreatsImport <em>Security Threats Import</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ModelImpl#getSecuritySpecification <em>Security Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends NamedElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<e4sm.de.metamodel.e4sm.Package> packages;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The default value of the '{@link #getPersonsPicturesPath() <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPersonsPicturesPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONS_PICTURES_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonsPicturesPath() <em>Persons Pictures Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPersonsPicturesPath()
	 * @generated
	 * @ordered
	 */
	protected String personsPicturesPath = PERSONS_PICTURES_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpecification> types;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getClassificationClasses() <em>Classification Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationClass> classificationClasses;

	/**
	 * The cached value of the '{@link #getSecurityThreatsDefinition() <em>Security Threats Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityThreatsDefinition()
	 * @generated
	 * @ordered
	 */
	protected KnownSecurityThreats securityThreatsDefinition;

	/**
	 * The cached value of the '{@link #getSecurityThreatsImport() <em>Security Threats Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityThreatsImport()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityThreatsImport> securityThreatsImport;

	/**
	 * The cached value of the '{@link #getSecuritySpecification() <em>Security Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySpecification()
	 * @generated
	 * @ordered
	 */
	protected SecuritySpecification securitySpecification;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.MODEL__DOCUMENTATION, oldDocumentation,
					documentation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonsPicturesPath() {
		return personsPicturesPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public EList<TypeSpecification> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeSpecification>(TypeSpecification.class, this,
					e4smPackage.MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, e4smPackage.MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					e4smPackage.MODEL__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassificationClass> getClassificationClasses() {
		if (classificationClasses == null) {
			classificationClasses = new EObjectContainmentEList<ClassificationClass>(ClassificationClass.class, this,
					e4smPackage.MODEL__CLASSIFICATION_CLASSES);
		}
		return classificationClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnownSecurityThreats getSecurityThreatsDefinition() {
		return securityThreatsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityThreatsDefinition(KnownSecurityThreats newSecurityThreatsDefinition,
			NotificationChain msgs) {
		KnownSecurityThreats oldSecurityThreatsDefinition = securityThreatsDefinition;
		securityThreatsDefinition = newSecurityThreatsDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.MODEL__SECURITY_THREATS_DEFINITION, oldSecurityThreatsDefinition,
					newSecurityThreatsDefinition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityThreatsDefinition(KnownSecurityThreats newSecurityThreatsDefinition) {
		if (newSecurityThreatsDefinition != securityThreatsDefinition) {
			NotificationChain msgs = null;
			if (securityThreatsDefinition != null)
				msgs = ((InternalEObject) securityThreatsDefinition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MODEL__SECURITY_THREATS_DEFINITION, null, msgs);
			if (newSecurityThreatsDefinition != null)
				msgs = ((InternalEObject) newSecurityThreatsDefinition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MODEL__SECURITY_THREATS_DEFINITION, null, msgs);
			msgs = basicSetSecurityThreatsDefinition(newSecurityThreatsDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.MODEL__SECURITY_THREATS_DEFINITION,
					newSecurityThreatsDefinition, newSecurityThreatsDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityThreatsImport> getSecurityThreatsImport() {
		if (securityThreatsImport == null) {
			securityThreatsImport = new EObjectContainmentEList<SecurityThreatsImport>(SecurityThreatsImport.class,
					this, e4smPackage.MODEL__SECURITY_THREATS_IMPORT);
		}
		return securityThreatsImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuritySpecification getSecuritySpecification() {
		return securitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritySpecification(SecuritySpecification newSecuritySpecification,
			NotificationChain msgs) {
		SecuritySpecification oldSecuritySpecification = securitySpecification;
		securitySpecification = newSecuritySpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.MODEL__SECURITY_SPECIFICATION, oldSecuritySpecification, newSecuritySpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecuritySpecification(SecuritySpecification newSecuritySpecification) {
		if (newSecuritySpecification != securitySpecification) {
			NotificationChain msgs = null;
			if (securitySpecification != null)
				msgs = ((InternalEObject) securitySpecification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MODEL__SECURITY_SPECIFICATION, null, msgs);
			if (newSecuritySpecification != null)
				msgs = ((InternalEObject) newSecuritySpecification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MODEL__SECURITY_SPECIFICATION, null, msgs);
			msgs = basicSetSecuritySpecification(newSecuritySpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.MODEL__SECURITY_SPECIFICATION,
					newSecuritySpecification, newSecuritySpecification));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isPersonPicturePathValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean validationFailed = false;
		URI uri = null;
		if (personsPicturesPath == null || personsPicturesPath.length() == 0) {
			return true; // The path is not valid, but is also not set
		} else {
			uri = URI.createURI(personsPicturesPath);
		}
		String path = null;
		Path p = null;
		if (uri.isPlatform()) {
			path = uri.toPlatformString(false);
		}
		if (path != null) {
			p = Paths.get(path);
		}
		if (p == null) {
			return false;
		}
		if (validationFailed || (uri != null && !Files.isDirectory(p))) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING, e4smValidator.DIAGNOSTIC_SOURCE,
						e4smValidator.MODEL__IS_PERSON_PICTURE_PATH_VALID,
						"The given path \"" + personsPicturesPath
								+ "\" does not exists in this system or is not accessible",
						new Object[] { this, this.getPersonsPicturesPath() }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		case e4smPackage.MODEL__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__CLASSIFICATION_CLASSES:
			return ((InternalEList<?>) getClassificationClasses()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__SECURITY_THREATS_DEFINITION:
			return basicSetSecurityThreatsDefinition(null, msgs);
		case e4smPackage.MODEL__SECURITY_THREATS_IMPORT:
			return ((InternalEList<?>) getSecurityThreatsImport()).basicRemove(otherEnd, msgs);
		case e4smPackage.MODEL__SECURITY_SPECIFICATION:
			return basicSetSecuritySpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.MODEL__PARAMETERS:
			return getParameters();
		case e4smPackage.MODEL__DOCUMENTATION:
			return getDocumentation();
		case e4smPackage.MODEL__PACKAGES:
			return getPackages();
		case e4smPackage.MODEL__ACTORS:
			return getActors();
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			return getPersonsPicturesPath();
		case e4smPackage.MODEL__VARIANTS:
			return getVariants();
		case e4smPackage.MODEL__TYPES:
			return getTypes();
		case e4smPackage.MODEL__IMPORTS:
			return getImports();
		case e4smPackage.MODEL__ENVIRONMENTS:
			return getEnvironments();
		case e4smPackage.MODEL__CLASSIFICATION_CLASSES:
			return getClassificationClasses();
		case e4smPackage.MODEL__SECURITY_THREATS_DEFINITION:
			return getSecurityThreatsDefinition();
		case e4smPackage.MODEL__SECURITY_THREATS_IMPORT:
			return getSecurityThreatsImport();
		case e4smPackage.MODEL__SECURITY_SPECIFICATION:
			return getSecuritySpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		case e4smPackage.MODEL__DOCUMENTATION:
			setDocumentation((String) newValue);
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
		case e4smPackage.MODEL__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends TypeSpecification>) newValue);
			return;
		case e4smPackage.MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case e4smPackage.MODEL__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case e4smPackage.MODEL__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
			getClassificationClasses().addAll((Collection<? extends ClassificationClass>) newValue);
			return;
		case e4smPackage.MODEL__SECURITY_THREATS_DEFINITION:
			setSecurityThreatsDefinition((KnownSecurityThreats) newValue);
			return;
		case e4smPackage.MODEL__SECURITY_THREATS_IMPORT:
			getSecurityThreatsImport().clear();
			getSecurityThreatsImport().addAll((Collection<? extends SecurityThreatsImport>) newValue);
			return;
		case e4smPackage.MODEL__SECURITY_SPECIFICATION:
			setSecuritySpecification((SecuritySpecification) newValue);
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
		case e4smPackage.MODEL__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.MODEL__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
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
		case e4smPackage.MODEL__TYPES:
			getTypes().clear();
			return;
		case e4smPackage.MODEL__IMPORTS:
			getImports().clear();
			return;
		case e4smPackage.MODEL__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case e4smPackage.MODEL__CLASSIFICATION_CLASSES:
			getClassificationClasses().clear();
			return;
		case e4smPackage.MODEL__SECURITY_THREATS_DEFINITION:
			setSecurityThreatsDefinition((KnownSecurityThreats) null);
			return;
		case e4smPackage.MODEL__SECURITY_THREATS_IMPORT:
			getSecurityThreatsImport().clear();
			return;
		case e4smPackage.MODEL__SECURITY_SPECIFICATION:
			setSecuritySpecification((SecuritySpecification) null);
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
		case e4smPackage.MODEL__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.MODEL__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case e4smPackage.MODEL__PACKAGES:
			return packages != null && !packages.isEmpty();
		case e4smPackage.MODEL__ACTORS:
			return actors != null && !actors.isEmpty();
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			return PERSONS_PICTURES_PATH_EDEFAULT == null ? personsPicturesPath != null
					: !PERSONS_PICTURES_PATH_EDEFAULT.equals(personsPicturesPath);
		case e4smPackage.MODEL__VARIANTS:
			return variants != null && !variants.isEmpty();
		case e4smPackage.MODEL__TYPES:
			return types != null && !types.isEmpty();
		case e4smPackage.MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		case e4smPackage.MODEL__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case e4smPackage.MODEL__CLASSIFICATION_CLASSES:
			return classificationClasses != null && !classificationClasses.isEmpty();
		case e4smPackage.MODEL__SECURITY_THREATS_DEFINITION:
			return securityThreatsDefinition != null;
		case e4smPackage.MODEL__SECURITY_THREATS_IMPORT:
			return securityThreatsImport != null && !securityThreatsImport.isEmpty();
		case e4smPackage.MODEL__SECURITY_SPECIFICATION:
			return securitySpecification != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.MODEL__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return e4smPackage.MODEL__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.MODEL___IS_PERSON_PICTURE_PATH_VALID__DIAGNOSTICCHAIN_MAP:
			return isPersonPicturePathValid((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", personsPicturesPath: ");
		result.append(personsPicturesPath);
		result.append(')');
		return result.toString();
	}

} // ModelImpl
