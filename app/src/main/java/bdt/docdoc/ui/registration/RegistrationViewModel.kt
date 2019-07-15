package bdt.docdoc.ui.registration

import android.databinding.ObservableField
import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.DataManager
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.response.UserRegistrationResponse
import bdt.docdoc.ui.dashboard.IDashboardNavigator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */

class RegistrationViewModel : BaseViewModel {

    var iDataManager: IDataManager

    var firstNameObservableField = ObservableField<String>()

    var lastNameObservableField = ObservableField<String>()

    var emailObservableField = ObservableField<String>()

    var mobileNoObservableField = ObservableField<String>()

    @Inject constructor(iDataManager: IDataManager) : super(iDataManager) {
        super.BaseViewModel(iDataManager)
        this.iDataManager = iDataManager
    }

    fun signUp() {
        (getNavigator() as IRegistrationNavigator).signUp()
    }

    fun signUpService(request: UserRegistrationRequest) {
        viewModelScope.launch(Dispatchers.IO) {
            var userRegistrationResponse = iDataManager.register(request)
            saveUser(userRegistrationResponse)
        }

    }

    private fun saveUser(userRegistrationResponse: UserRegistrationResponse) {

        viewModelScope.launch(Dispatchers.Main) {
            if (userRegistrationResponse.status) {
                (getNavigator() as IRegistrationNavigator).showDashboard()
            } else {
                (getNavigator() as IRegistrationNavigator).showError(userRegistrationResponse.errors)
            }

        }
    }

}