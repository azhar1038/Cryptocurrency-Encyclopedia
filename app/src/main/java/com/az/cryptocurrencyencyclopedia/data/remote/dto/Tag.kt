package com.az.cryptocurrencyencyclopedia.data.remote.dto


import com.squareup.moshi.Json

data class Tag(
    @Json(name = "coin_counter")
    val coinCounter: Int,
    @Json(name = "ico_counter")
    val icoCounter: Int,
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String
)