package com.ismael.ynabreports.reports_feature.presentation.pie_chart

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ismael.ynabreports.reports_feature.common.Resource
import com.ismael.ynabreports.reports_feature.domain.use_case.GetCategoriesUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class PieChartViewModel constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    private val _state = mutableStateOf(CategoryListState())
    val state get() = _state

     fun getCategories(budgetID: String) {
        getCategoriesUseCase(budgetID).onEach {result ->
            when(result) {
                is Resource.Loading -> {
                    _state.value = CategoryListState(isLoading = true)
                }
                is Resource.Success -> {
                    _state.value = CategoryListState(categories = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = CategoryListState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }
}