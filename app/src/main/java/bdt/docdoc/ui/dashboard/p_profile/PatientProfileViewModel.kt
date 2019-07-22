package bdt.docdoc.ui.dashboard.p_profile

import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.DataManager
import bdt.docdoc.repo.IDataManager

/**
 * Created by parikshit on 19/7/19.
 */
class PatientProfileViewModel: BaseViewModel {

    var iDataManager: IDataManager

    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }

}