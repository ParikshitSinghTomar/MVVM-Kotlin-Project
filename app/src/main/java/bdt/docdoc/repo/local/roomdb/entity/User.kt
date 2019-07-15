package bdt.docdoc.repo.local.room_db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by user on 12/3/19.
 */
@Entity(tableName = "user")
class User (@PrimaryKey
            var id: Int,
            @ColumnInfo(name = "firstname") var firstname:String
            , @ColumnInfo(name = "lastname") var lastname:String
            , @ColumnInfo(name = "email") var email:String
            , @ColumnInfo(name = "password") var password:String
            , @ColumnInfo(name = "secondryPhoneNo") var secondryPhoneNo:String
            , @ColumnInfo(name = "primaryPhoneNo") var primaryPhoneNo:String)