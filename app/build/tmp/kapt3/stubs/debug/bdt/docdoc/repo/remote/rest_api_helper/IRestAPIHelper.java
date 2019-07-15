package bdt.docdoc.repo.remote.rest_api_helper;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "", "login", "Lbdt/docdoc/repo/remote/model/response/UserBaseResponse;", "userRequest", "Lbdt/docdoc/repo/remote/model/request/UserRequest;", "patientService", "Lbdt/docdoc/repo/remote/model/response/PatientListResponse;", "request", "Lbdt/docdoc/repo/remote/model/request/PatientListRequest;", "register", "Lbdt/docdoc/repo/remote/model/response/UserRegistrationResponse;", "Lbdt/docdoc/repo/remote/model/request/UserRegistrationRequest;", "app_debug"})
public abstract interface IRestAPIHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.remote.model.response.UserBaseResponse login(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRequest userRequest);
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.remote.model.response.UserRegistrationResponse register(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRegistrationRequest request);
    
    @org.jetbrains.annotations.NotNull()
    public abstract bdt.docdoc.repo.remote.model.response.PatientListResponse patientService(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.PatientListRequest request);
}