package bdt.docdoc.ui.dashboard.p_history

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.databinding.FragmentPatientHistoryBinding
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import bdt.docdoc.repo.remote.model.response.MedicalHistory
import bdt.docdoc.repo.remote.model.response.PatientProfileDetails
import javax.inject.Inject


class PatientHistoryFragment : BaseFragment<FragmentPatientHistoryBinding, PatientHistoryViewModel>(), IPatientHistoryNavigator {


    @Inject
    lateinit var mViewModel: PatientHistoryViewModel

    var mAdapter: AdapterMedicalHistory? = null

    var medicalHistoryList: List<MedicalHistory> = ArrayList<MedicalHistory>()

    var mBinding: FragmentPatientHistoryBinding? = null

    lateinit var baseContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseContext = context
        mViewModel.setNavigator(this)
        mAdapter = AdapterMedicalHistory(baseContext, medicalHistoryList)
    }

    fun loadSelectedPatientDetails(response: PatientProfileDetails) {
        this.medicalHistoryList = response.medicalHistory!!
        mAdapter!!.medicalHistory = this.medicalHistoryList as ArrayList<MedicalHistory>
        mAdapter!!.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()
        mAdapter!!.refershData(this.medicalHistoryList)

        var layoutManager = LinearLayoutManager(baseContext)
        var dividerItemDecoration = DividerItemDecoration(mBinding!!.recyclerViewPatientsHistory.getContext(),
                layoutManager.getOrientation())

        mBinding!!.recyclerViewPatientsHistory.layoutManager = layoutManager
        mBinding!!.recyclerViewPatientsHistory.adapter = mAdapter
        mBinding!!.recyclerViewPatientsHistory.addItemDecoration(dividerItemDecoration)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = getViewDataBinding()
    }


    override fun executePendingBindings() {

    }

    override fun showError(error: String) {

    }

    override fun showToast(error: String) {

    }

    override fun showSuccess(success: String) {

    }

    override fun getViewModel(): PatientHistoryViewModel? {
        return mViewModel
    }

    override fun getBindingVariables(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_patient_history
    }

    companion object {
        val fragment = PatientHistoryFragment()
        fun newInstance(): PatientHistoryFragment {
            return fragment
        }
    }
}
