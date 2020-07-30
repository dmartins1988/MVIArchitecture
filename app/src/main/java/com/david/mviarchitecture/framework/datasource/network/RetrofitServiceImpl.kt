package com.david.mviarchitecture.framework.datasource.network

import com.david.mviarchitecture.framework.datasource.network.models.CharacterNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.EpisodeNetworkModel
import com.david.mviarchitecture.framework.datasource.network.models.QuoteNetworkModel
import com.david.mviarchitecture.framework.datasource.network.retrofit.Retrofit

class RetrofitServiceImpl(
    private val retrofit: Retrofit
) : RetrofitService {

    override suspend fun getCharacters(): List<CharacterNetworkModel> {
        return retrofit.getCharacters()
    }

    override suspend fun getEpisodes(): List<EpisodeNetworkModel> {
        return retrofit.getEpisodes()
    }

    override suspend fun getQuotes(): List<QuoteNetworkModel> {
        return retrofit.getQuotes()
    }

}