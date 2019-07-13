package bdt.docdoc;

import android.app.Activity;
import android.location.LocationManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<DispatchingAndroidInjector<Activity>>
      activityDispatchingAndroidInjectorProvider;

  private final Provider<LocationManager> locationManagerProvider;

  public MyApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider,
      Provider<LocationManager> locationManagerProvider) {
    this.activityDispatchingAndroidInjectorProvider = activityDispatchingAndroidInjectorProvider;
    this.locationManagerProvider = locationManagerProvider;
  }

  public static MembersInjector<MyApplication> create(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider,
      Provider<LocationManager> locationManagerProvider) {
    return new MyApplication_MembersInjector(
        activityDispatchingAndroidInjectorProvider, locationManagerProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectActivityDispatchingAndroidInjector(
        instance, activityDispatchingAndroidInjectorProvider.get());
    injectLocationManager(instance, locationManagerProvider.get());
  }

  public static void injectActivityDispatchingAndroidInjector(
      MyApplication instance,
      DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector) {
    instance.activityDispatchingAndroidInjector = activityDispatchingAndroidInjector;
  }

  public static void injectLocationManager(
      MyApplication instance, LocationManager locationManager) {
    instance.locationManager = locationManager;
  }
}
