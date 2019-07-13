package bdt.docdoc.common;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\'J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J(\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u0019\u001a\u00020\fR\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lbdt/docdoc/common/BaseFragment;", "T", "Landroid/databinding/ViewDataBinding;", "V", "Lbdt/docdoc/common/BaseViewModel;", "Landroid/support/v4/app/Fragment;", "()V", "mBaseViewModel", "Lbdt/docdoc/common/BaseViewModel;", "mRootView", "Landroid/view/View;", "getBindingVariables", "", "getLayoutId", "", "getViewModel", "()Lbdt/docdoc/common/BaseViewModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performDependencyInjection", "Callback", "app_debug"})
public abstract class BaseFragment<T extends android.databinding.ViewDataBinding, V extends bdt.docdoc.common.BaseViewModel> extends android.support.v4.app.Fragment {
    private V mBaseViewModel;
    private android.view.View mRootView;
    private java.util.HashMap _$_findViewCache;
    
    public final void performDependencyInjection() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract V getViewModel();
    
    public abstract void getBindingVariables();
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lbdt/docdoc/common/BaseFragment$Callback;", "", "onFragmentAttached", "", "onFragmentDetached", "args", "", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onFragmentAttached();
        
        public abstract void onFragmentDetached(@org.jetbrains.annotations.NotNull()
        java.lang.String args);
    }
}