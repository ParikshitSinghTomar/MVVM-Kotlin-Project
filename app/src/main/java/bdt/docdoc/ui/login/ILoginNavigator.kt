package bdt.docdoc.ui.login


import bdt.docdoc.common.INavigator
import bdt.docdoc.repo.remote.model.response.UserResponse

/**
 * Created by parikshittomar on 29-05-2019.
 */
interface ILoginNavigator:INavigator {

    fun loginSuccessful(userResponse: UserResponse)

}