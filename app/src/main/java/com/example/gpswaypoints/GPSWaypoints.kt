package com.example.gpswaypoints

import android.app.Application
//import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree
import dagger.hilt.android.HiltAndroidApp

/**
 * Application that sets up Timber in the DEBUG BuildConfig.
 * Read Timber's documentation for production setups.
 */
@HiltAndroidApp
class GPSWaypoints : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(DebugTree())
    }
}
