package com.plcoding.e_book.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/e_book/data/local/BooksDao;", "", "delete", "", "result", "Lcom/plcoding/e_book/domain/model/Books/Result;", "(Lcom/plcoding/e_book/domain/model/Books/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBooks", "Lkotlinx/coroutines/flow/Flow;", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBooksWithCategory", "categoryId", "getBooksWithDiscount", "upsert", "app_debug"})
@androidx.room.Dao
public abstract interface BooksDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Result result, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Result result, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Result")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> getBooks();
    
    @androidx.room.Query(value = "SELECT * FROM Result WHERE id=:id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBooks(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.domain.model.Books.Result> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Result WHERE discount > 0")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> getBooksWithDiscount();
    
    @androidx.room.Query(value = "SELECT * FROM Result WHERE category IN (SELECT id FROM Result WHERE Result.id =:categoryId)")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> getBooksWithCategory(int categoryId);
}