package com.plcoding.e_book.presentation.book;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0014J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u0019\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00148F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/plcoding/e_book/presentation/book/BookDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "booksUseCase", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "(Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;)V", "books", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "getBooks", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Landroid/graphics/Bitmap;", "imageBitmap", "getImageBitmap", "()Landroid/graphics/Bitmap;", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "imageBitmap$delegate", "Landroidx/compose/runtime/MutableState;", "", "sideEffect", "getSideEffect", "()Ljava/lang/String;", "setSideEffect", "(Ljava/lang/String;)V", "sideEffect$delegate", "deleteBookResponseItem", "", "result", "(Lcom/plcoding/e_book/domain/model/Books/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImage", "encodedImage", "onEvent", "event", "Lcom/plcoding/e_book/presentation/book/DetailsEvent;", "upserBookResponseItem", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BookDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sideEffect$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState imageBitmap$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> books = null;
    
    @javax.inject.Inject
    public BookDetailsViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSideEffect() {
        return null;
    }
    
    private final void setSideEffect(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getImageBitmap() {
        return null;
    }
    
    private final void setImageBitmap(android.graphics.Bitmap p0) {
    }
    
    public final void loadImage(@org.jetbrains.annotations.Nullable
    java.lang.String encodedImage) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.book.DetailsEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> getBooks() {
        return null;
    }
    
    private final java.lang.Object deleteBookResponseItem(com.plcoding.e_book.domain.model.Books.Result result, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object upserBookResponseItem(com.plcoding.e_book.domain.model.Books.Result result, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}