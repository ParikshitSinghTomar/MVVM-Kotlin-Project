package bdt.docdoc.common;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH\'J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001cR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006$"}, d2 = {"Lbdt/docdoc/common/BaseActivity;", "T", "Landroid/databinding/ViewDataBinding;", "V", "Lbdt/docdoc/common/BaseViewModel;", "Landroid/support/v7/app/AppCompatActivity;", "Lbdt/docdoc/common/BaseFragment$Callback;", "()V", "mProgressDialog", "Landroid/app/ProgressDialog;", "mViewDataBinding", "Landroid/databinding/ViewDataBinding;", "mViewModel", "Lbdt/docdoc/common/BaseViewModel;", "getBindingVariable", "", "getLayoutId", "getViewDataBinding", "()Landroid/databinding/ViewDataBinding;", "getViewModel", "()Lbdt/docdoc/common/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentAttached", "onFragmentDetached", "args", "", "performDataBinding", "performDependencyInjection", "showCustomToast", "message", "showErrorSnack", "str", "showSuccessSnack", "app_debug"})
public abstract class BaseActivity<T extends android.databinding.ViewDataBinding, V extends bdt.docdoc.common.BaseViewModel> extends android.support.v7.app.AppCompatActivity implements bdt.docdoc.common.BaseFragment.Callback {
    private android.app.ProgressDialog mProgressDialog;
    private T mViewDataBinding;
    private V mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performDataBinding() {
    }
    
    private final void performDependencyInjection() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getViewDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    public abstract int getBindingVariable();
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    @java.lang.Override()
    public void onFragmentAttached() {
    }
    
    @java.lang.Override()
    public void onFragmentDetached(@org.jetbrains.annotations.NotNull()
    java.lang.String args) {
    }
    
    public final void showErrorSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void showSuccessSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void showCustomToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public BaseActivity() {
        super();
    }
}