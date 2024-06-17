package com.ismael.ynabreports.reports_feature.domain.use_case

import coil.network.HttpException
import com.ismael.ynabreports.reports_feature.common.Resource
import com.ismael.ynabreports.reports_feature.domain.model.Category
import com.ismael.ynabreports.reports_feature.domain.repository.YnabRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetCategoriesUseCase (
    private val ynabRepository: YnabRepository
) {
    operator fun invoke(budgetID: String) : Flow<Resource<List<Category>>> = flow {
        try {
            emit(Resource.Loading())
            val categories = ynabRepository.getCategories(budgetID)
            emit(Resource.Success(categories))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}