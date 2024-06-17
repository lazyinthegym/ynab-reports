package com.ismael.ynabreports.reports_feature.data.repository

import com.ismael.ynabreports.reports_feature.data.remote.YnabApi
import com.ismael.ynabreports.reports_feature.data.remote.dto.toCategories
import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.ismael.ynabreports.reports_feature.domain.repository.YnabRepository

class YnabRepositoryImpl(
    private val ynabApi: YnabApi
) : YnabRepository {
    override suspend fun getCategories(budgetID: String): List<Category> {
         val tmpResponseDto = ynabApi.getCategories(budgetID)
        return tmpResponseDto.toCategories()
    }
}