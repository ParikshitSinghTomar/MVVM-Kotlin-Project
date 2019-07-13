package bdt.docdoc.util.call_adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbdt/docdoc/util/call_adapter/Subscription;", "", "()V", "disposed", "", "bind", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "event", "Landroid/arch/lifecycle/Lifecycle$Event;", "dispose", "isDisposed", "app_debug"})
public final class Subscription {
    private boolean disposed;
    
    public final boolean isDisposed() {
        return false;
    }
    
    public final void dispose() {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.Lifecycle.Event event) {
    }
    
    public Subscription() {
        super();
    }
}