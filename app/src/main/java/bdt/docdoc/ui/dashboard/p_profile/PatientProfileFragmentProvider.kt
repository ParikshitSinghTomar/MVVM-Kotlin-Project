package bdt.docdoc.ui.dashboard.p_profile

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by parikshit on 19/7/19.
 */
@Module
abstract class PatientProfileFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(PatientProfileFragmentModule::class))
    abstract fun providePatientProfileFragmentFactory():PatientProfileFragment

}