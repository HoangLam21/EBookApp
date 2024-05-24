package com.plcoding.e_book.presentation.book;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007J\u0019\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(J\u0019\u0010)\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R/\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/plcoding/e_book/presentation/book/BookDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "booksUseCase", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "(Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;)V", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "_paymentUrl", "", "books", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "getBooks", "()Lkotlinx/coroutines/flow/Flow;", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "paymentUrl", "getPaymentUrl", "<set-?>", "sideEffect", "getSideEffect", "()Ljava/lang/String;", "setSideEffect", "(Ljava/lang/String;)V", "sideEffect$delegate", "Landroidx/compose/runtime/MutableState;", "createOrder", "", "idBook", "deleteBookResponseItem", "result", "(Lcom/plcoding/e_book/domain/model/Books/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePayment", "method", "onEvent", "event", "Lcom/plcoding/e_book/presentation/book/DetailsEvent;", "upserBookResponseItem", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BookDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.BooksUseCase booksUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sideEffect$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.plcoding.e_book.domain.model.Books.Result>> books = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _orderId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> orderId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _paymentUrl = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> paymentUrl = null;
    
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getOrderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getPaymentUrl() {
        return null;
    }
    
    public final void makePayment(int orderId, int method) {
    }
    
    public final void createOrder(int idBook) {
    }
}