package abcd.xy.metamodel.abcd.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

public class ABCDAdapterFactoryContentProvider extends AdapterFactoryContentProvider
{

	public ABCDAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected IPropertySource createPropertySource(Object object,
			 IItemPropertySource itemPropertySource) {
			            return new ABCDPropertySource(object, itemPropertySource);
			}

}
