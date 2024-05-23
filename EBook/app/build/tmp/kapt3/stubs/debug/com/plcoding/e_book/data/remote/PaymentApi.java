package com.plcoding.e_book.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/plcoding/e_book/data/remote/PaymentApi;", "", "PaymentPost", "Lretrofit2/Response;", "Lcom/plcoding/e_book/data/remote/dto/APIResponseObj;", "Lcom/plcoding/e_book/data/remote/ResponseURLPayment;", "orderId", "", "method", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PaymentApi {
    
    @retrofit2.http.POST(value = "payment/payfor")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object PaymentPost(@retrofit2.http.Query(value = "order_id")
    int orderId, @retrofit2.http.Query(value = "method")
    int method, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.plcoding.e_book.data.remote.dto.APIResponseObj<com.plcoding.e_book.data.remote.ResponseURLPayment>>> $completion);
}