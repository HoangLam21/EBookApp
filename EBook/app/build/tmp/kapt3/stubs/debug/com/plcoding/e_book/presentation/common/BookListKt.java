package com.plcoding.e_book.presentation.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0003\u001a4\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a4\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a4\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a*\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a0\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0003\u001a\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u001a\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007\u00a8\u0006\u001b"}, d2 = {"BookListCategoryShimmerEffect", "", "BookListShimmerEffect", "BooksList", "modifier", "Landroidx/compose/ui/Modifier;", "resultitem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "onClick", "Lkotlin/Function1;", "BooksListCategory", "", "BooksListDT", "ContinueReadingList", "books", "HotBooksList", "Lkotlinx/coroutines/flow/Flow;", "ShimmerEffectContinueReading", "ShimmerEffectHot", "handlePagingResult", "", "handlePagingResultBookList", "handlePagingResultBooksListCategory", "handlePagingResultContinueBook", "handlePagingResultHot", "bookList", "app_debug"})
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
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.plcoding.e_book.domain.model.Books.Result>> books, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResultHot(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Result> bookList) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void ShimmerEffectHot() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BooksListCategory(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Result> resultitem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResultBooksListCategory(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void BookListCategoryShimmerEffect() {
    }
}