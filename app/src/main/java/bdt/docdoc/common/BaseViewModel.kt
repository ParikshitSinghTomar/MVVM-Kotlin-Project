package bdt.docdoc.common


import android.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bdt.docdoc.repo.IDataManager
import kotlinx.coroutines.*
import java.lang.ref.WeakReference

/**
 * Created by user on 12/3/19.
 */
abstract class BaseViewModel(iDataManager: IDataManager) : ViewModel() {

    private var mNavigator: INavigator? = null
    private var mDataManager: IDataManager? = null
    private val isLoading: ObservableField<Boolean>? = ObservableField(false)

    fun BaseViewModel(iDataManager: IDataManager) {
        this.mDataManager = iDataManager
    }

    open fun setNavigator(mNavigator: INavigator) {
        this.mNavigator = mNavigator
    }

    open fun getNavigator(): INavigator? {
        return mNavigator
    }

    open fun getDataManager(): IDataManager? {
        return mDataManager
    }


    open fun doIOCall(doIOCaller: IOCaller,ioListener: IOListener){
        viewModelScope.launch(Dispatchers.IO){
           try {
               var t= doIOCaller.performIOCall()
               viewModelScope.launch(Dispatchers.Main){
                   ioListener.success(t)
               }
           }catch (e:Exception){
               viewModelScope.launch(Dispatchers.Main){
                    ioListener.error(e.fillInStackTrace())
               }
           }

        }
    }

    interface IOCaller{
        fun performIOCall()
    }
    interface IOListener{
        fun error(t:Throwable)
        fun success(any:Any)
    }

//    open fun getSchedulerProvider(): IScheduleProvider? {
//        return mScheduleProvider
//    }
//
//    open fun getCompositeDisposable(): CompositeDisposable? {
//        return mCompositeDisposable
//    }

    open fun setIsLoading(isLoading: Boolean) {
        this.isLoading!!.set(isLoading)
    }

    open fun isLoading(): Boolean {
        return this.isLoading!!.get()
    }

    override fun onCleared() {
        super.onCleared()
    }



}