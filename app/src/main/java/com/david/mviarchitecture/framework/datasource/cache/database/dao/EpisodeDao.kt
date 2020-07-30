package com.david.mviarchitecture.framework.datasource.cache.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.david.mviarchitecture.framework.datasource.cache.models.EpisodeEntity

@Dao
interface EpisodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEpisode(episodeEntity: EpisodeEntity) : Long

    @Query("SELECT * FROM episode_table")
    suspend fun getEpisodes() : List<EpisodeEntity>
}