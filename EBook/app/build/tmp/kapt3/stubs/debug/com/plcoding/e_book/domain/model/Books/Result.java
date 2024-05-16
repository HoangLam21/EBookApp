package com.plcoding.e_book.domain.model.Books;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00bf\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u00a2\u0006\u0002\u0010\u001eJ\u0011\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010A\u001a\u00020\tH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010C\u001a\u00020\tH\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\tH\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\tH\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\tH\u00c6\u0003J\t\u0010J\u001a\u00020\tH\u00c6\u0003J\t\u0010K\u001a\u00020\tH\u00c6\u0003J\t\u0010L\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\u00ee\u0001\u0010O\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010PJ\t\u0010Q\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020\u0006H\u00d6\u0001J\t\u0010W\u001a\u00020\tH\u00d6\u0001J\u0019\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001a\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u001c\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010%\u00a8\u0006]"}, d2 = {"Lcom/plcoding/e_book/domain/model/Books/Result;", "Landroid/os/Parcelable;", "authors", "", "Lcom/plcoding/e_book/domain/model/Books/Author;", "available", "", "bookQuantity", "createAt", "", "createBy", "description", "discount", "galleryManage", "Lcom/plcoding/e_book/domain/model/Books/Gallery;", "hot", "id", "language", "Lcom/plcoding/e_book/domain/model/Books/Language;", "num_pages", "price", "provider", "Lcom/plcoding/e_book/domain/model/Books/Provider;", "publication_date", "publisher", "Lcom/plcoding/e_book/domain/model/Books/Publisher;", "title", "total_pay", "updateAt", "updateBy", "(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/Integer;Lcom/plcoding/e_book/domain/model/Books/Language;IILcom/plcoding/e_book/domain/model/Books/Provider;Ljava/lang/String;Lcom/plcoding/e_book/domain/model/Books/Publisher;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAuthors", "()Ljava/util/List;", "getAvailable", "()I", "getBookQuantity", "getCreateAt", "()Ljava/lang/String;", "getCreateBy", "getDescription", "getDiscount", "getGalleryManage", "getHot", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "()Lcom/plcoding/e_book/domain/model/Books/Language;", "getNum_pages", "getPrice", "getProvider", "()Lcom/plcoding/e_book/domain/model/Books/Provider;", "getPublication_date", "getPublisher", "()Lcom/plcoding/e_book/domain/model/Books/Publisher;", "getTitle", "getTotal_pay", "getUpdateAt", "getUpdateBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/Integer;Lcom/plcoding/e_book/domain/model/Books/Language;IILcom/plcoding/e_book/domain/model/Books/Provider;Ljava/lang/String;Lcom/plcoding/e_book/domain/model/Books/Publisher;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/plcoding/e_book/domain/model/Books/Result;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
@androidx.room.Entity
public final class Result implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors = null;
    private final int available = 0;
    private final int bookQuantity = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createBy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    private final int discount = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> galleryManage = null;
    private final int hot = 0;
    @androidx.room.PrimaryKey
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final com.plcoding.e_book.domain.model.Books.Language language = null;
    private final int num_pages = 0;
    private final int price = 0;
    @org.jetbrains.annotations.Nullable
    private final com.plcoding.e_book.domain.model.Books.Provider provider = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String publication_date = null;
    @org.jetbrains.annotations.Nullable
    private final com.plcoding.e_book.domain.model.Books.Publisher publisher = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int total_pay = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updateAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updateBy = null;
    
    public Result(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors, int available, int bookQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String createAt, @org.jetbrains.annotations.NotNull
    java.lang.String createBy, @org.jetbrains.annotations.NotNull
    java.lang.String description, int discount, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> galleryManage, int hot, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Language language, int num_pages, int price, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Provider provider, @org.jetbrains.annotations.NotNull
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Publisher publisher, @org.jetbrains.annotations.NotNull
    java.lang.String title, int total_pay, @org.jetbrains.annotations.NotNull
    java.lang.String updateAt, @org.jetbrains.annotations.NotNull
    java.lang.String updateBy) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Author> getAuthors() {
        return null;
    }
    
    public final int getAvailable() {
        return 0;
    }
    
    public final int getBookQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreateAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreateBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getDiscount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> getGalleryManage() {
        return null;
    }
    
    public final int getHot() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Language getLanguage() {
        return null;
    }
    
    public final int getNum_pages() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Provider getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublication_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Publisher getPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getTotal_pay() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpdateAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpdateBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Author> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Language component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Provider component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Publisher component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Result copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors, int available, int bookQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String createAt, @org.jetbrains.annotations.NotNull
    java.lang.String createBy, @org.jetbrains.annotations.NotNull
    java.lang.String description, int discount, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> galleryManage, int hot, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Language language, int num_pages, int price, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Provider provider, @org.jetbrains.annotations.NotNull
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Publisher publisher, @org.jetbrains.annotations.NotNull
    java.lang.String title, int total_pay, @org.jetbrains.annotations.NotNull
    java.lang.String updateAt, @org.jetbrains.annotations.NotNull
    java.lang.String updateBy) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
}