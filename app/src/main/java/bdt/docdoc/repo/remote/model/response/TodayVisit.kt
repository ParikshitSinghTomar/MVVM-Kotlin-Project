package bdt.docdoc.repo.remote.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder("bp", "temp", "weight", "symptoms")
class TodayVisit {

    @JsonProperty("bp")
    @get:JsonProperty("bp")
    @set:JsonProperty("bp")
    var bp: Int? = null
    @JsonProperty("temp")
    @get:JsonProperty("temp")
    @set:JsonProperty("temp")
    var temp: Int? = null
    @JsonProperty("weight")
    @get:JsonProperty("weight")
    @set:JsonProperty("weight")
    var weight: Int? = null
    @JsonProperty("symptoms")
    @get:JsonProperty("symptoms")
    @set:JsonProperty("symptoms")
    var symptoms: List<String>? = null

}
