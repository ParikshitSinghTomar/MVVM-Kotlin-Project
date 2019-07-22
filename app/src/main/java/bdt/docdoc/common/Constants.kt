package bdt.docdoc.common

import android.Manifest

/**
 * Created by parikshit on 27/6/19.
 */
class Constants {

    companion object {
        const val DB_VERSION = 1
        const val DB_NAME = "app_database"
        const val PREF_NAME: String = "app_pref"
        const val EMPTY_STRING: String = ""
        val PERMISSIONS= listOf(
                Manifest.permission.INTERNET,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_NETWORK_STATE
                )
        val FRAGMENT_PATIENT_INFO: String="patient_info_fragment"
    }
}