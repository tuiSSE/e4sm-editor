/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.OutputPin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.execution.ExecutionFactory;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.OutputPin} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class OutputPinItemProvider extends PinItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutputPinItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAmplifyPropertyDescriptor(object);
			addOutputUncertaintyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Amplify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmplifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OutputPin_amplify_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OutputPin_amplify_feature",
								"_UI_OutputPin_type"),
						e4smPackage.Literals.OUTPUT_PIN__AMPLIFY, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output Uncertainty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputUncertaintyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OutputPin_outputUncertainty_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OutputPin_outputUncertainty_feature",
								"_UI_OutputPin_type"),
						e4smPackage.Literals.OUTPUT_PIN__OUTPUT_UNCERTAINTY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(e4smPackage.Literals.OUTPUT_PIN__TOKEN_SPECIFICATION);
			childrenFeatures.add(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION);
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
	 * This returns OutputPin.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutputPin"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * If the pin has a name, use that as label.
	 * else, if the container has a name, use "of cName"
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabelText((Pin) object);
		return label == null || label.length() == 0 ? getString("_UI_OutputPin_type")
				: getString("_UI_OutputPin_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OutputPin.class)) {
		case e4smPackage.OUTPUT_PIN__AMPLIFY:
		case e4smPackage.OUTPUT_PIN__OUTPUT_UNCERTAINTY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case e4smPackage.OUTPUT_PIN__TOKEN_SPECIFICATION:
		case e4smPackage.OUTPUT_PIN__OUTPUT_EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__TOKEN_SPECIFICATION,
				e4smFactory.eINSTANCE.createTokenSpecification()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				CoreFactory.eINSTANCE.createLiteralDate()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createInputPinReference()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createInputPinAttributeReference()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add(createChildParameter(e4smPackage.Literals.OUTPUT_PIN__OUTPUT_EXPRESSION,
				ExecutionFactory.eINSTANCE.createExponentiation()));
	}

}
