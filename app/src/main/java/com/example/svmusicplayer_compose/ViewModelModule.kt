package com.example.svmusicplayer_compose

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {
    @Provides
    fun provideMusicViewModel(repository: MusicRepository): MusicViewModel {
        return MusicViewModel(repository)
    }
}