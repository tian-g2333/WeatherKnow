package com.weatherknow.android.logic.network

import com.weatherknow.android.WeatherKnowApplication
import com.weatherknow.android.logic.model.DailyResponse
import com.weatherknow.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${WeatherKnowApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    @GET("v2.5/${WeatherKnowApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}