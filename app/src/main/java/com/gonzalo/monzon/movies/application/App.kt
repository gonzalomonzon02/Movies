package com.gonzalo.monzon.movies.application

import android.app.Application
import com.gonzalo.monzon.movies.application.di.modules.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModules)
        }
    }
}