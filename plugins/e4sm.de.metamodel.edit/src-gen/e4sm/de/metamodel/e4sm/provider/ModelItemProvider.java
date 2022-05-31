/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.analysis.AnalysisFactory;
import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.core.provider.NamedElementItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPersonsPicturesPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Persons Pictures Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPersonsPicturesPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_personsPicturesPath_feature"),
						getString("_UI_Model_personsPicturesPath_feature_description"), // Added a personalized description
						e4smPackage.Literals.MODEL__PERSONS_PICTURES_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS);
			childrenFeatures.add(e4smPackage.Literals.MODEL__PACKAGES);
			childrenFeatures.add(e4smPackage.Literals.MODEL__ACTORS);
			childrenFeatures.add(e4smPackage.Literals.MODEL__VARIANTS);
			childrenFeatures.add(e4smPackage.Literals.MODEL__TYPES);
			childrenFeatures.add(e4smPackage.Literals.MODEL__IMPORTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Model) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Model_type")
				: getString("_UI_Model_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
		case e4smPackage.MODEL__PERSONS_PICTURES_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case e4smPackage.MODEL__PARAMETERS:
		case e4smPackage.MODEL__PACKAGES:
		case e4smPackage.MODEL__ACTORS:
		case e4smPackage.MODEL__VARIANTS:
		case e4smPackage.MODEL__TYPES:
		case e4smPackage.MODEL__IMPORTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS,
				AnalysisFactory.eINSTANCE.createParameter()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__PACKAGES, e4smFactory.eINSTANCE.createPackage()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__ACTORS, e4smFactory.eINSTANCE.createActor()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__ACTORS, e4smFactory.eINSTANCE.createHuman()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__ACTORS, e4smFactory.eINSTANCE.createRobot()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__ACTORS, e4smFactory.eINSTANCE.createPerson()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__VARIANTS, CoreFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.MODEL__TYPES,
				CoreFactory.eINSTANCE.createTypeSpecification()));

		newChildDescriptors
				.add(createChildParameter(e4smPackage.Literals.MODEL__IMPORTS, e4smFactory.eINSTANCE.createImport()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return e4smEditPlugin.INSTANCE;
	}

}
