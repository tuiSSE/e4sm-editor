package e4sm.de.metamodel.e4sm.common;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class E4SMPropertySource extends PropertySource {

	public E4SMPropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
			      return new E4SMPropertyDescriptor(object, itemPropertyDescriptor);
			}

}
