package com.weatherknow.android.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.weatherknow.android.logic.Repository
import com.weatherknow.android.logic.model.Location

class WeatherViewModel : ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()

    val locationlng = ""

    val locationlat = ""

    val placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshweather(lng:String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }
}