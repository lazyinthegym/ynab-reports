package com.ismael.ynabreports.reports_feature.data.remote.dto


import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CategoryDto(
    @Json(name = "activity")
    val activity: Int,
    @Json(name = "balance")
    val balance: Int,
    @Json(name = "budgeted")
    val budgeted: Int,
    @Json(name = "category_group_id")
    val categoryGroupId: String,
    @Json(name = "category_group_name")
    val categoryGroupName: String,
    @Json(name = "deleted")
    val deleted: Boolean,
    @Json(name = "goal_cadence")
    val goalCadence: Int? = null,
    @Json(name = "goal_cadence_frequency")
    val goalCadenceFrequency: Int? = null,
    @Json(name = "goal_creation_month")
    val goalCreationMonth: String? = null,
    @Json(name = "goal_day")
    val goalDay: Int? = null,
    @Json(name = "goal_months_to_budget")
    val goalMonthsToBudget: Int? = null,
    @Json(name = "goal_overall_funded")
    val goalOverallFunded: Int? = null,
    @Json(name = "goal_overall_left")
    val goalOverallLeft: Int? = null,
    @Json(name = "goal_percentage_complete")
    val goalPercentageComplete: Int? = null,
    @Json(name = "goal_target")
    val goalTarget: Int? = null,
    @Json(name = "goal_target_month")
    val goalTargetMonth: String? = null,
    @Json(name = "goal_type")
    val goalType: String? = null,
    @Json(name = "goal_under_funded")
    val goalUnderFunded: Int? = null,
    @Json(name = "hidden")
    val hidden: Boolean,
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "note")
    val note: String? = null,
    @Json(name = "original_category_group_id")
    val originalCategoryGroupId: String? = null
)

fun CategoryDto.toCategory() = Category(
    name = name,
    activity = activity
)