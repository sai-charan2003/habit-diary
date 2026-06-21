package com.charan.habitdiary.presentation.habit_stats

sealed class HabitStatsEffect {
    data object OnNavigateBack : HabitStatsEffect()

    data object AnimateToNextMonth : HabitStatsEffect()

    data object AnimateToPreviousMonth : HabitStatsEffect()

    data class OnNavigateToAddLogScreen(val logId : Long) : HabitStatsEffect()

    data class OnNavigateToEditHabitScreen(val habitId : Long) : HabitStatsEffect()


}