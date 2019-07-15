package bdt.docdoc.repo.local.roomdb.entity;

import java.lang.System;

/**
 * Created by parikshit on 27/6/19.
 */
@android.arch.persistence.room.Database(version = 1, entities = {bdt.docdoc.repo.local.room_db.entity.User.class, bdt.docdoc.repo.local.roomdb.entity.Patient.class})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "getPatientDao", "Lbdt/docdoc/repo/local/roomdb/dao/PatientDao;", "getUserDao", "Lbdt/docdoc/repo/local/room_db/dao/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static volatile bdt.docdoc.repo.local.roomdb.entity.AppDatabase INSTANCE;
    public static final bdt.docdoc.repo.local.roomdb.entity.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.local.room_db.dao.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.local.roomdb.dao.PatientDao getPatientDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final bdt.docdoc.repo.local.roomdb.entity.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}