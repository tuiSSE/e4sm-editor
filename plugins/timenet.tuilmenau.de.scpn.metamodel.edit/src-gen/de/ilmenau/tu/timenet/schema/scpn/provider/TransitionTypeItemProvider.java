/**
 */
package de.ilmenau.tu.timenet.schema.scpn.provider;

import de.ilmenau.tu.timenet.schema.scpn.TransitionType;
import de.ilmenau.tu.timenet.schema.scpn.scpnFactory;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ilmenau.tu.timenet.schema.scpn.TransitionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionTypeItemProvider extends NodeTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayExpressionPropertyDescriptor(object);
			addGlobalGuardPropertyDescriptor(object);
			addLocalGuardPropertyDescriptor(object);
			addLogfileDescriptionPropertyDescriptor(object);
			addLogfileExpressionPropertyDescriptor(object);
			addLogfileNamePropertyDescriptor(object);
			addManualCodePropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addServerTypePropertyDescriptor(object);
			addSpecTypePropertyDescriptor(object);
			addTakeFirstPropertyDescriptor(object);
			addTimeGuardPropertyDescriptor(object);
			addWatchPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Display Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_displayExpression_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_displayExpression_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__DISPLAY_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Global Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_globalGuard_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_globalGuard_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__GLOBAL_GUARD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Local Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_localGuard_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_localGuard_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__LOCAL_GUARD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logfile Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogfileDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_logfileDescription_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_logfileDescription_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__LOGFILE_DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logfile Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogfileExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_logfileExpression_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_logfileExpression_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__LOGFILE_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logfile Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogfileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_logfileName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_logfileName_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__LOGFILE_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Manual Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManualCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_manualCode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_manualCode_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__MANUAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_path_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_serverType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_serverType_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__SERVER_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spec Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_specType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_specType_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__SPEC_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Take First feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTakeFirstPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_takeFirst_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_takeFirst_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__TAKE_FIRST, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Time Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_timeGuard_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_timeGuard_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__TIME_GUARD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Watch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionType_watch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionType_watch_feature",
								"_UI_TransitionType_type"),
						scpnPackage.Literals.TRANSITION_TYPE__WATCH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(scpnPackage.Literals.TRANSITION_TYPE__LABEL);
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
	 * This returns TransitionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransitionType"));
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
		String label = ((TransitionType) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_TransitionType_type")
				: getString("_UI_TransitionType_type") + " " + label;
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

		switch (notification.getFeatureID(TransitionType.class)) {
		case scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION:
		case scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD:
		case scpnPackage.TRANSITION_TYPE__LOCAL_GUARD:
		case scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION:
		case scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION:
		case scpnPackage.TRANSITION_TYPE__LOGFILE_NAME:
		case scpnPackage.TRANSITION_TYPE__MANUAL_CODE:
		case scpnPackage.TRANSITION_TYPE__PATH:
		case scpnPackage.TRANSITION_TYPE__SERVER_TYPE:
		case scpnPackage.TRANSITION_TYPE__SPEC_TYPE:
		case scpnPackage.TRANSITION_TYPE__TAKE_FIRST:
		case scpnPackage.TRANSITION_TYPE__TIME_GUARD:
		case scpnPackage.TRANSITION_TYPE__WATCH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case scpnPackage.TRANSITION_TYPE__LABEL:
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

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.TRANSITION_TYPE__LABEL,
				scpnFactory.eINSTANCE.createLabelType()));
	}

}
