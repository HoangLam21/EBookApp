package com.plcoding.e_book.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.plcoding.e_book.data.manager.dataStore
import com.plcoding.e_book.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow
import com.plcoding.e_book.util.Constants
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl(
    private val conext: Context
):LocalUserManager {
    override suspend fun saveAppEntry() {
       conext.dataStore.edit { setting ->
           setting[PreferencesKeys.APP_ENTRY] = true
       }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return conext.dataStore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY]?: false
        }
    }

}

private val Context.dataStore: DataStore<Preferences> by androidx.datastore.preferences.preferencesDataStore(name = Constants.USER_SETTINGS)

private object  PreferencesKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}