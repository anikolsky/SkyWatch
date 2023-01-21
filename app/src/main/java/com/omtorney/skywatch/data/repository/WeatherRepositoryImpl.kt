package com.omtorney.skywatch.data.repository

import com.omtorney.skywatch.data.mappers.toWeatherInfo
import com.omtorney.skywatch.data.remote.WeatherApi
import com.omtorney.skywatch.domain.repository.WeatherRepository
import com.omtorney.skywatch.domain.util.Resource
import com.omtorney.skywatch.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lon = lon
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(message = e.message ?: "An unknown error occurred")
        }
    }
}