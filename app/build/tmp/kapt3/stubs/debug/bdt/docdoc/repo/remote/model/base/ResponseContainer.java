package bdt.docdoc.repo.remote.model.base;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2 = {"Lbdt/docdoc/repo/remote/model/base/ResponseContainer;", "T", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "setData", "(Lorg/json/JSONObject;)V", "errors", "", "getErrors", "()Ljava/lang/String;", "setErrors", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "status", "", "getStatus", "()Z", "setStatus", "(Z)V", "toString", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseContainer<T extends java.lang.Object> {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "status")
    private boolean status;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "code")
    private int code;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "errors")
    private java.lang.String errors;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "data")
    private org.json.JSONObject data;
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponseContainer() {
        super();
    }
}