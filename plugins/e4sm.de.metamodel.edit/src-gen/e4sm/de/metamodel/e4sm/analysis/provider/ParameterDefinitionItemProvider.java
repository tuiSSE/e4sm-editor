/**
 */
package e4sm.de.metamodel.e4sm.analysis.provider;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.provider.e4smEditPlugin;

import e4sm.de.metamodel.e4sm.core.CoreFactory;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.provider.TypedElementItemProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterDefinitionItemProvider extends TypedElementItemProvider {
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

			addParametersPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addMustBeDefinedOnPropertyDescriptor(object);
			addCanBeDefinedOnPropertyDescriptor(object);
			addShallNotBeDefinedOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_parameters_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_parameters_feature",
						"_UI_ParameterDefinition_type"),
				AnalysisPackage.Literals.PARAMETER_DEFINITION__PARAMETERS, true, false, true, null, null, null));
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
						AnalysisPackage.Literals.PARAMETER_DEFINITION__UNIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Must Be Defined On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMustBeDefinedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_ParameterDefinition_mustBeDefinedOn_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ParameterDefinition_mustBeDefinedOn_feature", "_UI_ParameterDefinition_type"),
				AnalysisPackage.Literals.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				List<EClass> choiceOfValues = new ArrayList<EClass>();
				EList<EClassifier> classifiers = CorePackage.eINSTANCE.getEClassifiers();
				classifiers.forEach(c -> {
					if (c instanceof EClass) {
						if (((EClass) c).getEAllSuperTypes().stream()
								.anyMatch(e -> e.equals(AnalysisPackage.eINSTANCE.getParameterizableElement()))) {
							choiceOfValues.add((EClass) c);
						}
					}
				});
				return choiceOfValues;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Can Be Defined On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCanBeDefinedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterDefinition_canBeDefinedOn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterDefinition_canBeDefinedOn_feature",
						"_UI_ParameterDefinition_type"),
				AnalysisPackage.Literals.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				List<EClass> choiceOfValues = new ArrayList<EClass>();
				EList<EClassifier> classifiers = CorePackage.eINSTANCE.getEClassifiers();
				classifiers.forEach(c -> {
					if (c instanceof EClass) {
						if (((EClass) c).getEAllSuperTypes().stream()
								.anyMatch(e -> e.equals(AnalysisPackage.eINSTANCE.getParameterizableElement()))) {
							choiceOfValues.add((EClass) c);
						}
					}
				});
				return choiceOfValues;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Shall Not Be Defined On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addShallNotBeDefinedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterDefinition_shallNotBeDefinedOn_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ParameterDefinition_shallNotBeDefinedOn_feature", "_UI_ParameterDefinition_type"),
						AnalysisPackage.Literals.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON, true, false, true, null,
						null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						List<EClass> choiceOfValues = new ArrayList<EClass>();
						EList<EClassifier> classifiers = CorePackage.eINSTANCE.getEClassifiers();
						classifiers.forEach(c -> {
							if (c instanceof EClass) {
								if (((EClass) c).getEAllSuperTypes().stream()
										.anyMatch(e -> e.equals(AnalysisPackage.eINSTANCE.getParameterizableElement()))) {
									choiceOfValues.add((EClass) c);
								}
							}
						});
						return choiceOfValues;
					}
				});
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
			childrenFeatures.add(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE);
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
		case AnalysisPackage.PARAMETER_DEFINITION__UNIT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
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

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralDouble()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralLong()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralShort()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralByte()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
				CoreFactory.eINSTANCE.createLiteralCharacter()));

		newChildDescriptors.add(createChildParameter(AnalysisPackage.Literals.PARAMETER_DEFINITION__DEFAULT_VALUE,
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
