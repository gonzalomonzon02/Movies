package com.gonzalo.monzon.movies.application.di.modules

import com.gonzalo.monzon.movies.application.data.network.ApiService
import org.koin.dsl.module

val generalModule = module {
    single { ApiService().getRetrofit() }
}
