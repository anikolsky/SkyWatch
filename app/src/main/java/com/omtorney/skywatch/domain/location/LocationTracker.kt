package com.omtorney.skywatch.domain.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location? // could be custom Impl for KMM
}