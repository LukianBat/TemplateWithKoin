package com.lukianbat.template.core.di.modules

import android.content.Context
import androidx.room.Room
import com.lukianbat.template.core.data.AppDatabase

object RoomProvider {
    fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "database").build()
    }
}