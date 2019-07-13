package bdt.docdoc.ui.registration;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegistrationActivity_MembersInjector
    implements MembersInjector<RegistrationActivity> {
  private final Provider<RegistrationViewModel> mRegistrationViewModelProvider;

  public RegistrationActivity_MembersInjector(
      Provider<RegistrationViewModel> mRegistrationViewModelProvider) {
    this.mRegistrationViewModelProvider = mRegistrationViewModelProvider;
  }

  public static MembersInjector<RegistrationActivity> create(
      Provider<RegistrationViewModel> mRegistrationViewModelProvider) {
    return new RegistrationActivity_MembersInjector(mRegistrationViewModelProvider);
  }

  @Override
  public void injectMembers(RegistrationActivity instance) {
    injectMRegistrationViewModel(instance, mRegistrationViewModelProvider.get());
  }

  public static void injectMRegistrationViewModel(
      RegistrationActivity instance, RegistrationViewModel mRegistrationViewModel) {
    instance.mRegistrationViewModel = mRegistrationViewModel;
  }
}
