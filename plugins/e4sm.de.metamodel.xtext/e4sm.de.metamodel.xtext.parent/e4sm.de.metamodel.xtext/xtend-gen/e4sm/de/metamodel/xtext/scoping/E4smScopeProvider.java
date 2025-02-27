/**
 * generated by Xtext 2.26.0
 */
package e4sm.de.metamodel.xtext.scoping;

import e4sm.de.metamodel.e4sm.DataNode;
import e4sm.de.metamodel.e4sm.Import;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.core.AttributeSpecification;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.TypeSpecification;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.InputPinAttributeReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class E4smScopeProvider extends AbstractE4smScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof InputPinAttributeReference) && 
      Objects.equals(reference, ExecutionPackage.Literals.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE))) {
      final InputPin ip = ((InputPinAttributeReference) context).getInputPin();
      TypeSpecification ts = ip.getType();
      final ArrayList<AttributeSpecification> candidates = new ArrayList<AttributeSpecification>();
      if (((ts != null) && (((Object[])Conversions.unwrapArray(ts.getAttributes(), Object.class)).length > 0))) {
        candidates.addAll(ts.getAttributes());
        while ((ts.getSuperType() != null)) {
          {
            ts = ts.getSuperType();
            candidates.addAll(ts.getAttributes());
          }
        }
      }
      return Scopes.scopeFor(candidates);
    }
    if (((context instanceof TypeSpecification) && Objects.equals(reference, CorePackage.Literals.TYPE_SPECIFICATION__SUPER_TYPE))) {
      EObject _rootContainer = EcoreUtil2.getRootContainer(context);
      final Model rootElement = ((Model) _rootContainer);
      final Function1<TypeSpecification, Boolean> _function = (TypeSpecification it) -> {
        return Boolean.valueOf((!Objects.equals(it, context)));
      };
      final List<TypeSpecification> candidates_1 = IterableExtensions.<TypeSpecification>toList(IterableExtensions.<TypeSpecification>takeWhile(rootElement.getTypes(), _function));
      EList<Import> _imports = rootElement.getImports();
      for (final Import im : _imports) {
        candidates_1.addAll(im.getReferencedModel().getTypes());
      }
      return Scopes.scopeFor(candidates_1);
    }
    if (((context instanceof DataNode) && Objects.equals(reference, CorePackage.Literals.TYPED_ELEMENT__TYPE))) {
      EObject _rootContainer_1 = EcoreUtil2.getRootContainer(context);
      final Model rootElement_1 = ((Model) _rootContainer_1);
      final Function1<TypeSpecification, Boolean> _function_1 = (TypeSpecification it) -> {
        return Boolean.valueOf((!Objects.equals(it, context)));
      };
      List<TypeSpecification> candidates_2 = IterableExtensions.<TypeSpecification>toList(IterableExtensions.<TypeSpecification>takeWhile(rootElement_1.getTypes(), _function_1));
      EList<Import> _imports_1 = rootElement_1.getImports();
      for (final Import im_1 : _imports_1) {
        candidates_2.addAll(im_1.getReferencedModel().getTypes());
      }
      return Scopes.scopeFor(candidates_2);
    }
    return super.getScope(context, reference);
  }
}
