package bdt.docdoc.ui.dashboard

import android.databinding.ObservableField
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardViewModel : BaseViewModel {

    var iDataManager: IDataManager
    lateinit var iDashboardNavigator: IDashboardNavigator


    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }



}