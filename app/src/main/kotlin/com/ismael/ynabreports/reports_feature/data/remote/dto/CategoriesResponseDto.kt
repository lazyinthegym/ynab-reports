package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.ismael.ynabreports.reports_feature.data.remote.dto.toCategory
import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CategoriesResponseDto(
    @Json(name = "data")
    val data: DataDto
)

fun CategoriesResponseDto.toCategories() : List<Category>
{
    return data.categoryGroups.flatMap { it.categories }.map { it.toCategory() }
}