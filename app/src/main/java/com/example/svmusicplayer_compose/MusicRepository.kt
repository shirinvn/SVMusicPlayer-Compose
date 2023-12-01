package com.example.svmusicplayer_compose

// MusicRepository.kt
class MusicRepository(private val musicDataSource: MusicDataSource) {
    suspend fun getMusicList(): List<Music> {
        return musicDataSource.fetchMusicList() // Implement data fetching logic here
    }
}
