package bdt.docdoc.ui.login

import android.util.Log
import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.common.Constants
import bdt.docdoc.common.Constants.Companion.EMPTY_STRING
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.BaseResponse
import bdt.docdoc.repo.remote.model.response.UserResponse
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
    private var userResponse = UserResponse()
    private var baseResponse = BaseResponse()

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

//            viewModelScope.launch(Dispatchers.Main){
//                if(error.equals(EMPTY_STRING)&&userResponse.status){
//                    (getNavigator() as IDashboardNavigator).loginSuccessful(userResponse)
//                }else{
//                    (getNavigator() as IDashboardNavigator).showError(error)
//                }
//
//            }
        }

    }

    private fun saveUser(baseResponse: BaseResponse) {


        Log.e(TAG, baseResponse.toString())
        var data = baseResponse.data
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
            if (baseResponse.errors.equals(EMPTY_STRING) && baseResponse.status) {
                (getNavigator() as ILoginNavigator).loginSuccessful(baseResponse.data)
            } else {
                (getNavigator() as ILoginNavigator).showError(baseResponse.errors)
            }
        }

    }


}