package com.david.mviarchitecture.framework.datasource.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class QuoteNetworkModel(
    @SerializedName("author")
    @Expose
    var author: String?,
    @SerializedName("quote")
    @Expose
    var quote: String?,
    @SerializedName("quote_id")
    @Expose
    var quoteId: Int?,
    @SerializedName("series")
    @Expose
    var series: String?
)