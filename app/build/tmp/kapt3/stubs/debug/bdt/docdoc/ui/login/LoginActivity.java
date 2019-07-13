package bdt.docdoc.ui.login;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0017J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J-\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00192\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0-2\u0006\u0010/\u001a\u000200H\u0016\u00a2\u0006\u0002\u00101J\b\u00102\u001a\u00020\u001dH\u0002J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020.H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020.H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u00104\u001a\u00020.H\u0016J\b\u00108\u001a\u00020\u001dH\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u0002X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00069"}, d2 = {"Lbdt/docdoc/ui/login/LoginActivity;", "Lbdt/docdoc/common/BaseActivity;", "error/NonExistentClass", "Lbdt/docdoc/ui/login/LoginViewModel;", "Lbdt/docdoc/ui/login/ILoginNavigator;", "Landroid/view/View$OnClickListener;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mBinding", "getMBinding", "()Lerror/NonExistentClass;", "setMBinding", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "mLoginViewModel", "getMLoginViewModel", "()Lbdt/docdoc/ui/login/LoginViewModel;", "setMLoginViewModel", "(Lbdt/docdoc/ui/login/LoginViewModel;)V", "permissionResquestCode", "", "getPermissionResquestCode", "()I", "executePendingBindings", "", "getBindingVariable", "getLayoutId", "getViewModel", "loginSuccessful", "userResponse", "Lbdt/docdoc/repo/remote/model/response/UserResponse;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "permissionChecks", "showError", "error", "showSuccess", "success", "showToast", "validateLoginFields", "app_debug"})
public final class LoginActivity extends bdt.docdoc.common.BaseActivity<error.NonExistentClass, bdt.docdoc.ui.login.LoginViewModel> implements bdt.docdoc.ui.login.ILoginNavigator, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public bdt.docdoc.ui.login.LoginViewModel mLoginViewModel;
    @org.jetbrains.annotations.NotNull()
    public error.NonExistentClass mBinding;
    private final int permissionResquestCode = 1011;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void showSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String success) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void validateLoginFields() {
    }
    
    @android.support.annotation.UiThread()
    @java.lang.Override()
    public void loginSuccessful(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.response.UserResponse userResponse) {
    }
    
    @java.lang.Override()
    public void executePendingBindings() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.ui.login.LoginViewModel getMLoginViewModel() {
        return null;
    }
    
    public final void setMLoginViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.ui.login.LoginViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getMBinding() {
        return null;
    }
    
    public final void setMBinding(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    public final int getPermissionResquestCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void permissionChecks() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public bdt.docdoc.ui.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    public LoginActivity() {
        super();
    }
}