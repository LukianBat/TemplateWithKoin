package com.lukianbat.template.feature.splash.presentation

import com.lukianbat.template.core.data.ISettingsManager
import com.lukianbat.template.core.presentation.BaseViewModel
import com.lukianbat.template.core.presentation.EventsDispatcher
import com.lukianbat.template.core.presentation.EventsDispatcherOwner

class SplashViewModel(private val settingsManager: ISettingsManager) :
    BaseViewModel(),
    EventsDispatcherOwner<SplashContract.SplashView> {

    override val eventsDispatcher: EventsDispatcher<SplashContract.SplashView> = EventsDispatcher()

    fun checkSettings() {
        if (settingsManager.isAuthorized) {
            eventsDispatcher.dispatchEvent { navigateToMain() }
        } else {
            eventsDispatcher.dispatchEvent { navigateToAuth() }
        }
    }
}