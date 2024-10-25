package com.technologia.jetnews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.technologia.jetnews.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val onBoardPages = listOf(
    Page(
        title = "Page1",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Page2",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Page3",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
        image = R.drawable.onboarding3
    ),
)