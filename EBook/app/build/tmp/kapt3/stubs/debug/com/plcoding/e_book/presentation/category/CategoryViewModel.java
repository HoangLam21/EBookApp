package com.plcoding.e_book.presentation.category;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\tR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006("}, d2 = {"Lcom/plcoding/e_book/presentation/category/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "bookUseCases", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "categoryUseCases", "Lcom/plcoding/e_book/domain/usecases/category/CategoryUseCase;", "(Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;Lcom/plcoding/e_book/domain/usecases/category/CategoryUseCase;)V", "_categoryId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "book", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "getBook", "()Lkotlinx/coroutines/flow/Flow;", "booksWithCategory", "", "getBooksWithCategory", "category", "Lcom/plcoding/e_book/domain/model/Category/Result;", "getCategory", "categoryId", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoryId", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "", "sideEffect", "getSideEffect", "()Ljava/lang/String;", "setSideEffect", "(Ljava/lang/String;)V", "sideEffect$delegate", "Landroidx/compose/runtime/MutableState;", "onEvent", "", "event", "Lcom/plcoding/e_book/presentation/category/CategoryEvent;", "setCategory", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.BooksUseCase bookUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.category.CategoryUseCase categoryUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sideEffect$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> book = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Category.Result>> category = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _categoryId = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> categoryId = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> booksWithCategory = null;
    
    @javax.inject.Inject
    public CategoryViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.BooksUseCase bookUseCases, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.category.CategoryUseCase categoryUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSideEffect() {
        return null;
    }
    
    private final void setSideEffect(java.lang.String p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.category.CategoryEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> getBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Category.Result>> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.domain.model.Books.Result>> getBooksWithCategory() {
        return null;
    }
    
    public final void setCategory(int categoryId) {
    }
}