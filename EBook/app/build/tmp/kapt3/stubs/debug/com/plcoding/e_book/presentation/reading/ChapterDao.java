package com.plcoding.e_book.presentation.reading;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/e_book/presentation/reading/ChapterDao;", "", "getAllChapter", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/plcoding/e_book/presentation/reading/Chapter;", "getChapter", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "", "chapter", "(Lcom/plcoding/e_book/presentation/reading/Chapter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertAll", "chapters", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface ChapterDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.reading.Chapter chapter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.presentation.reading.Chapter> chapters, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Chapter")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.presentation.reading.Chapter>> getAllChapter();
    
    @androidx.room.Query(value = "SELECT * FROM chapter WHERE id=:id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getChapter(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.presentation.reading.Chapter> $completion);
}