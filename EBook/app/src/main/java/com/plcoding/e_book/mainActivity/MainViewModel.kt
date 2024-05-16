package com.plcoding.e_book.mainActivity

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases
import com.plcoding.e_book.presentation.navgragh.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
): ViewModel() {

    //private val _startDestination = mutableStateOf(Route.AppStartNavigation.route)
    //val startDestination: State<String> = _startDestination
        var startDestination by mutableStateOf(Route.AppStartNavigation.route)
            private set

    init {
        appEntryUseCases.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if(shouldStartFromHomeScreen){
                startDestination  = Route.BooksNavigation.route
            }else{
                startDestination = Route.AppStartNavigation.route
            }
            delay(300) //Without this delay, the onBoarding screen will show for a momentum.

        }.launchIn(viewModelScope)
    }
}