package com.plcoding.e_book.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/plcoding/e_book/data/local/CategoryDao;", "", "delete", "", "category", "Lcom/plcoding/e_book/domain/model/Category/Result;", "(Lcom/plcoding/e_book/domain/model/Category/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "", "getCategory", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "app_debug"})
@androidx.room.Dao
public abstract interface CategoryDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Category.Result category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Category.Result category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Result")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Category.Result>> getCategories();
    
    @androidx.room.Query(value = "SELECT * FROM Result WHERE id=:id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCategory(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.domain.model.Category.Result> $completion);
}