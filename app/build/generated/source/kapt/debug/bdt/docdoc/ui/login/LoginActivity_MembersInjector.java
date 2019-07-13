package bdt.docdoc.ui.login;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginViewModel> mLoginViewModelProvider;

  public LoginActivity_MembersInjector(Provider<LoginViewModel> mLoginViewModelProvider) {
    this.mLoginViewModelProvider = mLoginViewModelProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginViewModel> mLoginViewModelProvider) {
    return new LoginActivity_MembersInjector(mLoginViewModelProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectMLoginViewModel(instance, mLoginViewModelProvider.get());
  }

  public static void injectMLoginViewModel(LoginActivity instance, LoginViewModel mLoginViewModel) {
    instance.mLoginViewModel = mLoginViewModel;
  }
}
