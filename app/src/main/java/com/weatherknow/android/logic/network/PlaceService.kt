package com.weatherknow.android.logic.network

import com.weatherknow.android.WeatherKnowApplication
import com.weatherknow.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService{

    @GET("v2/place?token=${WeatherKnowApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query:String): Call<PlaceResponse>

}