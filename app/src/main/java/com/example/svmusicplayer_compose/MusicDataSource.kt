package com.example.svmusicplayer_compose

// MusicDataSource.kt
interface MusicDataSource {
    suspend fun fetchMusicList(): List<Music>
    // Add other methods for fetching individual songs, etc., if needed
}

