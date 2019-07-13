package bdt.docdoc.di.component

import bdt.docdoc.MyApplication
import bdt.docdoc.ui.splash.SplashActivity
import dagger.Component
import org.loop.example.di.module.AndroidModule
import pari.docdoc.di.builder.ActivityBuilder
import javax.inject.Singleton
import android.app.Application
import dagger.BindsInstance



/**
 * Created by loop on 14/12/14.
 */
@Singleton
@Component(modules = arrayOf(AndroidModule::class,ActivityBuilder::class))
interface ApplicationComponent {
    fun inject(application: MyApplication)

}
