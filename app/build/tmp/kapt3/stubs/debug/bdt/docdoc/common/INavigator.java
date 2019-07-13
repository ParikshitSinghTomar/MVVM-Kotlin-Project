package bdt.docdoc.common;

import java.lang.System;

/**
 * Created by parikshit on 3/7/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lbdt/docdoc/common/INavigator;", "", "executePendingBindings", "", "showError", "error", "", "showSuccess", "success", "showToast", "app_debug"})
public abstract interface INavigator {
    
    public abstract void executePendingBindings();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
    
    public abstract void showSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String success);
}