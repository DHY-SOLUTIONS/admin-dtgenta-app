package com.example.fintechapp.app


import android.app.Application

import com.example.fintechapp.common.extensions.isDebugMode
import dagger.hilt.android.HiltAndroidApp
//import timber.log.Timber

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (isDebugMode) {
//            Timber.plant(Timber.DebugTree())
        }
//        configAWS()
    }

//    private fun configAWS() {
//        try {
//            Amplify.addPlugin(AWSCognitoAuthPlugin())
//            Amplify.addPlugin(AWSApiPlugin())
//            Amplify.configure(applicationContext)
//        } catch (error: AmplifyException) {
////            Timber.e("configAWS ${error.message}")
//        }
//    }
}