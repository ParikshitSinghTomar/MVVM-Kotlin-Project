package bdt.docdoc.ui.dashboard.p_medicine

import android.content.Context
import android.os.Bundle
import android.view.View
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.databinding.FragmentPatientMedicineBinding
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import javax.inject.Inject


class PatientMedicineFragment : BaseFragment<FragmentPatientMedicineBinding, PatientMedicineViewModel>(), IPatientMedicineNavigator {


    @Inject
    lateinit var mViewModel: PatientMedicineViewModel

    var mBinding: FragmentPatientMedicineBinding? = null

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

    override fun getViewModel(): PatientMedicineViewModel? {
        return mViewModel
    }

    override fun getBindingVariables(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_patient_medicine
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }


    companion object {
        fun newInstance(): PatientMedicineFragment {
            val fragment = PatientMedicineFragment()
            return fragment
        }
    }
}
