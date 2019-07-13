package bdt.docdoc.ui.splash;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SplashViewModel> mSplashViewModelProvider;

  public SplashActivity_MembersInjector(Provider<SplashViewModel> mSplashViewModelProvider) {
    this.mSplashViewModelProvider = mSplashViewModelProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SplashViewModel> mSplashViewModelProvider) {
    return new SplashActivity_MembersInjector(mSplashViewModelProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectMSplashViewModel(instance, mSplashViewModelProvider.get());
  }

  public static void injectMSplashViewModel(
      SplashActivity instance, SplashViewModel mSplashViewModel) {
    instance.mSplashViewModel = mSplashViewModel;
  }
}
