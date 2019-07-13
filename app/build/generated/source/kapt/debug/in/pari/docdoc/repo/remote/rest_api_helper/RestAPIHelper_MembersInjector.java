package in.pari.docdoc.repo.remote.rest_api_helper;

import dagger.MembersInjector;
import in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestAPIHelper_MembersInjector implements MembersInjector<RestAPIHelper> {
  private final Provider<RetrofitService> retrofitServiceProvider;

  public RestAPIHelper_MembersInjector(Provider<RetrofitService> retrofitServiceProvider) {
    this.retrofitServiceProvider = retrofitServiceProvider;
  }

  public static MembersInjector<RestAPIHelper> create(
      Provider<RetrofitService> retrofitServiceProvider) {
    return new RestAPIHelper_MembersInjector(retrofitServiceProvider);
  }

  @Override
  public void injectMembers(RestAPIHelper instance) {
    injectRetrofitService(instance, retrofitServiceProvider.get());
  }

  public static void injectRetrofitService(
      RestAPIHelper instance, RetrofitService retrofitService) {
    instance.retrofitService = retrofitService;
  }
}
