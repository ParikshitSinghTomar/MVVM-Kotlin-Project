package org.loop.example.di.module;

import android.location.LocationManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideLocationManagerFactory implements Factory<LocationManager> {
  private final AndroidModule module;

  public AndroidModule_ProvideLocationManagerFactory(AndroidModule module) {
    this.module = module;
  }

  @Override
  public LocationManager get() {
    return Preconditions.checkNotNull(
        module.provideLocationManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LocationManager> create(AndroidModule module) {
    return new AndroidModule_ProvideLocationManagerFactory(module);
  }
}
