package bdt.docdoc.ui.medicin_list

import bdt.docdoc.common.INavigator
import bdt.docdoc.repo.local.roomdb.entity.Medicine

/**
 * Created by parikshit on 27/7/19.
 */
interface IMedicineListNavigator: INavigator {
    fun showMedicineList(list: ArrayList<Medicine>)
}