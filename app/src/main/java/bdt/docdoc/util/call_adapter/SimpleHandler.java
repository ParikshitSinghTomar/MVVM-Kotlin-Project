package bdt.docdoc.util.call_adapter;

public interface SimpleHandler<T> {
    void accept(T response, Throwable throwable);
}