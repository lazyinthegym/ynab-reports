package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataDto(
    @Json(name = "category_groups")
    val categoryGroups: List<CategoryGroupDto>,
    @Json(name = "server_knowledge")
    val serverKnowledge: Int
)