package bdt.docdoc.common

import android.app.ProgressDialog
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import bdt.docdoc.R
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.ui.splash.ISplashNavigator
import dagger.android.AndroidInjection

//import dagger.android.AndroidInjection

/**
 * Created by user on 12/3/19.
 */
abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel> : AppCompatActivity(), BaseFragment.Callback {

    private var mProgressDialog: ProgressDialog? = null
    private var mViewDataBinding: T? = null
    private var mViewModel: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
        performDataBinding()
    }

    private fun performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())

        if (this.mViewModel == null) {
            this.mViewModel = getViewModel()
        } else {
            this.mViewModel = mViewModel
        }
        mViewDataBinding?.setVariable(getBindingVariable(), mViewModel)
        mViewDataBinding?.executePendingBindings()
    }

    private fun performDependencyInjection() {
        AndroidInjection.inject(this)
    }

    fun getViewDataBinding(): T? {
        return mViewDataBinding
    }

    abstract fun getViewModel(): V

    abstract fun getBindingVariable(): Int

    abstract @LayoutRes
    fun getLayoutId(): Int

    override fun onFragmentAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentDetached(args: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun showErrorSnack(str: String) {
        var snack = Snackbar.make(mViewDataBinding!!.root, str, Snackbar.LENGTH_SHORT)
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.error_color_material))
        snack.setDuration(2000)
        snack.show()
    }
    fun showSuccessSnack(str: String) {
        var snack = Snackbar.make(mViewDataBinding!!.root, str, Snackbar.LENGTH_SHORT)
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.material_deep_teal_500))
        snack.setDuration(2000)
        snack.show()
    }
    fun showCustomToast(message:String){
        var toast=Toast.makeText(this,message,Toast.LENGTH_SHORT)
        toast.show()
    }
}
