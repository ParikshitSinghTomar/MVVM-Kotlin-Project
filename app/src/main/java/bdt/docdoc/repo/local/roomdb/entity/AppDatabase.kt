package bdt.docdoc.repo.local.roomdb.entity

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import bdt.docdoc.common.Constants
import bdt.docdoc.repo.local.room_db.dao.UserDao
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.local.roomdb.dao.MedicineDao
import bdt.docdoc.repo.local.roomdb.dao.PatientDao

/**
 * Created by parikshit on 27/6/19.
 */
@Database(version = Constants.DB_VERSION, entities = arrayOf(User::class, Patient::class,Medicine::class))
abstract class AppDatabase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        Constants.DB_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

    abstract fun getUserDao(): UserDao
    abstract fun getPatientDao(): PatientDao
    abstract fun getMedicineDao(): MedicineDao

}