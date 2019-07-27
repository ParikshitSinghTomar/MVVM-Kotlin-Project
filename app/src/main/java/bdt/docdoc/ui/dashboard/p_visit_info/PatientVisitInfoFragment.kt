package bdt.docdoc.ui.dashboard.p_visit_info

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.common.Constants
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import bdt.docdoc.repo.remote.model.common.CommonObjectSymptomsDescription
import bdt.docdoc.repo.remote.model.common.MedicineDescription
import bdt.docdoc.repo.remote.model.common.Symptoms
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse
import bdt.docdoc.ui.medicin_list.ActivityMedicineList
import kotlinx.android.synthetic.main.fragment_patient_visit_info.*
import javax.inject.Inject


class PatientVisitInfoFragment : BaseFragment<FragmentPatientVisitInfoBinding, PatientVisitInfoViewModel>(), IPatientVisitInfoNavigator, IVisitInfoAdaterBindListener {


    @Inject
    lateinit var mViewModel: PatientVisitInfoViewModel

    var mBinding: FragmentPatientVisitInfoBinding? = null

    private var baseContext: Context? = null
    var adapterSymptoms: AdapterSymptoms? = null

    private var response: PatientTodayVisitDetailResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseContext = context

    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = getViewDataBinding()
        mBinding!!.viewModel = mViewModel
        mViewModel.setNavigator(this)
        mViewModel.getPatientDetails()

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

    override fun showDetails(response: PatientTodayVisitDetailResponse) {
        this.response = response
        var visitList = getFreshList()
        adapterSymptoms = AdapterSymptoms(visitList, baseContext as Context, this)
        recyclerViewTodaySymptoms.layoutManager = LinearLayoutManager(context)
        recyclerViewTodaySymptoms.adapter = adapterSymptoms
        adapterSymptoms!!.notifyDataSetChanged()
    }

    private fun getFreshList(): ArrayList<CommonObjectSymptomsDescription> {
        var visitList = arrayListOf<CommonObjectSymptomsDescription>()

        if (response != null) {
            var symptomsHeading = Symptoms()
            symptomsHeading.name = Constants.SYMPTOMS
            symptomsHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_SYMPTOMS
            visitList.add(symptomsHeading)
            for (s in response!!.symptoms) {
                var commonObjectSymptomsDescription = Symptoms()
                commonObjectSymptomsDescription.name = s
                commonObjectSymptomsDescription.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS
                visitList.add(commonObjectSymptomsDescription)
            }

            var addSymptomsButton = Symptoms()
            addSymptomsButton.name = Constants.ADD_SYMPTOMS
            addSymptomsButton.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS
            visitList.add(addSymptomsButton)

            var medicineHeading = MedicineDescription()
            medicineHeading.name = Constants.MEDICINE
            medicineHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_MEDICINE
            visitList.add(medicineHeading)


            var addMedicine = MedicineDescription()
            addMedicine.name = Constants.ADD_MEDICINE
            addMedicine.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE
            visitList.add(addMedicine)
        }
        return visitList

    }

    override fun startMedicineListActivity(ojb: CommonObjectSymptomsDescription) {
        val intent = ActivityMedicineList.getActivityResultIntent(context)
        startActivityForResult(intent, ActivityMedicineList.ACTIVTY_REQUEST_CODE_ADD_MEDICINE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                ActivityMedicineList.ACTIVTY_REQUEST_CODE_ADD_MEDICINE -> {
                    var medicineName = data!!.getStringExtra(ActivityMedicineList.RESULT_INTENT_MEDICINE_NAME)
                    val cOSD = MedicineDescription()
                    cOSD.name = medicineName
                    cOSD.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.MEDICINE
                    cOSD.days = 1
                    cOSD.timeInDay = 1
                    cOSD.remarks = ""

                    addItem(cOSD)
                }
            }
        }
    }

    private fun addItem(cOSD: CommonObjectSymptomsDescription) {
        var visitList = arrayListOf<CommonObjectSymptomsDescription>()

        if (response != null) {
            var symptomsHeading = Symptoms()
            symptomsHeading.name = Constants.SYMPTOMS
            symptomsHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_SYMPTOMS
            visitList.add(symptomsHeading)
            for (s in response!!.symptoms) {
                var commonObjectSymptomsDescription = Symptoms()
                commonObjectSymptomsDescription.name = s
                commonObjectSymptomsDescription.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS
                visitList.add(commonObjectSymptomsDescription)
            }
            if (cOSD.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS)) {
                visitList.add(cOSD)
            }
            var addSymptomsButton = Symptoms()
            addSymptomsButton.name = Constants.ADD_SYMPTOMS
            addSymptomsButton.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS
            visitList.add(addSymptomsButton)

            var medicineHeading = MedicineDescription()
            medicineHeading.name = Constants.MEDICINE
            medicineHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_MEDICINE
            visitList.add(medicineHeading)

            if (cOSD.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.MEDICINE)) {
                visitList.add(cOSD)
            }

            var addMedicine = MedicineDescription()
            addMedicine.name = Constants.ADD_MEDICINE
            addMedicine.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE
            visitList.add(addMedicine)
        }
        adapterSymptoms!!.notifyDataSetChanged()

    }


}
