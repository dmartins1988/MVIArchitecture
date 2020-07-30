package com.david.mviarchitecture.framework.datasource.network

import com.david.mviarchitecture.framework.datasource.network.models.CharacterNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.EpisodeNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.QuoteNetworkModel

interface RetrofitService {

    suspend fun getCharacters() : List<CharacterNetworkModel>

    suspend fun getEpisodes() : List<EpisodeNetworkModel>

    suspend fun getQuotes() : List<QuoteNetworkModel>

}