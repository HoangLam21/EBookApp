package com.plcoding.e_book;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010\u0015\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u001c\u0010\u0017\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u0019\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u001c\u0010\u001b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u001c\u0010\u001d\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b$\u0010\u0006R\u001c\u0010%\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b&\u0010\rR\u001c\u0010\'\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b(\u0010\u0006R\u001c\u0010)\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006+"}, d2 = {"Lcom/plcoding/e_book/Dimens;", "", "()V", "ArticleCardSize", "Landroidx/compose/ui/unit/Dp;", "getArticleCardSize-D9Ej5fM", "()F", "F", "BookImageSize", "getBookImageSize-D9Ej5fM", "BookName", "Landroidx/compose/ui/unit/TextUnit;", "getBookName-XSAIIZE", "()J", "J", "ExtraSmallPadding", "getExtraSmallPadding-D9Ej5fM", "ExtraSmallPadding2", "getExtraSmallPadding2-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IndicatorSize", "getIndicatorSize-D9Ej5fM", "MediumPadding1", "getMediumPadding1-D9Ej5fM", "MediumPadding2", "getMediumPadding2-D9Ej5fM", "MediumPadding3", "getMediumPadding3-D9Ej5fM", "MediumText", "getMediumText-XSAIIZE", "NormalText", "getNormalText-XSAIIZE", "SSmallText", "getSSmallText-XSAIIZE", "SmallIconSize", "getSmallIconSize-D9Ej5fM", "SmallText", "getSmallText-XSAIIZE", "ThumbnailTemplate", "getThumbnailTemplate-D9Ej5fM", "YouMaylikeCardSize", "getYouMaylikeCardSize-D9Ej5fM", "app_debug"})
public final class Dimens {
    private static final float ExtraSmallPadding = 0.0F;
    private static final float ExtraSmallPadding2 = 0.0F;
    private static final float MediumPadding1 = 0.0F;
    private static final float MediumPadding2 = 0.0F;
    private static final float MediumPadding3 = 0.0F;
    private static final float IndicatorSize = 0.0F;
    private static final float SmallIconSize = 0.0F;
    private static final float IconSize = 0.0F;
    private static final float BookImageSize = 0.0F;
    private static final float ThumbnailTemplate = 0.0F;
    private static final float ArticleCardSize = 0.0F;
    private static final float YouMaylikeCardSize = 0.0F;
    private static final long BookName = 0L;
    private static final long SSmallText = 0L;
    private static final long SmallText = 0L;
    private static final long NormalText = 0L;
    private static final long MediumText = 0L;
    @org.jetbrains.annotations.NotNull
    public static final com.plcoding.e_book.Dimens INSTANCE = null;
    
    private Dimens() {
        super();
    }
}