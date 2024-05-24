package com.plcoding.e_book.presentation.reading;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007\u001a&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\b\u0010\u0012\u001a\u00020\u0006H\u0007\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"chaptersData", "", "Lcom/plcoding/e_book/presentation/reading/Chapter;", "getChaptersData", "()Ljava/util/List;", "ChapterItem", "", "chapter", "onNextChapter", "Lkotlin/Function0;", "onPreviousChapter", "onBackClick", "ChapterScreen", "chapterIndex", "", "navigateUp", "readingViewModel", "Lcom/plcoding/e_book/presentation/reading_chapter/ReadingViewModel;", "PVChapter", "app_debug"})
public final class ChapterScreenKt {
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.plcoding.e_book.presentation.reading.Chapter> chaptersData = null;
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.plcoding.e_book.presentation.reading.Chapter> getChaptersData() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void ChapterScreen(int chapterIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateUp, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel readingViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ChapterItem(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.presentation.reading.Chapter chapter, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextChapter, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPreviousChapter, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable
    public static final void PVChapter() {
    }
}