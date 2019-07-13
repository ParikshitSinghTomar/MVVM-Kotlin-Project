package bdt.docdoc.ui.registration;

import java.lang.System;

/**
 * Created by user on 12/3/19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbdt/docdoc/ui/registration/RegistrationActivityModule;", "", "()V", "provideRegistrationViewModel", "Lbdt/docdoc/ui/registration/RegistrationViewModel;", "iDataManager", "Lbdt/docdoc/repo/IDataManager;", "app_debug"})
@dagger.Module()
public final class RegistrationActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final bdt.docdoc.ui.registration.RegistrationViewModel provideRegistrationViewModel(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.repo.IDataManager iDataManager) {
        return null;
    }
    
    public RegistrationActivityModule() {
        super();
    }
}