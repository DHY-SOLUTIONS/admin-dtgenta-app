package com.example.fintechapp.ui.screens.sign_up.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.fintechapp.common.AppColor
import com.example.fintechapp.common.AppLanguage
import com.example.fintechapp.ui.components.CustomButton
import com.example.fintechapp.ui.screens.sign_up.SignUpViewModel

@Composable
fun SignUpContinueButton(viewModel : SignUpViewModel){
    val buttonState: Boolean by viewModel.buttonState.collectAsStateWithLifecycle()
    CustomButton(
        buttonColor = if (buttonState) AppColor.darkBlue else AppColor.darkBlue.copy(alpha = 0.2f),
        onClick = {},
        contentText = AppLanguage.CONTINUE,
        modifier = Modifier.fillMaxWidth(),
        enable = buttonState
    )
}