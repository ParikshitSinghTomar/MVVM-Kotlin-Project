package bdt.docdoc.repo.remote.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder("date", "bp", "visit_id", "name", "age", "doctor_name","visibility", "temp", "weight", "symptoms", "prescription_list", "precautions")
class MedicalHistory {

    @JsonProperty("date")
    @get:JsonProperty("date")
    @set:JsonProperty("date")
    var date: String? = null

    @JsonProperty("visibility")
    @get:JsonProperty("visibility")
    @set:JsonProperty("visibility")
    var visibility: Boolean = false


    @JsonProperty("name")
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    var name: String? = null

    @JsonProperty("doctor_name")
    @get:JsonProperty("doctor_name")
    @set:JsonProperty("doctor_name")
    var doctorName: String? = null


    @JsonProperty("age")
    @get:JsonProperty("age")
    @set:JsonProperty("age")
    var age: Int? = null


    @JsonProperty("bp")
    @get:JsonProperty("bp")
    @set:JsonProperty("bp")
    var bp: Int? = null
    @JsonProperty("visit_id")
    @get:JsonProperty("visit_id")
    @set:JsonProperty("visit_id")
    var visitId: Int? = null
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
    @JsonProperty("prescription_list")
    @get:JsonProperty("prescription_list")
    @set:JsonProperty("prescription_list")
    var prescriptionList: List<PrescriptionList>? = null
    @JsonProperty("precautions")
    @get:JsonProperty("precautions")
    @set:JsonProperty("precautions")
    var precautions: List<String>? = null


}
