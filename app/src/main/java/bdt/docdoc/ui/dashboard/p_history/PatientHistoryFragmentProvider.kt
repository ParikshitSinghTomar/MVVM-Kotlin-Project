package bdt.docdoc.ui.dashboard.p_history

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by parikshit on 19/7/19.
 */
@Module
abstract class PatientHistoryFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(PatientHistoryFragmentModule::class))
    abstract fun providePatientHistoryFragmentFactory(): PatientHistoryFragment

}