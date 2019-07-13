package bdt.docdoc.repo.local.sharedpref

import android.content.Context
import android.content.SharedPreferences
import bdt.docdoc.BuildConfig
import bdt.docdoc.MyApplication
import bdt.docdoc.common.Constants
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
class SharedPrefHelper : ISharedPrefHelper {

    private var context:Context
    private var shrdPref:SharedPreferences
    private var editor:SharedPreferences.Editor

    private val IS_USER_AUTHENTIC="is_user_authentic"

    @Inject constructor(){
        context = MyApplication.application
        shrdPref=context.getSharedPreferences(Constants.PREF_NAME,Context.MODE_PRIVATE)
        editor=shrdPref.edit()
    }

    override fun isUserAuthentic(): Boolean {
        return  shrdPref.getBoolean(IS_USER_AUTHENTIC,false)
    }
}