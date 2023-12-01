package com.example.svmusicplayer_compose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

//data class Playlist(
//    val id: Int,
//    val name: String,
//    val songs: List<Music>
//)
//
//// Example of managing playlists in MusicViewModel
//class MusicViewModel(private val repository: MusicRepository) : ViewModel() {
//    private val _playlists = MutableLiveData<List<Playlist>>()
//    val playlists: LiveData<List<Playlist>> get() = _playlists
//
//    fun createPlaylist(playlistName: String, songs: List<Music>) {
//        // Create a new playlist and add it to the list of playlists
//        val newPlaylist = Playlist(id = playlists.value?.size ?: 0, name = playlistName, songs = songs)
//        _playlists.value = _playlists.value.orEmpty().plus(newPlaylist)
//    }
//
//    // Implement other playlist management functions (add songs, remove songs, delete playlist, etc.)
//}

