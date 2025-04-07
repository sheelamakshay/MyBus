package np.com.bimalkafle.firebaseauthdemoapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import np.com.bimalkafle.firebaseauthdemoapp.pages.HomePage
import np.com.bimalkafle.firebaseauthdemoapp.pages.LoginPage
import np.com.bimalkafle.firebaseauthdemoapp.pages.SignupPage
import np.com.bimalkafle.firebaseauthdemoapp.pages.BookingPage
import np.com.bimalkafle.firebaseauthdemoapp.pages.BusSelectionPage
import np.com.bimalkafle.firebaseauthdemoapp.pages.ViewTicketPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            LoginPage(modifier, navController, authViewModel)
        }
        composable("signup") {
            SignupPage(modifier, navController, authViewModel)
        }
        composable("home") {
            HomePage(modifier, navController, authViewModel)
        }
        composable("booking") {
            BookingPage(modifier, navController)
        }
        composable("bus_selection") {
            BusSelectionPage(modifier, navController)
        }
        composable("view_ticket") {
            ViewTicketPage(modifier, navController)
        }
    })
}
