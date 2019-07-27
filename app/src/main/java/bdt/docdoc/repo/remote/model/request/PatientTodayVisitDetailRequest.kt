package bdt.docdoc.repo.remote.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 25/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class PatientTodayVisitDetailRequest {

    @JsonProperty(value = "id")
    var patientID=-1

    @JsonProperty(value = "visit_id")
    var patientVisitID=-1

    @JsonProperty(value = "doc_id")
    var docID=-1


}