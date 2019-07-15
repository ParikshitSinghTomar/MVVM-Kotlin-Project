package bdt.docdoc.repo.local.room_db

import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by user on 12/3/19.
 */
interface IRoomDBHelper {


    fun insertUser(user: User)

    fun findUser(id: Int): Int

    fun getCurrentUser(): User

    fun savePatient(patientEntityList: List<Patient>)

}