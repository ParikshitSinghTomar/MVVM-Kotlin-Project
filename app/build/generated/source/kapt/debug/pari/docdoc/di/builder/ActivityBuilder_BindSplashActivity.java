package pari.docdoc.di.builder;

import android.app.Activity;
import bdt.docdoc.ui.splash.SplashActivity;
import bdt.docdoc.ui.splash.SplashActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.class)
public abstract class ActivityBuilder_BindSplashActivity {
  private ActivityBuilder_BindSplashActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SplashActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SplashActivityModule.class)
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity> {}
  }
}
