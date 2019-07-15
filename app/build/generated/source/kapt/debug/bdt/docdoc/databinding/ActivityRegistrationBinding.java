package bdt.docdoc.databinding;
import bdt.docdoc.R;
import bdt.docdoc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityRegistrationBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView3, 6);
    }
    // views
    @NonNull
    public final android.widget.Button buttonSignUp;
    @NonNull
    public final android.widget.EditText editTextEmail;
    @NonNull
    public final android.widget.EditText editTextFirstName;
    @NonNull
    public final android.widget.EditText editTextLastName;
    @NonNull
    public final android.widget.EditText editTextMobileNo;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView textView3;
    // variables
    @Nullable
    private bdt.docdoc.ui.registration.RegistrationViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegistrationBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.buttonSignUp = (android.widget.Button) bindings[5];
        this.buttonSignUp.setTag(null);
        this.editTextEmail = (android.widget.EditText) bindings[4];
        this.editTextEmail.setTag(null);
        this.editTextFirstName = (android.widget.EditText) bindings[1];
        this.editTextFirstName.setTag(null);
        this.editTextLastName = (android.widget.EditText) bindings[2];
        this.editTextLastName.setTag(null);
        this.editTextMobileNo = (android.widget.EditText) bindings[3];
        this.editTextMobileNo.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((bdt.docdoc.ui.registration.RegistrationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable bdt.docdoc.ui.registration.RegistrationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public bdt.docdoc.ui.registration.RegistrationViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelEmailObservableField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelLastNameObservableField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelMobileNoObservableField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelFirstNameObservableField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelEmailObservableField(android.databinding.ObservableField<java.lang.String> ViewModelEmailObservableField, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLastNameObservableField(android.databinding.ObservableField<java.lang.String> ViewModelLastNameObservableField, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMobileNoObservableField(android.databinding.ObservableField<java.lang.String> ViewModelMobileNoObservableField, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstNameObservableField(android.databinding.ObservableField<java.lang.String> ViewModelFirstNameObservableField, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        java.lang.String viewModelLastNameObservableFieldGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmailObservableField = null;
        android.databinding.ObservableField<java.lang.String> viewModelLastNameObservableField = null;
        android.databinding.ObservableField<java.lang.String> viewModelMobileNoObservableField = null;
        android.databinding.ObservableField<java.lang.String> viewModelFirstNameObservableField = null;
        java.lang.String viewModelFirstNameObservableFieldGet = null;
        java.lang.String viewModelEmailObservableFieldGet = null;
        java.lang.String viewModelMobileNoObservableFieldGet = null;
        bdt.docdoc.ui.registration.RegistrationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailObservableField
                        viewModelEmailObservableField = viewModel.getEmailObservableField();
                    }
                    updateRegistration(0, viewModelEmailObservableField);


                    if (viewModelEmailObservableField != null) {
                        // read viewModel.emailObservableField.get()
                        viewModelEmailObservableFieldGet = viewModelEmailObservableField.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.lastNameObservableField
                        viewModelLastNameObservableField = viewModel.getLastNameObservableField();
                    }
                    updateRegistration(1, viewModelLastNameObservableField);


                    if (viewModelLastNameObservableField != null) {
                        // read viewModel.lastNameObservableField.get()
                        viewModelLastNameObservableFieldGet = viewModelLastNameObservableField.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mobileNoObservableField
                        viewModelMobileNoObservableField = viewModel.getMobileNoObservableField();
                    }
                    updateRegistration(2, viewModelMobileNoObservableField);


                    if (viewModelMobileNoObservableField != null) {
                        // read viewModel.mobileNoObservableField.get()
                        viewModelMobileNoObservableFieldGet = viewModelMobileNoObservableField.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstNameObservableField
                        viewModelFirstNameObservableField = viewModel.getFirstNameObservableField();
                    }
                    updateRegistration(3, viewModelFirstNameObservableField);


                    if (viewModelFirstNameObservableField != null) {
                        // read viewModel.firstNameObservableField.get()
                        viewModelFirstNameObservableFieldGet = viewModelFirstNameObservableField.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.buttonSignUp.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextEmail, viewModelEmailObservableFieldGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextFirstName, viewModelFirstNameObservableFieldGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextLastName, viewModelLastNameObservableFieldGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextMobileNo, viewModelMobileNoObservableFieldGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        bdt.docdoc.ui.registration.RegistrationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.signUp();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityRegistrationBinding>inflate(inflater, bdt.docdoc.R.layout.activity_registration, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(bdt.docdoc.R.layout.activity_registration, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityRegistrationBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegistrationBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_registration_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityRegistrationBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.emailObservableField
        flag 1 (0x2L): viewModel.lastNameObservableField
        flag 2 (0x3L): viewModel.mobileNoObservableField
        flag 3 (0x4L): viewModel.firstNameObservableField
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}