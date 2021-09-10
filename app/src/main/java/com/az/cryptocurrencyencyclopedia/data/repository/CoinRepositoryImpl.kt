package com.az.cryptocurrencyencyclopedia.data.repository

import com.az.cryptocurrencyencyclopedia.data.remote.CoinApi
import com.az.cryptocurrencyencyclopedia.data.remote.dto.CoinDetailDto
import com.az.cryptocurrencyencyclopedia.data.remote.dto.CoinDto
import com.az.cryptocurrencyencyclopedia.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}