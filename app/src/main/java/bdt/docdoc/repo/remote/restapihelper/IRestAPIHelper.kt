package bdt.docdoc.repo.remote.rest_api_helper

import bdt.docdoc.repo.remote.model.request.*
import bdt.docdoc.repo.remote.model.response.*

/**
 * Created by user on 12/3/19.
 */
interface IRestAPIHelper {


    fun login(userRequest: UserRequest): UserBaseResponse

    fun register(request: UserRegistrationRequest): UserRegistrationResponse

    fun patientService(request: PatientListRequest): PatientListResponse

    fun getPatientTodayVisitDetail(patientTodayVisitDetailRequest: PatientTodayVisitDetailRequest): PatientProfileDetails

    fun getMedicineList(): MedicineListResponse

    fun savePatientApiCall(request: SavePatientRequest)

    fun verifyPatientPhoneNo(request: SavePatientRequest)
}