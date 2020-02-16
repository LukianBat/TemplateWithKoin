package com.lukianbat.template.core

import android.app.Application
import com.lukianbat.template.core.di.networkModule
import com.lukianbat.template.core.di.preferencesModule
import com.lukianbat.template.feature.auth.di.authModule
import com.lukianbat.template.feature.splash.di.splashModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    networkModule, preferencesModule,
                    authModule, splashModule
                )
            )
        }
    }
}