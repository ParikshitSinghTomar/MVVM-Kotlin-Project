package org.loop.example.di.module

import `in`.pari.docdoc.repo.remote.rest_api_helper.RestAPIHelper
import `in`.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService
import android.app.Application
import android.content.Context
import android.location.LocationManager
import bdt.docdoc.BuildConfig
import bdt.docdoc.MyApplication
import bdt.docdoc.repo.DataManager
import bdt.docdoc.repo.IDataManager
import bdt.docdoc.repo.local.room_db.IRoomDBHelper
import bdt.docdoc.repo.local.roomdb.RoomDBHelper
import bdt.docdoc.repo.local.roomdb.entity.AppDatabase
import bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper
import bdt.docdoc.repo.local.sharedpref.SharedPrefHelper
import bdt.docdoc.repo.local.storage.IStorageHelper
import bdt.docdoc.repo.local.storage.StorageHelper
import bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper
import bdt.docdoc.util.call_adapter.SimpleCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import org.loop.example.di.info.ForApplication
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * A module for Android-specific dependencies which require a [android.content.Context] or [ ] to create.
 */
@Module
class AndroidModule(private val application: Application) {

    /**
     * Allow the application context to be injected but require that it be annotated with [ ][ForApplication] to explicitly differentiate it from an activity context.
     */
    @Provides
    @Singleton
    fun provideApplicationContext(application: Application): Context = application


//    @Provides
//    @Singleton
//    fun provideApplicationContext(application: Application):Context{
//        return application
//    }

    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager =
            application.getSystemService(Context.LOCATION_SERVICE) as LocationManager


    @Provides
    @Singleton
    fun provideDataManager(dataManager: DataManager): IDataManager {
        return dataManager
    }

    @Provides
    @Singleton
    fun provideDBHelper(dbHelper: RoomDBHelper): IRoomDBHelper {
        return dbHelper
    }

    @Provides
    @Singleton
    fun provideRestAPIHelper(restApiHelper: RestAPIHelper, storageHelper: StorageHelper): IRestAPIHelper {

//        return restApiHelper

        return storageHelper
    }


    @Provides
    @Singleton
    fun provideSharedPrefHelper(prefHelper: SharedPrefHelper): ISharedPrefHelper {
        return prefHelper
    }

    @Provides
    @Singleton
    fun provideStorageHelper(storageApiHelper: StorageHelper): IStorageHelper {
        return storageApiHelper
    }

    @Provides
    fun provideAppDatabase(): AppDatabase {
        return AppDatabase.getDatabase(MyApplication.application.baseContext)
    }

    @Provides
    fun provideOkHttpClient(): OkHttpClient {

        return OkHttpClient().newBuilder().readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(20, TimeUnit.SECONDS)
                .build()

    }

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
    }

    @Provides
    fun provideRetrofitService(retrofit: Retrofit): RetrofitService {

        return retrofit.create<RetrofitService>(RetrofitService::class.java)
    }
}
