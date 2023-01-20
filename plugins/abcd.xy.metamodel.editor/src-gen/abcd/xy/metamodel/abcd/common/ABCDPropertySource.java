package abcd.xy.metamodel.abcd.common;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class ABCDPropertySource extends PropertySource {

	public ABCDPropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
			      return new ABCDPropertyDescriptor(object, itemPropertyDescriptor);
			}

}
