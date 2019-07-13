package bdt.docdoc.ui.registration

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by user on 12/3/19.
 */
@Module
class RegistrationActivityModule {

    @Provides
    fun provideRegistrationViewModel(iDataManager: IDataManager):RegistrationViewModel{
        return RegistrationViewModel(iDataManager)
    }
}