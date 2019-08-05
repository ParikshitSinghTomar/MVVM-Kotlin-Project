package bdt.docdoc.repo.remote.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder("line1", "line2", "city", "pincode", "location")
class Address {

    @JsonProperty("line1")
    @get:JsonProperty("line1")
    @set:JsonProperty("line1")
    var line1: String? = null
    @JsonProperty("line2")
    @get:JsonProperty("line2")
    @set:JsonProperty("line2")
    var line2: String? = null
    @JsonProperty("city")
    @get:JsonProperty("city")
    @set:JsonProperty("city")
    var city: String? = null
    @JsonProperty("pincode")
    @get:JsonProperty("pincode")
    @set:JsonProperty("pincode")
    var pincode: String? = null
    @JsonProperty("state")
    @get:JsonProperty("state")
    @set:JsonProperty("state")
    var state: String? = null
    @JsonProperty("location")
    @get:JsonProperty("location")
    @set:JsonProperty("location")
    var location: List<Double>? = null


}
