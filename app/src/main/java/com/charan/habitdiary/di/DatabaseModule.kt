package com.charan.habitdiary.di

import android.content.Context
import com.charan.habitdiary.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    @Provides
    @Singleton
    fun provideHabitDao(database: AppDatabase) = database.habitDao()

    @Provides
    @Singleton
    fun provideDailyLogDao(database: AppDatabase) = database.dailyLogDao()

    @Provides
    @Singleton
    fun provideDailyLogMediaDao(database: AppDatabase) = database.dailyLogMediaEntityDao()
}
