package com.plcoding.e_book.domain.usecases.app_entry

import com.plcoding.e_book.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}