package com.lukianbat.template.core.data

import android.content.SharedPreferences

interface ISettingsManager {
    var token: String
    var isFirstLaunch: Boolean
    var isAuthorized: Boolean
}

class SettingsManager(private val sharedPreferences: SharedPreferences) : ISettingsManager {

    override var token: String
        get() = sharedPreferences.getString(TOKEN_KEY, "") as String
        set(value) {
            sharedPreferences.edit().putString(TOKEN_KEY, value).apply()
        }

    override var isFirstLaunch: Boolean
        get() = sharedPreferences.getBoolean(FIRST_LAUNCH_KEY, true)
        set(value) {
            sharedPreferences.edit().putBoolean(FIRST_LAUNCH_KEY, value).apply()
        }

    override var isAuthorized: Boolean
        get() = sharedPreferences.getBoolean(IS_AUTHORIZED_KEY, false)
        set(value) {
            sharedPreferences.edit().putBoolean(IS_AUTHORIZED_KEY, value).apply()
        }

    companion object {
        private const val TOKEN_KEY = "TOKEN_KEY"
        private const val FIRST_LAUNCH_KEY = "FIRST_LAUNCH_KEY"
        private const val IS_AUTHORIZED_KEY = "IS_AUTHORIZED"
    }
}