/**
 */
package de.ilmenau.tu.timenet.schema.scpn.provider;

import de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType;
import de.ilmenau.tu.timenet.schema.scpn.scpnFactory;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ilmenau.tu.timenet.schema.scpn.ModuleImplementationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleImplementationTypeItemProvider extends NetTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleImplementationTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__LABEL);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__PLACE);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MODULE_PIN);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__ARC);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MEASURE);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__DEFINITION);
			childrenFeatures.add(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__COMMENT);
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
	 * This returns ModuleImplementationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleImplementationType"));
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
		String label = ((ModuleImplementationType) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ModuleImplementationType_type")
				: getString("_UI_ModuleImplementationType_type") + " " + label;
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

		switch (notification.getFeatureID(ModuleImplementationType.class)) {
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__LABEL:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__PLACE:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__MODULE_PIN:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__ARC:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__MEASURE:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__DEFINITION:
		case scpnPackage.MODULE_IMPLEMENTATION_TYPE__COMMENT:
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

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__LABEL,
				scpnFactory.eINSTANCE.createLabelType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__PLACE,
				scpnFactory.eINSTANCE.createPlaceType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__TIMED_TRANSITION,
				scpnFactory.eINSTANCE.createTimedTransitionType()));

		newChildDescriptors
				.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__IMMEDIATE_TRANSITION,
						scpnFactory.eINSTANCE.createImmediateTransitionType()));

		newChildDescriptors
				.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__SUBSTITUTION_TRANSITION,
						scpnFactory.eINSTANCE.createSubstitutionTransitionType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MODULE_INSTANCE,
				scpnFactory.eINSTANCE.createModuleInstanceType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MODULE_PIN,
				scpnFactory.eINSTANCE.createModulePinType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__ARC,
				scpnFactory.eINSTANCE.createArcType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__MEASURE,
				scpnFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__DEFINITION,
				scpnFactory.eINSTANCE.createDefinitionType()));

		newChildDescriptors.add(createChildParameter(scpnPackage.Literals.MODULE_IMPLEMENTATION_TYPE__COMMENT,
				scpnFactory.eINSTANCE.createCommentType()));
	}

}
