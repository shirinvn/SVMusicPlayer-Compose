package com.example.svmusicplayer_compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PlaybackControls(onPlayPauseClicked: () -> Unit, onNextClicked: () -> Unit, onPreviousClicked: () -> Unit) {
    Row {
        Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Previous",
            modifier =Modifier.clickable { onPreviousClicked() })
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "Play/Pause",
            modifier =Modifier.clickable { onPlayPauseClicked() }
        )
        Icon(imageVector = Icons.Default.ArrowForward,
            contentDescription = "Next",
            modifier =Modifier.clickable{ onNextClicked() })
    }
}
