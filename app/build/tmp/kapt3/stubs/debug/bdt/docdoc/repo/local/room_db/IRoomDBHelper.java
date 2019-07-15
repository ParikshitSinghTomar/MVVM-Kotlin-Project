package bdt.docdoc.repo.local.room_db;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&\u00a8\u0006\u000e"}, d2 = {"Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;", "", "findUser", "", "id", "getCurrentUser", "Lbdt/docdoc/repo/local/room_db/entity/User;", "insertUser", "", "user", "savePatient", "patientEntityList", "", "Lbdt/docdoc/repo/local/roomdb/entity/Patient;", "app_debug"})
public abstract interface IRoomDBHelper {
    
    public abstract void insertUser(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.room_db.entity.User user);
    
    public abstract int findUser(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.local.room_db.entity.User getCurrentUser();
    
    public abstract void savePatient(@org.jetbrains.annotations.NotNull()
    java.util.List<bdt.docdoc.repo.local.roomdb.entity.Patient> patientEntityList);
}