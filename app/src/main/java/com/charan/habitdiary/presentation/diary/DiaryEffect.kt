package com.charan.habitdiary.presentation.diary

sealed class DiaryEffect {

    data object ScrollToCurrentDate : DiaryEffect()

    data object ScrollToSelectedDate : DiaryEffect()

    data class OnNavigateToAddDailyLogScreen(val id : Long?) : DiaryEffect()
}