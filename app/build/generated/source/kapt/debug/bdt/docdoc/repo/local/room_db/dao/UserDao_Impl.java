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
import java.util.ArrayList;
import java.util.List;
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
        return "INSERT OR ABORT INTO `user`(`id`,`firstname`,`lastname`,`email`,`password`,`secondryPhoneNo`,`primaryPhoneNo`) VALUES (?,?,?,?,?,?,?)";
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

  @Override
  public List<User> findUser2() {
    final String _sql = "SELECT * FROM User";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfFirstname = _cursor.getColumnIndexOrThrow("firstname");
      final int _cursorIndexOfLastname = _cursor.getColumnIndexOrThrow("lastname");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final int _cursorIndexOfSecondryPhoneNo = _cursor.getColumnIndexOrThrow("secondryPhoneNo");
      final int _cursorIndexOfPrimaryPhoneNo = _cursor.getColumnIndexOrThrow("primaryPhoneNo");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpFirstname;
        _tmpFirstname = _cursor.getString(_cursorIndexOfFirstname);
        final String _tmpLastname;
        _tmpLastname = _cursor.getString(_cursorIndexOfLastname);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        final String _tmpSecondryPhoneNo;
        _tmpSecondryPhoneNo = _cursor.getString(_cursorIndexOfSecondryPhoneNo);
        final String _tmpPrimaryPhoneNo;
        _tmpPrimaryPhoneNo = _cursor.getString(_cursorIndexOfPrimaryPhoneNo);
        _item = new User(_tmpId,_tmpFirstname,_tmpLastname,_tmpEmail,_tmpPassword,_tmpSecondryPhoneNo,_tmpPrimaryPhoneNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
