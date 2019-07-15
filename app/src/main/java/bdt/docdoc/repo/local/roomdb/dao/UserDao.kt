package bdt.docdoc.repo.local.room_db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import bdt.docdoc.repo.local.room_db.entity.User

/**
 * Created by user on 12/3/19.
 */
@Dao
interface UserDao {

    @Insert
    fun insert(user: User)

    @Query("SELECT COUNT(*) FROM User where id=:id")
    fun findUser(id: Int): Int

    @Query("SELECT * FROM User")
    fun findUser2(): List<User>

}