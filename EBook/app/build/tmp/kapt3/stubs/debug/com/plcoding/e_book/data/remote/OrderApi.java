package com.plcoding.e_book.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/plcoding/e_book/data/remote/OrderApi;", "", "CreateOrderPost", "Lretrofit2/Response;", "Lcom/plcoding/e_book/data/remote/dto/APIResponse;", "Lcom/plcoding/e_book/domain/model/Order/OrderResponse;", "token", "", "orderPost", "Lcom/plcoding/e_book/domain/model/Order/Result;", "(Ljava/lang/String;Lcom/plcoding/e_book/domain/model/Order/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface OrderApi {
    
    @retrofit2.http.POST(value = "order/add")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object CreateOrderPost(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Order.Result orderPost, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.plcoding.e_book.data.remote.dto.APIResponse<com.plcoding.e_book.domain.model.Order.OrderResponse>>> $completion);
}