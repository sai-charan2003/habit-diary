package com.charan.habitdiary.presentation.habits

sealed class HabitEffect {
    data class OnNavigateToAddHabitScreen(val id : Long?) : HabitEffect()

    data class OnNavigateToAddDailyLogScreen(val id : Long?) : HabitEffect()

    data class OnNavigateToHabitStatsScreen(val habitId : Long) : HabitEffect()
}