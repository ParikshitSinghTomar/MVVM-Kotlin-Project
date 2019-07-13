package bdt.docdoc.repo.remote.model.response;

import java.lang.System;

/**
 * Created by parikshit on 12/7/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2 = {"Lbdt/docdoc/repo/remote/model/response/BaseResponse;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "Lbdt/docdoc/repo/remote/model/response/UserResponse;", "getData", "()Lbdt/docdoc/repo/remote/model/response/UserResponse;", "setData", "(Lbdt/docdoc/repo/remote/model/response/UserResponse;)V", "errors", "", "getErrors", "()Ljava/lang/String;", "setErrors", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "status", "", "getStatus", "()Z", "setStatus", "(Z)V", "toString", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public final class BaseResponse {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "code")
    private int code;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "status")
    private boolean status;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "data")
    private bdt.docdoc.repo.remote.model.response.UserResponse data;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "errors")
    private java.lang.String errors;
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.remote.model.response.UserResponse getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.response.UserResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BaseResponse() {
        super();
    }
}