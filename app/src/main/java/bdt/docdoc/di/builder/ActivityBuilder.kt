package pari.docdoc.di.builder

import bdt.docdoc.ui.dashboard.DashboardActivity
import bdt.docdoc.ui.dashboard.DashboardActivityModule
import bdt.docdoc.ui.dashboard.p_visit_info.PatientFragmentProvider
import bdt.docdoc.ui.login.LoginActivity
import bdt.docdoc.ui.login.LoginActivityModule
import bdt.docdoc.ui.registration.RegistrationActivity
import bdt.docdoc.ui.registration.RegistrationActivityModule
import bdt.docdoc.ui.splash.SplashActivity
import bdt.docdoc.ui.splash.SplashActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by user on 12/3/19.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(SplashActivityModule::class))
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = arrayOf(RegistrationActivityModule::class))
    abstract fun bindRegistrationActivity():RegistrationActivity


    @ContributesAndroidInjector(modules = arrayOf(LoginActivityModule::class))
    abstract fun bindLoginActivity(): LoginActivity


    @ContributesAndroidInjector(modules = arrayOf(DashboardActivityModule::class, PatientFragmentProvider::class))
    abstract fun bindDashboardActivity(): DashboardActivity
}