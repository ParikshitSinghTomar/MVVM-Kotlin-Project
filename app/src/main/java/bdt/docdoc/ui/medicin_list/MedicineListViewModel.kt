package bdt.docdoc.ui.medicin_list

import androidx.lifecycle.viewModelScope
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import bdt.docdoc.repo.remote.model.response.MedicineListResponse
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
            var medicineListResponse = iDataManager.getMedicineList()
            viewModelScope.launch(Dispatchers.Main) {
                if (medicineListResponse.status && medicineListResponse.errors.length == 0) {
                    saveMedicineInDB(medicineListResponse)
                } else {
                    (getNavigator() as IMedicineListNavigator).showError(medicineListResponse.errors)
                }
            }
        }
    }

    private fun saveMedicineInDB(medicineListResponse: MedicineListResponse) {
        viewModelScope.launch(Dispatchers.IO){

            var list=ArrayList<Medicine>()
            for(medicine in medicineListResponse.data){
                list.add(Medicine(medicine.id,medicine.name,medicine.description,medicine.detail_url))
            }
            iDataManager.saveMedicineList(list)

            viewModelScope.launch(Dispatchers.Main){
                (getNavigator() as IMedicineListNavigator).showMedicineList(list)
            }
        }
    }
}