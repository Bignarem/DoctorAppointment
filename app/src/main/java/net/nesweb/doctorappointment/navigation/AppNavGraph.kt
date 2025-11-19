package net.nesweb.doctorappointment.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import net.nesweb.doctorappointment.core.ViewModel.MainViewModel
import net.nesweb.doctorappointment.navigation.routes.introRoute


@Composable
fun AppNavGraph(
    nav: NavHostController,
    vm: MainViewModel
) {
    NavHost(navController = nav, startDestination = Screen.Intro.route) {
        introRoute(
            onStart = {
                nav.navigate(Screen.Home.route) {
                    popUpTo(Screen.Intro.route) {inclusive = true}
                }
            }
        )
    }
}