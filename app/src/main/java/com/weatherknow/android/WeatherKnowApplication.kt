package com.weatherknow.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherKnowApplication : Application() {

    companion object{
        const val TOKEN = "ffffff"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}