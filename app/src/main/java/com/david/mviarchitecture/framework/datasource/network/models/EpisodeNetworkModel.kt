package com.david.mviarchitecture.framework.datasource.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EpisodeNetworkModel(
    @SerializedName("air_date")
    @Expose
    var airDate: String?,
    @SerializedName("characters")
    @Expose
    var characters: List<String>?,
    @SerializedName("episode")
    @Expose
    var episode: String?,
    @SerializedName("episode_id")
    @Expose
    var episodeId: Int?,
    @SerializedName("season")
    @Expose
    var season: String?,
    @SerializedName("series")
    @Expose
    var series: String?,
    @SerializedName("title")
    @Expose
    var title: String?
)