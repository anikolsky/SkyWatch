package com.omtorney.skywatch.domain.weather

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>, // today's weather
    val currentWeatherData: WeatherData? // hourly weather
)