package com.plcoding.e_book.presentation.reading

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ChapterViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ChapterResponsitory

    init {
        val chapterDao = ChapterDatabase.getDatabase(application).chapterDao()
        repository = ChapterResponsitory(chapterDao)
    }

    private val _chapters = MutableStateFlow<List<Chapter>>(emptyList())
    val chapters: Flow<List<Chapter>> get() = _chapters.asStateFlow()

    private val _currentChapterIndex = MutableStateFlow(0)
    val currentChapterIndex: StateFlow<Int> get() = _currentChapterIndex.asStateFlow()



    init {
        fetchChapters()
    }

    private fun fetchChapters() {
        viewModelScope.launch {
            repository.getAllChapters().collect { chapterList ->
                _chapters.value = chapterList
            }
        }
    }

    fun upsertInitialChapters(chapters: List<Chapter>) {
        viewModelScope.launch {
            repository.upsertChapters(chapters)
            fetchChapters() // refresh the chapters list
        }
    }

    fun nextChapter() {
        val newIndex = (_currentChapterIndex.value + 1).coerceAtMost(_chapters.value.size - 1)
        _currentChapterIndex.value = newIndex
    }

    fun previousChapter() {
        val newIndex = (_currentChapterIndex.value - 1).coerceAtLeast(0)
        _currentChapterIndex.value = newIndex
    }

    fun setChapterIndex(index: Int) {
        _currentChapterIndex.value = index
    }


}
