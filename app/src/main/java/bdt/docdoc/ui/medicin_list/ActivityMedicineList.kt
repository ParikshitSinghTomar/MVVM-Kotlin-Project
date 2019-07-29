package bdt.docdoc.ui.medicin_list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.SearchView
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.common.INavigator
import bdt.docdoc.databinding.ActivityListMedicineBinding
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import javax.inject.Inject

/**
 * Created by parikshit on 27/7/19.
 */
class ActivityMedicineList : BaseActivity<ActivityListMedicineBinding, MedicineListViewModel>(), IMedicineListNavigator {


    @Inject
    lateinit var mViewModel: MedicineListViewModel

    lateinit var mBinding: ActivityListMedicineBinding
    lateinit var context: Context

    var adapter: MedicineListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = baseContext
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mViewModel
        mViewModel.setNavigator(this)
        mViewModel.getListOfMedicine()

        mBinding.searchViewMedicineSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
//                adapter!!.
                return true;
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true;
            }

        })

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
//        mBinding.executePendingBindings()
    }

    override fun showError(error: String) {
        showError(error)
    }

    override fun showToast(error: String) {
        showToast(error)
    }

    override fun showSuccess(success: String) {
        showSuccessSnack(success)
    }

    companion object {
        fun getActivityResultIntent(context: Context): Intent {
            val intent = Intent(context, ActivityMedicineList::class.java)
            return intent
        }

        val ACTIVTY_REQUEST_CODE_ADD_MEDICINE = 1010;
        val RESULT_INTENT_MEDICINE_NAME = "medicine_name"
    }

    override fun showMedicineList(list: ArrayList<Medicine>) {
        adapter = MedicineListAdapter(context, list)

        mBinding.recyclerViewMedicineList.layoutManager = LinearLayoutManager(context)
        mBinding.recyclerViewMedicineList.adapter = adapter
        adapter!!.notifyDataSetChanged()

    }
}