package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MonthsResponseDto(
    @Json(name = "data")
    val data: DataDto = DataDto()
)

fun MonthsResponseDto.toDomainCategoryList(): List<Category> {
    return data.month.categories.map {
        Category(
            name = it.name,
            activityInEuro = (it.activity / 1000) * (-1) // Convert to Euro
        )
    }
}
