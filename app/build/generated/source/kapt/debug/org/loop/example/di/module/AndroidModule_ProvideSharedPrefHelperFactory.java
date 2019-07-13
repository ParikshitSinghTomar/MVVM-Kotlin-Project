package org.loop.example.di.module;

import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper;
import bdt.docdoc.repo.local.sharedpref.SharedPrefHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideSharedPrefHelperFactory
    implements Factory<ISharedPrefHelper> {
  private final AndroidModule module;

  private final Provider<SharedPrefHelper> prefHelperProvider;

  public AndroidModule_ProvideSharedPrefHelperFactory(
      AndroidModule module, Provider<SharedPrefHelper> prefHelperProvider) {
    this.module = module;
    this.prefHelperProvider = prefHelperProvider;
  }

  @Override
  public ISharedPrefHelper get() {
    return Preconditions.checkNotNull(
        module.provideSharedPrefHelper(prefHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ISharedPrefHelper> create(
      AndroidModule module, Provider<SharedPrefHelper> prefHelperProvider) {
    return new AndroidModule_ProvideSharedPrefHelperFactory(module, prefHelperProvider);
  }
}
