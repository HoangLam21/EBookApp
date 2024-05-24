package com.plcoding.e_book.presentation.reading_chapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u0014\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/plcoding/e_book/presentation/reading_chapter/ReadingViewModel;", "Landroidx/lifecycle/ViewModel;", "api", "Lcom/plcoding/e_book/domain/model/update_reading/UpdateChapterApi;", "(Lcom/plcoding/e_book/domain/model/update_reading/UpdateChapterApi;)V", "_readingResult", "Landroidx/lifecycle/MutableLiveData;", "", "readingResult", "Landroidx/lifecycle/LiveData;", "getReadingResult", "()Landroidx/lifecycle/LiveData;", "createReading", "", "token", "", "bookId", "chapterIndex", "getResultFromResponse", "response", "Lretrofit2/Response;", "Lcom/plcoding/e_book/domain/model/update_reading/ChapterUpdateResponse;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ReadingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi api = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _readingResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> readingResult = null;
    
    @javax.inject.Inject
    public ReadingViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getReadingResult() {
        return null;
    }
    
    public final int getResultFromResponse(@org.jetbrains.annotations.NotNull
    retrofit2.Response<com.plcoding.e_book.domain.model.update_reading.ChapterUpdateResponse> response) {
        return 0;
    }
    
    public final void createReading(@org.jetbrains.annotations.NotNull
    java.lang.String token, int bookId, int chapterIndex) {
    }
}