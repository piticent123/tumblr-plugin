package org.angularjs.index;

import com.intellij.util.indexing.*;
import com.intellij.util.io.DataExternalizer;
import com.intellij.util.io.EnumeratorStringDescriptor;
import com.intellij.util.io.KeyDescriptor;
import org.angularjs.codeInsight.router.AngularJSUiRouterConstants;
import org.jetbrains.annotations.NotNull;

/**
 * @author Irina.Chernushina on 2/11/2016.
 */
public class AngularUiRouterViewsIndex extends FileBasedIndexExtension<String, AngularNamedItemDefinition> {
  public static final ID<String, AngularNamedItemDefinition> UI_ROUTER_VIEWS_CACHE_INDEX = ID.create("angularjs.ui.router.views.index");
  private final AngularAttributeIndexer myIndexer = new AngularAttributeIndexer(AngularJSUiRouterConstants.uiView);

  @NotNull
  @Override
  public ID<String, AngularNamedItemDefinition> getName() {
    return UI_ROUTER_VIEWS_CACHE_INDEX;
  }

  @NotNull
  @Override
  public DataIndexer<String, AngularNamedItemDefinition, FileContent> getIndexer() {
    return myIndexer;
  }

  @NotNull
  @Override
  public KeyDescriptor<String> getKeyDescriptor() {
    return EnumeratorStringDescriptor.INSTANCE;
  }

  @NotNull
  @Override
  public DataExternalizer<AngularNamedItemDefinition> getValueExternalizer() {
    return AngularViewDefinitionExternalizer.INSTANCE;
  }

  @NotNull
  @Override
  public FileBasedIndex.InputFilter getInputFilter() {
    return AngularTemplateIndexInputFilter.INSTANCE;
  }

  @Override
  public boolean dependsOnFileContent() {
    return true;
  }

  @Override
  public int getVersion() {
    return AngularIndexUtil.BASE_VERSION;
  }
}
