package bdt.docdoc.ui.dashboard.p_visit_info

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseFragment
import bdt.docdoc.common.Constants
import bdt.docdoc.databinding.FragmentPatientVisitInfoBinding
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.common.CommonObjectSymptomsDescription
import bdt.docdoc.repo.remote.model.common.MedicineDescription
import bdt.docdoc.repo.remote.model.common.Precaution
import bdt.docdoc.repo.remote.model.common.Symptoms
import bdt.docdoc.repo.remote.model.response.PatientProfileDetails
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse
import bdt.docdoc.ui.medicin_list.ActivityMedicineList
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_patient_visit_info.*
import javax.inject.Inject


class PatientVisitInfoFragment : BaseFragment<FragmentPatientVisitInfoBinding, PatientVisitInfoViewModel>(), IPatientVisitInfoNavigator, IVisitInfoAdaterBindListener {


    @Inject
    lateinit var mViewModel: PatientVisitInfoViewModel

    var mBinding: FragmentPatientVisitInfoBinding? = null

    private var baseContext: Context? = null
    var adapterSymptoms: AdapterSymptoms? = null


    private var medicineList = ArrayList<CommonObjectSymptomsDescription>()
    private var symptomsList = ArrayList<CommonObjectSymptomsDescription>()
    private var precautionsList = ArrayList<CommonObjectSymptomsDescription>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseContext = context

    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = getViewDataBinding()
        mBinding!!.viewModel = mViewModel
        mViewModel.setNavigator(this)
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
        val fragment = PatientVisitInfoFragment()
        fun newInstance(): PatientVisitInfoFragment {
            return fragment
        }
    }

    override fun loadSelectedPatientDetails(response: PatientProfileDetails) {

        showBasicInfo(response)
        symptomsList.clear()
        medicineList.clear()
        precautionsList.clear()
        createSymptomsList(response)
        var visitList = getRefreshedList()
        adapterSymptoms = AdapterSymptoms(visitList, baseContext as Context, this)
        recyclerViewTodaySymptoms.layoutManager = LinearLayoutManager(context)
        recyclerViewTodaySymptoms.adapter = adapterSymptoms
        adapterSymptoms!!.notifyDataSetChanged()
    }

    private fun showBasicInfo(response: PatientProfileDetails) {
        Glide
                .with(context)
                .load(response.profileUrl)
                .centerCrop()
                .into(mBinding!!.imageViewProfile)
        mBinding!!.textViewPatientName.text = response.name
        mBinding!!.textViewPatientTemp.text = "Temprature: " + response.todayVisit!!.temp.toString()
        mBinding!!.textViewPatientBP.text = "Blood Pressure: " + response.todayVisit!!.bp.toString()
        mBinding!!.textViewWeight.text = "Weight: " + response.todayVisit!!.weight.toString()
    }

    private fun createSymptomsList(response: PatientProfileDetails) {

        for (symptomName in response.todayVisit!!.symptoms!!) {
            var symptom = Symptoms()
            symptom.name = symptomName
            symptom.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS
            symptomsList.add(symptom)
        }
    }

    private fun getRefreshedList(): ArrayList<CommonObjectSymptomsDescription> {
        var visitList = arrayListOf<CommonObjectSymptomsDescription>()

        var symptomsHeading = Symptoms()
        symptomsHeading.name = Constants.SYMPTOMS
        symptomsHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_SYMPTOMS
        visitList.add(symptomsHeading)

        visitList.addAll(symptomsList)

        var addSymptomsButton = Symptoms()
        addSymptomsButton.name = Constants.ADD_SYMPTOMS
        addSymptomsButton.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS
        visitList.add(addSymptomsButton)

        var medicineHeading = MedicineDescription()
        medicineHeading.name = Constants.MEDICINE
        medicineHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_MEDICINE
        visitList.add(medicineHeading)


        visitList.addAll(medicineList)

        var addMedicine = MedicineDescription()
        addMedicine.name = Constants.ADD_MEDICINE
        addMedicine.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE
        visitList.add(addMedicine)


        var precautionHeading = MedicineDescription()
        precautionHeading.name = Constants.PRECAUTIONS
        precautionHeading.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_PRECAUTION
        visitList.add(precautionHeading)

        visitList.addAll(precautionsList)

        var addPrecautionMedicine = MedicineDescription()
        addPrecautionMedicine.name = Constants.ADD_PRECAUTIONS
        addPrecautionMedicine.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_PRECAUTION
        visitList.add(addPrecautionMedicine)

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
                    medicineList.add(cOSD)
                    refreshList()
                }
            }
        }
    }

    private fun refreshList() {
        var visitList = getRefreshedList()
        adapterSymptoms!!.refreshData(visitList)
    }

    override fun removeMedicine(medicineDescription: MedicineDescription) {
        medicineList.remove(medicineDescription as CommonObjectSymptomsDescription)
        refreshList()
    }

    override fun removeSymptom(symptoms: Symptoms) {
        symptomsList.remove(symptoms as CommonObjectSymptomsDescription)
        refreshList()
    }

    override fun removePrecautions(precaution: Precaution) {
        precautionsList.remove(precaution)
        refreshList()
    }

    private fun showPrecautionDialog() {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.activity_precautions)
        val editText = dialog.findViewById(R.id.editTextPrecaution) as EditText
        val imageClose = dialog.findViewById(R.id.imageClose) as ImageView
        imageClose.setOnClickListener({
            dialog.dismiss()
        })
        val yesBtn = dialog.findViewById(R.id.buttonSelect) as Button
        yesBtn.setOnClickListener {
            var text = editText.text.toString()
            if (text.isNullOrEmpty()) {
                editText.hint = "Please enter valid text."
                editText.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            }
            var precaution = Precaution()
            precaution.name = text
            precaution.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.PRECAUTION
            precautionsList.add(precaution)
            refreshList()
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun addPrecaution() {
        showPrecautionDialog()
    }

    private fun showSymptomsDialog() {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.activity_precautions)
        val editText = dialog.findViewById(R.id.editTextPrecaution) as EditText
        val imageClose = dialog.findViewById(R.id.imageClose) as ImageView
        imageClose.setOnClickListener({
            dialog.dismiss()
        })
        val yesBtn = dialog.findViewById(R.id.buttonSelect) as Button
        yesBtn.setOnClickListener {
            var text = editText.text.toString()
            if (text.isNullOrEmpty()) {
                editText.hint = "Please enter valid text."
                editText.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            }
            var symptom = Symptoms()
            symptom.name = text
            symptom.objectType = CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS
            symptomsList.add(symptom)
            refreshList()
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun addSymptom() {
        showSymptomsDialog()
    }
}
