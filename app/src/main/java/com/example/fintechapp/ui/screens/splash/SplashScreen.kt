package com.example.fintechapp.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import com.example.fintechapp.common.AppImage
import com.example.fintechapp.ui.base.DtgAppState

@Composable
fun SplashScreen(
    appState: DtgAppState,
    viewModel: SplashViewModel = hiltViewModel(),

    ) {
//    LaunchedEffect(Unit) {
//        viewModel.onNavigateToOnBoarding = {
//            navController.navigate(Routers.Onboarding.destination) {
//                popUpTo(Routers.Splash.destination) { inclusive = true }
//            }
//        }
//    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(
                id = AppImage.imgLogo
            ),
            contentDescription = null,
            modifier = Modifier
                .size(height = 150.dp, width = 300.dp)
        )
    }
}