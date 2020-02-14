package com.lukianbat.template.core.di

import com.lukianbat.template.core.di.modules.PreferenceProvider
import com.lukianbat.template.core.di.modules.RetrofitProvider
import com.lukianbat.template.core.di.modules.RoomProvider
import com.lukianbat.template.feature.auth.AuthViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { RetrofitProvider.provideRetrofit() }
}

val databaseModule = module {
    single { RoomProvider.provideAppDatabase(androidContext()) }
}

val preferencesModule = module {
    single { PreferenceProvider.provideSharedPreference(androidContext()) }
}

val authViewModelModule = module {
    viewModel {
        AuthViewModel()
    }
}