package com.plcoding.e_book.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ab\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0011"}, d2 = {"fontAwesome", "Landroidx/compose/ui/text/font/FontFamily;", "getFontAwesome", "()Landroidx/compose/ui/text/font/FontFamily;", "HomeScreen", "", "books", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "navigateToSearch", "Lkotlin/Function0;", "navigateToDetail", "Lkotlin/Function1;", "category", "Lcom/plcoding/e_book/domain/model/Category/Result;", "navigateToCategory", "navigateToLike", "app_debug"})
public final class HomeScreenKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.ui.text.font.FontFamily fontAwesome = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.text.font.FontFamily getFontAwesome() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result> books, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToSearch, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> navigateToDetail, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result> category, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToCategory, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToLike) {
    }
}