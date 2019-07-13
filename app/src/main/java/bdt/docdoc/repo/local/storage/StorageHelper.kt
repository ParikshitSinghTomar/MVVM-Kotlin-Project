package bdt.docdoc.repo.local.storage

import android.content.Context
import bdt.docdoc.MyApplication
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.BaseResponse
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.BufferedReader
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class StorageHelper : IStorageHelper, IRestAPIHelper{
    override fun login(userRequest: UserRequest): BaseResponse {

        val content=loadFromAssets("login_success_response.json")
        var response=ObjectMapper().readValue(content,BaseResponse::class.java)
        return response
    }

    var context:Context = MyApplication.application

    @Inject
    constructor()

    fun loadFromAssets(jsonFileName:String):String{
        val manager=MyApplication.application.getAssets()
        var stream=manager.open(jsonFileName)
        var content:String
        val reader=BufferedReader(stream.reader())
        try{
            content=reader.readText()
        }finally {
            reader.close()
        }
        return content
    }
}