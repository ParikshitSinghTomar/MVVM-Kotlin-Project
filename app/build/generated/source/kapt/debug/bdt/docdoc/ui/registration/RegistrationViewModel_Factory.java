package bdt.docdoc.ui.registration;

import bdt.docdoc.repo.IDataManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegistrationViewModel_Factory implements Factory<RegistrationViewModel> {
  private final Provider<IDataManager> iDataManagerProvider;

  public RegistrationViewModel_Factory(Provider<IDataManager> iDataManagerProvider) {
    this.iDataManagerProvider = iDataManagerProvider;
  }

  @Override
  public RegistrationViewModel get() {
    return new RegistrationViewModel(iDataManagerProvider.get());
  }

  public static Factory<RegistrationViewModel> create(Provider<IDataManager> iDataManagerProvider) {
    return new RegistrationViewModel_Factory(iDataManagerProvider);
  }
}
