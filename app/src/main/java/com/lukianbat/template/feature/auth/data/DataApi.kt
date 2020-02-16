package com.lukianbat.template.feature.auth.data

import io.reactivex.Completable
import retrofit2.http.GET

interface DataApi {

    @GET("/example")
    fun signIn(): Completable

    @GET("/example")
    fun signUp(): Completable
}