package bdt.docdoc.repo.remote.rest_api_helper

import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.BaseResponse

/**
 * Created by user on 12/3/19.
 */
interface IRestAPIHelper {


    fun login(userRequest: UserRequest):BaseResponse
}