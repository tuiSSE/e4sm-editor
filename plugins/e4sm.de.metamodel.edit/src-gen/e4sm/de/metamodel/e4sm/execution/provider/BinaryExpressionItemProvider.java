/**
 */
package e4sm.de.metamodel.e4sm.execution.provider;

import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.execution.BinaryExpression;
import e4sm.de.metamodel.e4sm.execution.ExecutionFactory;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.execution.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryExpression_left_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_left_feature",
								"_UI_BinaryExpression_type"),
						ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BinaryExpression_right_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_right_feature",
								"_UI_BinaryExpression_type"),
						ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT, true, false, true, null, null, null));
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
			childrenFeatures.add(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT);
			childrenFeatures.add(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT);
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
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
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
		return getString("_UI_BinaryExpression_type");
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

		switch (notification.getFeatureID(BinaryExpression.class)) {
		case ExecutionPackage.BINARY_EXPRESSION__LEFT:
		case ExecutionPackage.BINARY_EXPRESSION__RIGHT:
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

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				ExecutionFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				ExecutionFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				ExecutionFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT,
				CoreFactory.eINSTANCE.createLiteralDate()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				ExecutionFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				ExecutionFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				ExecutionFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT,
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

		boolean qualify = childFeature == ExecutionPackage.Literals.BINARY_EXPRESSION__LEFT
				|| childFeature == ExecutionPackage.Literals.BINARY_EXPRESSION__RIGHT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
