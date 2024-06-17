package com.ismael.ynabreports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.ismael.ynabreports.reports_feature.data.remote.RetrofitClient
import com.ismael.ynabreports.reports_feature.data.repository.YnabRepositoryImpl
import com.ismael.ynabreports.reports_feature.domain.use_case.GetCategoriesUseCase
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartScreen
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModel
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val apiService = RetrofitClient.ynabAPIService
        val repository = YnabRepositoryImpl(apiService)
        val useCase = GetCategoriesUseCase(repository)
        val viewModelFactory = PieChartViewModelFactory(useCase)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(PieChartViewModel::class.java)

        setContent {
            MyApp {
                PieChartScreen(viewModel)
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), content = content)
    }
}
