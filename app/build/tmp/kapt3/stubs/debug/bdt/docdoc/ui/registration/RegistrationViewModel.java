package bdt.docdoc.ui.registration;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006 "}, d2 = {"Lbdt/docdoc/ui/registration/RegistrationViewModel;", "Lbdt/docdoc/common/BaseViewModel;", "iDataManager", "Lbdt/docdoc/repo/IDataManager;", "(Lbdt/docdoc/repo/IDataManager;)V", "emailObservableField", "Landroid/databinding/ObservableField;", "", "getEmailObservableField", "()Landroid/databinding/ObservableField;", "setEmailObservableField", "(Landroid/databinding/ObservableField;)V", "firstNameObservableField", "getFirstNameObservableField", "setFirstNameObservableField", "getIDataManager", "()Lbdt/docdoc/repo/IDataManager;", "setIDataManager", "lastNameObservableField", "getLastNameObservableField", "setLastNameObservableField", "mobileNoObservableField", "getMobileNoObservableField", "setMobileNoObservableField", "saveUser", "", "userRegistrationResponse", "Lbdt/docdoc/repo/remote/model/response/UserRegistrationResponse;", "signUp", "signUpService", "request", "Lbdt/docdoc/repo/remote/model/request/UserRegistrationRequest;", "app_debug"})
public final class RegistrationViewModel extends bdt.docdoc.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.IDataManager iDataManager;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> firstNameObservableField;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> lastNameObservableField;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> emailObservableField;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> mobileNoObservableField;
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.IDataManager getIDataManager() {
        return null;
    }
    
    public final void setIDataManager(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getFirstNameObservableField() {
        return null;
    }
    
    public final void setFirstNameObservableField(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getLastNameObservableField() {
        return null;
    }
    
    public final void setLastNameObservableField(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getEmailObservableField() {
        return null;
    }
    
    public final void setEmailObservableField(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getMobileNoObservableField() {
        return null;
    }
    
    public final void setMobileNoObservableField(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    public final void signUp() {
    }
    
    public final void signUpService(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.remote.model.request.UserRegistrationRequest request) {
    }
    
    private final void saveUser(bdt.docdoc.repo.remote.model.response.UserRegistrationResponse userRegistrationResponse) {
    }
    
    @javax.inject.Inject()
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
        super(null);
    }
}