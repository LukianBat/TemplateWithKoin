package com.lukianbat.template.feature.auth.presentation

import com.lukianbat.template.core.presentation.BaseViewModel
import com.lukianbat.template.feature.auth.data.IAuthRepository

class AuthViewModel(private val authRepository: IAuthRepository) : BaseViewModel() {
    init {
        authRepository.signIn()
    }
}
