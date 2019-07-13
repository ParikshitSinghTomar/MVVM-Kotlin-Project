package bdt.docdoc.repo.remote.model.response;

import java.lang.System;

/**
 * Created by parikshit on 12/7/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lbdt/docdoc/repo/remote/model/response/UserResponse;", "", "()V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "id", "", "getId", "()I", "setId", "(I)V", "lastName", "getLastName", "setLastName", "password", "getPassword", "setPassword", "primaryPhoneNo", "getPrimaryPhoneNo", "setPrimaryPhoneNo", "secondryPhoneNo", "getSecondryPhoneNo", "setSecondryPhoneNo", "toString", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public final class UserResponse {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "firstName")
    private java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lastName")
    private java.lang.String lastName;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "password")
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "primaryPhoneNo")
    private java.lang.String primaryPhoneNo;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "secondryPhoneNo")
    private java.lang.String secondryPhoneNo;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getPrimaryPhoneNo() {
        return null;
    }
    
    public final void setPrimaryPhoneNo(@org.jetbrains.annotations.NotNull()
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
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserResponse() {
        super();
    }
}