/**
 */
package e4sm.de.metamodel.e4sm.analysis.provider;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.provider.e4smEditPlugin;

import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.core.provider.ElementItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.analysis.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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

			addParameterDefinitionPropertyDescriptor(object);
			addAppliesOnlyOnVariantsPropertyDescriptor(object);
			addDoesNotApplyOnVariantsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Parameter_parameterDefinition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Parameter_parameterDefinition_feature",
								"_UI_Parameter_type"),
						AnalysisPackage.Literals.PARAMETER__PARAMETER_DEFINITION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Applies Only On Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliesOnlyOnVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Parameter_appliesOnlyOnVariants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Parameter_appliesOnlyOnVariants_feature",
								"_UI_Parameter_type"),
						AnalysisPackage.Literals.PARAMETER__APPLIES_ONLY_ON_VARIANTS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Does Not Apply On Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoesNotApplyOnVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Parameter_doesNotApplyOnVariants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Parameter_doesNotApplyOnVariants_feature",
								"_UI_Parameter_type"),
						AnalysisPackage.Literals.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS, true, false, true, null, null,
						null));
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
			childrenFeatures.add(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE);
			childrenFeatures.add(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE);
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
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Parameter p = (Parameter) object;
		String label = "";
		ParameterDefinition def = p.getParameterDefinition();
		if (def != null) {
			label = def.getName() + " (" + def.getUnit() + ") = " + p.getInitialValue();
		} else {
			label = "!! Please set a Parameter Definition";
		}
		return label == null || label.length() == 0 ? getString("_UI_Parameter_type")
				: getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
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

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE,
				CoreFactory.eINSTANCE.createLiteralDate()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE,
				CoreFactory.eINSTANCE.createLiteralDate()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == AnalysisPackage.Literals.PARAMETER__INITIAL_VALUE
				|| childFeature == AnalysisPackage.Literals.PARAMETER__CURRENT_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
