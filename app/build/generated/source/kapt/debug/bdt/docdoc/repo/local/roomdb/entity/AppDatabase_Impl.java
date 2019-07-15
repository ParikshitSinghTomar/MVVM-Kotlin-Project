package bdt.docdoc.repo.local.roomdb.entity;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import bdt.docdoc.repo.local.room_db.dao.UserDao;
import bdt.docdoc.repo.local.room_db.dao.UserDao_Impl;
import bdt.docdoc.repo.local.roomdb.dao.PatientDao;
import bdt.docdoc.repo.local.roomdb.dao.PatientDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile UserDao _userDao;

  private volatile PatientDao _patientDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` INTEGER NOT NULL, `firstname` TEXT NOT NULL, `lastname` TEXT NOT NULL, `email` TEXT NOT NULL, `password` TEXT NOT NULL, `secondryPhoneNo` TEXT NOT NULL, `primaryPhoneNo` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `patient` (`visit_id` INTEGER NOT NULL, `patient_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `address` TEXT NOT NULL, `email` TEXT NOT NULL, `age` INTEGER NOT NULL, `mobileNo` TEXT NOT NULL, `visit_count` INTEGER NOT NULL, `visit_done` INTEGER NOT NULL, PRIMARY KEY(`visit_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"70bd955501f672f5232c8afeb9da8b54\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        _db.execSQL("DROP TABLE IF EXISTS `patient`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(7);
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsUser.put("firstname", new TableInfo.Column("firstname", "TEXT", true, 0));
        _columnsUser.put("lastname", new TableInfo.Column("lastname", "TEXT", true, 0));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", true, 0));
        _columnsUser.put("password", new TableInfo.Column("password", "TEXT", true, 0));
        _columnsUser.put("secondryPhoneNo", new TableInfo.Column("secondryPhoneNo", "TEXT", true, 0));
        _columnsUser.put("primaryPhoneNo", new TableInfo.Column("primaryPhoneNo", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle user(bdt.docdoc.repo.local.room_db.entity.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsPatient = new HashMap<String, TableInfo.Column>(9);
        _columnsPatient.put("visit_id", new TableInfo.Column("visit_id", "INTEGER", true, 1));
        _columnsPatient.put("patient_id", new TableInfo.Column("patient_id", "INTEGER", true, 0));
        _columnsPatient.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsPatient.put("address", new TableInfo.Column("address", "TEXT", true, 0));
        _columnsPatient.put("email", new TableInfo.Column("email", "TEXT", true, 0));
        _columnsPatient.put("age", new TableInfo.Column("age", "INTEGER", true, 0));
        _columnsPatient.put("mobileNo", new TableInfo.Column("mobileNo", "TEXT", true, 0));
        _columnsPatient.put("visit_count", new TableInfo.Column("visit_count", "INTEGER", true, 0));
        _columnsPatient.put("visit_done", new TableInfo.Column("visit_done", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPatient = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPatient = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPatient = new TableInfo("patient", _columnsPatient, _foreignKeysPatient, _indicesPatient);
        final TableInfo _existingPatient = TableInfo.read(_db, "patient");
        if (! _infoPatient.equals(_existingPatient)) {
          throw new IllegalStateException("Migration didn't properly handle patient(bdt.docdoc.repo.local.roomdb.entity.Patient).\n"
                  + " Expected:\n" + _infoPatient + "\n"
                  + " Found:\n" + _existingPatient);
        }
      }
    }, "70bd955501f672f5232c8afeb9da8b54", "a08bb8c7b616a05015e768d22dbb068f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "user","patient");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user`");
      _db.execSQL("DELETE FROM `patient`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao getUserDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public PatientDao getPatientDao() {
    if (_patientDao != null) {
      return _patientDao;
    } else {
      synchronized(this) {
        if(_patientDao == null) {
          _patientDao = new PatientDao_Impl(this);
        }
        return _patientDao;
      }
    }
  }
}
