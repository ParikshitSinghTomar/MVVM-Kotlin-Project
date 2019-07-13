package bdt.docdoc.repo.local.roomdb

import bdt.docdoc.repo.local.room_db.IRoomDBHelper
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.local.roomdb.entity.AppDatabase
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by parikshittomar on 01-06-2019.
 */
@Singleton
class RoomDBHelper:IRoomDBHelper{


    var appDatabase:AppDatabase
    @Inject constructor(mAppDatabase: AppDatabase){
        this.appDatabase=mAppDatabase
    }

    override fun insertUser(user: User) {
        appDatabase.getUserDao().insert(user)
    }
    override fun findUser(id: Int): Int {
       return appDatabase.getUserDao().findUser(id)
    }
}