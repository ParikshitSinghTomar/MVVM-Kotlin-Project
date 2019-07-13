package bdt.docdoc;

import java.lang.System;

/**
 * Created by loop on 09/12/14.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lbdt/docdoc/MyApplication;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "activityInjector", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.location.LocationManager locationManager;
    @org.jetbrains.annotations.NotNull()
    public static bdt.docdoc.di.component.ApplicationComponent graph;
    @org.jetbrains.annotations.NotNull()
    public static bdt.docdoc.MyApplication application;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.String> dynamicUrl;
    public static final bdt.docdoc.MyApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final void setLocationManager(@org.jetbrains.annotations.NotNull()
    android.location.LocationManager p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final bdt.docdoc.di.component.ApplicationComponent getGraph() {
        return null;
    }
    
    public static final void setGraph(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.di.component.ApplicationComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final bdt.docdoc.MyApplication getApplication() {
        return null;
    }
    
    public static final void setApplication(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.MyApplication p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.HashMap<java.lang.String, java.lang.String> getDynamicUrl() {
        return null;
    }
    
    public static final void setDynamicUrl(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lbdt/docdoc/MyApplication$Companion;", "", "()V", "application", "Lbdt/docdoc/MyApplication;", "application$annotations", "getApplication", "()Lbdt/docdoc/MyApplication;", "setApplication", "(Lbdt/docdoc/MyApplication;)V", "dynamicUrl", "Ljava/util/HashMap;", "", "dynamicUrl$annotations", "getDynamicUrl", "()Ljava/util/HashMap;", "setDynamicUrl", "(Ljava/util/HashMap;)V", "graph", "Lbdt/docdoc/di/component/ApplicationComponent;", "graph$annotations", "getGraph", "()Lbdt/docdoc/di/component/ApplicationComponent;", "setGraph", "(Lbdt/docdoc/di/component/ApplicationComponent;)V", "app_debug"})
    public static final class Companion {
        
        public static void graph$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final bdt.docdoc.di.component.ApplicationComponent getGraph() {
            return null;
        }
        
        public final void setGraph(@org.jetbrains.annotations.NotNull()
        bdt.docdoc.di.component.ApplicationComponent p0) {
        }
        
        public static void application$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final bdt.docdoc.MyApplication getApplication() {
            return null;
        }
        
        public final void setApplication(@org.jetbrains.annotations.NotNull()
        bdt.docdoc.MyApplication p0) {
        }
        
        public static void dynamicUrl$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, java.lang.String> getDynamicUrl() {
            return null;
        }
        
        public final void setDynamicUrl(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, java.lang.String> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}