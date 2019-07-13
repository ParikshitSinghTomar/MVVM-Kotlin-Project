package bdt.docdoc.ui.login;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<IDataManager> iDataManagerProvider;

  public LoginViewModel_Factory(Provider<IDataManager> iDataManagerProvider) {
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public LoginViewModel get() {
    return new LoginViewModel(iDataManagerProvider.get());
  }

  public static Factory<LoginViewModel> create(Provider<IDataManager> iDataManagerProvider) {
    return new LoginViewModel_Factory(iDataManagerProvider);
  }
}
