package bdt.docdoc.repo.local.roomdb.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by parikshit on 15/7/19.
 */

@Dao
interface PatientDao {

    @Insert
    fun insert(patientList: List<Patient>)

}