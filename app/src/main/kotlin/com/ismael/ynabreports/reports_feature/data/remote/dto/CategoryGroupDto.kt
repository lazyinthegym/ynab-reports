package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CategoryGroupDto(
    @Json(name = "categories")
    val categories: List<CategoryDto>,
    @Json(name = "deleted")
    val deleted: Boolean,
    @Json(name = "hidden")
    val hidden: Boolean,
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String
)