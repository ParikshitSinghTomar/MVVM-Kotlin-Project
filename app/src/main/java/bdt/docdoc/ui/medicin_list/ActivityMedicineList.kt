package bdt.docdoc.ui.medicin_list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.common.INavigator
import bdt.docdoc.databinding.ActivityListMedicineBinding
import javax.inject.Inject

/**
 * Created by parikshit on 27/7/19.
 */
class ActivityMedicineList : BaseActivity<ActivityListMedicineBinding, MedicineListViewModel>(), IMedicineListNavigator {


    @Inject
    lateinit var mViewModel: MedicineListViewModel

    lateinit var mBinding: ActivityListMedicineBinding
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = baseContext
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mViewModel
        mViewModel.setNavigator(this)
    }


    override fun getViewModel(): MedicineListViewModel {
        return mViewModel
    }

    override fun getBindingVariable(): Int {

        return BR._all

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_list_medicine
    }

    override fun executePendingBindings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    companion object {
        fun getActivityResultIntent(context: Context): Intent {
            val intent = Intent(context, ActivityMedicineList::class.java)
            return intent
        }

        val ACTIVTY_REQUEST_CODE_ADD_MEDICINE = 1010;
        val RESULT_INTENT_MEDICINE_NAME="medicine_name"
    }

}