package com.example.moviesnight.ui.theme.data

import androidx.annotation.DrawableRes

data class MovieThumbnailState(
    val id: Int,
    @DrawableRes val imageRes: Int
)

val UpComingMoviesData = listOf(
    MovieThumbnailState(1, com.example.moviesnight.R.drawable.movie_1),
    MovieThumbnailState(2, com.example.moviesnight.R.drawable.movie_2),
    MovieThumbnailState(3, com.example.moviesnight.R.drawable.movie_3),
    MovieThumbnailState(4, com.example.moviesnight.R.drawable.movie_4)
)

val RecentlyWatchedMoviesData = listOf(
    MovieThumbnailState(5, com.example.moviesnight.R.drawable.movie_5),
    MovieThumbnailState(6, com.example.moviesnight.R.drawable.movie_6),
    MovieThumbnailState(7, com.example.moviesnight.R.drawable.movie_7),
    MovieThumbnailState(8, com.example.moviesnight.R.drawable.movie_8)
)

val StreamingMoviesData = listOf(
    MovieThumbnailState(8, com.example.moviesnight.R.drawable.movie_8),
    MovieThumbnailState(1, com.example.moviesnight.R.drawable.movie_1),
    MovieThumbnailState(2, com.example.moviesnight.R.drawable.movie_2),
    MovieThumbnailState(4, com.example.moviesnight.R.drawable.movie_4)
)
