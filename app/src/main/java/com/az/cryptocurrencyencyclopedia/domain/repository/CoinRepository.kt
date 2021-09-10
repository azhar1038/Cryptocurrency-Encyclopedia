package com.az.cryptocurrencyencyclopedia.domain.repository

import com.az.cryptocurrencyencyclopedia.data.remote.dto.CoinDetailDto
import com.az.cryptocurrencyencyclopedia.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}