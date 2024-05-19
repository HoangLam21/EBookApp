package com.plcoding.e_book.presentation.book

import android.graphics.Bitmap
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
import android.graphics.BitmapFactory
import android.util.Base64
@HiltViewModel
class BookDetailsViewModel @Inject constructor(
    private val booksUseCase: BooksUseCase
): ViewModel() {
    var sideEffect by mutableStateOf<String?>(null)
        private set


    var imageBitmap by mutableStateOf<Bitmap?>(null)
        private set

    fun loadImage(encodedImage: String?) {
        encodedImage?.let {
            try {
                val decodedBytes = Base64.decode(it, Base64.DEFAULT)
                val bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
                imageBitmap = bitmap
            } catch (e: Exception) {
                // Handle error
            }
        }
    }

    fun onEvent(event: DetailsEvent){
        when(event){
            is DetailsEvent.UpsertDeleteBooks -> {
                viewModelScope.launch {
                    val bookitem = event.result.id?.let { booksUseCase.selectBook(it) }
                    if(bookitem==null){
                        Log.d("da vo them sach","het roi")
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
        booksUseCase.deleteBooks(result = result)
        sideEffect = "Book Deleted"
    }

    private suspend fun upserBookResponseItem(result: Result) {
        booksUseCase.upsertBooks(result= result)
        sideEffect = "Book Saved"

    }

}