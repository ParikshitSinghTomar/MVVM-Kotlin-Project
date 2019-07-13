package org.loop.example.di.module;

import bdt.docdoc.repo.local.room_db.IRoomDBHelper;
import bdt.docdoc.repo.local.roomdb.RoomDBHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideDBHelperFactory implements Factory<IRoomDBHelper> {
  private final AndroidModule module;

  private final Provider<RoomDBHelper> dbHelperProvider;

  public AndroidModule_ProvideDBHelperFactory(
      AndroidModule module, Provider<RoomDBHelper> dbHelperProvider) {
    this.module = module;
    this.dbHelperProvider = dbHelperProvider;
  }

  @Override
  public IRoomDBHelper get() {
    return Preconditions.checkNotNull(
        module.provideDBHelper(dbHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IRoomDBHelper> create(
      AndroidModule module, Provider<RoomDBHelper> dbHelperProvider) {
    return new AndroidModule_ProvideDBHelperFactory(module, dbHelperProvider);
  }
}
