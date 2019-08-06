package bdt.docdoc.repo.remote.model.request

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 6/8/19.
 */
class PhoneNoExistRequest {

    @JsonProperty(value = "phone_no")
    var phone_no: String = Constants.EMPTY_STRING

    @JsonProperty(value = "doc_id")
    var doc_id: String = Constants.EMPTY_STRING

}