package bdt.docdoc.ui.dashboard.p_visit_info

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 19/7/19.
 */
@Module
class PatientFragmentModule {

    @Provides
    fun providesPatientVisitInfoViewModel(iDataManager: IDataManager):PatientVisitInfoViewModel{
        return PatientVisitInfoViewModel(iDataManager)
    }

}