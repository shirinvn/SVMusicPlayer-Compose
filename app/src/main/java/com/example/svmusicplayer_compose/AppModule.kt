package com.example.svmusicplayer_compose

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideMusicDataSource(): MusicDataSource {
        return MusicLocalDataSource() // Replace with your actual data source
    }

    @Provides
    fun provideMusicRepository(dataSource: MusicDataSource): MusicRepository {
        return MusicRepository(dataSource)
    }
}