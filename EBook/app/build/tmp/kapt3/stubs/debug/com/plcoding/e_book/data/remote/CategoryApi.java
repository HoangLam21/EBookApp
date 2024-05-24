package com.plcoding.e_book.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/plcoding/e_book/data/remote/CategoryApi;", "", "getBooksByCategory", "Lretrofit2/Response;", "Lcom/plcoding/e_book/data/remote/dto/APIResponseArr;", "Lcom/plcoding/e_book/domain/model/Category/Result;", "categoryId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategory", "Lcom/plcoding/e_book/data/remote/dto/CategoryResponse;", "page", "sources", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CategoryApi {
    
    @retrofit2.http.GET(value = "category/all")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCategory(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.NotNull
    java.lang.String sources, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.data.remote.dto.CategoryResponse> $completion);
    
    @retrofit2.http.GET(value = "ebook/of-category")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBooksByCategory(@retrofit2.http.Query(value = "category_id")
    int categoryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.plcoding.e_book.data.remote.dto.APIResponseArr<com.plcoding.e_book.domain.model.Category.Result>>> $completion);
}