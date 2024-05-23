package com.plcoding.e_book.presentation.onboarding1

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.loc.newsapp.presentation.onboarding.items
import com.plcoding.e_book.Dimens.MediumPadding2
import com.plcoding.e_book.presentation.common.BooksButton
import com.plcoding.e_book.presentation.common.BooksTextButton
import com.plcoding.e_book.presentation.onboarding.OnBoardingEvent
import com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel
import com.plcoding.e_book.presentation.onboarding.components.OnBoardingPage
import com.plcoding.e_book.presentation.onboardingcomponents.PagerIndicator
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import com.plcoding.e_book.ui.theme.SecondaryKeyColor
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    event: (OnBoardingEvent) -> Unit
) {
    val viewModel: OnBoardingViewModel = hiltViewModel()
    Column(modifier = Modifier.fillMaxSize()) {
        val buttonsState = remember {
            derivedStateOf {
                listOf("", "Get Started")
            }
        }

        val scope = rememberCoroutineScope()
        OnBoardingPage(item = items.first())
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding2)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.weight(0.5f))
            Row(verticalAlignment = Alignment.CenterVertically) {
                BooksButton(
                    text = buttonsState.value[1],
                    onClick = {
                        if (buttonsState.value[1] == "Get Started") {
                            scope.launch {
                                event(OnBoardingEvent.SaveAppEntry)
                            }
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PrimaryKeyColor,
                        contentColor = SecondaryKeyColor
                    )
                )
            }
            Row(
                modifier = Modifier.padding(top = 120.dp, bottom = 52.dp)
            ) {
            }
            Spacer(modifier = Modifier.weight(0.5f))
        }
    }
}