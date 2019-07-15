package bdt.docdoc.ui.registration

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.viewModelScope
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.databinding.ActivityRegistrationBinding
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.ui.dashboard.DashboardActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class RegistrationActivity : BaseActivity<ActivityRegistrationBinding, RegistrationViewModel>(), IRegistrationNavigator {


    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, RegistrationActivity::class.java)
        }
    }

    @Inject
    lateinit var mRegistrationViewModel: RegistrationViewModel

    lateinit var context: Context

    lateinit var mBinding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = baseContext
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mRegistrationViewModel

        mRegistrationViewModel.setNavigator(this)
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

    override fun showDashboard() {
        startActivity(DashboardActivity.getStartIntent(context))
    }

    override fun signUp() {
        var firstName = mBinding.editTextFirstName.text.toString()
        var lastName = mBinding.editTextLastName.text.toString()
        var email = mBinding.editTextEmail.text.toString()
        var mobileNo = mBinding.editTextMobileNo.text.toString()
        if (firstName == null || firstName.isEmpty()) {
            showErrorSnack(getString(R.string.not_null_firstname))
        } else if (lastName == null || lastName.isEmpty()) {
            showErrorSnack(getString(R.string.not_null_lastname))
        } else if (email == null || email.isEmpty()) {
            showErrorSnack(getString(R.string.not_null_email))
        } else if (mobileNo == null || mobileNo.isEmpty()) {
            showErrorSnack(getString(R.string.not_null_mobile_no))
        } else {
            var request = UserRegistrationRequest()
            request.firstName = firstName
            request.lastName = lastName
            request.email = email
            request.mobileNo = mobileNo
            mRegistrationViewModel.signUpService(request)
        }
    }

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
}