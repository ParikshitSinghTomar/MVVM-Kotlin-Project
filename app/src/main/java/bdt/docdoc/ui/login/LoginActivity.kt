package bdt.docdoc.ui.login

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.UiThread
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Toast
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.common.Constants
import bdt.docdoc.databinding.ActivityLoginBinding
import bdt.docdoc.repo.remote.model.response.UserResponse
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(), ILoginNavigator, View.OnClickListener {
    override fun showError(error: String) {
        showErrorSnack(error)
    }

    override fun showToast(error: String) {

    }

    override fun showSuccess(success: String) {
        showSuccessSnack(success)
    }


    override fun onClick(v: View?) {

        when (v!!.id) {
            mBinding.btnLogin.id -> {
                validateLoginFields()
            }
        }

    }

    private fun validateLoginFields() {
        val username = mBinding.edtUsername.text.toString()
        val password = mBinding.edtPassword.text.toString()
        if (username.isEmpty()) {
            showErrorSnack(getString(R.string.blank_username))
        } else if (username.contains("@") && !username.matches(Regex.fromLiteral("([-!#-'*+/-9=?A-Z^-~]+(\\.[-!#-'*+/-9=?A-Z^-~]+)*|\"([]!#-[^-~ \\t]|(\\\\[\\t -~]))+\")@[0-9A-Za-z]([0-9A-Za-z-]{0,61}[0-9A-Za-z])?(\\.[0-9A-Za-z]([0-9A-Za-z-]{0,61}[0-9A-Za-z])?)+"))) {
            showErrorSnack(getString(R.string.wrong_email_format))
        } else if (password.isEmpty()) {
            showErrorSnack(getString(R.string.blank_password))
        } else {
            mLoginViewModel.onSignIn(username, password)
        }
    }


    @UiThread
    override fun loginSuccessful(userResponse: UserResponse) {
        val toast: Toast = Toast.makeText(context, "Login Successfully Done", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun executePendingBindings() {

    }

    @Inject
    lateinit var mLoginViewModel: LoginViewModel
    lateinit var mBinding: ActivityLoginBinding

    val permissionResquestCode = 1011;

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = baseContext
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mLoginViewModel
        mLoginViewModel.setNavigator(this)
        mBinding.btnLogin.setOnClickListener(this)

        permissionChecks()
    }

    private fun permissionChecks() {

        var requiredPermission: ArrayList<String>? = ArrayList()
        for (permission in Constants.PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(context, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                requiredPermission!!.add(permission)
            }
        }

        if (!requiredPermission.isNullOrEmpty()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(requiredPermission!!.toTypedArray(), permissionResquestCode)
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == permissionResquestCode) {
            if (grantResults.isNotEmpty()
            ) {
                var allPermissionGranted = true
                for (result in grantResults) {
                    if (result != PackageManager.PERMISSION_GRANTED) {
                        allPermissionGranted = false
                    }
                }

                if (allPermissionGranted) {
                    showSuccessSnack("Great!, Now you can enjoy application.")
                    mBinding.btnLogin.isEnabled=true
                    mBinding.btnLogin.setBackgroundColor(ContextCompat.getColor(this, R.color.abc_search_url_text_normal))
                }else{
                    mBinding.btnLogin.isEnabled=false
                    mBinding.btnLogin.setBackgroundColor(ContextCompat.getColor(this, R.color.primary_text_disabled_material_light))
                }
            }
        }
    }


    override fun getViewModel(): LoginViewModel {
        return mLoginViewModel
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }


}