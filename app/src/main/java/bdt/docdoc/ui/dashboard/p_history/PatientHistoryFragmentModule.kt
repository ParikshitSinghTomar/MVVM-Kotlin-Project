package bdt.docdoc.ui.dashboard.p_history

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 19/7/19.
 */
@Module
class PatientHistoryFragmentModule {

    @Provides
    fun providesPatientHistoryViewModel(iDataManager: IDataManager):PatientHistoryViewModel{
        return PatientHistoryViewModel(iDataManager)
    }

}