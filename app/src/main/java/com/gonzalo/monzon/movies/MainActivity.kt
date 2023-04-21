package com.gonzalo.monzon.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gonzalo.monzon.movies.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel.fetchMovies()

    }
}