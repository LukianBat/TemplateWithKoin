package com.lukianbat.template.feature.auth.di

import com.lukianbat.template.feature.auth.data.DataApi
import retrofit2.Retrofit

object AuthApiProvider {

    fun provideAuthApi(retrofit: Retrofit): DataApi = retrofit.create(
        DataApi::class.java
    )
}