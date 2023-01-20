/**
 */
package abcd.xy.metamodel.abcd.provider;

import abcd.xy.metamodel.abcd.analysis.AnalysisFactory;
import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.abcdPackage;
import abcd.xy.metamodel.abcd.core.provider.NamedElementItemProvider;
import abcd.xy.metamodel.abcd.abcdFactory;
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
 * This is the item provider adapter for a {@link abcd.xy.metamodel.abcd.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentationPropertyDescriptor(object);
			addMainResponsiblePropertyDescriptor(object);
			addPackagesPropertyDescriptor(object);
			addSpecifiesComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DocumentableElement_documentation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentableElement_documentation_feature",
						"_UI_DocumentableElement_type"),
				CorePackage.Literals.DOCUMENTABLE_ELEMENT__DOCUMENTATION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Main Responsible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainResponsiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Package_mainResponsible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Package_mainResponsible_feature",
								"_UI_Package_type"),
						abcdPackage.Literals.PACKAGE__MAIN_RESPONSIBLE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Package_packages_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Package_packages_feature",
								"_UI_Package_type"),
						abcdPackage.Literals.PACKAGE__PACKAGES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Specifies Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecifiesComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Package_specifiesComponent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Package_specifiesComponent_feature",
								"_UI_Package_type"),
						abcdPackage.Literals.PACKAGE__SPECIFIES_COMPONENT, true, false, true, null, null, null));
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
			childrenFeatures.add(AnalysisPackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS);
			childrenFeatures.add(abcdPackage.Literals.PACKAGE__COMPONENTS);
			childrenFeatures.add(abcdPackage.Literals.PACKAGE__CONNECTORS);
			childrenFeatures.add(abcdPackage.Literals.PACKAGE__SECTORS);
			childrenFeatures.add(abcdPackage.Literals.PACKAGE__PACKAGES);
			childrenFeatures.add(abcdPackage.Literals.PACKAGE__DATASTORES);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
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
		String label = ((abcd.xy.metamodel.abcd.Package) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Package_type")
				: getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(abcd.xy.metamodel.abcd.Package.class)) {
		case abcdPackage.PACKAGE__DOCUMENTATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case abcdPackage.PACKAGE__PARAMETERS:
		case abcdPackage.PACKAGE__COMPONENTS:
		case abcdPackage.PACKAGE__CONNECTORS:
		case abcdPackage.PACKAGE__SECTORS:
		case abcdPackage.PACKAGE__PACKAGES:
		case abcdPackage.PACKAGE__DATASTORES:
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

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS,
				AnalysisFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createSoftwareComponent()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createMachineLearningComponent()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createPhysicalComponent()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createHeuristic()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS, abcdFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS,
				abcdFactory.eINSTANCE.createExternalDependency()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS, abcdFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.PACKAGE__COMPONENTS, abcdFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__CONNECTORS,
				abcdFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__CONNECTORS,
				abcdFactory.eINSTANCE.createPhysicalConnector()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__CONNECTORS,
				abcdFactory.eINSTANCE.createLogicalConnector()));

		newChildDescriptors
				.add(createChildParameter(abcdPackage.Literals.PACKAGE__SECTORS, abcdFactory.eINSTANCE.createSector()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.PACKAGE__PACKAGES, abcdFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.PACKAGE__DATASTORES,
				abcdFactory.eINSTANCE.createDataStore()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return abcdEditPlugin.INSTANCE;
	}

}
