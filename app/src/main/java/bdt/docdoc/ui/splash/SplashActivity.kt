package bdt.docdoc.ui.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.databinding.SplashBinding
import bdt.docdoc.ui.login.LoginActivity
import bdt.docdoc.ui.registration.RegistrationActivity
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class SplashActivity :  BaseActivity<SplashBinding, SplashViewModel>(), ISplashNavigator {
    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showToast(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSuccess(success: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var mSplashViewModel:SplashViewModel

    lateinit var mBinding:SplashBinding

    lateinit var context:Context

    val TAG:String=SplashActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=baseContext
        mBinding=getViewDataBinding()!!
        mBinding.viewModel=mSplashViewModel
        mSplashViewModel.setNavigator(this)
    }

    override fun onStart() {
        super.onStart()
        message()
    }

    private fun message(){
        object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d(TAG,"Tick: "+millisUntilFinished.toString())
                mSplashViewModel.incrementCounter()
            }
            override fun onFinish() {
                if(mSplashViewModel.isUserAuthentic()){
                    startActivity(Intent(baseContext,RegistrationActivity::class.java))
                }else{
                    startActivity(Intent(baseContext,LoginActivity::class.java))
                }
            }
        }.start()
    }
    override fun getViewModel(): SplashViewModel {
        return mSplashViewModel
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
       return R.layout.splash
    }

    override fun executePendingBindings(){
        mBinding.textViewCounter.setText(mSplashViewModel.counter.value.toString())
    }

}