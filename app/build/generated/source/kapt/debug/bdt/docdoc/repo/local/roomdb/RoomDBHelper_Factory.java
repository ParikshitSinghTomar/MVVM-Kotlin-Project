package bdt.docdoc.repo.local.roomdb;

import bdt.docdoc.repo.local.roomdb.entity.AppDatabase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RoomDBHelper_Factory implements Factory<RoomDBHelper> {
  private final Provider<AppDatabase> mAppDatabaseProvider;

  public RoomDBHelper_Factory(Provider<AppDatabase> mAppDatabaseProvider) {
    this.mAppDatabaseProvider = mAppDatabaseProvider;
  }

  @Override
  public RoomDBHelper get() {
    return new RoomDBHelper(mAppDatabaseProvider.get());
  }

  public static Factory<RoomDBHelper> create(Provider<AppDatabase> mAppDatabaseProvider) {
    return new RoomDBHelper_Factory(mAppDatabaseProvider);
  }
}
