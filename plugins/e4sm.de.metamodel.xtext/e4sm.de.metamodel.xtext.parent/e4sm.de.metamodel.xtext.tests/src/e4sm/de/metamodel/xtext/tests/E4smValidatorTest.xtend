package e4sm.de.metamodel.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import e4sm.de.metamodel.e4sm.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import static org.junit.Assert.assertTrue

@RunWith(XtextRunner)
@InjectWith(E4smInjectorProvider)
class E4smValidatorTest {
	// TODO
	
	@Inject	extension ParseHelper<Model> parseHelper
	@Inject extension ValidationTestHelper
	
	@Test
	def void testSomething(){
		assertTrue(true);
	}
}