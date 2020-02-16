package com.lukianbat.template.core.di

import com.lukianbat.template.core.data.ISettingsManager
import com.lukianbat.template.core.data.SettingsManager
import com.lukianbat.template.core.di.modules.PreferenceProvider
import com.lukianbat.template.core.di.modules.RetrofitProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val networkModule = module {
    single { RetrofitProvider.provideRetrofit() }
}

val preferencesModule = module {
    single { PreferenceProvider.provideSharedPreference(androidContext()) }
    single<ISettingsManager> { SettingsManager(get()) }
}