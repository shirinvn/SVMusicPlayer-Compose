package com.example.svmusicplayer_compose

class MusicLocalDataSource : MusicDataSource {
    override suspend fun fetchMusicList(): List<Music> {
        // Implement logic to fetch music from a local data source (e.g., database, files)
        return listOf(
            Music(1, "Song 1", "Artist 1", 180, "image_url_1"),
            Music(2, "Song 2", "Artist 2", 200, "image_url_2"),
            // Add more music items as needed
        )
    }
}
