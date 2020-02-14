package com.lukianbat.template.core.di.modules

import android.content.Context
import android.content.SharedPreferences

object PreferenceProvider {
    fun provideSharedPreference(context: Context): SharedPreferences =
        context.getSharedPreferences("preferences", Context.MODE_PRIVATE)
}