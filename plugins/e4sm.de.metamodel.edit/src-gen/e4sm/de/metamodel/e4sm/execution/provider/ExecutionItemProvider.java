/**
 */
package e4sm.de.metamodel.e4sm.execution.provider;

import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.e4smFactory;

import e4sm.de.metamodel.e4sm.execution.Execution;
import e4sm.de.metamodel.e4sm.execution.ExecutionFactory;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;

import e4sm.de.metamodel.e4sm.provider.e4smEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.execution.Execution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ExecutionPackage.Literals.EXECUTION__ELEMENTS);
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
	 * This returns Execution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Execution"));
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
		return getString("_UI_Execution_type");
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

		switch (notification.getFeatureID(Execution.class)) {
		case ExecutionPackage.EXECUTION__ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createFlowFinal()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createConst()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				ExecutionFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				e4smFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				e4smFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.EXECUTION__ELEMENTS,
				CoreFactory.eINSTANCE.createLiteralDate()));
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
