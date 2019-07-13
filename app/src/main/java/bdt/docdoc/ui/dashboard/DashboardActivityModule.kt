package bdt.docdoc.ui.dashboard

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 13/7/19.
 */
@Module
class DashboardActivityModule {

    @Provides
    fun provideDashboardViewModel(iDataManager: IDataManager):DashboardViewModel{
        return DashboardViewModel(iDataManager = iDataManager)
    }

}