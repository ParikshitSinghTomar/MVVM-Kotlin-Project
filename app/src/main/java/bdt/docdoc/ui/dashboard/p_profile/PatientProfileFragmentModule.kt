package bdt.docdoc.ui.dashboard.p_profile

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 19/7/19.
 */
@Module
class PatientProfileFragmentModule {

    @Provides
    fun providesPatientProfileViewModel(iDataManager: IDataManager):PatientProfileViewModel{
        return PatientProfileViewModel(iDataManager)
    }

}