package bdt.docdoc.ui.dashboard

import bdt.docdoc.common.INavigator
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by parikshit on 13/7/19.
 */
interface IDashboardNavigator : INavigator {
    fun showPatientList(patientEntityList: ArrayList<Patient>)
}