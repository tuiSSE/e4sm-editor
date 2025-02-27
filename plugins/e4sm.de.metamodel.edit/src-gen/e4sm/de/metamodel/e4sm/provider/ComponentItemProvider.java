/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.analysis.AnalysisFactory;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.execution.ExecutionFactory;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
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
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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
			addComponentsPropertyDescriptor(object);
			addMainResponsiblePropertyDescriptor(object);
			addSpecifiedInPackagePropertyDescriptor(object);
			addFiringStrategyPropertyDescriptor(object);
			addOutputPinsPropertyDescriptor(object);
			addInputPinsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_components_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_components_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__COMPONENTS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Component_mainResponsible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_mainResponsible_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__MAIN_RESPONSIBLE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Specified In Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecifiedInPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_specifiedInPackage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_specifiedInPackage_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__SPECIFIED_IN_PACKAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Firing Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiringStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_firingStrategy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_firingStrategy_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__FIRING_STRATEGY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output Pins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_outputPins_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_outputPins_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__OUTPUT_PINS, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Pins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_inputPins_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_inputPins_feature",
								"_UI_Component_type"),
						e4smPackage.Literals.COMPONENT__INPUT_PINS, false, false, false, null, null, null));
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
			childrenFeatures.add(ExecutionPackage.Literals.DELAYABLE_ELEMENT__TIME_FUNCTION);
			childrenFeatures.add(e4smPackage.Literals.COMPONENT__COMPONENTS);
			childrenFeatures.add(e4smPackage.Literals.COMPONENT__PINS);
			childrenFeatures.add(e4smPackage.Literals.COMPONENT__EXECUTION);
			childrenFeatures.add(e4smPackage.Literals.COMPONENT__DATASTORES);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
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
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
		case e4smPackage.COMPONENT__DOCUMENTATION:
		case e4smPackage.COMPONENT__FIRING_STRATEGY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case e4smPackage.COMPONENT__PARAMETERS:
		case e4smPackage.COMPONENT__TIME_FUNCTION:
		case e4smPackage.COMPONENT__COMPONENTS:
		case e4smPackage.COMPONENT__PINS:
		case e4smPackage.COMPONENT__EXECUTION:
		case e4smPackage.COMPONENT__DATASTORES:
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

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.DELAYABLE_ELEMENT__TIME_FUNCTION,
				ExecutionFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createSoftwareComponent()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createMachineLearningComponent()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createPhysicalComponent()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createHeuristic()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createExternalDependency()));

		newChildDescriptors.add(
				createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS, e4smFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createBinaryClassificationComponent()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__COMPONENTS,
				e4smFactory.eINSTANCE.createMulticlassClassificationComponent()));

		newChildDescriptors.add(
				createChildParameter(e4smPackage.Literals.COMPONENT__PINS, e4smFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add(
				createChildParameter(e4smPackage.Literals.COMPONENT__PINS, e4smFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__EXECUTION,
				ExecutionFactory.eINSTANCE.createExecution()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.COMPONENT__DATASTORES,
				e4smFactory.eINSTANCE.createDataStore()));
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
