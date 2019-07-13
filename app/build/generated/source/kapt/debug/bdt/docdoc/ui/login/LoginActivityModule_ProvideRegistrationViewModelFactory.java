package bdt.docdoc.ui.login;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivityModule_ProvideRegistrationViewModelFactory
    implements Factory<LoginViewModel> {
  private final LoginActivityModule module;

  private final Provider<IDataManager> iDataManagerProvider;

  public LoginActivityModule_ProvideRegistrationViewModelFactory(
      LoginActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    this.module = module;
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public LoginViewModel get() {
    return Preconditions.checkNotNull(
        module.provideRegistrationViewModel(iDataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginViewModel> create(
      LoginActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    return new LoginActivityModule_ProvideRegistrationViewModelFactory(
        module, iDataManagerProvider);
  }
}
