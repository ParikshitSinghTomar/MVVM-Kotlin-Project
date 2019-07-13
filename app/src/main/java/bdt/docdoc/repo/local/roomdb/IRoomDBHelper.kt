package bdt.docdoc.repo.local.room_db

import bdt.docdoc.repo.local.room_db.entity.User

/**
 * Created by user on 12/3/19.
 */
interface IRoomDBHelper {


    fun insertUser(user: User)

    fun findUser(id:Int):Int
}