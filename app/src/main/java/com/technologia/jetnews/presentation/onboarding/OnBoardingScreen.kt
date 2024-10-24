package com.technologia.jetnews.presentation.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.technologia.jetnews.presentation.onboarding.components.OnBoardingPage

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val pagerState = rememberPagerState(initialPage = 0){
            onBoardPages.size
        }

        val buttonState = remember {
            derivedStateOf {
                when(pagerState.currentPage){
                    0-> listOf("","Next")
                    1-> listOf("Back","Next")
                    2-> listOf("Back","Get Started")
                    else -> listOf("","")
                }
            }
        }
        
        HorizontalPager(state = pagerState) {index->
            OnBoardingPage(onBoardingPage = onBoardPages[index])
        }
    }
}