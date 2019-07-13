package bdt.docdoc.repo;

import bdt.docdoc.repo.local.room_db.IRoomDBHelper;
import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper;
import bdt.docdoc.repo.local.storage.IStorageHelper;
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManager_Factory implements Factory<DataManager> {
  private final Provider<IRoomDBHelper> iRoomDBHelperProvider;

  private final Provider<IStorageHelper> iStorageHelperProvider;

  private final Provider<ISharedPrefHelper> iSharedPrefHelperProvider;

  private final Provider<IRestAPIHelper> iRestAPIHelperProvider;

  public DataManager_Factory(
      Provider<IRoomDBHelper> iRoomDBHelperProvider,
      Provider<IStorageHelper> iStorageHelperProvider,
      Provider<ISharedPrefHelper> iSharedPrefHelperProvider,
      Provider<IRestAPIHelper> iRestAPIHelperProvider) {
    this.iRoomDBHelperProvider = iRoomDBHelperProvider;
    this.iStorageHelperProvider = iStorageHelperProvider;
    this.iSharedPrefHelperProvider = iSharedPrefHelperProvider;
    this.iRestAPIHelperProvider = iRestAPIHelperProvider;
  }

  @Override
  public DataManager get() {
    return new DataManager(
        iRoomDBHelperProvider.get(),
        iStorageHelperProvider.get(),
        iSharedPrefHelperProvider.get(),
        iRestAPIHelperProvider.get());
  }

  public static Factory<DataManager> create(
      Provider<IRoomDBHelper> iRoomDBHelperProvider,
      Provider<IStorageHelper> iStorageHelperProvider,
      Provider<ISharedPrefHelper> iSharedPrefHelperProvider,
      Provider<IRestAPIHelper> iRestAPIHelperProvider) {
    return new DataManager_Factory(
        iRoomDBHelperProvider,
        iStorageHelperProvider,
        iSharedPrefHelperProvider,
        iRestAPIHelperProvider);
  }
}
