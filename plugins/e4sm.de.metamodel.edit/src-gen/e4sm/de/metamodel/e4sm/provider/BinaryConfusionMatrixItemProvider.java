/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.BinaryConfusionMatrix;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.BinaryConfusionMatrix} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryConfusionMatrixItemProvider extends ConfusionMatrixItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryConfusionMatrixItemProvider(AdapterFactory adapterFactory) {
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

			addTpPropertyDescriptor(object);
			addTnPropertyDescriptor(object);
			addFpPropertyDescriptor(object);
			addFnPropertyDescriptor(object);
			addPositiveClassPropertyDescriptor(object);
			addNegativeClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryConfusionMatrix_tp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_tp_feature",
								"_UI_BinaryConfusionMatrix_type"),
						e4smPackage.Literals.BINARY_CONFUSION_MATRIX__TP, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryConfusionMatrix_tn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_tn_feature",
								"_UI_BinaryConfusionMatrix_type"),
						e4smPackage.Literals.BINARY_CONFUSION_MATRIX__TN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryConfusionMatrix_fp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_fp_feature",
								"_UI_BinaryConfusionMatrix_type"),
						e4smPackage.Literals.BINARY_CONFUSION_MATRIX__FP, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryConfusionMatrix_fn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_fn_feature",
								"_UI_BinaryConfusionMatrix_type"),
						e4smPackage.Literals.BINARY_CONFUSION_MATRIX__FN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Positive Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositiveClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BinaryConfusionMatrix_positiveClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_positiveClass_feature",
						"_UI_BinaryConfusionMatrix_type"),
				e4smPackage.Literals.BINARY_CONFUSION_MATRIX__POSITIVE_CLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Negative Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BinaryConfusionMatrix_negativeClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BinaryConfusionMatrix_negativeClass_feature",
						"_UI_BinaryConfusionMatrix_type"),
				e4smPackage.Literals.BINARY_CONFUSION_MATRIX__NEGATIVE_CLASS, true, false, true, null, null, null));
	}

	/**
	 * This returns BinaryConfusionMatrix.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryConfusionMatrix"));
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
		String label = ((BinaryConfusionMatrix) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BinaryConfusionMatrix_type")
				: getString("_UI_BinaryConfusionMatrix_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryConfusionMatrix.class)) {
		case e4smPackage.BINARY_CONFUSION_MATRIX__TP:
		case e4smPackage.BINARY_CONFUSION_MATRIX__TN:
		case e4smPackage.BINARY_CONFUSION_MATRIX__FP:
		case e4smPackage.BINARY_CONFUSION_MATRIX__FN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
