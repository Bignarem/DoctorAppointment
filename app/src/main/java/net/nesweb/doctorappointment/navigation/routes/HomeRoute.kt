package net.nesweb.doctorappointment.navigation.routes

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import net.nesweb.doctorappointment.core.ViewModel.MainViewModel
import net.nesweb.doctorappointment.feature.home.MainScreen
import net.nesweb.doctorappointment.navigation.Screen

fun NavGraphBuilder.homeRoute(
    vm: MainViewModel,
) {
    composable(Screen.Home.route) {
        val categories by vm.category.observeAsState(emptyList())

        LaunchedEffect(Unit) {
            if (categories.isEmpty()) vm.loadCategory()
        }

        MainScreen(viewModel = vm)
    }
}