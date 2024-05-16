package com.plcoding.e_book.presentation.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a4\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a4\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0003\u001a\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a8\u0006\u0012"}, d2 = {"BookList", "", "modifier", "Landroidx/compose/ui/Modifier;", "resultitem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "onClick", "Lkotlin/Function1;", "BooksListDT", "", "BooksListHome", "bookitem", "ShimmerEffect", "ShimmerRowEffect", "handlePagingResult", "", "handleRowPagingResult", "app_debug"})
public final class BookListKt {
    
    @androidx.compose.runtime.Composable
    public static final void BookList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BooksListHome(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> bookitem, @org.jetbrains.annotations.NotNull
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
    private static final void ShimmerEffect() {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handleRowPagingResult(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> resultitem) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void ShimmerRowEffect() {
    }
}