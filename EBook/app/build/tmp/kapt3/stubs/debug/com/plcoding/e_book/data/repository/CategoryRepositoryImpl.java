package com.plcoding.e_book.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/plcoding/e_book/data/repository/CategoryRepositoryImpl;", "Lcom/plcoding/e_book/domain/repository/CategoryRepository;", "categoryApi", "Lcom/plcoding/e_book/data/remote/CategoryApi;", "(Lcom/plcoding/e_book/data/remote/CategoryApi;)V", "getCategory", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Category/Result;", "sources", "", "", "app_debug"})
public final class CategoryRepositoryImpl implements com.plcoding.e_book.domain.repository.CategoryRepository {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.remote.CategoryApi categoryApi = null;
    
    public CategoryRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.CategoryApi categoryApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Category.Result>> getCategory(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
}