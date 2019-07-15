package bdt.docdoc.ui.dashboard

import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.response.PatientListResponse
import bdt.docdoc.repo.remote.model.response.PatientResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardViewModel : BaseViewModel {

    var iDataManager: IDataManager
    lateinit var iDashboardNavigator: IDashboardNavigator


    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }

    fun initPatientView() {

        viewModelScope.launch(Dispatchers.IO) {
            var user = iDataManager.getCurrentUser()
            var request = PatientListRequest()
            request.docID = user.id
            request.token = user.email
            var response = iDataManager.patientService(request)
            isValidResponse(response)
        }

    }

    private fun isValidResponse(response: PatientListResponse) {
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
                        patient.email,
                        patient.age,
                        patient.mobileNo,
                        patient.visit_count,
                        patient.visit_done)
                patientEntityList.add(patientEntity)

            }
            iDataManager.savePatient(patientEntityList)

            viewModelScope.launch(Dispatchers.Main) {
                (getNavigator() as IDashboardNavigator).showPatientList(patientEntityList)
            }

        }
    }

}