package org.loop.example.di.module;

import bdt.docdoc.repo.DataManager;
import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideDataManagerFactory implements Factory<IDataManager> {
  private final AndroidModule module;

  private final Provider<DataManager> dataManagerProvider;

  public AndroidModule_ProvideDataManagerFactory(
      AndroidModule module, Provider<DataManager> dataManagerProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public IDataManager get() {
    return Preconditions.checkNotNull(
        module.provideDataManager(dataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IDataManager> create(
      AndroidModule module, Provider<DataManager> dataManagerProvider) {
    return new AndroidModule_ProvideDataManagerFactory(module, dataManagerProvider);
  }
}
