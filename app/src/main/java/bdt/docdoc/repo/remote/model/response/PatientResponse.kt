package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants.Companion.EMPTY_STRING
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 15/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class PatientResponse {

    @JsonProperty(value = "visit_id")
    var id=-1

    @JsonProperty(value = "patient_id")
    var patientID=-1

    @JsonProperty(value = "name")
    var name= EMPTY_STRING

    @JsonProperty(value = "address")
    var address= EMPTY_STRING

    @JsonProperty(value = "email")
    var email= EMPTY_STRING

    @JsonProperty(value = "age")
    var age= -1

    @JsonProperty(value = "mobileNo")
    var mobileNo= EMPTY_STRING

    @JsonProperty(value = "visit_count")
    var visit_count= 0

    @JsonProperty(value = "visit_done")
    var visit_done= false

}