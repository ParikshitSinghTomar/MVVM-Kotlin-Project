package bdt.docdoc.repo.local.room_db.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import bdt.docdoc.repo.local.room_db.entity.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user`(`id`,`firstname`,`lastname`,`email`,`password`,`secondryPhoneNo`,`primaryPhoneNo`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstname());
        }
        if (value.getLastname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        if (value.getSecondryPhoneNo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSecondryPhoneNo());
        }
        if (value.getPrimaryPhoneNo() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPrimaryPhoneNo());
        }
      }
    };
  }

  @Override
  public void insert(User user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int findUser(int id) {
    final String _sql = "SELECT COUNT(*) FROM User where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
