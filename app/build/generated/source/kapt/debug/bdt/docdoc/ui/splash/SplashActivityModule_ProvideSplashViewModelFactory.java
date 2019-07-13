package bdt.docdoc.ui.splash;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashActivityModule_ProvideSplashViewModelFactory
    implements Factory<SplashViewModel> {
  private final SplashActivityModule module;

  private final Provider<IDataManager> iDataManagerProvider;

  public SplashActivityModule_ProvideSplashViewModelFactory(
      SplashActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    this.module = module;
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public SplashViewModel get() {
    return Preconditions.checkNotNull(
        module.provideSplashViewModel(iDataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashViewModel> create(
      SplashActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    return new SplashActivityModule_ProvideSplashViewModelFactory(module, iDataManagerProvider);
  }
}
