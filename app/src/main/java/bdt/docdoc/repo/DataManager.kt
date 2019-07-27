package bdt.docdoc.repo

import bdt.docdoc.repo.local.room_db.IRoomDBHelper
import bdt.docdoc.repo.local.room_db.entity.User
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper
import bdt.docdoc.repo.local.storage.IStorageHelper
import bdt.docdoc.repo.remote.model.request.PatientListRequest
import bdt.docdoc.repo.remote.model.request.PatientTodayVisitDetailRequest
import bdt.docdoc.repo.remote.model.request.UserRegistrationRequest
import bdt.docdoc.repo.remote.model.request.UserRequest
import bdt.docdoc.repo.remote.model.response.PatientListResponse
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse
import bdt.docdoc.repo.remote.model.response.UserBaseResponse
import bdt.docdoc.repo.remote.model.response.UserRegistrationResponse
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper
import dagger.Module
import javax.inject.Inject

/**
 * Created by user on 12/3/19.
 */
@Module
class DataManager : IDataManager {



    var iRoomDBHelper: IRoomDBHelper
    var iStorageHelper: IStorageHelper
    var iSharedPrefHelper: ISharedPrefHelper
    var iRestAPIHelper: IRestAPIHelper

    @Inject
    constructor(
            iRoomDBHelper: IRoomDBHelper
            , iStorageHelper: IStorageHelper
            , iSharedPrefHelper: ISharedPrefHelper
            , iRestAPIHelper: IRestAPIHelper
    ) {
        this.iRestAPIHelper = iRestAPIHelper
        this.iStorageHelper = iStorageHelper
        this.iSharedPrefHelper = iSharedPrefHelper
        this.iRoomDBHelper = iRoomDBHelper
    }

    override fun isUserAuthentic(): Boolean {
        return iSharedPrefHelper.isUserAuthentic()
    }

    override fun login(userRequest: UserRequest): UserBaseResponse {
        return iRestAPIHelper.login(userRequest)
    }

    override fun insertUser(user: User) {
        iRoomDBHelper.insertUser(user)
    }

    override fun findUser(id: Int): Int {
        return iRoomDBHelper.findUser(id)
    }

    override fun register(request: UserRegistrationRequest): UserRegistrationResponse {
        return iRestAPIHelper.register(request)
    }

    override fun getCurrentUser(): User {
        return iRoomDBHelper.getCurrentUser()
    }

    override fun patientService(request: PatientListRequest): PatientListResponse {
        return iRestAPIHelper.patientService(request)
    }

    override fun savePatient(patientEntityList: List<Patient>) {
        iRoomDBHelper.savePatient(patientEntityList)
    }
    override fun getPatientTodayVisitDetail(patientTodayVisitDetailRequest: PatientTodayVisitDetailRequest): PatientTodayVisitDetailResponse {
        return iRestAPIHelper.getPatientTodayVisitDetail(patientTodayVisitDetailRequest)
    }

    override fun setUserAuthentic(status: Boolean) {
        iSharedPrefHelper.setUserAuthentic(status)
    }
}