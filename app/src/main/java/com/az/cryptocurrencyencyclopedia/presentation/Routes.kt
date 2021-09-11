package com.az.cryptocurrencyencyclopedia.presentation

sealed class Routes(val route: String){
    object CoinList: Routes("coin_list")
    object CoinDetail: Routes("coin_detail")
}
