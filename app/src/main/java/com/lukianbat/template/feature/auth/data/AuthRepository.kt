package com.lukianbat.template.feature.auth.data

import com.lukianbat.template.core.data.ISettingsManager
import io.reactivex.Completable

interface IAuthRepository {

    fun signIn(): Completable

    fun signUp(): Completable
}

class AuthRepository(private val api: DataApi, private val settingsManager: ISettingsManager) : IAuthRepository {

    override fun signIn(): Completable = api.signIn()

    override fun signUp(): Completable = api.signUp()
}