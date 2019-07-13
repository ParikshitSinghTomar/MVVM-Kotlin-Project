package org.loop.example.di.module;

import bdt.docdoc.repo.local.roomdb.entity.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AndroidModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final AndroidModule module;

  public AndroidModule_ProvideAppDatabaseFactory(AndroidModule module) {
    this.module = module;
  }

  @Override
  public AppDatabase get() {
    return Preconditions.checkNotNull(
        module.provideAppDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AppDatabase> create(AndroidModule module) {
    return new AndroidModule_ProvideAppDatabaseFactory(module);
  }
}
