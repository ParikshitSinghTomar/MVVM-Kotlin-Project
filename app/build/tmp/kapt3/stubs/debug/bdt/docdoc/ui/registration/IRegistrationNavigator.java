package bdt.docdoc.ui.registration;

import java.lang.System;

/**
 * Created by parikshittomar on 29-05-2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lbdt/docdoc/ui/registration/IRegistrationNavigator;", "Lbdt/docdoc/common/INavigator;", "showDashboard", "", "signUp", "app_debug"})
public abstract interface IRegistrationNavigator extends bdt.docdoc.common.INavigator {
    
    public abstract void signUp();
    
    public abstract void showDashboard();
}