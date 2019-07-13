package org.loop.example.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final AndroidModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AndroidModule_ProvideRetrofitFactory(
      AndroidModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      AndroidModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new AndroidModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }
}
