package bdt.docdoc.ui.dashboard.p_history

import android.content.Context
import android.os.Bundle
import android.view.View
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.databinding.FragmentPatientHistoryBinding
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import javax.inject.Inject


class PatientHistoryFragment : BaseFragment<FragmentPatientHistoryBinding, PatientHistoryViewModel>(), IPatientHistoryNavigator {


    @Inject
    lateinit var mViewModel: PatientHistoryViewModel

    var mBinding: FragmentPatientHistoryBinding? = null

    private var baseContext: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseContext = context
        mViewModel.setNavigator(this)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding=getViewDataBinding()
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


    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }


    companion object {
        fun newInstance(): PatientHistoryFragment {
            val fragment = PatientHistoryFragment()
            return fragment
        }
    }
}
