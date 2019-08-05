package bdt.docdoc.repo.remote.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder("medicine_name", "days", "times_in_a_day", "remarks")
class PrescriptionList {

    @JsonProperty("medicine_name")
    @get:JsonProperty("medicine_name")
    @set:JsonProperty("medicine_name")
    var medicineName: String? = null
    @JsonProperty("days")
    @get:JsonProperty("days")
    @set:JsonProperty("days")
    var days: Int? = null
    @JsonProperty("times_in_a_day")
    @get:JsonProperty("times_in_a_day")
    @set:JsonProperty("times_in_a_day")
    var timesInADay: Int? = null
    @JsonProperty("remarks")
    @get:JsonProperty("remarks")
    @set:JsonProperty("remarks")
    var remarks: String? = null


}
