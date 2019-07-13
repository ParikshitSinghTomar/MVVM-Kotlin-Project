package bdt.docdoc.repo.local.sharedpref;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefHelper_Factory implements Factory<SharedPrefHelper> {
  private static final SharedPrefHelper_Factory INSTANCE = new SharedPrefHelper_Factory();

  @Override
  public SharedPrefHelper get() {
    return new SharedPrefHelper();
  }

  public static Factory<SharedPrefHelper> create() {
    return INSTANCE;
  }
}
