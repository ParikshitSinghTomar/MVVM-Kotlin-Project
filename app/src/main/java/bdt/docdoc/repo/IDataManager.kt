package bdt.docdoc.repo

import bdt.docdoc.repo.local.room_db.IRoomDBHelper
import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper
import bdt.docdoc.repo.local.storage.IStorageHelper
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper


/**
 * Created by user on 12/3/19.
 */
interface IDataManager : IRoomDBHelper, ISharedPrefHelper, IRestAPIHelper, IStorageHelper {
}