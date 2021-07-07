package e4sm.de.metamodel.e4sm.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

public class E4SMAdapterFactoryContentProvider extends AdapterFactoryContentProvider
{

	public E4SMAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected IPropertySource createPropertySource(Object object,
			 IItemPropertySource itemPropertySource) {
			            return new E4SMPropertySource(object, itemPropertySource);
			}

}
