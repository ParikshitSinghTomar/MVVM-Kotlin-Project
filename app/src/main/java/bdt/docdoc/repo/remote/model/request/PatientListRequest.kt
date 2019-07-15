package bdt.docdoc.repo.remote.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 15/7/19.
 */
class PatientListRequest {


    @JsonProperty(value = "doc_id")
    var docID=-1

    @JsonProperty(value = "token")
    var token="NA"

}