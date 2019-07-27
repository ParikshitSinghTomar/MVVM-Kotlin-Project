package bdt.docdoc.repo.remote.rest_api_helper

import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.PatientTodayVisitDetailRequest
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.*

/**
 * Created by user on 12/3/19.
 */
interface IRestAPIHelper {


    fun login(userRequest: UserRequest): UserBaseResponse

    fun register(request: UserRegistrationRequest): UserRegistrationResponse

    fun patientService(request: PatientListRequest): PatientListResponse

    fun getPatientTodayVisitDetail(patientTodayVisitDetailRequest: PatientTodayVisitDetailRequest): PatientTodayVisitDetailResponse

    fun getMedicineList(): MedicineListResponse
}