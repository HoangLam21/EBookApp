package com.plcoding.e_book.di


import android.app.Application
import com.plcoding.e_book.data.manager.LocalUserManagerImpl
import com.plcoding.e_book.domain.manager.LocalUserManager
import com.plcoding.e_book.domain.usecases.AppEntryUseCases
import com.plcoding.e_book.domain.usecases.ReadAppEntry
import com.plcoding.e_book.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
}