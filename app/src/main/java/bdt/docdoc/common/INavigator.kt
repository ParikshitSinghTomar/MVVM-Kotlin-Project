package bdt.docdoc.common


/**
 * Created by parikshit on 3/7/19.
 */
interface INavigator {

   fun executePendingBindings()
   fun showError(error:String)
   fun showToast(error:String)
   fun showSuccess(success:String)
}