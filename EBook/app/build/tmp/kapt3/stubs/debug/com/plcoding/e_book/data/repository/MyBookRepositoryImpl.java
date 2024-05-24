package com.plcoding.e_book.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/plcoding/e_book/data/repository/MyBookRepositoryImpl;", "Lcom/plcoding/e_book/domain/repository/MyBookRepository;", "myBooksApi", "Lcom/plcoding/e_book/data/remote/MyBooksApi;", "booksDao", "Lcom/plcoding/e_book/data/local/BooksDao;", "(Lcom/plcoding/e_book/data/remote/MyBooksApi;Lcom/plcoding/e_book/data/local/BooksDao;)V", "getMyBooks", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "sources", "", "", "selectMyBooks", "app_debug"})
public final class MyBookRepositoryImpl implements com.plcoding.e_book.domain.repository.MyBookRepository {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.remote.MyBooksApi myBooksApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.local.BooksDao booksDao = null;
    
    public MyBookRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.MyBooksApi myBooksApi, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDao booksDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> getMyBooks(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> selectMyBooks() {
        return null;
    }
}