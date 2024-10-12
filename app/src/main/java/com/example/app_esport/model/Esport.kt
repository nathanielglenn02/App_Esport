package com.example.app_esport.model

data class Esport(
    val title: String,
    val overview: String,
    val description: String,
    val date: String,
    val location: String,
    val prizePool: String,
    val teams: List<String>,
    val players: List<String>,
    val sponsors: List<String>,
    val streamingPlatforms: String,
    val website: String,
    val socialMedia: String,
    val schedule: String,
    val history: String,
    val imageResource: Int
)
