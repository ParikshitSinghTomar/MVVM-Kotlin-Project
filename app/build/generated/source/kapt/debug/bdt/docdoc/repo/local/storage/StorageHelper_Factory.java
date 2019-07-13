package bdt.docdoc.repo.local.storage;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StorageHelper_Factory implements Factory<StorageHelper> {
  private static final StorageHelper_Factory INSTANCE = new StorageHelper_Factory();

  @Override
  public StorageHelper get() {
    return new StorageHelper();
  }

  public static Factory<StorageHelper> create() {
    return INSTANCE;
  }
}
