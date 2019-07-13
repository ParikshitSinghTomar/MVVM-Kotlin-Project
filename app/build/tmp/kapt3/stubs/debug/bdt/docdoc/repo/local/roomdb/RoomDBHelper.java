package bdt.docdoc.repo.local.roomdb;

import java.lang.System;

/**
 * Created by parikshittomar on 01-06-2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lbdt/docdoc/repo/local/roomdb/RoomDBHelper;", "Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;", "mAppDatabase", "Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;", "(Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;)V", "appDatabase", "getAppDatabase", "()Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;", "setAppDatabase", "findUser", "", "id", "insertUser", "", "user", "Lbdt/docdoc/repo/local/room_db/entity/User;", "app_debug"})
@javax.inject.Singleton()
public final class RoomDBHelper implements bdt.docdoc.repo.local.room_db.IRoomDBHelper {
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.local.roomdb.entity.AppDatabase appDatabase;
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.local.roomdb.entity.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.roomdb.entity.AppDatabase p0) {
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
    public RoomDBHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.roomdb.entity.AppDatabase mAppDatabase) {
        super();
    }
}