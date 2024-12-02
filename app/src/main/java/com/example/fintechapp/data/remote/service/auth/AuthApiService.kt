package com.example.fintechapp.data.remote.service.auth


import kotlinx.serialization.Serializable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("/signIn")
    suspend fun signIn(@Body request: LoginRequest) : Response<LoginResponse>
}

@Serializable
data class LoginRequest(
    val email: String,
    val password: String,
)

@Serializable
data class LoginResponse(
    val token: String
)
