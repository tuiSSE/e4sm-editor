/**
 */
package e4sm.de.metamodel.e4sm.provider;

import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.DataNode;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.analysis.AnalysisFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.core.CorePackage;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e4sm.de.metamodel.e4sm.Connector} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ConnectorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConnectorItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						CorePackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Connector_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Connector_source_feature",
								"_UI_Connector_type"),
						e4smPackage.Literals.CONNECTOR__SOURCE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof Connector connector) {
							Package contaninedInPackage = (Package) connector.eContainer();
							EGenericType eGenericType = connector.eClass().getFeatureType(feature);
							Collection<EObject> result = new UniqueEList<EObject>();
							Collection<EObject> visited = new HashSet<EObject>();
							collectReachableObjectsOfType(visited, result, contaninedInPackage, eGenericType);
							if (!feature.isMany() && !result.contains(null)) {
								// Allow unselecting an element
								result.add(null);
							}
							return result;
						}
						return null;
					}
				});
	}

	/**
	 * This adds a property descriptor for the Target feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Connector_target_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Connector_target_feature",
								"_UI_Connector_type"),
						e4smPackage.Literals.CONNECTOR__TARGET, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof Connector connector) {
							Package contaninedInPackage = (Package) connector.eContainer();
							EGenericType eGenericType = connector.eClass().getFeatureType(feature);
							Collection<EObject> result = new UniqueEList<EObject>();
							Collection<EObject> visited = new HashSet<EObject>();
							collectReachableObjectsOfType(visited, result, contaninedInPackage, eGenericType);
							if (!feature.isMany() && !result.contains(null)) {
								// Allow unselecting an element
								result.add(null);
							}
							return result;
							/*
							 * Package p = (Package) connector.eContainer(); if (p != null) { if (connector
							 * instanceof PhysicalConnector) { //Get all pins of other PhysicalComponents of
							 * the same level, TODO: include PhysicalComponents contained by sectors.
							 * result.addAll(p.getComponents().stream().filter(c -> c instanceof
							 * PhysicalComponent) .map(c -> c.getPins()).flatMap(l ->
							 * l.stream()).toList()); } else if (connector instanceof
							 * LogicalConnector) { //Get all pins, including pins contained by containers
							 * TODO result.addAll(p.getComponents().stream().map(c -> c.getPins()).flatMap(l
							 * -> l.stream()) .toList()); } else //Generic connector,
							 * TODO result.addAll(p.getComponents().stream().map(c -> c.getPins()).flatMap(l
							 * -> l.stream()).toList()); }
							 * 
							 * return result;
							 */
						}
						return null;
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
			childrenFeatures.add(CorePackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS);
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
	 * This returns Connector.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connector"));
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
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> If
	 * the connector has a name, use that as label else, if the source and target
	 * name both have names, return sName->tName else, use the UUID <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabelText((Connector) object);
		return label == null || label.length() == 0
				? getString("_UI_Connector_type") + " " + EcoreUtil.getID((Connector) object)
				: getString("_UI_Connector_type") + " " + label;
	}

	public String getLabelText(Connector connector) {
		final String name = connector.getName();
		String label = "";
		if (name != null && name.length() > 0) {
			label = name;
		}

		DataNode sourceElement = connector.getSource();
		DataNode targetElement = connector.getTarget();
		if (sourceElement != null && targetElement != null) {
			String sourceName = sourceElement.computeName();
			String targetName = targetElement.computeName();
			//			Component sourceContainer = (Component) sourceElement.eContainer();
			//			Component targetContainer = (Component) targetElement.eContainer();
			//			String sourceName = sourceContainer.getName();
			//			String targetName = targetContainer.getName();
			if (sourceName != null && targetName != null && sourceName.length() > 0 && targetName.length() > 0) {
				label += ": " + sourceName + "->" + targetName;
			}
		}
		return label;
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

		switch (notification.getFeatureID(Connector.class)) {
		case e4smPackage.CONNECTOR__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case e4smPackage.CONNECTOR__PARAMETERS:
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

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.PARAMETERIZABLE_ELEMENT__PARAMETERS,
				AnalysisFactory.eINSTANCE.createParameter()));
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
