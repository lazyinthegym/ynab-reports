package com.ismael.ynabreports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ismael.ynabreports.reports_feature.data.remote.RetrofitClient
import com.ismael.ynabreports.reports_feature.data.repository.YnabRepositoryImpl
import com.ismael.ynabreports.reports_feature.domain.use_case.GetCategoriesUseCase
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartScreen
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModel
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModelFactory
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                val viewModel = getViewModel<PieChartViewModel>()
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
