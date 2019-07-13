package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 12/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class BaseResponse{


//    {
//        "status": true,
//        "code": 205,
    //      "errors":"No Error",
//        "message": "User found",
//        "data": {
//    }
//    }

    @JsonProperty(value = "code")
    var code:Int=-1

    @JsonProperty(value = "status")
    var status:Boolean=false

    @JsonProperty(value = "message")
    var message:String=Constants.EMPTY_STRING

    @JsonProperty(value = "data")
    var data:UserResponse=UserResponse()

    @JsonProperty(value = "errors")
    var errors:String=Constants.EMPTY_STRING

    override fun toString(): String {
        return "BaseResponse(code=$code, status=$status, message='$message', data=$data, errors='$errors')"
    }


}