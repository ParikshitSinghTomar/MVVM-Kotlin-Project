package bdt.docdoc.repo.local.sharedpref;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0017\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbdt/docdoc/repo/local/sharedpref/SharedPrefHelper;", "Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;", "()V", "IS_USER_AUTHENTIC", "", "context", "Landroid/content/Context;", "editor", "Landroid/content/SharedPreferences$Editor;", "shrdPref", "Landroid/content/SharedPreferences;", "isUserAuthentic", "", "app_debug"})
public final class SharedPrefHelper implements bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper {
    private android.content.Context context;
    private android.content.SharedPreferences shrdPref;
    private android.content.SharedPreferences.Editor editor;
    private final java.lang.String IS_USER_AUTHENTIC = "is_user_authentic";
    
    @java.lang.Override()
    public boolean isUserAuthentic() {
        return false;
    }
    
    @javax.inject.Inject()
    public SharedPrefHelper() {
        super();
    }
}