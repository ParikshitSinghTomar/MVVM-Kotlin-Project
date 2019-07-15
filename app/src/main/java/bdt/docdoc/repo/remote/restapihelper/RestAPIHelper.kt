package `in`.pari.docdoc.repo.remote.rest_api_helper

import `in`.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService
import android.util.Log
import bdt.docdoc.BuildConfig
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.PatientListResponse
import bdt.docdoc.repo.remote.model.response.UserBaseResponse
import bdt.docdoc.repo.remote.model.response.UserRegistrationResponse
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper
import java.io.IOException
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class RestAPIHelper : IRestAPIHelper {


    @Inject
    lateinit var retrofitService: RetrofitService
    val TAG = RestAPIHelper::class.java.simpleName

    @Inject
    constructor()

    override fun login(userRequest: UserRequest): UserBaseResponse {
        val url = BuildConfig.BASE_URL + "login"
        var error = "NoError"
        try {
            var response = retrofitService.login(url, userRequest).blockingGet()
            Log.e(TAG, response.toString())
            return response
        } catch (e: IOException) {
            error = e.message!!
            e.printStackTrace()
        }
        var userResponse = UserBaseResponse()
        userResponse.errors = error
        return userResponse

    }

    override fun register(request: UserRegistrationRequest): UserRegistrationResponse {
        val url = BuildConfig.BASE_URL + "register"
        var error = "NoError"
        try {
            var response = retrofitService.register(url, request).blockingGet()
            Log.e(TAG, response.toString())
            return response
        } catch (e: IOException) {
            error = e.message!!
            e.printStackTrace()
        }
        var userRegistrationResponse = UserRegistrationResponse()
        userRegistrationResponse.errors = error
        return userRegistrationResponse

    }

    override fun patientService(request: PatientListRequest): PatientListResponse {
        val url = BuildConfig.BASE_URL + "patientlist"
        var error = "NoError"
        try {
            var response = retrofitService.fetchPatientList(url, request).blockingGet()
            Log.e(TAG, response.toString())
            return response
        } catch (e: IOException) {
            error = e.message!!
            e.printStackTrace()
        }
        var response = PatientListResponse()
        response.errors = error
        return response

    }

}