package bdt.docdoc.ui.dashboard

import bdt.docdoc.common.INavigator
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.response.PatientProfileDetails
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse

/**
 * Created by parikshit on 13/7/19.
 */
interface IDashboardNavigator : INavigator {
    fun showPatientList(patientEntityList: ArrayList<Patient>)
    fun showDetails(response: PatientProfileDetails)
}