package com.plcoding.e_book.presentation.reading

import kotlinx.coroutines.flow.Flow

class ChapterResponsitory(private val chapterDao: ChapterDao) {

    fun getAllChapters(): Flow<List<Chapter>> = chapterDao.getAllChapter()

    fun getChapters(): Flow<List<Chapter>> {
        return chapterDao.getAllChapter()
    }

    suspend fun upsertChapter(chapter: Chapter) {
        chapterDao.upsert(chapter)
    }

    suspend fun selectChapter(id: Int): Chapter? {
        return chapterDao.getChapter(id)

    }

    suspend fun upsertChapters(chapters: List<Chapter>) {
        chapterDao.upsertAll(chapters)
    }

}