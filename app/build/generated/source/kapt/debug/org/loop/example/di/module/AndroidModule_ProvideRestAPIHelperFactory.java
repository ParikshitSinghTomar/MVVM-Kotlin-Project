package org.loop.example.di.module;

import bdt.docdoc.repo.local.storage.StorageHelper;
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import in.pari.docdoc.repo.remote.rest_api_helper.RestAPIHelper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideRestAPIHelperFactory implements Factory<IRestAPIHelper> {
  private final AndroidModule module;

  private final Provider<RestAPIHelper> restApiHelperProvider;

  private final Provider<StorageHelper> storageHelperProvider;

  public AndroidModule_ProvideRestAPIHelperFactory(
      AndroidModule module,
      Provider<RestAPIHelper> restApiHelperProvider,
      Provider<StorageHelper> storageHelperProvider) {
    this.module = module;
    this.restApiHelperProvider = restApiHelperProvider;
    this.storageHelperProvider = storageHelperProvider;
  }

  @Override
  public IRestAPIHelper get() {
    return Preconditions.checkNotNull(
        module.provideRestAPIHelper(restApiHelperProvider.get(), storageHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IRestAPIHelper> create(
      AndroidModule module,
      Provider<RestAPIHelper> restApiHelperProvider,
      Provider<StorageHelper> storageHelperProvider) {
    return new AndroidModule_ProvideRestAPIHelperFactory(
        module, restApiHelperProvider, storageHelperProvider);
  }
}
