package com.ismael.ynabreports.reports_feature.presentation.pie_chart

import com.ismael.ynabreports.reports_feature.domain.model.Category

data class CategoryListState (
    val isLoading: Boolean = false,
    val categories: List<Category> = emptyList(),
    val error: String = ""
)