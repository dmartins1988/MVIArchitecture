package com.david.mviarchitecture.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EpisodeModel(
    @SerializedName("air_date")
    var airDate: String?,
    @SerializedName("characters")
    var characters: List<String>?,
    @SerializedName("episode")
    var episode: String?,
    @SerializedName("episode_id")
    var episodeId: Int?,
    @SerializedName("season")
    var season: String?,
    @SerializedName("series")
    var series: String?,
    @SerializedName("title")
    var title: String?
) : Parcelable