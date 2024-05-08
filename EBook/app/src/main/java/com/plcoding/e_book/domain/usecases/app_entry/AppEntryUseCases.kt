package com.plcoding.e_book.domain.usecases.app_entry

import com.plcoding.e_book.domain.usecases.app_entry.ReadAppEntry

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)
