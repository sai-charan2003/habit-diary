package com.charan.habitdiary.data.model.enums

enum class DailyLogSortType {

    NEWEST_FIRST,
    OLDEST_FIRST;

    fun toLocaleString() : Int{
        return when(this){
            NEWEST_FIRST -> com.charan.habitdiary.R.string.newest_first
            OLDEST_FIRST -> com.charan.habitdiary.R.string.oldest_first
        }
    }

    companion object {
        fun fromRes(resId: Int): DailyLogSortType {
            return entries.firstOrNull { it.toLocaleString() == resId }
                ?: NEWEST_FIRST
        }
    }

}