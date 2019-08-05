package bdt.docdoc.ui.dashboard

import bdt.docdoc.repo.IDataManager
import bdt.docdoc.ui.dashboard.p_history.PatientHistoryFragment
import bdt.docdoc.ui.dashboard.p_medicine.PatientMedicineFragment
import bdt.docdoc.ui.dashboard.p_profile.PatientProfileFragment
import bdt.docdoc.ui.dashboard.p_visit_info.PatientVisitInfoFragment
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 13/7/19.
 */
@Module
class DashboardActivityModule {

    @Provides
    fun provideDashboardViewModel(iDataManager: IDataManager): DashboardViewModel {
        return DashboardViewModel(iDataManager = iDataManager)
    }

    @Provides
    fun providePatientVisitInfoFragment(): PatientVisitInfoFragment {
        return PatientVisitInfoFragment.newInstance()
    }

    @Provides
    fun providePatientProfileFragment(): PatientProfileFragment {
        return PatientProfileFragment.newInstance()
    }

    @Provides
    fun providePatientHistoryFragment(): PatientHistoryFragment {
        return PatientHistoryFragment.newInstance()
    }

    @Provides
    fun providePatientMedicineFragment(): PatientMedicineFragment {
        return PatientMedicineFragment.newInstance()
    }


}