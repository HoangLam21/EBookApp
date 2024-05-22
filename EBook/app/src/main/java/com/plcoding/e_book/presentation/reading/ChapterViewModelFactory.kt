package com.plcoding.e_book.presentation.reading
import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ChapterViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChapterViewModel::class.java)) {
            return ChapterViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}