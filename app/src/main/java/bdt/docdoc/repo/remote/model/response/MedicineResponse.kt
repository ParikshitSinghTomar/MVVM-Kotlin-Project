package bdt.docdoc.repo.remote.model.response

import bdt.docdoc.common.Constants
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by parikshit on 27/7/19.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class MedicineResponse {

    @JsonProperty(value = "_id")
    var id = -1

    @JsonProperty(value = "name")
    val name: String = Constants.EMPTY_STRING
    @JsonProperty(value = "description")
    val description: String = Constants.EMPTY_STRING
    @JsonProperty(value = "detail_url")
    val detail_url: String = Constants.EMPTY_STRING

    override fun toString(): String {
        return "MedicineResponse(id=$id, name='$name', description='$description', detail_url='$detail_url')"
    }


}