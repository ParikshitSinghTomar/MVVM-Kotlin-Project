package bdt.docdoc.repo.remote.model.request

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 15/7/19.
 */
class UserRegistrationRequest{

    @JsonProperty(value = "first_name")
    var firstName="NA"

    @JsonProperty(value = "last_name")
    var lastName="NA"

    @JsonProperty(value = "email")
    var email="NA"

    @JsonProperty(value = "primary_phone_no")
    var mobileNo="NA"


}