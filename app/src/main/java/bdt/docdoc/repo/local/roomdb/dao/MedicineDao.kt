package bdt.docdoc.repo.local.roomdb.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import bdt.docdoc.repo.local.roomdb.entity.Medicine

/**
 * Created by parikshit on 29/7/19.
 */
@Dao
interface MedicineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(patientList: List<Medicine>)

    @Query("SELECT * FROM Medicine")
    fun getMedicineList(): List<Medicine>
}