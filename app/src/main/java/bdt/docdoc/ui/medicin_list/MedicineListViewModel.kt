package bdt.docdoc.ui.medicin_list

import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by parikshit on 27/7/19.
 */
class MedicineListViewModel : BaseViewModel {

    lateinit var iDataManager: IDataManager

    constructor(iDataManager: IDataManager) : super(iDataManager) {
        this.iDataManager = iDataManager
    }

    fun getListOfMedicine() {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }
}