package org.loop.example.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideRetrofitServiceFactory implements Factory<RetrofitService> {
  private final AndroidModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AndroidModule_ProvideRetrofitServiceFactory(
      AndroidModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RetrofitService get() {
    return Preconditions.checkNotNull(
        module.provideRetrofitService(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RetrofitService> create(
      AndroidModule module, Provider<Retrofit> retrofitProvider) {
    return new AndroidModule_ProvideRetrofitServiceFactory(module, retrofitProvider);
  }
}
