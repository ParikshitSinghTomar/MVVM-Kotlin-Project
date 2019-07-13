package `in`.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper

import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.BaseResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url

/**
 * Created by user on 12/3/19.
 */
interface RetrofitService {

    @POST
    fun login(@Url url:String,@Body userRequest: UserRequest):Single<BaseResponse>
}