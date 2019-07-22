package bdt.docdoc.ui.dashboard.p_visit_info

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by parikshit on 19/7/19.
 */
@Module
abstract class PatientFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(PatientFragmentModule::class))
    abstract fun providePatientVisitInfoFragmentFactory():PatientVisitInfoFragment

}