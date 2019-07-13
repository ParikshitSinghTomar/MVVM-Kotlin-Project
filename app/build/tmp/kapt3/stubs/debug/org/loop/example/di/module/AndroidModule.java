package org.loop.example.di.module;

import java.lang.System;

/**
 * A module for Android-specific dependencies which require a [android.content.Context] or [ ] to create.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001aH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/loop/example/di/module/AndroidModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideAppDatabase", "Lbdt/docdoc/repo/local/roomdb/entity/AppDatabase;", "provideApplicationContext", "Landroid/content/Context;", "provideDBHelper", "Lbdt/docdoc/repo/local/room_db/IRoomDBHelper;", "dbHelper", "Lbdt/docdoc/repo/local/roomdb/RoomDBHelper;", "provideDataManager", "Lbdt/docdoc/repo/IDataManager;", "dataManager", "Lbdt/docdoc/repo/DataManager;", "provideLocationManager", "Landroid/location/LocationManager;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRestAPIHelper", "Lbdt/docdoc/repo/remote/rest_api_helper/IRestAPIHelper;", "restApiHelper", "Lin/pari/docdoc/repo/remote/rest_api_helper/RestAPIHelper;", "storageHelper", "Lbdt/docdoc/repo/local/storage/StorageHelper;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "provideRetrofitService", "Lin/pari/docdoc/repo/remote/rest_api_helper/retrofit_helper/RetrofitService;", "retrofit", "provideSharedPrefHelper", "Lbdt/docdoc/repo/local/sharedpref/ISharedPrefHelper;", "prefHelper", "Lbdt/docdoc/repo/local/sharedpref/SharedPrefHelper;", "provideStorageHelper", "Lbdt/docdoc/repo/local/storage/IStorageHelper;", "storageApiHelper", "app_debug"})
@dagger.Module()
public final class AndroidModule {
    private final android.app.Application application = null;
    
    /**
     * Allow the application context to be injected but require that it be annotated with [ ][ForApplication] to explicitly differentiate it from an activity context.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideApplicationContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.location.LocationManager provideLocationManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final bdt.docdoc.repo.IDataManager provideDataManager(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.DataManager dataManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final bdt.docdoc.repo.local.room_db.IRoomDBHelper provideDBHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.roomdb.RoomDBHelper dbHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final bdt.docdoc.repo.remote.rest_api_helper.IRestAPIHelper provideRestAPIHelper(@org.jetbrains.annotations.NotNull()
    in.pari.docdoc.repo.remote.rest_api_helper.RestAPIHelper restApiHelper, @org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.storage.StorageHelper storageHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final bdt.docdoc.repo.local.sharedpref.ISharedPrefHelper provideSharedPrefHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.sharedpref.SharedPrefHelper prefHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final bdt.docdoc.repo.local.storage.IStorageHelper provideStorageHelper(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.local.storage.StorageHelper storageApiHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final bdt.docdoc.repo.local.roomdb.entity.AppDatabase provideAppDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final in.pari.docdoc.repo.remote.rest_api_helper.retrofit_helper.RetrofitService provideRetrofitService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public AndroidModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}