package bdt.docdoc.repo.local.room_db.dao;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lbdt/docdoc/repo/local/room_db/dao/UserDao;", "", "findUser", "", "id", "findUser2", "", "Lbdt/docdoc/repo/local/room_db/entity/User;", "insert", "", "user", "app_debug"})
public abstract interface UserDao {
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.entity.User user);
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM User where id=:id")
    public abstract int findUser(int id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM User")
    public abstract java.util.List<bdt.docdoc.repo.local.room_db.entity.User> findUser2();
}