package bdt.docdoc.ui.dashboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.databinding.ActivityDashboardBinding
import javax.inject.Inject

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardActivity : BaseActivity<ActivityDashboardBinding, DashboardViewModel>(), IDashboardNavigator {


    @Inject
    lateinit var mDashboardViewModel: DashboardViewModel

    lateinit var mBinding: ActivityDashboardBinding
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mDashboardViewModel
        mDashboardViewModel.setNavigator(this)
    }

    override fun getViewModel(): DashboardViewModel {
        return mDashboardViewModel
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_dashboard
    }

    companion object {

        fun getStartIntent(context: Context): Intent {
            return Intent(context,DashboardActivity::class.java)
        }

    }

    override fun executePendingBindings() {

    }

    override fun showError(error: String) {

    }

    override fun showToast(error: String) {

    }

    override fun showSuccess(success: String) {

    }


}