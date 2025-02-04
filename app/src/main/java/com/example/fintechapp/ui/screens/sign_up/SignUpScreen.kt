package com.example.fintechapp.ui.screens.sign_up

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fintechapp.common.AppColor
import com.example.fintechapp.common.AppLanguage
import com.example.fintechapp.common.AppTextStyle
import com.example.fintechapp.ui.components.AppTopBar
import com.example.fintechapp.ui.screens.sign_up.components.SignUpConfirmPassword
import com.example.fintechapp.ui.screens.sign_up.components.SignUpContinueButton
import com.example.fintechapp.ui.screens.sign_up.components.SignUpEmailInput
import com.example.fintechapp.ui.screens.sign_up.components.SignUpPasswordInput

@Composable
fun SignUpScreen(
//    navController: NavController
    viewModel: SignUpViewModel = viewModel()
) {
    val scrollState = rememberScrollState()
    Scaffold(topBar = {
        AppTopBar(onBackNavigation = {})
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(23.dp)
                .verticalScroll(scrollState)
                .imePadding()
        ) {
            Text(
                AppLanguage.HI_THERE, style = AppTextStyle.latoBoldFontStyle.copy(
                    fontSize = 24.sp, color = AppColor.darkBlue
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                AppLanguage.JOIN_US_CREATE_ACCOUNT_YOUR_TODAY,
                style = AppTextStyle.latoRegularFontStyle.copy(
                    color = AppColor.darkBlue
                )
            )
            Spacer(modifier = Modifier.height(40.dp))
            SignUpEmailInput(viewModel)
            Spacer(modifier = Modifier.height(15.dp))
            SignUpPasswordInput(viewModel)
            Spacer(modifier = Modifier.height(15.dp))
            SignUpConfirmPassword(viewModel)
            Spacer(modifier = Modifier.height(15.dp))
            SignUpContinueButton(viewModel)
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                VerticalDivider(
                    color = AppColor.grey, // Màu sắc của divider
                    thickness = 1.dp,   // Độ dày của divider
                    modifier = Modifier.fillMaxWidth() // Chiều rộng đầy đủ
                )
                Text(
                    AppLanguage.OR,
                    style = AppTextStyle.latoRegularFontStyle.copy(
                        color = AppColor.darkBlue
                    )
                )
//                VerticalDivider(
//                    color = AppColor.grey, // Màu sắc của divider
//                    thickness = 1.dp,   // Độ dày của divider
//                    modifier = Modifier.fillMaxWidth() // Chiều rộng đầy đủ
//                )
            }
        }
    }
}

//@Preview
//@Composable
//fun preview() {
//    SignUpScreen()
//}