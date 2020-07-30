package com.david.mviarchitecture.framework.datasource.network.retrofit

import com.david.mviarchitecture.framework.datasource.network.NetworkConstants
import com.david.mviarchitecture.framework.datasource.network.models.CharacterNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.EpisodeNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.QuoteNetworkModel
import retrofit2.http.GET

interface Retrofit {

    @GET(NetworkConstants.CHARACTERS)
    suspend fun getCharacters() : List<CharacterNetworkModel>

    @GET(NetworkConstants.EPISODES)
    suspend fun getEpisodes() : List<EpisodeNetworkModel>

    @GET(NetworkConstants.QUOTES)
    suspend fun getQuotes() : List<QuoteNetworkModel>

}