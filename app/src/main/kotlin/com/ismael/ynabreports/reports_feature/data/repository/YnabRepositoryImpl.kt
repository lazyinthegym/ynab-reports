package com.ismael.ynabreports.reports_feature.data.repository

import com.ismael.ynabreports.reports_feature.data.remote.YnabApi
import com.ismael.ynabreports.reports_feature.data.remote.dto.toDomainCategoryList
import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.ismael.ynabreports.reports_feature.domain.repository.YnabRepository
import java.util.Date

class YnabRepositoryImpl(
    private val ynabApi: YnabApi
) : YnabRepository {
    override suspend fun getCategories(budgetID: String): List<Category> {
        // TODO: make current month an input parameter
         return ynabApi.getCategoryDetailsByMonth(budgetID, "current").toDomainCategoryList()
    }
}