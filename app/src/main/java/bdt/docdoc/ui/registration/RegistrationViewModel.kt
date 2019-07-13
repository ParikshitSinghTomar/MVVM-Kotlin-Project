package bdt.docdoc.ui.registration

import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.DataManager
import bdt.docdoc.repo.IDataManager
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */

class RegistrationViewModel : BaseViewModel {

    var iDataManager: IDataManager

    @Inject constructor(iDataManager: IDataManager) : super(iDataManager) {
        super.BaseViewModel(iDataManager)
        this.iDataManager = iDataManager
    }

}