package com.charan.habitdiary.presentation.on_boarding

sealed class OnBoardingEffect {
    data class OnScrollToPage(val page: Int) : OnBoardingEffect()
    object NavigateToHome : OnBoardingEffect()
}