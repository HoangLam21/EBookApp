package com.plcoding.e_book.domain.model.Books;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\f\u0012\u0006\u0010&\u001a\u00020\f\u00a2\u0006\u0002\u0010\'J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\u0017H\u00c6\u0003J\t\u0010P\u001a\u00020\u0017H\u00c6\u0003J\t\u0010Q\u001a\u00020\u001aH\u00c6\u0003J\t\u0010R\u001a\u00020\u0006H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\t\u0010T\u001a\u00020\u001eH\u00c6\u0003J\t\u0010U\u001a\u00020\fH\u00c6\u0003J\t\u0010V\u001a\u00020\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020!H\u00c6\u0003J\t\u0010X\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Y\u001a\u00020\fH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0006H\u00c6\u0003J\t\u0010[\u001a\u00020\fH\u00c6\u0003J\t\u0010\\\u001a\u00020\fH\u00c6\u0003J\t\u0010]\u001a\u00020\bH\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010_\u001a\u00020\fH\u00c6\u0003J\t\u0010`\u001a\u00020\fH\u00c6\u0003J\t\u0010a\u001a\u00020\fH\u00c6\u0003J\t\u0010b\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0093\u0002\u0010d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\fH\u00c6\u0001J\u0013\u0010e\u001a\u00020\u00172\b\u0010f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010g\u001a\u00020\u0006H\u00d6\u0001J\t\u0010h\u001a\u00020\fH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u001c\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\"\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0011\u0010#\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0011\u0010$\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0011\u0010%\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0011\u0010&\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00101\u00a8\u0006i"}, d2 = {"Lcom/plcoding/e_book/domain/model/Books/Result;", "", "authors", "", "Lcom/plcoding/e_book/domain/model/Books/Author;", "available", "", "bookQuantity", "", "category", "Lcom/plcoding/e_book/domain/model/Books/Category;", "createAt", "", "createBy", "description", "discount", "feedback", "Lcom/plcoding/e_book/domain/model/Books/Feedback;", "galleryManage", "Lcom/plcoding/e_book/domain/model/Books/GalleryManage;", "hot", "id", "isebook", "", "isvip", "language", "Lcom/plcoding/e_book/domain/model/Books/Language;", "num_pages", "price", "provider", "Lcom/plcoding/e_book/domain/model/Books/Provider;", "publication_date", "publisher", "Lcom/plcoding/e_book/domain/model/Books/Publisher;", "readingsession", "title", "total_pay", "updateAt", "updateBy", "(Ljava/util/List;IDLcom/plcoding/e_book/domain/model/Books/Category;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/plcoding/e_book/domain/model/Books/Feedback;Ljava/util/List;IIZZLcom/plcoding/e_book/domain/model/Books/Language;IILcom/plcoding/e_book/domain/model/Books/Provider;Ljava/lang/String;Lcom/plcoding/e_book/domain/model/Books/Publisher;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAuthors", "()Ljava/util/List;", "getAvailable", "()I", "getBookQuantity", "()D", "getCategory", "()Lcom/plcoding/e_book/domain/model/Books/Category;", "getCreateAt", "()Ljava/lang/String;", "getCreateBy", "getDescription", "getDiscount", "getFeedback", "()Lcom/plcoding/e_book/domain/model/Books/Feedback;", "getGalleryManage", "getHot", "getId", "getIsebook", "()Z", "getIsvip", "getLanguage", "()Lcom/plcoding/e_book/domain/model/Books/Language;", "getNum_pages", "getPrice", "getProvider", "()Lcom/plcoding/e_book/domain/model/Books/Provider;", "getPublication_date", "getPublisher", "()Lcom/plcoding/e_book/domain/model/Books/Publisher;", "getReadingsession", "getTitle", "getTotal_pay", "getUpdateAt", "getUpdateBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity
public final class Result {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors = null;
    private final int available = 0;
    private final double bookQuantity = 0.0;
    @org.jetbrains.annotations.Nullable
    private final com.plcoding.e_book.domain.model.Books.Category category = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createBy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    private final int discount = 0;
    @org.jetbrains.annotations.Nullable
    private final com.plcoding.e_book.domain.model.Books.Feedback feedback = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.e_book.domain.model.Books.GalleryManage> galleryManage = null;
    private final int hot = 0;
    @androidx.room.PrimaryKey
    private final int id = 0;
    private final boolean isebook = false;
    private final boolean isvip = false;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.model.Books.Language language = null;
    private final int num_pages = 0;
    private final int price = 0;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.model.Books.Provider provider = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String publication_date = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.model.Books.Publisher publisher = null;
    private final int readingsession = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int total_pay = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updateAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updateBy = null;
    
    public Result(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors, int available, double bookQuantity, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Category category, @org.jetbrains.annotations.NotNull
    java.lang.String createAt, @org.jetbrains.annotations.NotNull
    java.lang.String createBy, @org.jetbrains.annotations.NotNull
    java.lang.String description, int discount, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Feedback feedback, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.GalleryManage> galleryManage, int hot, int id, boolean isebook, boolean isvip, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Language language, int num_pages, int price, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Provider provider, @org.jetbrains.annotations.NotNull
    java.lang.String publication_date, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Publisher publisher, int readingsession, @org.jetbrains.annotations.NotNull
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
    
    public final double getBookQuantity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Category getCategory() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Feedback getFeedback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.GalleryManage> getGalleryManage() {
        return null;
    }
    
    public final int getHot() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean getIsebook() {
        return false;
    }
    
    public final boolean getIsvip() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Language getLanguage() {
        return null;
    }
    
    public final int getNum_pages() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Provider getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublication_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Publisher getPublisher() {
        return null;
    }
    
    public final int getReadingsession() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.GalleryManage> component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Language component15() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Provider component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Publisher component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Category component4() {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Feedback component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Result copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors, int available, double bookQuantity, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Category category, @org.jetbrains.annotations.NotNull
    java.lang.String createAt, @org.jetbrains.annotations.NotNull
    java.lang.String createBy, @org.jetbrains.annotations.NotNull
    java.lang.String description, int discount, @org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Feedback feedback, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.GalleryManage> galleryManage, int hot, int id, boolean isebook, boolean isvip, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Language language, int num_pages, int price, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Provider provider, @org.jetbrains.annotations.NotNull
    java.lang.String publication_date, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Publisher publisher, int readingsession, @org.jetbrains.annotations.NotNull
    java.lang.String title, int total_pay, @org.jetbrains.annotations.NotNull
    java.lang.String updateAt, @org.jetbrains.annotations.NotNull
    java.lang.String updateBy) {
        return null;
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
}