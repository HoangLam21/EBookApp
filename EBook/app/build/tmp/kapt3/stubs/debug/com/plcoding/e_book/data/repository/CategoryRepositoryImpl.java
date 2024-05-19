package com.plcoding.e_book.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\bH\u0016J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/plcoding/e_book/data/repository/CategoryRepositoryImpl;", "Lcom/plcoding/e_book/domain/repository/CategoryRepository;", "categoryApi", "Lcom/plcoding/e_book/data/remote/CategoryApi;", "categoryDao", "Lcom/plcoding/e_book/data/local/CategoryDao;", "(Lcom/plcoding/e_book/data/remote/CategoryApi;Lcom/plcoding/e_book/data/local/CategoryDao;)V", "getCategory", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Category/Result;", "sources", "", "", "selectCategories", "selectCategory", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CategoryRepositoryImpl implements com.plcoding.e_book.domain.repository.CategoryRepository {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.remote.CategoryApi categoryApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.local.CategoryDao categoryDao = null;
    
    public CategoryRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.CategoryApi categoryApi, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.CategoryDao categoryDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Category.Result>> getCategory(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Category.Result>> selectCategories() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object selectCategory(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.e_book.domain.model.Category.Result> $completion) {
        return null;
    }
}