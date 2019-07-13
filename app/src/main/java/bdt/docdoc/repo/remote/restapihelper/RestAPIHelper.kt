package `in`.pari.docdoc.repo.remote.rest_api_helper

import `in`.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService
import android.util.Log
import bdt.docdoc.BuildConfig
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.BaseResponse
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

    override fun login(userRequest: UserRequest): BaseResponse {
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
        var userResponse = BaseResponse()
        userResponse.errors = error
        return userResponse

    }

}