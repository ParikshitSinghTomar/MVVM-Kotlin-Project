package bdt.docdoc.repo.local.room_db.entity;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@android.arch.persistence.room.Entity(tableName = "user")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lbdt/docdoc/repo/local/room_db/entity/User;", "", "id", "", "firstname", "", "lastname", "email", "password", "secondryPhoneNo", "primaryPhoneNo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstname", "setFirstname", "getId", "()I", "setId", "(I)V", "getLastname", "setLastname", "getPassword", "setPassword", "getPrimaryPhoneNo", "setPrimaryPhoneNo", "getSecondryPhoneNo", "setSecondryPhoneNo", "app_debug"})
public final class User {
    @android.arch.persistence.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "firstname")
    private java.lang.String firstname;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "lastname")
    private java.lang.String lastname;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "password")
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "secondryPhoneNo")
    private java.lang.String secondryPhoneNo;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "primaryPhoneNo")
    private java.lang.String primaryPhoneNo;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstname() {
        return null;
    }
    
    public final void setFirstname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastname() {
        return null;
    }
    
    public final void setLastname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecondryPhoneNo() {
        return null;
    }
    
    public final void setSecondryPhoneNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrimaryPhoneNo() {
        return null;
    }
    
    public final void setPrimaryPhoneNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public User(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String firstname, @org.jetbrains.annotations.NotNull()
    java.lang.String lastname, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String secondryPhoneNo, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryPhoneNo) {
        super();
    }
}