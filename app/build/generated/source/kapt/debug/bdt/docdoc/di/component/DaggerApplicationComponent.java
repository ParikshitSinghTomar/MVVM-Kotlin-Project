package bdt.docdoc.di.component;

import android.app.Activity;
import android.location.LocationManager;
import bdt.docdoc.MyApplication;
import bdt.docdoc.MyApplication_MembersInjector;
import bdt.docdoc.repo.DataManager;
import bdt.docdoc.repo.DataManager_Factory;
import bdt.docdoc.repo.IDataManager;
import bdt.docdoc.repo.local.room_db.IRoomDBHelper;
import bdt.docdoc.repo.local.roomdb.RoomDBHelper;
import bdt.docdoc.repo.local.roomdb.RoomDBHelper_Factory;
import bdt.docdoc.repo.local.roomdb.entity.AppDatabase;
import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper;
import bdt.docdoc.repo.local.sharedpref.SharedPrefHelper_Factory;
import bdt.docdoc.repo.local.storage.IStorageHelper;
import bdt.docdoc.repo.local.storage.StorageHelper_Factory;
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper;
import bdt.docdoc.ui.login.LoginActivity;
import bdt.docdoc.ui.login.LoginActivityModule;
import bdt.docdoc.ui.login.LoginActivity_MembersInjector;
import bdt.docdoc.ui.registration.RegistrationActivity;
import bdt.docdoc.ui.registration.RegistrationActivityModule;
import bdt.docdoc.ui.registration.RegistrationActivity_MembersInjector;
import bdt.docdoc.ui.splash.SplashActivity;
import bdt.docdoc.ui.splash.SplashActivityModule;
import bdt.docdoc.ui.splash.SplashActivity_MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import in.pari.docdoc.repo.remote.rest_api_helper.RestAPIHelper;
import in.pari.docdoc.repo.remote.rest_api_helper.RestAPIHelper_Factory;
import in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import org.loop.example.di.module.AndroidModule;
import org.loop.example.di.module.AndroidModule_ProvideAppDatabaseFactory;
import org.loop.example.di.module.AndroidModule_ProvideDBHelperFactory;
import org.loop.example.di.module.AndroidModule_ProvideDataManagerFactory;
import org.loop.example.di.module.AndroidModule_ProvideLocationManagerFactory;
import org.loop.example.di.module.AndroidModule_ProvideOkHttpClientFactory;
import org.loop.example.di.module.AndroidModule_ProvideRestAPIHelperFactory;
import org.loop.example.di.module.AndroidModule_ProvideRetrofitFactory;
import org.loop.example.di.module.AndroidModule_ProvideRetrofitServiceFactory;
import org.loop.example.di.module.AndroidModule_ProvideSharedPrefHelperFactory;
import org.loop.example.di.module.AndroidModule_ProvideStorageHelperFactory;
import pari.docdoc.di.builder.ActivityBuilder_BindLoginActivity;
import pari.docdoc.di.builder.ActivityBuilder_BindRegistrationActivity;
import pari.docdoc.di.builder.ActivityBuilder_BindSplashActivity;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder>
      splashActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent.Builder>
      registrationActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<LocationManager> provideLocationManagerProvider;

  private Provider<AppDatabase> provideAppDatabaseProvider;

  private Provider<RoomDBHelper> roomDBHelperProvider;

  private Provider<IRoomDBHelper> provideDBHelperProvider;

  private Provider<IStorageHelper> provideStorageHelperProvider;

  private Provider<ISharedPrefHelper> provideSharedPrefHelperProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<RetrofitService> provideRetrofitServiceProvider;

  private Provider<RestAPIHelper> restAPIHelperProvider;

  private Provider<IRestAPIHelper> provideRestAPIHelperProvider;

  private Provider<DataManager> dataManagerProvider;

  private Provider<IDataManager> provideDataManagerProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.splashActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder get() {
            return new SplashActivitySubcomponentBuilder();
          }
        };
    this.registrationActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent.Builder
              get() {
            return new RegistrationActivitySubcomponentBuilder();
          }
        };
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.provideLocationManagerProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideLocationManagerFactory.create(builder.androidModule));
    this.provideAppDatabaseProvider =
        AndroidModule_ProvideAppDatabaseFactory.create(builder.androidModule);
    this.roomDBHelperProvider =
        DoubleCheck.provider(RoomDBHelper_Factory.create(provideAppDatabaseProvider));
    this.provideDBHelperProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideDBHelperFactory.create(
                builder.androidModule, roomDBHelperProvider));
    this.provideStorageHelperProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideStorageHelperFactory.create(
                builder.androidModule, StorageHelper_Factory.create()));
    this.provideSharedPrefHelperProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideSharedPrefHelperFactory.create(
                builder.androidModule, SharedPrefHelper_Factory.create()));
    this.provideOkHttpClientProvider =
        AndroidModule_ProvideOkHttpClientFactory.create(builder.androidModule);
    this.provideRetrofitProvider =
        AndroidModule_ProvideRetrofitFactory.create(
            builder.androidModule, provideOkHttpClientProvider);
    this.provideRetrofitServiceProvider =
        AndroidModule_ProvideRetrofitServiceFactory.create(
            builder.androidModule, provideRetrofitProvider);
    this.restAPIHelperProvider = RestAPIHelper_Factory.create(provideRetrofitServiceProvider);
    this.provideRestAPIHelperProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideRestAPIHelperFactory.create(
                builder.androidModule, restAPIHelperProvider, StorageHelper_Factory.create()));
    this.dataManagerProvider =
        DataManager_Factory.create(
            provideDBHelperProvider,
            provideStorageHelperProvider,
            provideSharedPrefHelperProvider,
            provideRestAPIHelperProvider);
    this.provideDataManagerProvider =
        DoubleCheck.provider(
            AndroidModule_ProvideDataManagerFactory.create(
                builder.androidModule, dataManagerProvider));
  }

  @Override
  public void inject(MyApplication application) {
    injectMyApplication(application);
  }

  private MyApplication injectMyApplication(MyApplication instance) {
    MyApplication_MembersInjector.injectActivityDispatchingAndroidInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            MapBuilder
                .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
                    newMapBuilder(3)
                .put(SplashActivity.class, (Provider) splashActivitySubcomponentBuilderProvider)
                .put(
                    RegistrationActivity.class,
                    (Provider) registrationActivitySubcomponentBuilderProvider)
                .put(LoginActivity.class, (Provider) loginActivitySubcomponentBuilderProvider)
                .build()));
    MyApplication_MembersInjector.injectLocationManager(
        instance, provideLocationManagerProvider.get());
    return instance;
  }

  public static final class Builder {
    private AndroidModule androidModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (androidModule == null) {
        throw new IllegalStateException(AndroidModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder androidModule(AndroidModule androidModule) {
      this.androidModule = Preconditions.checkNotNull(androidModule);
      return this;
    }
  }

  private final class SplashActivitySubcomponentBuilder
      extends ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder {
    private SplashActivityModule splashActivityModule;

    private SplashActivity seedInstance;

    @Override
    public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent build() {
      if (splashActivityModule == null) {
        this.splashActivityModule = new SplashActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(SplashActivity.class.getCanonicalName() + " must be set");
      }
      return new SplashActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SplashActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SplashActivitySubcomponentImpl
      implements ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent {
    private SplashActivityModule splashActivityModule;

    private SplashActivitySubcomponentImpl(SplashActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SplashActivitySubcomponentBuilder builder) {
      this.splashActivityModule = builder.splashActivityModule;
    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
    }

    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectMSplashViewModel(
          instance,
          Preconditions.checkNotNull(
              splashActivityModule.provideSplashViewModel(
                  DaggerApplicationComponent.this.provideDataManagerProvider.get()),
              "Cannot return null from a non-@Nullable @Provides method"));
      return instance;
    }
  }

  private final class RegistrationActivitySubcomponentBuilder
      extends ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent.Builder {
    private RegistrationActivityModule registrationActivityModule;

    private RegistrationActivity seedInstance;

    @Override
    public ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent build() {
      if (registrationActivityModule == null) {
        this.registrationActivityModule = new RegistrationActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            RegistrationActivity.class.getCanonicalName() + " must be set");
      }
      return new RegistrationActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(RegistrationActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class RegistrationActivitySubcomponentImpl
      implements ActivityBuilder_BindRegistrationActivity.RegistrationActivitySubcomponent {
    private RegistrationActivityModule registrationActivityModule;

    private RegistrationActivitySubcomponentImpl(RegistrationActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final RegistrationActivitySubcomponentBuilder builder) {
      this.registrationActivityModule = builder.registrationActivityModule;
    }

    @Override
    public void inject(RegistrationActivity arg0) {
      injectRegistrationActivity(arg0);
    }

    private RegistrationActivity injectRegistrationActivity(RegistrationActivity instance) {
      RegistrationActivity_MembersInjector.injectMRegistrationViewModel(
          instance,
          Preconditions.checkNotNull(
              registrationActivityModule.provideRegistrationViewModel(
                  DaggerApplicationComponent.this.provideDataManagerProvider.get()),
              "Cannot return null from a non-@Nullable @Provides method"));
      return instance;
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivityModule loginActivityModule;

    private LoginActivity seedInstance;

    @Override
    public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent build() {
      if (loginActivityModule == null) {
        this.loginActivityModule = new LoginActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent {
    private LoginActivityModule loginActivityModule;

    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActivitySubcomponentBuilder builder) {
      this.loginActivityModule = builder.loginActivityModule;
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectMLoginViewModel(
          instance,
          Preconditions.checkNotNull(
              loginActivityModule.provideRegistrationViewModel(
                  DaggerApplicationComponent.this.provideDataManagerProvider.get()),
              "Cannot return null from a non-@Nullable @Provides method"));
      return instance;
    }
  }
}
