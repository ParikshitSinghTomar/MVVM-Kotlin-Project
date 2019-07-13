package bdt.docdoc.ui.splash;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"Lbdt/docdoc/ui/splash/SplashViewModel;", "Lbdt/docdoc/common/BaseViewModel;", "iDataManager", "Lbdt/docdoc/repo/IDataManager;", "(Lbdt/docdoc/repo/IDataManager;)V", "_counter", "Landroid/arch/lifecycle/MutableLiveData;", "", "counter", "Landroid/arch/lifecycle/LiveData;", "getCounter", "()Landroid/arch/lifecycle/LiveData;", "getIDataManager", "()Lbdt/docdoc/repo/IDataManager;", "setIDataManager", "incrementCounter", "", "isUserAuthentic", "", "app_debug"})
public final class SplashViewModel extends bdt.docdoc.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private bdt.docdoc.repo.IDataManager iDataManager;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> _counter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.lang.Integer> counter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.repo.IDataManager getIDataManager() {
        return null;
    }
    
    public final void setIDataManager(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Integer> getCounter() {
        return null;
    }
    
    public final boolean isUserAuthentic() {
        return false;
    }
    
    public final void incrementCounter() {
    }
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
        super(null);
    }
}