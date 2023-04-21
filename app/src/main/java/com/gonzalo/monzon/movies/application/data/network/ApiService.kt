package com.gonzalo.monzon.movies.application.data.network

import com.gonzalo.monzon.movies.BuildConfig
import com.gonzalo.monzon.movies.application.data.network.interceptors.AddAuthorizationHeaderInterceptor
import com.gonzalo.monzon.movies.application.data.network.interceptors.AddSettingHeaderInterceptor
import com.gonzalo.monzon.movies.presentation.utils.contants.AppConstants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiService {
    private val apiClientCommon = OkHttpClient.Builder()
        .addNetworkInterceptor(AddAuthorizationHeaderInterceptor())
        .addNetworkInterceptor(AddSettingHeaderInterceptor())
        .readTimeout(AppConstants.TIMER_TIME_OUT, TimeUnit.SECONDS)
        .writeTimeout(AppConstants.TIMER_TIME_OUT, TimeUnit.SECONDS)
        .build()

    fun getRetrofit(): Retrofit = Retrofit.Builder()
        .client(apiClientCommon)
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BuildConfig.BASE_URL)
        .build()
}