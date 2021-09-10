package com.az.cryptocurrencyencyclopedia.presentation.coin_detail

import com.az.cryptocurrencyencyclopedia.domain.model.Coin
import com.az.cryptocurrencyencyclopedia.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
