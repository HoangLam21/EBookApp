package com.plcoding.e_book.domain.usecases.book;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006."}, d2 = {"Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "", "getBooks", "Lcom/plcoding/e_book/domain/usecases/books/GetBooks;", "upsertBooks", "Lcom/plcoding/e_book/domain/usecases/books/UpsertBooks;", "deleteBooks", "Lcom/plcoding/e_book/domain/usecases/books/DeleteBooks;", "selectBooks", "Lcom/plcoding/e_book/domain/usecases/books/SelectBooks;", "selectBook", "Lcom/plcoding/e_book/domain/usecases/books/SelectBook;", "getBooksWithDiscount", "Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithDiscount;", "getBooksWithCategory", "Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithCategory;", "(Lcom/plcoding/e_book/domain/usecases/books/GetBooks;Lcom/plcoding/e_book/domain/usecases/books/UpsertBooks;Lcom/plcoding/e_book/domain/usecases/books/DeleteBooks;Lcom/plcoding/e_book/domain/usecases/books/SelectBooks;Lcom/plcoding/e_book/domain/usecases/books/SelectBook;Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithDiscount;Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithCategory;)V", "getDeleteBooks", "()Lcom/plcoding/e_book/domain/usecases/books/DeleteBooks;", "getGetBooks", "()Lcom/plcoding/e_book/domain/usecases/books/GetBooks;", "getGetBooksWithCategory", "()Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithCategory;", "getGetBooksWithDiscount", "()Lcom/plcoding/e_book/domain/usecases/book/GetBooksWithDiscount;", "getSelectBook", "()Lcom/plcoding/e_book/domain/usecases/books/SelectBook;", "getSelectBooks", "()Lcom/plcoding/e_book/domain/usecases/books/SelectBooks;", "getUpsertBooks", "()Lcom/plcoding/e_book/domain/usecases/books/UpsertBooks;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class BooksUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.books.GetBooks getBooks = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.books.UpsertBooks upsertBooks = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.books.DeleteBooks deleteBooks = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.books.SelectBooks selectBooks = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.books.SelectBook selectBook = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount getBooksWithDiscount = null;
    @org.jetbrains.annotations.NotNull
    private final com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory getBooksWithCategory = null;
    
    public BooksUseCase(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.GetBooks getBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.UpsertBooks upsertBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.DeleteBooks deleteBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.SelectBooks selectBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.SelectBook selectBook, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount getBooksWithDiscount, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory getBooksWithCategory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.GetBooks getGetBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.UpsertBooks getUpsertBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.DeleteBooks getDeleteBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.SelectBooks getSelectBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.SelectBook getSelectBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount getGetBooksWithDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory getGetBooksWithCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.GetBooks component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.UpsertBooks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.DeleteBooks component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.SelectBooks component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.books.SelectBook component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.BooksUseCase copy(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.GetBooks getBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.UpsertBooks upsertBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.DeleteBooks deleteBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.SelectBooks selectBooks, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.books.SelectBook selectBook, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount getBooksWithDiscount, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory getBooksWithCategory) {
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