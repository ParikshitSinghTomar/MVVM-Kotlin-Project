package bdt.docdoc.repo.local.roomdb.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by parikshit on 15/7/19.
 */

@Dao
interface PatientDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(patientList: List<Patient>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPatient(patient: Patient)

    @Query("SELECT * FROM Patient")
    fun getPatientList(): List<Patient>

}