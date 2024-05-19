package com.plcoding.e_book.presentation.book

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.plcoding.e_book.domain.model.Books.Result

@HiltViewModel
class BookDetailsViewModel @Inject constructor(
    private val booksUseCase: BooksUseCase
): ViewModel() {
    var sideEffect by mutableStateOf<String?>(null)
        private set

    fun onEvent(event: DetailsEvent){
        when(event){
            is DetailsEvent.UpsertDeleteBooks -> {
                viewModelScope.launch {
                    val bookitem = event.result.id?.let { booksUseCase.selectBook(it) }
                    if(bookitem==null){
                        upserBookResponseItem(event.result)
                    }else{
                        deleteBookResponseItem(event.result)
                    }
                }
            }

            is DetailsEvent.RemoveSideEffect ->{
                sideEffect = null
            }
        }
    }

    val books = booksUseCase.getBooks(
        sources = listOf("bbc-news","abc-news", "al-jaz-egl")
    ).cachedIn(viewModelScope)

    private suspend fun deleteBookResponseItem(result: Result) {
        Log.d("da co delete","upsert")

        booksUseCase.deleteBooks(result = result)
        Log.d("da co delete","upsert")

        sideEffect = "Book Deleted"
    }

    private suspend fun upserBookResponseItem(result: Result) {
        Log.d("da co delete","upsert")

        booksUseCase.upsertBooks(result= result)
        Log.d("da co upsert","upsert")
        sideEffect = "Book Saved"

    }

}