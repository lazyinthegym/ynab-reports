package com.ismael.ynabreports.reports_feature.presentation.pie_chart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ismael.ynabreports.reports_feature.domain.use_case.GetCategoriesUseCase

class PieChartViewModelFactory(private val getCategoriesUseCase: GetCategoriesUseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PieChartViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PieChartViewModel(getCategoriesUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}