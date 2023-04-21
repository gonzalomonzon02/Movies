package com.gonzalo.monzon.movies.application.data.network.interceptors

import com.gonzalo.monzon.movies.BuildConfig
import com.gonzalo.monzon.movies.presentation.utils.contants.AppConstants
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AddAuthorizationHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        val newUrl: HttpUrl = request
            .url()
            .newBuilder()
            .addQueryParameter(AppConstants.API_KEY_PARAMETER, BuildConfig.API_KEY)
            .build()

        request = request
            .newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(request)
    }
}