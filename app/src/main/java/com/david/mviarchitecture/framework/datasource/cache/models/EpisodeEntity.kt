package com.david.mviarchitecture.framework.datasource.cache.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "episode_table")
class EpisodeEntity(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "episode_id")
    var id: Int,

    @ColumnInfo(name = "episode")
    var episode: String,

    @ColumnInfo(name = "season")
    var season: String,

    @ColumnInfo(name = "series")
    var series: String,

    @ColumnInfo(name = "title")
    var title: String

)