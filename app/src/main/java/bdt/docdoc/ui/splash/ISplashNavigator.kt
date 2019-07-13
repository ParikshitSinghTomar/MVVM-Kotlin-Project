package bdt.docdoc.ui.splash

import bdt.docdoc.common.INavigator

/**
 * Created by parikshittomar on 29-05-2019.
 */
interface ISplashNavigator:INavigator {

    override fun executePendingBindings();
}