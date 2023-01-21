package com.omtorney.skywatch.domain.repository

import com.omtorney.skywatch.domain.util.Resource
import com.omtorney.skywatch.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo>
}