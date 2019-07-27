package bdt.docdoc.ui.medicin_list

import bdt.docdoc.repo.IDataManager
import dagger.Module
import dagger.Provides

/**
 * Created by parikshit on 27/7/19.
 */
@Module
class MedicineListActivityModule {

    @Provides
    fun provideMedicineListViewModel(iDataManager: IDataManager):MedicineListViewModel{
        return MedicineListViewModel(iDataManager)
    }

}