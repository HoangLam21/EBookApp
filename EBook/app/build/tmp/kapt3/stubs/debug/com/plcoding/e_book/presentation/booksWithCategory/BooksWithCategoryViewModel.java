package com.plcoding.e_book.presentation.booksWithCategory;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/plcoding/e_book/presentation/booksWithCategory/BooksWithCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "booksUseCase", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "(Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;)V", "_booksByCategory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/plcoding/e_book/domain/model/Books/Result;", "booksByCategory", "Lkotlinx/coroutines/flow/StateFlow;", "getBooksByCategory", "()Lkotlinx/coroutines/flow/StateFlow;", "", "categoryId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BooksWithCategoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> _booksByCategory = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> booksByCategory = null;
    
    @javax.inject.Inject
    public BooksWithCategoryViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> getBooksByCategory() {
        return null;
    }
    
    public final void getBooksByCategory(int categoryId) {
    }
}