package bdt.docdoc.repo.remote.model.request;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbdt/docdoc/repo/remote/model/request/UserRequest;", "Lbdt/docdoc/repo/remote/model/base/BaseRequest;", "()V", "email", "", "mobileNo", "password", "username", "getEmail", "getMobileNo", "getPassword", "getUsername", "setEmail", "", "setMobileNo", "setPassword", "setUsername", "toString", "app_debug"})
public final class UserRequest extends bdt.docdoc.repo.remote.model.base.BaseRequest {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "username")
    private java.lang.String username;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "password")
    private java.lang.String password;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email")
    private java.lang.String email;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "mobileNo")
    private java.lang.String mobileNo;
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "username")
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "username")
    public final java.lang.String getUsername() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "password")
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "password")
    public final java.lang.String getPassword() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email")
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email")
    public final java.lang.String getEmail() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "mobileNo")
    public final void setMobileNo(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "mobileNo")
    public final java.lang.String getMobileNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserRequest() {
        super();
    }
}