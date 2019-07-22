package bdt.docdoc.ui.dashboard.p_medicine

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by parikshit on 19/7/19.
 */
@Module
abstract class PatientMedicineFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(PatientMedicineFragmentModule::class))
    abstract fun providePatientMedicineFragmentFactory():PatientMedicineFragment

}