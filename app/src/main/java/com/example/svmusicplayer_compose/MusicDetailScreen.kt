package com.example.svmusicplayer_compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MusicDetailScreen(selectedMusic: Music?) {
    Surface(color = Color.White) {
        selectedMusic?.let { music ->
            Column {
                // Display detailed information about the selected music item
            }
        }
    }
}
