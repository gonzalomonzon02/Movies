package com.gonzalo.monzon.movies.application.di.modules

import com.gonzalo.monzon.movies.application.datasources.RetrofitMovieDataSource
import com.gonzalo.monzon.movies.domain.datasources.RemoteMovieDataSource
import org.koin.dsl.module

val dataSourcesModule = module {
    single<RemoteMovieDataSource> { RetrofitMovieDataSource(get()) }
}