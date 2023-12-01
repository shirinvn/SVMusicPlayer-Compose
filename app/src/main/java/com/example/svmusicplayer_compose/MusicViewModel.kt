package com.example.svmusicplayer_compose

// MusicViewModel.kt
import android.media.MediaPlayer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

//class MusicViewModel(private val repository: MusicRepository) : ViewModel() {
//
//    private val _musicList = MutableLiveData<List<Music>>()
//    val musicList: LiveData<List<Music>> get() = _musicList
//
//    // Function to fetch music list
//    fun fetchMusicList() {
//        viewModelScope.launch(Dispatchers.IO) {
//            try {
//                val musicList = repository.getMusicList()
//                _musicList.postValue(musicList)
//            } catch (e: Exception) {
//                // Handle errors or exceptions here
//            }
//        }
//    }
//}

@HiltViewModel
class MusicViewModel  @Inject constructor(
    private val repository: MusicRepository
): ViewModel() {
    private var mediaPlayer: MediaPlayer? = null
    private val _musicList = MutableLiveData<List<Music>>() // Assuming you have a LiveData for music list
    val musicList: LiveData<List<Music>> get() = _musicList

    // Function to start playback
    fun playMusic(music: Music) {
        stopMusic() // Stop any ongoing playback
        mediaPlayer = MediaPlayer().apply {
           // setDataSource(/* Set data source for the selected music */)
            prepare()
            start()
            music.isPlaying = true // Update playback state in the model
        }
    }

    // Function to pause playback
    fun pauseMusic() {
        mediaPlayer?.pause()
        // Update playback state in the model
        _musicList.value = _musicList.value?.map { it.copy(isPlaying = false) }
    }

    // Function to stop playback
    fun stopMusic() {
        mediaPlayer?.release()
        mediaPlayer = null
        // Update playback state in the model
        _musicList.value = _musicList.value?.map { it.copy(isPlaying = false) }
    }

    // Handle other playback controls (skip, seek, etc.) as needed
}
