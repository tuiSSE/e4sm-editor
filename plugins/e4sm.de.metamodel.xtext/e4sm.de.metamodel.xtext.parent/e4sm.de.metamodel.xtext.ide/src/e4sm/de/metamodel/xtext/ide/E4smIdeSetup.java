/*
 * generated by Xtext 2.30.0
 */
package e4sm.de.metamodel.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import e4sm.de.metamodel.xtext.E4smRuntimeModule;
import e4sm.de.metamodel.xtext.E4smStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class E4smIdeSetup extends E4smStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new E4smRuntimeModule(), new E4smIdeModule()));
	}
	
}
