
package android.databinding;
import bdt.docdoc.BR;
@javax.annotation.Generated("Android Data Binding")
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 21;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case bdt.docdoc.R.layout.activity_registration:
                    return bdt.docdoc.databinding.ActivityRegistrationBinding.bind(view, bindingComponent);
                case bdt.docdoc.R.layout.activity_login:
                    return bdt.docdoc.databinding.ActivityLoginBinding.bind(view, bindingComponent);
                case bdt.docdoc.R.layout.splash:
                    return bdt.docdoc.databinding.SplashBinding.bind(view, bindingComponent);
                case bdt.docdoc.R.layout.activity_dashboard:
                    return bdt.docdoc.databinding.ActivityDashboardBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 1185193333: {
                if(tag.equals("layout/activity_registration_0")) {
                    return bdt.docdoc.R.layout.activity_registration;
                }
                break;
            }
            case -237232145: {
                if(tag.equals("layout/activity_login_0")) {
                    return bdt.docdoc.R.layout.activity_login;
                }
                break;
            }
            case 312839581: {
                if(tag.equals("layout/splash_0")) {
                    return bdt.docdoc.R.layout.splash;
                }
                break;
            }
            case -1854838310: {
                if(tag.equals("layout/activity_dashboard_0")) {
                    return bdt.docdoc.R.layout.activity_dashboard;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}