package com.plcoding.e_book.presentation.reading_chapter

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.*
import com.plcoding.e_book.domain.model.update_reading.ChapterUpdateResponse
import com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi
import com.plcoding.e_book.util.Constants.USER_TOKEN
import kotlinx.coroutines.launch
import retrofit2.Response

@HiltViewModel
class ReadingViewModel @Inject constructor(
    private val api: UpdateChapterApi
) : ViewModel() {

    private val _readingResult = MutableLiveData<Int>()
    val readingResult: LiveData<Int> = _readingResult





    fun getResultFromResponse(response: Response<ChapterUpdateResponse>): Int {
        return response.body()?.result ?: -1
    }

    fun createReading(token: String, bookId: Int, chapterIndex: Int) {
        viewModelScope.launch {
            try {
                val response = api.upadateChapter("$token", bookId, chapterIndex)
                if (response.isSuccessful) {
                    val result = response.body()?.result ?: -1
                    _readingResult.postValue(result)
                    Log.d("ReadingViewModel", "Reading updated successfully with result: $result")
                } else {
                    Log.e("ReadingViewModel", "Failed to update reading: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("ReadingViewModel", "Exception: ${e.message}")
            }
        }
    }
}