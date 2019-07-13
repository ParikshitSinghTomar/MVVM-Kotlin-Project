package pari.docdoc.di.builder;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lpari/docdoc/di/builder/ActivityBuilder;", "", "()V", "bindDashboardActivity", "Lbdt/docdoc/ui/dashboard/DashboardActivity;", "bindLoginActivity", "Lbdt/docdoc/ui/login/LoginActivity;", "bindRegistrationActivity", "Lbdt/docdoc/ui/registration/RegistrationActivity;", "bindSplashActivity", "Lbdt/docdoc/ui/splash/SplashActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {bdt.docdoc.ui.splash.SplashActivityModule.class})
    public abstract bdt.docdoc.ui.splash.SplashActivity bindSplashActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {bdt.docdoc.ui.registration.RegistrationActivityModule.class})
    public abstract bdt.docdoc.ui.registration.RegistrationActivity bindRegistrationActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {bdt.docdoc.ui.login.LoginActivityModule.class})
    public abstract bdt.docdoc.ui.login.LoginActivity bindLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {bdt.docdoc.ui.dashboard.DashboardActivityModule.class})
    public abstract bdt.docdoc.ui.dashboard.DashboardActivity bindDashboardActivity();
    
    public ActivityBuilder() {
        super();
    }
}