package com.gonzalo.monzon.movies.application.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import java.util.*

class AddSettingHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val newUrl = chain.request()
            .url()
            .newBuilder()
            .addQueryParameter("language", Locale.getDefault().toLanguageTag())
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .addHeader("Content-Type", "application/json")
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }
}
