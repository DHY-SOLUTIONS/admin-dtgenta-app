package com.example.fintechapp.repository

import com.example.fintechapp.data.remote.ResultApi

interface AuthRepository {
    suspend fun signInAmplify(userName: String, password: String): ResultApi<String>

}