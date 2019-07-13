package bdt.docdoc.ui.registration;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegistrationActivityModule_ProvideRegistrationViewModelFactory
    implements Factory<RegistrationViewModel> {
  private final RegistrationActivityModule module;

  private final Provider<IDataManager> iDataManagerProvider;

  public RegistrationActivityModule_ProvideRegistrationViewModelFactory(
      RegistrationActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    this.module = module;
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public RegistrationViewModel get() {
    return Preconditions.checkNotNull(
        module.provideRegistrationViewModel(iDataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RegistrationViewModel> create(
      RegistrationActivityModule module, Provider<IDataManager> iDataManagerProvider) {
    return new RegistrationActivityModule_ProvideRegistrationViewModelFactory(
        module, iDataManagerProvider);
  }
}
