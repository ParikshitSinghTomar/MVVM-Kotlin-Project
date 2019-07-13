package bdt.docdoc.ui.splash;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<IDataManager> iDataManagerProvider;

  public SplashViewModel_Factory(Provider<IDataManager> iDataManagerProvider) {
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public SplashViewModel get() {
    return new SplashViewModel(iDataManagerProvider.get());
  }

  public static Factory<SplashViewModel> create(Provider<IDataManager> iDataManagerProvider) {
    return new SplashViewModel_Factory(iDataManagerProvider);
  }
}
