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
        val PERMISSIONS = listOf(
                Manifest.permission.INTERNET,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_NETWORK_STATE
        )
        val FRAGMENT_PATIENT_INFO: String = "patient_info_fragment"
        val FRAGMENT_PATIENT_PROFILE: String = "patient_profile_fragment"
        val FRAGMENT_PATIENT_HISTORY: String = "patient_history_fragment"
        val FRAGMENT_PATIENT_MEDICINE: String = "patient_medicine_fragment"
        val SYMPTOMS: String = "Symptoms"
        val ADD_SYMPTOMS: String = "Tap to add Symptoms"
        val MEDICINE: String = "Medicine"
        val ADD_MEDICINE: String = "Tap to add Medicine"
        val PRECAUTIONS: String = "Precautions"
        val ADD_PRECAUTIONS: String = "Tap to add Precaution"
    }
}