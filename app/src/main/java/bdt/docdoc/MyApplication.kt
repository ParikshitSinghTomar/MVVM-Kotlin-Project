package bdt.docdoc

import android.app.Activity
import android.app.Application
import android.location.LocationManager
import bdt.docdoc.di.component.ApplicationComponent
import bdt.docdoc.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import org.loop.example.di.module.AndroidModule
import javax.inject.Inject
import dagger.android.DispatchingAndroidInjector




/**
 * Created by loop on 09/12/14.
 */

class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }

    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var graph: ApplicationComponent
        @JvmStatic lateinit var application:MyApplication
        @JvmStatic var dynamicUrl=HashMap<String,String>()
    }

    @Inject
    lateinit var locationManager: LocationManager

    override fun onCreate() {
        super.onCreate()
        application=this
        graph = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
        graph.inject(this)


        println("App: $locationManager")
        //TODO do some other cool stuff here
    }
}