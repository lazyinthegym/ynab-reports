package com.ismael.ynabreports

import SplashScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartScreen
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModel
import kotlinx.serialization.Serializable
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                val viewModel = getViewModel<PieChartViewModel>()
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "splash_screen") {
                    composable("splash_screen") { SplashScreen(navController = navController) }
                    composable("pie_chart_screen") { PieChartScreen(viewModel) }
                }

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

@Serializable
object SplashScreen
object PieChartScreen