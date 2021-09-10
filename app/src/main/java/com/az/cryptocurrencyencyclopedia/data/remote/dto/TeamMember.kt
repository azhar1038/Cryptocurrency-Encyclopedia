package com.az.cryptocurrencyencyclopedia.data.remote.dto


import com.squareup.moshi.Json

data class TeamMember(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "position")
    val position: String
)