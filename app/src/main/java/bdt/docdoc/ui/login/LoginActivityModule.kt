package bdt.docdoc.ui.login

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by user on 12/3/19.
 */
@Module
class LoginActivityModule {

    @Provides
    fun provideRegistrationViewModel(iDataManager: IDataManager):LoginViewModel{
        return LoginViewModel(iDataManager)
    }
}