package bdt.docdoc.repo.remote.model.request

import bdt.docdoc.common.Constants
import bdt.docdoc.repo.remote.model.base.BaseRequest
import com.fasterxml.jackson.annotation.JsonProperty


/**
 * Created by user on 12/3/19.
 */
class UserRequest : BaseRequest() {


    @JsonProperty(value = "username")
    private var username: String = Constants.EMPTY_STRING

    @JsonProperty(value = "password")
    private var password: String = Constants.EMPTY_STRING

    @JsonProperty(value = "email")
    private var email: String = Constants.EMPTY_STRING

    @JsonProperty(value = "mobileNo")
    private var mobileNo: String = Constants.EMPTY_STRING

    @JsonProperty(value = "username")
    fun setUsername(username: String) {
        this.username = username
    }

    @JsonProperty(value = "username")
    fun getUsername(): String {
        return username
    }

    @JsonProperty(value = "password")
    fun setPassword(password: String) {
        this.password = password
    }

    @JsonProperty(value = "password")
    fun getPassword(): String {
        return password
    }

    @JsonProperty(value = "email")
    fun setEmail(email: String) {
        this.email = email
    }

    @JsonProperty(value = "email")
    fun getEmail(): String {
        return email
    }

    @JsonProperty(value = "mobileNo")
    fun setMobileNo(mobileNo: String) {
        this.mobileNo = mobileNo
    }

    @JsonProperty(value = "mobileNo")
    fun getMobileNo(): String {
        return mobileNo
    }



    override fun toString(): String {
        return "UserRequest(username='$username', password='$password', email='$email', mobileNo='$mobileNo')"
    }


}