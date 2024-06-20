package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataDto(
    @Json(name = "month")
    val month: MonthDto = MonthDto()
)