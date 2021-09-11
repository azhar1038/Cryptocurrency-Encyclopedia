package com.az.cryptocurrencyencyclopedia.data.remote.dto


import com.squareup.moshi.Json

data class LinksExtended(
    @Json(name = "stats")
    val stats: Stats?,
    @Json(name = "type")
    val type: String?,
    @Json(name = "url")
    val url: String?
)