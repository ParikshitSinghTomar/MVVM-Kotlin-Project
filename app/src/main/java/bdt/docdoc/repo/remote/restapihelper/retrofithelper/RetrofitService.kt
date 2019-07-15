package `in`.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper

import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.PatientListResponse
import bdt.docdoc.repo.remote.model.response.UserBaseResponse
import bdt.docdoc.repo.remote.model.response.UserRegistrationResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url

/**
 * Created by user on 12/3/19.
 */
interface RetrofitService {

    @POST
    fun login(@Url url: String, @Body userRequest: UserRequest): Single<UserBaseResponse>

    @POST
    fun register(@Url url: String, @Body request: UserRegistrationRequest): Single<UserRegistrationResponse>

    @POST
    fun fetchPatientList(@Url url: String, @Body request: PatientListRequest): Single<PatientListResponse>

}