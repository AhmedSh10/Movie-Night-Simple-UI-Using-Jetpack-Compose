package com.example.moviesnight.ui.theme.data

import androidx.annotation.DrawableRes

data class FeaturedMovieState(
    val id: Int,
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
    val timeSlots: List<String>
)

val featuredMoviesDatumStates = listOf(
    FeaturedMovieState(
        id = 1,
        image = com.example.moviesnight.R.drawable.movie_1,
        title = "The Matrix",
        description = "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 2,
        image = com.example.moviesnight.R.drawable.movie_2,
        title = "The Shawshank Redemption",
        description = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 3,
        image = com.example.moviesnight.R.drawable.movie_3,
        title = "The Godfather",
        description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 4,
        image = com.example.moviesnight.R.drawable.movie_4,
        title = "The Dark Knight",
        description = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 5,
        image = com.example.moviesnight.R.drawable.movie_5,
        title = "12 Angry",
        description = "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 6,
        image = com.example.moviesnight.R.drawable.movie_6,
        title = "Schindler's List",
        description = "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 7,
        image = com.example.moviesnight.R.drawable.movie_7,
        title = "The Lord of the Rings: The Return of the King",
        description = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    ),
    FeaturedMovieState(
        id = 8,
        image = com.example.moviesnight.R.drawable.movie_8,
        title = "Pulp Fiction",
        description = "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
        timeSlots = listOf("4:00 PM", "6:00 PM", "8:00 PM")
    )

)
