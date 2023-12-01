package com.example.svmusicplayer_compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MusicListScreen(musicList: List<Music>, onMusicItemSelected: (Music) -> Unit) {
    LazyColumn {
        items(musicList) { music ->
            MusicListItem(music = music, onMusicItemSelected = onMusicItemSelected)
        }
    }
}

@Composable
fun MusicListItem(music: Music, onMusicItemSelected: (Music) -> Unit) {
    // Design individual music item
    MyText(text = music.title,
        onClick = { onMusicItemSelected(music) },
        )


    // Add UI elements for artist, duration, etc.
}


@Composable
fun MyText(text:String , onClick :() -> Unit){
    Text(text = text,
        modifier= Modifier.clickable { onClick })

}