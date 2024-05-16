package com.plcoding.e_book.presentation.favourite_book;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/plcoding/e_book/presentation/favourite_book/FavouriteBookViewModel;", "Landroidx/lifecycle/ViewModel;", "booksUseCases", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "(Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/plcoding/e_book/presentation/favourite_book/FavouriteBookState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getBooks", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FavouriteBookViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.plcoding.e_book.presentation.favourite_book.FavouriteBookState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.plcoding.e_book.presentation.favourite_book.FavouriteBookState> state = null;
    
    @javax.inject.Inject
    public FavouriteBookViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.plcoding.e_book.presentation.favourite_book.FavouriteBookState> getState() {
        return null;
    }
    
    private final void getBooks() {
    }
}