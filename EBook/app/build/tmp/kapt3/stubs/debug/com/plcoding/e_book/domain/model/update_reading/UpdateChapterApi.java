package com.plcoding.e_book.domain.model.update_reading;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/plcoding/e_book/domain/model/update_reading/UpdateChapterApi;", "", "upadateChapter", "Lretrofit2/Response;", "Lcom/plcoding/e_book/domain/model/update_reading/ChapterUpdateResponse;", "token", "", "book_id", "", "chapter_index", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UpdateChapterApi {
    
    @retrofit2.http.PATCH(value = "chapter/update-reading-chapter")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upadateChapter(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @retrofit2.http.Query(value = "book_id")
    int book_id, @retrofit2.http.Query(value = "chapter_index")
    int chapter_index, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.plcoding.e_book.domain.model.update_reading.ChapterUpdateResponse>> $completion);
}