package com.az.cryptocurrencyencyclopedia.data.remote.dto


import com.squareup.moshi.Json

data class Stats(
    @Json(name = "contributors")
    val contributors: Int?,
    @Json(name = "followers")
    val followers: Int?,
    @Json(name = "stars")
    val stars: Int?,
    @Json(name = "subscribers")
    val subscribers: Int?
)