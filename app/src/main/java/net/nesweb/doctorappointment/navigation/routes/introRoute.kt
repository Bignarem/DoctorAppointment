package net.nesweb.doctorappointment.navigation.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import net.nesweb.doctorappointment.feature.intro.IntroScreen
import net.nesweb.doctorappointment.navigation.Screen

fun NavGraphBuilder.introRoute(onStart: () -> Unit) {
composable (Screen.Intro.route) {
    IntroScreen (onStartClick = onStart)
}
}