package in.pari.docdoc.repo.remote.rest_api_helper;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0017\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lin/pari/docdoc/repo/remote/rest_api_helper/RestAPIHelper;", "Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "retrofitService", "Lin/pari/docdoc/repo/remote/rest_api_helper/retrofit_helper/RetrofitService;", "getRetrofitService", "()Lin/pari/docdoc/repo/remote/rest_api_helper/retrofit_helper/RetrofitService;", "setRetrofitService", "(Lin/pari/docdoc/repo/remote/rest_api_helper/retrofit_helper/RetrofitService;)V", "login", "Lbdt/docdoc/repo/remote/model/response/UserBaseResponse;", "userRequest", "Lbdt/docdoc/repo/remote/model/request/UserRequest;", "register", "Lbdt/docdoc/repo/remote/model/response/UserRegistrationResponse;", "request", "Lbdt/docdoc/repo/remote/model/request/UserRegistrationRequest;", "app_debug"})
public final class RestAPIHelper implements bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService retrofitService;
    private final java.lang.String TAG = null;
    
    @org.jetbrains.annotations.NotNull()
    public final in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService getRetrofitService() {
        return null;
    }
    
    public final void setRetrofitService(@org.jetbrains.annotations.NotNull()
    in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService p0) {
    }
    
    public final java.lang.String getTAG() {
        return null;
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
    
    @javax.inject.Inject()
    public RestAPIHelper() {
        super();
    }
}