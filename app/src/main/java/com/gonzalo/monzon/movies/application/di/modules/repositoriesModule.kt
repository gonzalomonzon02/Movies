package com.gonzalo.monzon.movies.application.di.modules

import com.gonzalo.monzon.movies.application.repositories.MovieRepositoryImpl
import com.gonzalo.monzon.movies.domain.repositories.MovieRepository
import org.koin.dsl.module

val repositoriesModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
}