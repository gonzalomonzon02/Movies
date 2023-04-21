package com.gonzalo.monzon.movies.application.di.modules

import com.gonzalo.monzon.movies.application.data.network.services.MovieService
import org.koin.dsl.module
import retrofit2.Retrofit

val servicesModule = module {
    single { get<Retrofit>().create(MovieService::class.java) }
}