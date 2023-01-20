/**
 */
package abcd.xy.metamodel.abcd.provider;

import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.abcdFactory;
import abcd.xy.metamodel.abcd.abcdPackage;
import abcd.xy.metamodel.abcd.core.provider.NamedElementItemProvider;
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
 * This is the item provider adapter for a {@link abcd.xy.metamodel.abcd.Sector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SectorItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectorItemProvider(AdapterFactory adapterFactory) {
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
			addSectorsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Sectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Sector_sectors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Sector_sectors_feature",
								"_UI_Sector_type"),
						abcdPackage.Literals.SECTOR__SECTORS, true, false, true, null, null, null));
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
			childrenFeatures.add(abcdPackage.Literals.SECTOR__COMPONENTS);
			childrenFeatures.add(abcdPackage.Literals.SECTOR__SECTORS);
			childrenFeatures.add(abcdPackage.Literals.SECTOR__DATASTORES);
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
	 * This returns Sector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sector"));
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
		String label = ((Sector) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Sector_type")
				: getString("_UI_Sector_type") + " " + label;
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

		switch (notification.getFeatureID(Sector.class)) {
		case abcdPackage.SECTOR__DOCUMENTATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case abcdPackage.SECTOR__COMPONENTS:
		case abcdPackage.SECTOR__SECTORS:
		case abcdPackage.SECTOR__DATASTORES:
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		//		newChildDescriptors.add(
		//				createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS, abcdFactory.eINSTANCE.createComponent()));
		//
		//		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS,
		//				abcdFactory.eINSTANCE.createSoftwareComponent()));
		//
		//		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS,
		//				abcdFactory.eINSTANCE.createMachineLearningComponent()));

		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS,
				abcdFactory.eINSTANCE.createPhysicalComponent()));

		//		newChildDescriptors.add(
		//				createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS, abcdFactory.eINSTANCE.createHeuristic()));
		//
		//		newChildDescriptors.add(
		//				createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS, abcdFactory.eINSTANCE.createFunction()));
		//
		//		newChildDescriptors.add(createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS,
		//				abcdFactory.eINSTANCE.createExternalDependency()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS, abcdFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(
				createChildParameter(abcdPackage.Literals.SECTOR__COMPONENTS, abcdFactory.eINSTANCE.createActuator()));

		newChildDescriptors
				.add(createChildParameter(abcdPackage.Literals.SECTOR__SECTORS, abcdFactory.eINSTANCE.createSector()));
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
