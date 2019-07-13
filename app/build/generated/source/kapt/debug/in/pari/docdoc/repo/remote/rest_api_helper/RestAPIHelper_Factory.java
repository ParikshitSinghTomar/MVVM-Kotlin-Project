package in.pari.docdoc.repo.remote.rest_api_helper;

import dagger.internal.Factory;
import in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestAPIHelper_Factory implements Factory<RestAPIHelper> {
  private final Provider<RetrofitService> retrofitServiceProvider;

  public RestAPIHelper_Factory(Provider<RetrofitService> retrofitServiceProvider) {
    this.retrofitServiceProvider = retrofitServiceProvider;
  }

  @Override
  public RestAPIHelper get() {
    RestAPIHelper instance = new RestAPIHelper();
    RestAPIHelper_MembersInjector.injectRetrofitService(instance, retrofitServiceProvider.get());
    return instance;
  }

  public static Factory<RestAPIHelper> create(Provider<RetrofitService> retrofitServiceProvider) {
    return new RestAPIHelper_Factory(retrofitServiceProvider);
  }

  public static RestAPIHelper newRestAPIHelper() {
    return new RestAPIHelper();
  }
}
