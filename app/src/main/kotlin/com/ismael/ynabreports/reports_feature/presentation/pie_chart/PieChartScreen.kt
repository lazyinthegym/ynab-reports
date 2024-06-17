package com.ismael.ynabreports.reports_feature.presentation.pie_chart

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ismael.ynabreports.reports_feature.common.Constants

@Composable
fun PieChartScreen(viewModel: PieChartViewModel) {
    val categoriesState = viewModel.state.value
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) {
        viewModel. getCategories(Constants.BUDGET_ID)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        if (categoriesState.error.isNotBlank()) {
            // Show error message
            // TODO:("Show error message")
        } else if (categoriesState.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        } else {
            val data = categoriesState.categories.associate { category->
                category.name to category.activity / 1000
            }
            PieChart(data)
        }
    }
}
