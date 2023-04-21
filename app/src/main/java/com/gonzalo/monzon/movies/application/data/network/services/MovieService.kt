package com.gonzalo.monzon.movies.application.data.network.services

import com.gonzalo.monzon.movies.application.data.network.model.MovieDbResult
import com.gonzalo.monzon.movies.domain.model.TimeWindow
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("trending/movie/{time_window}")
    suspend fun getMoviesTrends(
        @Path("time_window") timeWindow: String,
        @Query("page") page: Int
    ): MovieDbResult
}