package com.plcoding.e_book.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ/\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/plcoding/e_book/data/remote/BooksApi;", "", "getBooks", "Lcom/plcoding/e_book/data/remote/dto/BooksResponse;", "page", "", "sources", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBooks", "searchQuery", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BooksApi {
    
    @retrofit2.http.GET(value = "ebook/all")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBooks(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.NotNull
    java.lang.String sources, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.data.remote.dto.BooksResponse> $completion);
    
    @retrofit2.http.GET(value = "ebook/find")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchBooks(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.NotNull
    java.lang.String sources, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.data.remote.dto.BooksResponse> $completion);
}