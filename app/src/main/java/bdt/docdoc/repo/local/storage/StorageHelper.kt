package bdt.docdoc.repo.local.storage

import android.content.Context
import bdt.docdoc.MyApplication
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.PatientTodayVisitDetailRequest
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.*
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.BufferedReader
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class StorageHelper : IStorageHelper, IRestAPIHelper {


    var context: Context = MyApplication.application

    override fun login(userRequest: UserRequest): UserBaseResponse {

        val content = loadFromAssets("login_success_response.json")
        var response = ObjectMapper().readValue(content, UserBaseResponse::class.java)
        return response
    }


    override fun register(request: UserRegistrationRequest): UserRegistrationResponse {

        val content = loadFromAssets("login_success_response.json")
        var response = ObjectMapper().readValue(content, UserRegistrationResponse::class.java)
        return response
    }


    @Inject
    constructor()

    fun loadFromAssets(jsonFileName: String): String {
        val manager = MyApplication.application.getAssets()
        var stream = manager.open(jsonFileName)
        var content: String
        val reader = BufferedReader(stream.reader())
        try {
            content = reader.readText()
        } finally {
            reader.close()
        }
        return content
    }

    override fun patientService(request: PatientListRequest): PatientListResponse {
        val content = loadFromAssets("patient_list_success_response.json")
        var response = ObjectMapper().readValue(content, PatientListResponse::class.java)
        return response
    }

    override fun getPatientTodayVisitDetail(patientTodayVisitDetailRequest: PatientTodayVisitDetailRequest): PatientProfileDetails {

        val content = loadFromAssets("patient_profile.json")
        var response = ObjectMapper().readValue(content, PatientProfileDetails::class.java)
        return response

    }

    override fun getMedicineList(): MedicineListResponse {
        val content = loadFromAssets("medicine_list.json")
        var response = ObjectMapper().readValue(content, MedicineListResponse::class.java)
        return response
    }

}