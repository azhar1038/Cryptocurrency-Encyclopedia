package com.az.cryptocurrencyencyclopedia.presentation.coin_list

import com.az.cryptocurrencyencyclopedia.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
