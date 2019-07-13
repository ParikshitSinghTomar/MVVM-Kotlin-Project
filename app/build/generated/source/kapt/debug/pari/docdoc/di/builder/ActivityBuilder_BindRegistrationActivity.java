package pari.docdoc.di.builder;

import android.app.Activity;
import bdt.docdoc.ui.registration.RegistrationActivity;
import bdt.docdoc.ui.registration.RegistrationActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindRegistrationActivity {
  private ActivityBuilder_BindRegistrationActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(RegistrationActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      RegistrationActivitySubcomponent.Builder builder);

  @Subcomponent(modules = RegistrationActivityModule.class)
  public interface RegistrationActivitySubcomponent extends AndroidInjector<RegistrationActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegistrationActivity> {}
  }
}
