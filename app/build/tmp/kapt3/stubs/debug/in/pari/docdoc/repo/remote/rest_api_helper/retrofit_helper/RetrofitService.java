package in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lin/pari/docdoc/repo/remote/rest_api_helper/retrofit_helper/RetrofitService;", "", "login", "Lio/reactivex/Single;", "Lbdt/docdoc/repo/remote/model/response/UserBaseResponse;", "url", "", "userRequest", "Lbdt/docdoc/repo/remote/model/request/UserRequest;", "register", "Lbdt/docdoc/repo/remote/model/response/UserRegistrationResponse;", "request", "Lbdt/docdoc/repo/remote/model/request/UserRegistrationRequest;", "app_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST()
    public abstract io.reactivex.Single<bdt.docdoc.repo.remote.model.response.UserBaseResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    bdt.docdoc.repo.remote.model.request.UserRequest userRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST()
    public abstract io.reactivex.Single<bdt.docdoc.repo.remote.model.response.UserRegistrationResponse> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    bdt.docdoc.repo.remote.model.request.UserRegistrationRequest request);
}