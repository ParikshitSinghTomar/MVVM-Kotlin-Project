package bdt.docdoc.repo.local.storage;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0017\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lbdt/docdoc/repo/local/storage/StorageHelper;", "Lbdt/docdoc/repo/local/storage/IStorageHelper;", "Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "loadFromAssets", "", "jsonFileName", "login", "Lbdt/docdoc/repo/remote/model/response/UserBaseResponse;", "userRequest", "Lbdt/docdoc/repo/remote/model/request/UserRequest;", "register", "Lbdt/docdoc/repo/remote/model/response/UserRegistrationResponse;", "request", "Lbdt/docdoc/repo/remote/model/request/UserRegistrationRequest;", "app_debug"})
public final class StorageHelper implements bdt.docdoc.repo.local.storage.IStorageHelper, bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public bdt.docdoc.repo.remote.model.response.UserBaseResponse login(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRequest userRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public bdt.docdoc.repo.remote.model.response.UserRegistrationResponse register(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRegistrationRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadFromAssets(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonFileName) {
        return null;
    }
    
    @javax.inject.Inject()
    public StorageHelper() {
        super();
    }
}