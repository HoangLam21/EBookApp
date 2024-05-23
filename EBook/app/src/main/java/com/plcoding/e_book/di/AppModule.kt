package com.plcoding.e_book.di


import android.app.Application
import androidx.room.Room
import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.data.local.BooksDatabse
import com.plcoding.e_book.data.local.BooksTypeConvertor
import com.plcoding.e_book.data.local.CategoryDao
import com.plcoding.e_book.data.local.CategoryDatabase
import com.plcoding.e_book.data.manager.LocalUserManagerImpl
import com.plcoding.e_book.data.remote.BooksApi
import com.plcoding.e_book.data.remote.CategoryApi
import com.plcoding.e_book.data.repository.BooksResponsetoryImpl
import com.plcoding.e_book.data.repository.CategoryRepositoryImpl
import com.plcoding.e_book.domain.manager.LocalUserManager
import com.plcoding.e_book.domain.repository.BooksResponsitory
import com.plcoding.e_book.domain.repository.CategoryRepository
import com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases
import com.plcoding.e_book.domain.usecases.app_entry.ReadAppEntry
import com.plcoding.e_book.domain.usecases.app_entry.SaveAppEntry
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import com.plcoding.e_book.domain.usecases.book.GetBooksWithCategory
import com.plcoding.e_book.domain.usecases.book.GetBooksWithDiscount
import com.plcoding.e_book.domain.usecases.book.SearchBooks
import com.plcoding.e_book.domain.usecases.books.DeleteBooks
import com.plcoding.e_book.domain.usecases.books.GetBooks
import com.plcoding.e_book.domain.usecases.books.SelectBook
import com.plcoding.e_book.domain.usecases.books.SelectBooks
import com.plcoding.e_book.domain.usecases.books.UpsertBooks
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase
import com.plcoding.e_book.domain.usecases.category.GetCategory
import com.plcoding.e_book.domain.usecases.category.SelectCategories
import com.plcoding.e_book.domain.usecases.category.SelectCategory
import com.plcoding.e_book.util.Constants
import com.plcoding.e_book.util.Constants.BOOKS_DATABASE_NAME
import com.plcoding.e_book.util.Constants.CATEGORY_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)


    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager

    )= AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

    @Provides
    @Singleton
    fun provideBooksApi(): BooksApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BooksApi::class.java)
    }

    @Provides
    @Singleton
    fun provideBooksRepository(
        booksApi: BooksApi,
        booksDao: BooksDao
    ): BooksResponsitory = BooksResponsetoryImpl(booksApi,booksDao)


    @Provides
    @Singleton
    fun provideBooksUseCases(
        booksResponsitory: BooksResponsitory,
        booksDao: BooksDao

    ): BooksUseCase{
        return BooksUseCase(
            getBooks = GetBooks(booksResponsitory),
            searchBooks = SearchBooks(booksResponsitory),
            upsertBooks = UpsertBooks(booksResponsitory),
            deleteBooks = DeleteBooks(booksResponsitory),
            selectBooks = SelectBooks(booksResponsitory),
            selectBook = SelectBook(booksResponsitory),
            getBooksWithDiscount = GetBooksWithDiscount(booksResponsitory),
            getBooksWithCategory = GetBooksWithCategory(booksResponsitory)
        )
    }

    @Provides
    @Singleton
    fun provideBooksDatabase(
        application: Application
    ): BooksDatabse{
        return Room.databaseBuilder(
            context = application,
            klass = BooksDatabse::class.java,
            name = BOOKS_DATABASE_NAME
        ).addTypeConverter(BooksTypeConvertor())
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideBooksDao(
        booksDatabase: BooksDatabse
    ): BooksDao = booksDatabase.booksDao


    @Provides
    @Singleton
    fun provideCategoryApi(): CategoryApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CategoryApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCategoryRepository(
        categoryApi: CategoryApi,
        categoryDao: CategoryDao
    ): CategoryRepository = CategoryRepositoryImpl(categoryApi, categoryDao)


    @Provides
    @Singleton
    fun provideCategoryUseCases(
        categoryRepository: CategoryRepository,
        categoryDao: CategoryDao

    ): CategoryUseCase{
        return CategoryUseCase(
            getCategory = GetCategory(categoryRepository),
            selectCategories = SelectCategories(categoryRepository),
            selectCategory = SelectCategory(categoryRepository)

        )
    }

    @Provides
    @Singleton
    fun provideCategoryDatabase(application: Application): CategoryDatabase {
        return Room.databaseBuilder(
            application,
            CategoryDatabase::class.java,
            CATEGORY_DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }



    @Provides
    @Singleton
    fun provideCategoryDao(
       categoryDatabase: CategoryDatabase
    ):CategoryDao=categoryDatabase.categoryDao

}