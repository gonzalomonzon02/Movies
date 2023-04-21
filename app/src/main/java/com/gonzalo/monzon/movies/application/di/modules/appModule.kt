package com.gonzalo.monzon.movies.application.di.modules

import com.gonzalo.monzon.movies.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel(get()) }
}