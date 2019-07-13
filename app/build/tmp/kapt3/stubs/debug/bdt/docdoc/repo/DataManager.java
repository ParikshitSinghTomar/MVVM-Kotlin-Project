package bdt.docdoc.repo;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lbdt/docdoc/repo/DataManager;", "Lbdt/docdoc/repo/IDataManager;", "iRoomDBHelper", "Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;", "iStorageHelper", "Lbdt/docdoc/repo/local/storage/IStorageHelper;", "iSharedPrefHelper", "Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;", "iRestAPIHelper", "Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "(Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;Lbdt/docdoc/repo/local/storage/IStorageHelper;Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;)V", "getIRestAPIHelper", "()Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "setIRestAPIHelper", "(Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;)V", "getIRoomDBHelper", "()Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;", "setIRoomDBHelper", "(Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;)V", "getISharedPrefHelper", "()Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;", "setISharedPrefHelper", "(Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;)V", "getIStorageHelper", "()Lbdt/docdoc/repo/local/storage/IStorageHelper;", "setIStorageHelper", "(Lbdt/docdoc/repo/local/storage/IStorageHelper;)V", "findUser", "", "id", "insertUser", "", "user", "Lbdt/docdoc/repo/local/room_db/entity/User;", "isUserAuthentic", "", "login", "Lbdt/docdoc/repo/remote/model/response/BaseResponse;", "userRequest", "Lbdt/docdoc/repo/remote/model/request/UserRequest;", "app_debug"})
@dagger.Module()
public final class DataManager implements bdt.docdoc.repo.IDataManager {
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.local.room_db.IRoomDBHelper iRoomDBHelper;
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.local.storage.IStorageHelper iStorageHelper;
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper iSharedPrefHelper;
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper iRestAPIHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.local.room_db.IRoomDBHelper getIRoomDBHelper() {
        return null;
    }
    
    public final void setIRoomDBHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.IRoomDBHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.local.storage.IStorageHelper getIStorageHelper() {
        return null;
    }
    
    public final void setIStorageHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.storage.IStorageHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper getISharedPrefHelper() {
        return null;
    }
    
    public final void setISharedPrefHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper getIRestAPIHelper() {
        return null;
    }
    
    public final void setIRestAPIHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper p0) {
    }
    
    @java.lang.Override()
    public boolean isUserAuthentic() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public bdt.docdoc.repo.remote.model.response.BaseResponse login(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRequest userRequest) {
        return null;
    }
    
    @java.lang.Override()
    public void insertUser(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.entity.User user) {
    }
    
    @java.lang.Override()
    public int findUser(int id) {
        return 0;
    }
    
    @javax.inject.Inject()
    public DataManager(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.IRoomDBHelper iRoomDBHelper, @org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.storage.IStorageHelper iStorageHelper, @org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper iSharedPrefHelper, @org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper iRestAPIHelper) {
        super();
    }
}