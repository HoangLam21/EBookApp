package com.plcoding.e_book.presentation.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/plcoding/e_book/presentation/payment/paymentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "paymentApi", "Lcom/plcoding/e_book/data/remote/PaymentApi;", "makePayment", "", "orderId", "", "method", "app_debug"})
public final class paymentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.data.remote.PaymentApi paymentApi = null;
    
    public paymentViewModel() {
        super();
    }
    
    public final void makePayment(int orderId, int method) {
    }
}