package com.lukianbat.template.feature.splash.di

import com.lukianbat.template.feature.splash.presentation.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    viewModel { SplashViewModel(get()) }
}