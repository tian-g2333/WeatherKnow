package com.weatherknow.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.weatherknow.android.WeatherKnowApplication
import com.weatherknow.android.logic.model.Place

object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = WeatherKnowApplication.context.
        getSharedPreferences("weather_know", Context.MODE_PRIVATE)
}