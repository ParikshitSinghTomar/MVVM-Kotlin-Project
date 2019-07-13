package org.loop.example.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AndroidModule module;

  public AndroidModule_ProvideOkHttpClientFactory(AndroidModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(AndroidModule module) {
    return new AndroidModule_ProvideOkHttpClientFactory(module);
  }
}
