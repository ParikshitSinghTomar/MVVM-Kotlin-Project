package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants.Companion.EMPTY_STRING
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 12/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class UserResponse(){

    @JsonProperty(value = "id")
    var id=-1

    @JsonProperty(value = "firstName")
    var firstName=EMPTY_STRING

    @JsonProperty(value = "lastName")
    var lastName= EMPTY_STRING

    @JsonProperty(value = "email")
    var email= EMPTY_STRING

    @JsonProperty(value = "password")
    var password= EMPTY_STRING

    @JsonProperty(value = "primaryPhoneNo")
    var primaryPhoneNo= EMPTY_STRING

    @JsonProperty(value = "secondryPhoneNo")
    var secondryPhoneNo= EMPTY_STRING

    override fun toString(): String {
        return "UserResponse(id=$id, firstName='$firstName', lastName='$lastName', email='$email', password='$password', primaryPhoneNo='$primaryPhoneNo', secondryPhoneNo='$secondryPhoneNo')"
    }


}