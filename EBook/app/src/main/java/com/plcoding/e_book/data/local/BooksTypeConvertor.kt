//package com.plcoding.e_book.data.local
//
//import androidx.room.ProvidedTypeConverter
//import androidx.room.TypeConverter
//import java.lang.reflect.Type;
//import java.util.List;
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//import com.plcoding.e_book.domain.model.Books.Author
//import com.plcoding.e_book.domain.model.Books.Gallery
//import com.plcoding.e_book.domain.model.Books.Language
//import com.plcoding.e_book.domain.model.Books.Provider
//import com.plcoding.e_book.domain.model.Books.Publisher
//
//@ProvidedTypeConverter
//class BooksTypeConvertor {
//
////    @TypeConverter
////    fun authorToString(author: Author): String{
////        return "${author.author_name},${author.createAt},${author.createBy}," +
////                "${author.id},${author.updateAt},${author.updateBy}"
////    }
////
////    @TypeConverter
////    fun stringToAuthor(author: String): Author{
////        return author.split(",").let { authorArray ->
////            Author(authorArray[0],authorArray[1],authorArray[2],authorArray[3].toInt(),authorArray[4],
////                authorArray[5])
////        }
////    }
//
//    @TypeConverter
//    fun authorsToString(authors: List<Author>): String {
//        val gson = Gson()
//        return gson.toJson(authors)
//    }
//
//    @TypeConverter
//    fun stringToAuthors(authorsString: String?): List<Author> {
//        if (authorsString.isNullOrEmpty()) {
//            return emptyList()
//        }
//        val gson = Gson()
//        val listType = object : TypeToken<List<Author>>() {}.type
//        return gson.fromJson(authorsString, listType)
//    }
//
//
//
//
//    @TypeConverter
//    fun galleryToString(gallery: Gallery): String{
//        return "${gallery.book_id},${gallery.thumbnail},${gallery.description}"
//    }
//
//    @TypeConverter
//    fun stringToGallery(gallery: String): Gallery{
//        return gallery.split(",").let { galleryArray ->
//            Gallery(galleryArray[0].toInt(),galleryArray[1],galleryArray[2])
//        }
//    }
//
////    @TypeConverter
////    fun languageToString(language: Language): String{
////        return "${language.createAt},${language.createBy},${language.id}," +
////                "${language.language_name},${language.updateAt},${language.updateBy}"
////    }
////
////    @TypeConverter
////    fun stringToLanguage(language: String): Language{
////        return language.split(",").let { languageArray ->
////            Language(languageArray[0],languageArray[1],languageArray[2].toInt(),languageArray[3],languageArray[4],
////                languageArray[5])
////        }
////    }
//
//    @TypeConverter
//    fun providerToString(provider: Provider): String{
//        return "${provider.address},${provider.createAt},${provider.createBy},${provider.id}," +
//                "${provider.providername},${provider.representativename},${provider.updateAt},${provider.updateBy}"
//    }
//
//    @TypeConverter
//    fun stringToProvider(provider: String): Provider{
//        return provider.split(",").let { providerArray ->
//            Provider(providerArray[0],providerArray[1],providerArray[2],providerArray[3].toInt(),
//                providerArray[4],providerArray[5],providerArray[6],providerArray[7])
//        }
//    }
//
//    @TypeConverter
//    fun publisherToString(publisher: Publisher): String{
//        return "${publisher.createAt},${publisher.createBy},${publisher.id}," +
//                "${publisher.publisher_name},${publisher.updateAt},${publisher.updateBy}"
//    }
//
//    @TypeConverter
//    fun stringToPublisher(publisher: String): Publisher{
//        return publisher.split(",").let { publisherArray ->
//            Publisher(publisherArray[0],publisherArray[1],publisherArray[2].toInt(),publisherArray[3],publisherArray[4],
//                publisherArray[5])
//        }
//    }
//
//
//
//
//}


package com.plcoding.e_book.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.plcoding.e_book.domain.model.Books.Author
import com.plcoding.e_book.domain.model.Books.Gallery
import com.plcoding.e_book.domain.model.Books.Language
import com.plcoding.e_book.domain.model.Books.Provider
import com.plcoding.e_book.domain.model.Books.Publisher

@ProvidedTypeConverter
class BooksTypeConvertor {

    @TypeConverter
    fun authorsToString(authors: List<Author>): String {
        val gson = Gson()
        return gson.toJson(authors)
    }

    @TypeConverter
    fun stringToAuthors(authorsString: String?): List<Author> {
        if (authorsString.isNullOrEmpty()) {
            return emptyList()
        }
        val gson = Gson()
        val listType = object : TypeToken<List<Author>>() {}.type
        return gson.fromJson(authorsString, listType)
    }

    @TypeConverter
    fun galleryToString(gallery: List<Gallery>): String {
        val gson = Gson()
        return gson.toJson(gallery)
    }

    @TypeConverter
    fun fromLanguage(language: Language?): String? {
        return language?.let { Gson().toJson(it) }
    }

    @TypeConverter
    fun toLanguage(languageString: String?): Language? {
        return languageString?.let { Gson().fromJson(it, Language::class.java) }
    }

    @TypeConverter
    fun stringToGallery(galleryString: String?): List<Gallery> {
        if (galleryString.isNullOrEmpty()) {
            return emptyList()
        }
        val gson = Gson()
        val listType = object : TypeToken<List<Gallery>>() {}.type
        return gson.fromJson(galleryString, listType)
    }


    @TypeConverter
    fun providerToString(provider: Provider): String {
        val gson = Gson()
        return gson.toJson(provider)
    }

    @TypeConverter
    fun stringToProvider(providerString: String): Provider {
        val gson = Gson()
        return gson.fromJson(providerString, Provider::class.java)
    }

    @TypeConverter
    fun publisherToString(publisher: Publisher): String {
        val gson = Gson()
        return gson.toJson(publisher)
    }

    @TypeConverter
    fun stringToPublisher(publisherString: String): Publisher {
        val gson = Gson()
        return gson.fromJson(publisherString, Publisher::class.java)
    }
}
