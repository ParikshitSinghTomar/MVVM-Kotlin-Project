package bdt.docdoc.ui.splash

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.util.Log
import bdt.docdoc.common.BaseViewModel
import bdt.docdoc.repo.IDataManager
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */

class SplashViewModel
    : BaseViewModel{

    var iDataManager: IDataManager

    @Inject constructor(iDataManager: IDataManager) : super(iDataManager) {
        super.BaseViewModel(iDataManager)
        this.iDataManager = iDataManager
    }

    private val _counter = MutableLiveData<Int>()

    val counter: LiveData<Int> = _counter


    fun isUserAuthentic(): Boolean {
        return iDataManager.isUserAuthentic()
    }

    fun incrementCounter() {
        var x: Int? = counter.value
        if (x == null) {
            x = 0
        } else {
            x = x + 1
        }
        _counter.value = x

        getNavigator()!!.executePendingBindings()

        Log.d(SplashViewModel::class.java.name, x.toString() + ", " + (_counter.value).toString())
    }


}