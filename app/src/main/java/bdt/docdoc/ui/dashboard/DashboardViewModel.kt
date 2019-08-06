package bdt.docdoc.ui.dashboard

import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.PatientTodayVisitDetailRequest
import bdt.docdoc.repo.remote.model.request.SavePatientRequest
import bdt.docdoc.repo.remote.model.response.PatientListResponse
import bdt.docdoc.repo.remote.model.response.PatientResponse
import bdt.docdoc.ui.dashboard.p_visit_info.IPatientVisitInfoNavigator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardViewModel : BaseViewModel {

    var iDataManager: IDataManager

    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }

    fun loadPatientList() {
        viewModelScope.launch(Dispatchers.IO) {
            var user = iDataManager.getCurrentUser()
            var request = PatientListRequest()
            request.docID = user.id
            request.token = user.email
            var response = iDataManager.patientService(request)
            saveResponse(response)
        }

    }

    private fun saveResponse(response: PatientListResponse) {
        viewModelScope.launch(Dispatchers.Main) {
            if (response.errors.isEmpty()) {
                if (response.status && response.data.size > 0) {
                    savePatientList(response.data)
                } else {
                    (getNavigator() as IDashboardNavigator).showError(response.message)
                }
            } else {
                (getNavigator() as IDashboardNavigator).showError(response.errors)
            }
        }
    }

    private fun savePatientList(patientList: List<PatientResponse>) {
        viewModelScope.launch(Dispatchers.IO) {
            var patientEntityList = arrayListOf<Patient>()
            for (patient in patientList) {
                var patientEntity = Patient(patient.id,
                        patient.patientID,
                        patient.name,
                        patient.address,
                        patient.profileUrl,
                        patient.email,
                        patient.age,
                        patient.mobileNo,
                        patient.visit_count,
                        patient.visit_done)
                patientEntityList.add(patientEntity)
            }
            iDataManager.savePatients(patientEntityList)
            var patientList = iDataManager.getPatientListFromDB() as ArrayList<Patient>
            viewModelScope.launch(Dispatchers.Main) {
                (getNavigator() as IDashboardNavigator).showPatientList(patientList)
            }


        }
    }

    fun loadPatientDetails(patient: Patient) {
        viewModelScope.launch(Dispatchers.IO) {
            var patientTodayVisitDetailRequest = PatientTodayVisitDetailRequest()
            patientTodayVisitDetailRequest.docID = 1
            patientTodayVisitDetailRequest.patientID = patient.patient_id
            patientTodayVisitDetailRequest.patientVisitID = patient.visit_id
            var response = iDataManager.getPatientTodayVisitDetail(patientTodayVisitDetailRequest/*patientTodayVisitDetailRequest=PatientTodayVisitDetailRequest()*/)

            viewModelScope.launch(Dispatchers.Main) {
                if (response.status!!) {
                    (getNavigator() as IDashboardNavigator).showDetails(response)
                } else {
                    var errors = response.errors
                    (getNavigator() as IDashboardNavigator).showError(errors!!)
                }
            }
        }
    }

    fun addPatient(patient: Patient) {

        viewModelScope.launch(Dispatchers.IO) {
            //            iDataManager.savePatient(patient)
            var request = SavePatientRequest()
            request.name = patient.name
            request.phone_no = patient.mobileNo
            request.age = patient.age
            request.bp = patient.bp
            request.name = patient.name
            request.name = patient.name
            request.name = patient.name

            iDataManager.savePatientApiCall()
        }
    }

    fun getDocID(): Int {
        return 123456
    }


}