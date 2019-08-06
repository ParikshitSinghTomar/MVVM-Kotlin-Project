package bdt.docdoc.repo.remote.model.request

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 6/8/19.
 */

class SavePatientRequest {


    @JsonProperty(value = "name")
    var name: String = Constants.EMPTY_STRING

    @JsonProperty(value = "age")
    var age: Int = -1

    @JsonProperty(value = "bp")
    var bp: Int = -1

    @JsonProperty(value = "phone_verified")
    var phone_verified: Boolean = false

    @JsonProperty(value = "temperature")
    var temperature: String = Constants.EMPTY_STRING

    @JsonProperty(value = "profile_url")
    var profileUrl: String = Constants.EMPTY_STRING

    @JsonProperty(value = "phone_no")
    var phone_no: String = Constants.EMPTY_STRING

    @JsonProperty(value = "city")
    var city: String = Constants.EMPTY_STRING

    @JsonProperty(value = "doc_id")
    var doc_id: String = Constants.EMPTY_STRING

}