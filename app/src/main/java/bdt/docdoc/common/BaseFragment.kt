package bdt.docdoc.common

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import dagger.android.support.AndroidSupportInjection

/**
 * Created by user on 12/3/19.
 */

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment() {


//    private var mBaseActivity: BaseActivity<T, V>? = null
//    private var mViewDataBinding: T? = null
    private var mBaseViewModel: V? = null
    private var mRootView: View? = null

    fun performDependencyInjection() {
//        AndroidSupportInjection.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)

        mBaseViewModel = getViewModel()
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    abstract fun getViewModel(): V?

    abstract fun getBindingVariables()

    abstract
    @LayoutRes
    fun getLayoutId(): Int

    interface Callback {
        fun onFragmentAttached()
        fun onFragmentDetached(args: String)
    }
}