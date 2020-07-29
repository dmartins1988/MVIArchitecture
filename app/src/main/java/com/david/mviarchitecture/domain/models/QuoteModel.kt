package com.david.mviarchitecture.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuoteModel(
    @SerializedName("author")
    var author: String?,
    @SerializedName("quote")
    var quote: String?,
    @SerializedName("quote_id")
    var quoteId: Int?,
    @SerializedName("series")
    var series: String?
) : Parcelable