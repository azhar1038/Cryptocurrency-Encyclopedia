package com.az.cryptocurrencyencyclopedia.data.remote.dto


import com.squareup.moshi.Json

data class Links(
    @Json(name = "explorer")
    val explorer: List<String>,
    @Json(name = "facebook")
    val facebook: List<String>,
    @Json(name = "reddit")
    val reddit: List<String>,
    @Json(name = "source_code")
    val sourceCode: List<String>,
    @Json(name = "website")
    val website: List<String>,
    @Json(name = "youtube")
    val youtube: List<String>
)