package com.plcoding.e_book.presentation.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a4\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a4\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a*\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a*\u0010\u000e\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0010\u001a\u00020\u0001H\u0003\u001a\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a8\u0006\u0016"}, d2 = {"BookListShimmerEffect", "", "BooksList", "modifier", "Landroidx/compose/ui/Modifier;", "resultitem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "onClick", "Lkotlin/Function1;", "BooksListDT", "", "ContinueReadingList", "books", "HotBooksList", "ShimmerEffectContinueReading", "ShimmerEffectHot", "handlePagingResult", "", "handlePagingResultBookList", "handlePagingResultContinueBook", "handlePagingResultHot", "app_debug"})
public final class BookListKt {
    
    @androidx.compose.runtime.Composable
    public static final void BooksList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResult(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    public static final void BooksListDT(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Result> resultitem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void BookListShimmerEffect() {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResultBookList(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    public static final void ContinueReadingList(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> books, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResultContinueBook(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> books) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void ShimmerEffectContinueReading() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HotBooksList(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> books, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResultHot(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> books) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void ShimmerEffectHot() {
    }
}