package org.loop.example.di.module;

import bdt.docdoc.repo.local.storage.IStorageHelper;
import bdt.docdoc.repo.local.storage.StorageHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideStorageHelperFactory implements Factory<IStorageHelper> {
  private final AndroidModule module;

  private final Provider<StorageHelper> storageApiHelperProvider;

  public AndroidModule_ProvideStorageHelperFactory(
      AndroidModule module, Provider<StorageHelper> storageApiHelperProvider) {
    this.module = module;
    this.storageApiHelperProvider = storageApiHelperProvider;
  }

  @Override
  public IStorageHelper get() {
    return Preconditions.checkNotNull(
        module.provideStorageHelper(storageApiHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IStorageHelper> create(
      AndroidModule module, Provider<StorageHelper> storageApiHelperProvider) {
    return new AndroidModule_ProvideStorageHelperFactory(module, storageApiHelperProvider);
  }
}
