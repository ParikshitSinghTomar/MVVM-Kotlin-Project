package bdt.docdoc.ui.dashboard.p_visit_info

import bdt.docdoc.common.INavigator
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse

/**
 * Created by parikshit on 19/7/19.
 */
interface IPatientVisitInfoNavigator: INavigator{
    fun showDetails(response: PatientTodayVisitDetailResponse)
}