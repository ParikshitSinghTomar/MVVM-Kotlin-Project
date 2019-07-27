package bdt.docdoc.repo.local.sharedpref

/**
 * Created by user on 12/3/19.
 */
interface ISharedPrefHelper {

    fun isUserAuthentic(): Boolean
    fun setUserAuthentic(status: Boolean)
}