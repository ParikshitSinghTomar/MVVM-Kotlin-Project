package bdt.docdoc.ui.splash

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by user on 12/3/19.
 */
@Module
class SplashActivityModule {

    @Provides
    fun provideSplashViewModel(iDataManager: IDataManager):SplashViewModel{
        return SplashViewModel(iDataManager)
    }
}