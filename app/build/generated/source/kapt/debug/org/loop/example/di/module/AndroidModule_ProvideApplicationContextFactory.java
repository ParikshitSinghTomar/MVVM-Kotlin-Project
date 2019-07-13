package org.loop.example.di.module;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideApplicationContextFactory implements Factory<Context> {
  private final AndroidModule module;

  private final Provider<Application> applicationProvider;

  public AndroidModule_ProvideApplicationContextFactory(
      AndroidModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideApplicationContext(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(
      AndroidModule module, Provider<Application> applicationProvider) {
    return new AndroidModule_ProvideApplicationContextFactory(module, applicationProvider);
  }
}
