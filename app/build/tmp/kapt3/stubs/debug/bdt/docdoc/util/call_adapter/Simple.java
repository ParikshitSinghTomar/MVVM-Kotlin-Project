package bdt.docdoc.util.call_adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0002JB\u0010\r\u001a\u00020\u000e2:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u000bJ\u0016\u0010\r\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012J*\u0010\u0013\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\t0\tJB\u0010\u0013\u001a\u00020\u00072:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u000bJ\u0016\u0010\u0013\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lbdt/docdoc/util/call_adapter/Simple;", "R", "", "call", "Lretrofit2/Call;", "(Lretrofit2/Call;)V", "handleResponse", "", "response", "Lretrofit2/Response;", "responseHandler", "Lkotlin/Function2;", "", "process", "Lbdt/docdoc/util/call_adapter/Subscription;", "Lkotlin/ParameterName;", "name", "t", "Lbdt/docdoc/util/call_adapter/SimpleHandler;", "run", "kotlin.jvm.PlatformType", "app_debug"})
public final class Simple<R extends java.lang.Object> {
    private final retrofit2.Call<R> call = null;
    
    public final void run(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.util.call_adapter.SimpleHandler<R> responseHandler) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.util.call_adapter.Subscription process(@org.jetbrains.annotations.NotNull()
    bdt.docdoc.util.call_adapter.SimpleHandler<R> responseHandler) {
        return null;
    }
    
    public final retrofit2.Response<R> run() {
        return null;
    }
    
    public final void run(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super R, ? super java.lang.Throwable, kotlin.Unit> responseHandler) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final bdt.docdoc.util.call_adapter.Subscription process(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super R, ? super java.lang.Throwable, kotlin.Unit> responseHandler) {
        return null;
    }
    
    private final void handleResponse(retrofit2.Response<R> response, kotlin.jvm.functions.Function2<? super R, ? super java.lang.Throwable, kotlin.Unit> responseHandler) {
    }
    
    public Simple(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<R> call) {
        super();
    }
}