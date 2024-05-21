package com.plcoding.e_book.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0016"}, d2 = {"fontAwesome", "Landroidx/compose/ui/text/font/FontFamily;", "getFontAwesome", "()Landroidx/compose/ui/text/font/FontFamily;", "HomeScreen", "", "books", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/plcoding/e_book/domain/model/Books/Result;", "booksWithDiscount", "Lkotlinx/coroutines/flow/Flow;", "", "navigateToSearch", "Lkotlin/Function0;", "navigateToBooksWithCategory", "Lkotlin/Function1;", "", "navigateToDetail", "category", "Lcom/plcoding/e_book/domain/model/Category/Result;", "navigateToCategory", "navigateToLike", "app_debug"})
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
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.plcoding.e_book.domain.model.Books.Result>> booksWithDiscount, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToSearch, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToBooksWithCategory, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.e_book.domain.model.Books.Result, kotlin.Unit> navigateToDetail, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result> category, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToCategory, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToLike) {
    }
}