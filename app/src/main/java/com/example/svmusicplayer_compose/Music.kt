package com.example.svmusicplayer_compose


data class Music(
    val id: Int,
    val title: String,
    val artist: String,
    val duration: Long,
    val imageUrl: String, // Replace with actual image URL or resource ID
    var isPlaying: Boolean = false // Track playback state
)
