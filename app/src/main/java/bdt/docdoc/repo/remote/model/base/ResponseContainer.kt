package bdt.docdoc.repo.remote.model.base

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import org.json.JSONObject
import java.util.*

/**
 * Created by user on 12/3/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
open class ResponseContainer<T>{

    @JsonProperty(value = "status")
    var status=false

    @JsonProperty(value = "code")
    var code:Int=-1

    @JsonProperty(value = "message")
     var message:String="No Message from server"


    @JsonProperty(value = "errors")
    var errors:String="No Error from server"

    @JsonProperty(value = "data")
    var data:JSONObject?=null

    override fun toString(): String {
        return "ResponseContainer(status=$status, code=$code, message='$message', errors='$errors', data=$data)"
    }

}