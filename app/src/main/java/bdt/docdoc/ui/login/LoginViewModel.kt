package bdt.docdoc.ui.login

import android.util.Log
import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.common.Constants
import bdt.docdoc.common.Constants.Companion.EMPTY_STRING
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.UserBaseResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */

class LoginViewModel
    : BaseViewModel {

    private val TAG: String = LoginViewModel::class.simpleName.toString()

    private var iDataManager: IDataManager
    private var baseResponse = UserBaseResponse()


    @Inject constructor(iDataManager: IDataManager) : super(iDataManager) {
        super.BaseViewModel(iDataManager)
        this.iDataManager = iDataManager
    }


    fun onSignIn(username: String, password: String) {

        var userRequest = UserRequest()
        userRequest.setUsername(username)
        userRequest.setPassword(password)
        userRequest.setEmail(username)
        userRequest.setMobileNo(username)


        viewModelScope.launch(Dispatchers.IO) {
            var error = Constants.EMPTY_STRING
            try {
                baseResponse = iDataManager.login(userRequest)
                Log.e(TAG, baseResponse.status.toString())
                Log.e(TAG, baseResponse.message)
            } catch (e: Exception) {
                error = e.cause.toString()
                e.printStackTrace()
            }

            if (error.equals(EMPTY_STRING) && baseResponse.status) {
                saveUser(baseResponse)
            } else {
                (getNavigator() as ILoginNavigator).showError(error)
            }

        }

    }

    private fun saveUser(userBaseResponse: UserBaseResponse) {

        Log.e(TAG, userBaseResponse.toString())
        var data = userBaseResponse.data
        var user = User(data.id, data.firstName,
                data.lastName, data.email,
                data.password, data.primaryPhoneNo,
                data.secondryPhoneNo)

        var count=iDataManager.findUser(user.id)
        if(count==0){
            iDataManager.insertUser(user)
            Log.e(TAG, data.toString())
        }
        viewModelScope.launch(Dispatchers.Main) {
            if (userBaseResponse.errors.equals(EMPTY_STRING) && userBaseResponse.status) {
                updateLoginStatus()
                (getNavigator() as ILoginNavigator).loginSuccessful(userBaseResponse.data)
            } else {
                (getNavigator() as ILoginNavigator).showError(userBaseResponse.errors)
            }
        }

    }

    private fun updateLoginStatus(){
        viewModelScope.launch(Dispatchers.IO){
            iDataManager.setUserAuthentic(true)
        }
    }

    private fun register(){
        (getNavigator() as ILoginNavigator).registration()
    }

}