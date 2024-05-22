package com.plcoding.e_book.presentation.reading;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nJ\u0014\u0010\u001b\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/plcoding/e_book/presentation/reading/ChapterViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_chapters", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/plcoding/e_book/presentation/reading/Chapter;", "_currentChapterIndex", "", "chapters", "Lkotlinx/coroutines/flow/Flow;", "getChapters", "()Lkotlinx/coroutines/flow/Flow;", "currentChapterIndex", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentChapterIndex", "()Lkotlinx/coroutines/flow/StateFlow;", "repository", "Lcom/plcoding/e_book/presentation/reading/ChapterResponsitory;", "fetchChapters", "", "nextChapter", "previousChapter", "setChapterIndex", "index", "upsertInitialChapters", "app_debug"})
public final class ChapterViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.presentation.reading.ChapterResponsitory repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.plcoding.e_book.presentation.reading.Chapter>> _chapters = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _currentChapterIndex = null;
    
    public ChapterViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.e_book.presentation.reading.Chapter>> getChapters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCurrentChapterIndex() {
        return null;
    }
    
    private final void fetchChapters() {
    }
    
    public final void upsertInitialChapters(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.presentation.reading.Chapter> chapters) {
    }
    
    public final void nextChapter() {
    }
    
    public final void previousChapter() {
    }
    
    public final void setChapterIndex(int index) {
    }
}