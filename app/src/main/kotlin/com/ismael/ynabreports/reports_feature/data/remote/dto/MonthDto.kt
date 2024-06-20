package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MonthDto(
    @Json(name = "activity")
    val activity: Int = 0,
    @Json(name = "age_of_money")
    val ageOfMoney: Int = 0,
    @Json(name = "budgeted")
    val budgeted: Int = 0,
    @Json(name = "categories")
    val categories: List<CategoryDto> = listOf(),
    @Json(name = "deleted")
    val deleted: Boolean = false,
    @Json(name = "income")
    val income: Int = 0,
    @Json(name = "month")
    val month: String = "",
    @Json(name = "note")
    val note: String? = null,
    @Json(name = "to_be_budgeted")
    val toBeBudgeted: Int = 0
)