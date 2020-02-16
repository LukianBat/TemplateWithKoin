package com.lukianbat.template.feature.auth.di

import com.lukianbat.template.feature.auth.data.IAuthRepository
import com.lukianbat.template.feature.auth.data.AuthRepository
import com.lukianbat.template.feature.auth.presentation.AuthViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val authModule = module {

    factory { AuthApiProvider.provideAuthApi(get()) }

    factory<IAuthRepository> { AuthRepository(get(), get()) }

    viewModel { AuthViewModel(get()) }
}