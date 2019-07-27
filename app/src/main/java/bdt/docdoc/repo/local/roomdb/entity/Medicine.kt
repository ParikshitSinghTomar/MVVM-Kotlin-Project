package bdt.docdoc.repo.local.roomdb.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by parikshit on 27/7/19.
 */
@Entity
data class Medicine(@PrimaryKey val _id: Int,
                    val name: String,
                    val description: String,
                    val detail_url: String)