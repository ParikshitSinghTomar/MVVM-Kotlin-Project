package bdt.docdoc.repo.local.room_db.dao;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lbdt/docdoc/repo/local/room_db/dao/UserDao;", "", "findUser", "", "id", "insert", "", "user", "Lbdt/docdoc/repo/local/room_db/entity/User;", "app_debug"})
public abstract interface UserDao {
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.entity.User user);
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM User where id=:id")
    public abstract int findUser(int id);
}