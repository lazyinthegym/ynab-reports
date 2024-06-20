import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.ismael.ynabreports.R

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3000L)  // Display the splash screen for 3 seconds
        navController.navigate("pie_chart_screen") {  // Change destination to pie_chart_screen
            popUpTo("splash_screen") { inclusive = true }
        }
    }

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_lego))  // Replace with your Lottie resource

    LottieAnimation(
        composition = composition,
        modifier = Modifier.fillMaxSize()
    )
}
