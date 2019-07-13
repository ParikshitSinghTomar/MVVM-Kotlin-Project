package bdt.docdoc.databinding;
import bdt.docdoc.R;
import bdt.docdoc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityLoginBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 1);
        sViewsWithIds.put(R.id.edtUsername, 2);
        sViewsWithIds.put(R.id.edtPassword, 3);
        sViewsWithIds.put(R.id.btnLogin, 4);
        sViewsWithIds.put(R.id.txtForgotPassword, 5);
    }
    // views
    @NonNull
    public final android.widget.Button btnLogin;
    @NonNull
    public final android.widget.EditText edtPassword;
    @NonNull
    public final android.widget.EditText edtUsername;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.widget.TextView txtForgotPassword;
    // variables
    @Nullable
    private bdt.docdoc.ui.login.LoginViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.btnLogin = (android.widget.Button) bindings[4];
        this.edtPassword = (android.widget.EditText) bindings[3];
        this.edtUsername = (android.widget.EditText) bindings[2];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView = (android.widget.TextView) bindings[1];
        this.txtForgotPassword = (android.widget.TextView) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((bdt.docdoc.ui.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable bdt.docdoc.ui.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public bdt.docdoc.ui.login.LoginViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLoginBinding>inflate(inflater, bdt.docdoc.R.layout.activity_login, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(bdt.docdoc.R.layout.activity_login, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_login_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLoginBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}