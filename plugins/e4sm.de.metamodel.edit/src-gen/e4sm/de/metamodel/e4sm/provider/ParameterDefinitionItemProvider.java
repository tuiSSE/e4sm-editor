/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.ParameterDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterDefinitionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addMustBeDefinedOnPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addCanBeDefinedOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterDefinition_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_type_feature",
								"_UI_ParameterDefinition_type"),
						e4smPackage.Literals.PARAMETER_DEFINITION__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterDefinition_parameters_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_parameters_feature",
								"_UI_ParameterDefinition_type"),
						e4smPackage.Literals.PARAMETER_DEFINITION__PARAMETERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterDefinition_unit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_unit_feature",
								"_UI_ParameterDefinition_type"),
						e4smPackage.Literals.PARAMETER_DEFINITION__UNIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Can Be Defined On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBeDefinedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_canBeDefinedOn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_canBeDefinedOn_feature",
						"_UI_ParameterDefinition_type"),
				e4smPackage.Literals.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	protected void tempTODODeleteMe(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_canBeDefinedOn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_canBeDefinedOn_feature",
						"_UI_ParameterDefinition_type"),
				e4smPackage.Literals.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<EObject> result = new UniqueEList<EObject>();
				result.add(null);
				result.add(e4smPackage.eINSTANCE.getEClassifier("Connector"));
				result.add(e4smPackage.eINSTANCE.getEClassifier("Component"));
				result.add(e4smPackage.eINSTANCE.getEClassifier("SoftwareComponent"));
				result.add(e4smPackage.eINSTANCE.getEClassifier("InputPin"));
				result.add(e4smPackage.eINSTANCE.getEClassifier("OutputPin"));
				return result;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Must Be Defined On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMustBeDefinedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_mustBeDefinedOn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_mustBeDefinedOn_feature",
						"_UI_ParameterDefinition_type"),
				e4smPackage.Literals.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_defaultValue_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_defaultValue_feature",
						"_UI_ParameterDefinition_type"),
				e4smPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ParameterDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterDefinition"));
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
		String label = ((ParameterDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ParameterDefinition_type")
				: getString("_UI_ParameterDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(ParameterDefinition.class)) {
		case e4smPackage.PARAMETER_DEFINITION__TYPE:
		case e4smPackage.PARAMETER_DEFINITION__UNIT:
		case e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
		case e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
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
