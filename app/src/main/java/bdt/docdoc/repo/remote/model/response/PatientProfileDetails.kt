package bdt.docdoc.repo.remote.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder("status", "message", "today_visit", "email", "phone_no", "profile_url", "basic_medical_report", "address", "medical_history")
class PatientProfileDetails {

    @JsonProperty("status")
    @get:JsonProperty("status")
    @set:JsonProperty("status")
    var status: Boolean? = null


    @JsonProperty("message")
    @get:JsonProperty("message")
    @set:JsonProperty("message")
    var message: String? = null


    @JsonProperty("today_visit")
    @get:JsonProperty("today_visit")
    @set:JsonProperty("today_visit")
    var todayVisit: TodayVisit? = null

    @JsonProperty("name")
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    var name: String? = null


    @JsonProperty("email")
    @get:JsonProperty("email")
    @set:JsonProperty("email")
    var email: String? = null

    @JsonProperty("phone_no")
    @get:JsonProperty("phone_no")
    @set:JsonProperty("phone_no")
    var phoneNo: String? = null


    @JsonProperty("profile_url")
    @get:JsonProperty("profile_url")
    @set:JsonProperty("profile_url")
    var profileUrl: String? = null


    @JsonProperty("basic_medical_report")
    @get:JsonProperty("basic_medical_report")
    @set:JsonProperty("basic_medical_report")
    var basicMedicalReport: List<String>? = null

    @JsonProperty("address")
    @get:JsonProperty("address")
    @set:JsonProperty("address")
    var address: Address? = null

    @JsonProperty("medical_history")
    @get:JsonProperty("medical_history")
    @set:JsonProperty("medical_history")
    var medicalHistory: List<MedicalHistory>? = null


    @JsonProperty("errors")
    @get:JsonProperty("errors")
    @set:JsonProperty("errors")
    var errors: String? = null


}
