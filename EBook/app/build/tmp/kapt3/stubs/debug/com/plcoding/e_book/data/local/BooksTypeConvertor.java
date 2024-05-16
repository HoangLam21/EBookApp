package com.plcoding.e_book.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/plcoding/e_book/data/local/BooksTypeConvertor;", "", "()V", "authorsToString", "", "authors", "", "Lcom/plcoding/e_book/domain/model/Books/Author;", "fromLanguage", "language", "Lcom/plcoding/e_book/domain/model/Books/Language;", "galleryToString", "gallery", "Lcom/plcoding/e_book/domain/model/Books/Gallery;", "providerToString", "provider", "Lcom/plcoding/e_book/domain/model/Books/Provider;", "publisherToString", "publisher", "Lcom/plcoding/e_book/domain/model/Books/Publisher;", "stringToAuthors", "authorsString", "stringToGallery", "galleryString", "stringToProvider", "providerString", "stringToPublisher", "publisherString", "toLanguage", "languageString", "app_debug"})
@androidx.room.ProvidedTypeConverter
public final class BooksTypeConvertor {
    
    public BooksTypeConvertor() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String authorsToString(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Author> authors) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Author> stringToAuthors(@org.jetbrains.annotations.Nullable
    java.lang.String authorsString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String galleryToString(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> gallery) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromLanguage(@org.jetbrains.annotations.Nullable
    com.plcoding.e_book.domain.model.Books.Language language) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.e_book.domain.model.Books.Language toLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String languageString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.e_book.domain.model.Books.Gallery> stringToGallery(@org.jetbrains.annotations.Nullable
    java.lang.String galleryString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String providerToString(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Provider provider) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Provider stringToProvider(@org.jetbrains.annotations.NotNull
    java.lang.String providerString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String publisherToString(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.model.Books.Publisher publisher) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.Books.Publisher stringToPublisher(@org.jetbrains.annotations.NotNull
    java.lang.String publisherString) {
        return null;
    }
}