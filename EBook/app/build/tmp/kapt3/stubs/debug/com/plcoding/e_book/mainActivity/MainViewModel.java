package com.plcoding.e_book.mainActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/plcoding/e_book/mainActivity/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "appEntryUseCases", "Lcom/plcoding/e_book/domain/usecases/app_entry/AppEntryUseCases;", "(Lcom/plcoding/e_book/domain/usecases/app_entry/AppEntryUseCases;)V", "<set-?>", "", "startDestination", "getStartDestination", "()Ljava/lang/String;", "setStartDestination", "(Ljava/lang/String;)V", "startDestination$delegate", "Landroidx/compose/runtime/MutableState;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases appEntryUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState startDestination$delegate = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases appEntryUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartDestination() {
        return null;
    }
    
    private final void setStartDestination(java.lang.String p0) {
    }
}