package bdt.docdoc.ui.dashboard.p_profile

import android.content.Context
import android.os.Bundle
import android.view.View
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.databinding.FragmentPatientProfileBinding
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import bdt.docdoc.repo.remote.model.response.PatientProfileDetails
import bdt.docdoc.ui.dashboard.p_profile.PatientProfileViewModel
import com.bumptech.glide.Glide
import javax.inject.Inject


class PatientProfileFragment : BaseFragment<FragmentPatientProfileBinding, PatientProfileViewModel>(), IPatientProfileNavigator {


    @Inject
    lateinit var mViewModel: PatientProfileViewModel

    var mBinding: FragmentPatientProfileBinding? = null

    private var baseContext: Context? = null

    private var patientProfileDetails: PatientProfileDetails? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseContext = context
        mViewModel.setNavigator(this)
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

    override fun getViewModel(): PatientProfileViewModel? {
        return mViewModel
    }

    override fun getBindingVariables(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_patient_profile
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }


    companion object {
        val fragment = PatientProfileFragment()
        fun newInstance(): PatientProfileFragment {
            return fragment
        }
    }

    fun loadSelectedPatientDetails(response: PatientProfileDetails) {
        this.patientProfileDetails = response
        refreshView(patientProfileDetails)
    }

    private fun refreshView(patientProfile: PatientProfileDetails?) {
        if (patientProfile != null) {
            Glide
                    .with(context)
                    .load(patientProfile.profileUrl)
                    .centerCrop()
                    .into(mBinding!!.imageViewProfile)
            mBinding!!.textViewPatientName.text = "Name: " + patientProfile.name
            mBinding!!.textViewEmail.text = "Email: " + patientProfile.email
            mBinding!!.textViewPhoneNo.text = "Contact No.: " + patientProfile.phoneNo
            mBinding!!.textViewPatientName.text = patientProfile.name
            var combinedAddress = patientProfile.address!!.line1 + "\n" +
                    patientProfile.address!!.line2 + "\n" +
                    patientProfile.address!!.city + ", " + patientProfile.address!!.state
            "Pincode: " + patientProfile.address!!.pincode + ""
            mBinding!!.textViewAddressValue.text = combinedAddress

            var combinedReport=StringBuilder()
            var counter=0
            for(report in patientProfile.basicMedicalReport!!){
                counter++
                combinedReport.append("$counter. $report")
                if(counter!= patientProfile.basicMedicalReport!!.size){
                    combinedReport.append("\n")
                }
            }
            mBinding!!.textViewBasicMedicalReport.text=combinedReport
        }

    }
}
