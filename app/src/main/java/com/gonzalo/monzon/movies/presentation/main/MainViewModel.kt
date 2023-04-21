package com.gonzalo.monzon.movies.presentation.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gonzalo.monzon.movies.domain.repositories.MovieRepository
import kotlinx.coroutines.launch

class MainViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun fetchMovies(){
        viewModelScope.launch {
            try {
                val movies = movieRepository.getMoviesTrends()
                Log.d("casaaaaa", movies.toString())
            } catch (e: Exception) {
                Log.d("casaaaaa", e.message.toString())
            }
        }
    }
}