package bdt.docdoc.repo.local.roomdb.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by parikshit on 15/7/19.
 */
@Entity(tableName = "patient")
data class Patient(@PrimaryKey
                   var visit_id: Int,
                   @ColumnInfo(name = "patient_id") var patient_id: Int,
                   @ColumnInfo(name = "name") var name: String
                   , @ColumnInfo(name = "address") var address: String
                   , @ColumnInfo(name = "profileUrl") var profileUrl: String
                   , @ColumnInfo(name = "email") var email: String
                   , @ColumnInfo(name = "age") var age: Int
                   , @ColumnInfo(name = "mobileNo") var mobileNo: String
                   , @ColumnInfo(name = "visit_count") var primaryPhoneNo: Int
                   , @ColumnInfo(name = "visit_done") var visit_done: Boolean)