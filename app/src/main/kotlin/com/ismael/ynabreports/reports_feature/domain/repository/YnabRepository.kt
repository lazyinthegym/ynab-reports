package com.ismael.ynabreports.reports_feature.domain.repository

import com.ismael.ynabreports.reports_feature.domain.model.Category

interface YnabRepository {
    suspend fun getCategories(budgetID: String): List<Category>
}