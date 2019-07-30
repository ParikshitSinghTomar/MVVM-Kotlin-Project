package bdt.docdoc.ui.dashboard.p_visit_info

import bdt.docdoc.repo.local.roomdb.entity.Medicine
import bdt.docdoc.repo.remote.model.common.CommonObjectSymptomsDescription
import bdt.docdoc.repo.remote.model.common.MedicineDescription
import bdt.docdoc.repo.remote.model.common.Symptoms

/**
 * Created by parikshit on 27/7/19.
 */
interface IVisitInfoAdaterBindListener {

    fun startMedicineListActivity(ojb: CommonObjectSymptomsDescription)
    fun removeSymptom(symptoms: Symptoms)
    fun removeMedicine(medicineDescription: MedicineDescription)
}