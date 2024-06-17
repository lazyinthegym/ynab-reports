package com.ismael.ynabreports.reports_feature.data.remote

import com.ismael.ynabreports.reports_feature.common.Constants
import com.ismael.ynabreports.reports_feature.data.remote.dto.CategoriesResponseDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface YnabApi {
    @Headers("Authorization: Bearer ${Constants.ACCESS_TOKEN}")
    @GET("budgets/{budget_id}/categories")
    suspend fun getCategories(@Path("budget_id") budgetId: String): CategoriesResponseDto
}