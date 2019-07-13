package bdt.docdoc.ui.login;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbdt/docdoc/ui/login/LoginViewModel;", "Lbdt/docdoc/common/BaseViewModel;", "iDataManager", "Lbdt/docdoc/repo/IDataManager;", "(Lbdt/docdoc/repo/IDataManager;)V", "TAG", "", "baseResponse", "Lbdt/docdoc/repo/remote/model/response/BaseResponse;", "userResponse", "Lbdt/docdoc/repo/remote/model/response/UserResponse;", "onSignIn", "", "username", "password", "saveUser", "app_debug"})
public final class LoginViewModel extends bdt.docdoc.common.BaseViewModel {
    private final java.lang.String TAG = null;
    private bdt.docdoc.repo.IDataManager iDataManager;
    private bdt.docdoc.repo.remote.model.response.UserResponse userResponse;
    private bdt.docdoc.repo.remote.model.response.BaseResponse baseResponse;
    
    public final void onSignIn(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void saveUser(bdt.docdoc.repo.remote.model.response.BaseResponse baseResponse) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
        super(null);
    }
}