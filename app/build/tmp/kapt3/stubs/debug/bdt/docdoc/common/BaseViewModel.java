package bdt.docdoc.common;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0005\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lbdt/docdoc/common/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "iDataManager", "Lbdt/docdoc/repo/IDataManager;", "(Lbdt/docdoc/repo/IDataManager;)V", "isLoading", "Landroid/databinding/ObservableField;", "", "mDataManager", "mNavigator", "Lbdt/docdoc/common/INavigator;", "BaseViewModel", "", "doIOCall", "doIOCaller", "Lbdt/docdoc/common/BaseViewModel$IOCaller;", "ioListener", "Lbdt/docdoc/common/BaseViewModel$IOListener;", "getDataManager", "getNavigator", "onCleared", "setIsLoading", "setNavigator", "IOCaller", "IOListener", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private bdt.docdoc.common.INavigator mNavigator;
    private bdt.docdoc.repo.IDataManager mDataManager;
    private final android.databinding.ObservableField<java.lang.Boolean> isLoading = null;
    
    public final void BaseViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
    }
    
    public void setNavigator(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.common.INavigator mNavigator) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public bdt.docdoc.common.INavigator getNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public bdt.docdoc.repo.IDataManager getDataManager() {
        return null;
    }
    
    public void doIOCall(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.common.BaseViewModel.IOCaller doIOCaller, @org.jetbrains.annotations.NotNull()
    bdt.docdoc.common.BaseViewModel.IOListener ioListener) {
    }
    
    public void setIsLoading(boolean isLoading) {
    }
    
    public boolean isLoading() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbdt/docdoc/common/BaseViewModel$IOCaller;", "", "performIOCall", "", "app_debug"})
    public static abstract interface IOCaller {
        
        public abstract void performIOCall();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H&\u00a8\u0006\b"}, d2 = {"Lbdt/docdoc/common/BaseViewModel$IOListener;", "", "error", "", "t", "", "success", "any", "app_debug"})
    public static abstract interface IOListener {
        
        public abstract void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable t);
        
        public abstract void success(@org.jetbrains.annotations.NotNull()
        java.lang.Object any);
    }
}