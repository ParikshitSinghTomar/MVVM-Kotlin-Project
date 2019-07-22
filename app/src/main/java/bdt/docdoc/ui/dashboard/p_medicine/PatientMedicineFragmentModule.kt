package bdt.docdoc.ui.dashboard.p_medicine

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 19/7/19.
 */
@Module
class PatientMedicineFragmentModule {

    @Provides
    fun providesPatientMedicineViewModel(iDataManager: IDataManager):PatientMedicineViewModel{
        return PatientMedicineViewModel(iDataManager)
    }

}