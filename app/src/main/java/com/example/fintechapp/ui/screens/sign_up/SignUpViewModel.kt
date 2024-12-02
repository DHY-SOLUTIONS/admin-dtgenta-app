package com.example.fintechapp.ui.screens.sign_up

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.fintechapp.data.remote.RetrofitHelper
import com.example.fintechapp.data.remote.service.auth.AuthApiService
import com.example.fintechapp.data.remote.service.auth.LoginRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SignUpViewModel() : ViewModel() {
    var emailTextInput by mutableStateOf<String>("")
    var passwordTextInput by mutableStateOf<String>("")
    var confirmPasswordTextInput by mutableStateOf<String>("")

    private val _isPasswordHideState = MutableStateFlow<Boolean>(true)
    val isPasswordHideState: StateFlow<Boolean> = _isPasswordHideState

    private val _isConfirmPasswordHideState = MutableStateFlow<Boolean>(true)
    val isConfirmPasswordHideState: StateFlow<Boolean> = _isConfirmPasswordHideState

    private val _buttonState = MutableStateFlow<Boolean>(false)
    val buttonState: StateFlow<Boolean> = _buttonState

    fun onLogin(){
        val authApiService = RetrofitHelper.getInstance().create(AuthApiService::class.java)
        GlobalScope.launch {
            val result = authApiService.signIn(LoginRequest("!23","2132"))
            if (result.isSuccessful){

            }
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }
    }

    fun setValueButtonState() {
        _buttonState.value = emailTextInput.isNotEmpty()
    }

    fun onChangeStatePasswordHide() {
        _isPasswordHideState.value = !_isPasswordHideState.value
    }

    fun onChangeStateConfirmPasswordHide() {
        _isConfirmPasswordHideState.value = !_isConfirmPasswordHideState.value
    }
}