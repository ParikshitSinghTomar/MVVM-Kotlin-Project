package bdt.docdoc.ui.dashboard.p_visit_info

import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.DataManager
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.remote.model.request.PatientTodayVisitDetailRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by parikshit on 19/7/19.
 */
class PatientVisitInfoViewModel : BaseViewModel {

    var iDataManager: IDataManager

    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }

    fun getPatientDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            var patientTodayVisitDetailRequest = PatientTodayVisitDetailRequest()
            var response = iDataManager.getPatientTodayVisitDetail(patientTodayVisitDetailRequest/*patientTodayVisitDetailRequest=PatientTodayVisitDetailRequest()*/)

            viewModelScope.launch(Dispatchers.Main) {
                if (response.status) {
                    (getNavigator() as IPatientVisitInfoNavigator).showDetails(response)
                } else {
                    var errors = response.errors
                    (getNavigator() as IPatientVisitInfoNavigator).showError(errors)
                }
            }
        }
    }

}