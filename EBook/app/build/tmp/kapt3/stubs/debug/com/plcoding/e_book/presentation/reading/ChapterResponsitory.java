package com.plcoding.e_book.presentation.reading;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/plcoding/e_book/presentation/reading/ChapterResponsitory;", "", "chapterDao", "Lcom/plcoding/e_book/presentation/reading/ChapterDao;", "(Lcom/plcoding/e_book/presentation/reading/ChapterDao;)V", "getAllChapters", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/plcoding/e_book/presentation/reading/Chapter;", "getChapters", "selectChapter", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertChapter", "", "chapter", "(Lcom/plcoding/e_book/presentation/reading/Chapter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertChapters", "chapters", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChapterResponsitory {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.presentation.reading.ChapterDao chapterDao = null;
    
    public ChapterResponsitory(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.reading.ChapterDao chapterDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.presentation.reading.Chapter>> getAllChapters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.presentation.reading.Chapter>> getChapters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upsertChapter(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.reading.Chapter chapter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object selectChapter(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.presentation.reading.Chapter> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upsertChapters(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.presentation.reading.Chapter> chapters, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}