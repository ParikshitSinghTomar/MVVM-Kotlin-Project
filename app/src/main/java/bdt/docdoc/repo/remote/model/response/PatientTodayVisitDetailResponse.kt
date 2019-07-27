package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 25/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class PatientTodayVisitDetailResponse {


//    {
//        "status":true,
//        "message":"Symptoms successfully fetched",
//        "bp":102,
//        "temp":102,
//        "symptoms":["Cough from 7 days","Cold from 2 days","Fever from 1 days"]
//
//    }

    @JsonProperty(value = "status")
    var status=false

    @JsonProperty(value = "message")
    var message=Constants.EMPTY_STRING

    @JsonProperty(value = "bloodPressure")
    var bloodPressure=-1

    @JsonProperty(value = "statempraturetus")
    var temperature=-1


    @JsonProperty(value="symptoms")
    var symptoms = arrayListOf<String>()
    lateinit var errors: String

}