package bdt.docdoc.ui.registration

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.databinding.ActivityRegistrationBinding
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class RegistrationActivity :  BaseActivity<ActivityRegistrationBinding, RegistrationViewModel>(), IRegistrationNavigator {
    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showToast(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSuccess(success: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun executePendingBindings() {

    }

    @Inject
    lateinit var mRegistrationViewModel:RegistrationViewModel

    lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=baseContext
    }

    override fun getViewModel(): RegistrationViewModel {
        return mRegistrationViewModel
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
       return R.layout.activity_registration
    }


}