package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 27/7/19.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class MedicineResponse {

    @JsonProperty(value = "visit_id")
    var id = -1

    @JsonProperty(value = "visit_id")
    val name: String = Constants.EMPTY_STRING
    @JsonProperty(value = "visit_id")
    val description: String = Constants.EMPTY_STRING
    @JsonProperty(value = "visit_id")
    val detail_url: String = Constants.EMPTY_STRING

    override fun toString(): String {
        return "MedicineResponse(id=$id, name='$name', description='$description', detail_url='$detail_url')"
    }


}