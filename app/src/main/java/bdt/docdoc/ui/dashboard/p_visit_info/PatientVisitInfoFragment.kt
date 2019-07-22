package bdt.docdoc.ui.dashboard.p_visit_info

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import javax.inject.Inject


class PatientVisitInfoFragment : BaseFragment<FragmentPatientVisitInfoBinding, PatientVisitInfoViewModel>(), IPatientVisitInfoNavigator {


    @Inject
    lateinit var mViewModel: PatientVisitInfoViewModel

    var mBinding: FragmentPatientVisitInfoBinding? = null

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

    override fun getViewModel(): PatientVisitInfoViewModel? {
        return mViewModel
    }

    override fun getBindingVariables(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_patient_visit_info
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }


    companion object {
        fun newInstance(): PatientVisitInfoFragment {
            val fragment = PatientVisitInfoFragment()
            return fragment
        }
    }
}
