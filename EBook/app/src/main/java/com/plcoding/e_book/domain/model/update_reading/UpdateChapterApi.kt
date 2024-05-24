package com.plcoding.e_book.domain.model.update_reading

import com.plcoding.e_book.util.Constants
import com.plcoding.e_book.util.Constants.USER_TOKEN
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Query

interface UpdateChapterApi{
    @PATCH("chapter/update-reading-chapter")
    suspend fun upadateChapter(
        @Header("Authorization") token :String ,

        @Query("book_id") book_id: Int,
    @Query("chapter_index") chapter_index: Int,
    ):Response<ChapterUpdateResponse>
}
