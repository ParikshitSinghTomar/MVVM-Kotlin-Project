package bdt.docdoc.ui.dashboard

import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardViewModel: BaseViewModel{

    lateinit var iDataManager:IDataManager

    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager=iDataManager
    }



}